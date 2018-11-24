$(document).ready(function () {
    function loadDate(){
        var d = new Date();
        var yearNow = d.getFullYear();
        for(var i = yearNow; i >= 1950; i--){
            $('.select-date').append($('<option>', {
                value: i,
                text: i + ""
            }));
            if (i == (yearNow-1)){
                $('.previous-datenow').val(i);
            }
            if (i == (yearNow-11)) {
                $('.start-date').val(i);
            }
        }
    }

    //-------------------------------------------------------------------------------------

    function generateHtmlDanhSachDiemDoanVien(data) {
        var html = '';
        $.each(data, function (i, item) {
            html += '<tr>';
                html += '<td class="diem-ma">' + item.maSv + '</td>';
                html += '<td class="diem-hoten">' + item.hoTen + '</td>';
                html += '<td class="diem-ngaysinh column-hidden">' + item.ngaySinh + '</td>';
                html += '<td class="diem-chidoan column-hidden">' + item.chiDoan + '</td>';
                html += '<td class="diem-donvi column-hidden">' + item.donVi + '</td>';
                html += '<td class="diem">' + item.diem + '</td>';
                html += '<td class="diem-thoigian">' + item.thoiGian + '</td>';
                html += '<td class="diem-ghichu">' + item.ghiChu + '</td>';
            html += '</tr>'
        });
        $('#danh-sach-diem-doan-vien tbody').html(html);
    }

    function tkDanhSachDiem(){
        var data = {};
        data.soLuong = 5;
        data.thoiGian = 2017;
        data.hocLuc = "K";
        data.idChiDoan = 1;
        data.idDonVi = 1;
        $.ajax({
            url: '/ho-so/danh-sach-diem',
            type: 'POST',
            contentType: 'application/json; charset=utf-8',
            dataType: 'JSON',
            data: JSON.stringify(data),
            success: function (data) {
                generateHtmlDanhSachDiemDoanVien(data);
            },
            error: function (e) {
                console.log(e);
            }
        })
    }

    //--------------------------------------------------------------------------------------------

    function generateHtmlDanhSachHoatDongDoanVien(data) {
        var html = '';
        $.each(data, function (i, item) {
            html += '<tr>';
                html += '<td class="hd-ma">' + item.maSv + '</td>';
                html += '<td class="hd-hoten">' + item.hoTen + '</td>';
                html += '<td class="hd-ngaysinh column-hidden">' + item.ngaySinh + '</td>';
                html += '<td class="hd-chidoan column-hidden">' + item.chiDoan + '</td>';
                html += '<td class="hd-donvi column-hidden">' + item.donVi + '</td>';
                html += '<td class="hd-thoigian">' + item.thoiGian + '</td>';
                html += '<td class="hd-sohoatdongthamgia">' + item.soLuong + '</td>';
            html += '</tr>'
        });
        $('#danh-sach-hoat-dong-doan-vien tbody').html(html);
    }

    function tkDanhSachHoatDong(){
        var data = {};
        data.soLuong = 5;
        data.thoiGian = 2017;
        data.idChiDoan = 1;
        data.idDonVi = 1;
        $.ajax({
            url: '/ho-so/danh-sach-hoat-dong',
            type: 'POST',
            contentType: 'application/json; charset=utf-8',
            dataType: 'JSON',
            data: JSON.stringify(data),
            success: function (data) {
                generateHtmlDanhSachHoatDongDoanVien(data);
            },
            error: function (e) {
                console.log(e);
            }
        })
    }

    $.when(
        loadDate(),
        tkDanhSachDiem(),
        tkDanhSachHoatDong(),
        $.ajax({
            url: '/chi-doan/list',
            type: 'GET',
            dataType: 'JSON',
            success: function (data) {
                $.each(data, function (i, item) {
                    $('.ten-chi-doan').append($('<option>', {
                        value: item.id,
                        text: item.tenChiDoan
                    }));
                });
                $('.ten-chi-doan').val(1);
            }
        }),
        $.ajax({
            url: '/don-vi/list',
            type: 'GET',
            dataType: 'JSON',
            success: function (data) {
                $.each(data, function (i, item) {
                    $('.ten-don-vi').append($('<option>', {
                        value: item.id,
                        text: item.tenDonVi
                    }));
                });
                $('.ten-don-vi').val(1)
            }
        })
    ).then(function () {
        //---------------------------------------------------------------------------------------------------------------
        function loadDataSeason(data){
            $('#doanvien-dangvien-tk').highcharts({
                title : {
                    text: 'Số lượng đoàn viên và đảng viên qua các thời kỳ'
                },
                subtitle : {
                    text: 'Từ năm ' + data.startDate + '-' + data.endDate
                },
                xAxis : {
                    title: {
                        text: 'Năm'
                    }
                },
                yAxis : {
                    title: {
                        text: 'Số lượng'
                    }
                },
                plotOptions : {
                    line: {
                        dataLabels: {
                            enabled: true
                        },
                        enableMouseTracking: false
                    },
                    series: {
                        label: {
                            connectorAllowed: false
                        },
                        pointStart: data.startDate
                    }
                },
                series : [
                    {
                        name: 'Đoàn viên',
                        data: data.listVaoDoan
                    },
                    {
                        name: 'Đảng viên',
                        data: data.listVaoDang
                    }
                ]
            });
        }

        $.ajax({
            url: '/ho-so/doan-vien',
            type: 'GET',
            dataType: 'JSON',
            data: {
                startDate : 2007,
                endDate : 2018
            },
            success : function (data) {
                loadDataSeason(data);
            },
            error : function () {
                alert("Error");
            }
        });

        $('#start-date').change(function () {
            var start = $('#start-date').val();
            var end = $('#end-date').val();
            if(start > end){
                alert("Error. Thời gian bắt đầu sau ngày kết thúc! ");
                return false;
            }
            $.ajax({
                url: '/ho-so/doan-vien',
                type: 'GET',
                dataType: 'JSON',
                data: {
                    startDate : start,
                    endDate : end
                },
                success : function (data) {
                    loadDataSeason(data);
                },
                error : function () {
                    alert("Error");
                }
            });
        });

        $('#end-date').change(function () {
            var start = $('#start-date').val();
            var end = $('#end-date').val();
            if(start > end){
                alert("Error. Thời gian kết thúc trước ngày bắt đầu! ");
                return false;
            }
            $.ajax({
                url: '/ho-so/doan-vien',
                type: 'GET',
                dataType: 'JSON',
                data: {
                    startDate : start,
                    endDate : end
                },
                success : function (data) {
                    loadDataSeason(data);
                },
                error : function () {
                    alert("Error");
                }
            });
        });
        //-------------------------------------------------------------------------------------------------------
        function loadDataDiemDoanVien(data) {
            $('#doanvien-chidoan-tk').highcharts({
                chart : {
                    plotBackgroundColor: null,
                    plotBorderWidth: null,
                    plotShadow: false
                },
                title : {
                    text: 'Biểu đồ thành tích học tập'
                },
                subtitle : {
                    text: 'Chi đoàn ' + $("#hl-chidoan-tenchidoan option:selected").text() +  ' - Năm ' + $("#hl-chidoan-thoigian option:selected").text()
                },
                tooltip : {
                    pointFormat: '{series.name}: <b>{point.percentage:.2f}%</b>'
                },
                plotOptions : {
                    pie: {
                        allowPointSelect: true,
                        cursor: 'pointer',
                        size: 220,
                        dataLabels: {
                            enabled: true,
                            format: '<b>{point.name}%</b>: {point.percentage:.2f} %',
                            style: {
                                color: (Highcharts.theme && Highcharts.theme.contrastTextColor)||
                                    'black'
                            }
                        }
                    }
                },
                series : [{
                    type: 'pie',
                    name: 'Chiếm khoảng',
                    data: [
                        ['Xuất sắc',   data.xuatSac],
                        {
                            name: 'Giỏi',
                            y: data.gioi,
                            sliced: true,
                            selected: true
                        },
                        ['Khá',    data.kha],
                        ['Trung bình khá',     data.tbKha],
                        ['Trung bình',   data.trungBinh],
                        ['Trung bình yếu',   data.tbYeu],
                        ['Yếu',   data.yeu],
                        ['Kém',   data.kem]
                    ]
                }]
            });
        }

        $.ajax({
            url: '/ho-so/hoc-luc-cd',
            type: 'GET',
            dataType: 'JSON',
            data: {
                idChiDoan: 1,
                nam: 2017
            },
            success: function (data) {
                loadDataDiemDoanVien(data)
            },
            error: function () {
                alert("Error")
            }
        });

        $('#hl-chidoan-tenchidoan').change(function () {
            $.ajax({
                url: '/ho-so/hoc-luc-cd',
                type: 'GET',
                dataType: 'JSON',
                data: {
                    idChiDoan: $('#hl-chidoan-tenchidoan').val(),
                    nam: $('#hl-chidoan-thoigian').val()
                },
                success: function (data) {
                    loadDataDiemDoanVien(data)
                },
                error: function () {
                    alert("Error")
                }
            });
        });

        $('#hl-chidoan-thoigian').change(function () {
            $.ajax({
                url: '/ho-so/hoc-luc-cd',
                type: 'GET',
                dataType: 'JSON',
                data: {
                    idChiDoan: $('#hl-chidoan-tenchidoan').val(),
                    nam: $('#hl-chidoan-thoigian').val()
                },
                success: function (data) {
                    loadDataDiemDoanVien(data)
                },
                error: function () {
                    alert("Error")
                }
            });
        });

        //-------------------------------------------------------------------------------------------------------

        function loadDataDiemDonVi(data) {
            $('#doanvien-donvi-tk').highcharts({
                chart : {
                    plotBackgroundColor: null,
                    plotBorderWidth: null,
                    plotShadow: false
                },
                title : {
                    text: 'Biểu đồ thành tích học tập'
                },
                subtitle : {
                    text: 'Khoa ' + $("#hl-donvi-tendonvi option:selected").text() + ' - Năm' + $("#hl-donvi-thoigian option:selected").text()
                },
                tooltip : {
                    pointFormat: '{series.name}: <b>{point.percentage:.2f}%</b>'
                },
                plotOptions : {
                    pie: {
                        allowPointSelect: true,
                        cursor: 'pointer',
                        size: 220,
                        dataLabels: {
                            enabled: true,
                            format: '<b>{point.name}%</b>: {point.percentage:.2f} %',
                            style: {
                                color: (Highcharts.theme && Highcharts.theme.contrastTextColor)||
                                    'black'
                            }
                        }
                    }
                },
                series : [{
                    type: 'pie',
                    name: 'Chiếm khoảng',
                    data: [
                        ['Xuất sắc', data.xuatSac],
                        {
                            name: 'Giỏi',
                            y: data.gioi,
                            sliced: true,
                            selected: true
                        },
                        ['Khá', data.kha],
                        ['Trung bình khá', data.tbKha],
                        ['Trung bình', data.trungBinh],
                        ['Trung bình yếu', data.tbYeu],
                        ['Yếu', data.yeu],
                        ['Kém', data.kem]
                    ]
                }]
            });
        }

        $.ajax({
            url: '/ho-so/hoc-luc-dv',
            type: 'GET',
            dataType: 'JSON',
            data: {
                idDonVi: 1,
                nam: 2017
            },
            success: function (data) {
                loadDataDiemDonVi(data)
            },
            error: function () {
                alert("Error")
            }
        });

        $('#hl-donvi-tendonvi').change(function () {
            $.ajax({
                url: '/ho-so/hoc-luc-dv',
                type: 'GET',
                dataType: 'JSON',
                data: {
                    idDonVi: $('#hl-donvi-tendonvi').val(),
                    nam: $('#hl-donvi-thoigian').val()
                },
                success: function (data) {
                    loadDataDiemDonVi(data)
                },
                error: function () {
                    alert("Error")
                }
            });
        });

        $('#hl-donvi-thoigian').change(function () {
            $.ajax({
                url: '/ho-so/hoc-luc-dv',
                type: 'GET',
                dataType: 'JSON',
                data: {
                    idDonVi: $('#hl-donvi-tendonvi').val(),
                    nam: $('#hl-donvi-thoigian').val()
                },
                success: function (data) {
                    loadDataDiemDonVi(data)
                },
                error: function () {
                    alert("Error")
                }
            });
        })
    });

    //----------------------------------------------------------------------------------------------------------

    $('#hoso-diem').click(function () {
        var data = {};
        data.soLuong = $('#diem-soluong').val();
        data.thoiGian = $('#diem-thoigian').val();
        data.hocLuc = $('#diem-hocluc').val();
        data.idChiDoan = $('#diem-chidoan').val();
        data.idDonVi = $('#diem-donvi').val();
        $.ajax({
            url: '/ho-so/danh-sach-diem',
            type: 'POST',
            contentType: 'application/json; charset=utf-8',
            dataType: 'JSON',
            data: JSON.stringify(data),
            success: function (data) {
                generateHtmlDanhSachDiemDoanVien(data);
            },
            error: function (e) {
                console.log(e);
            }
        })
    });

    //-----------------------------------------------------------------------------------------------------------

    $('#hoso-hoatdong').click(function () {
        var data = {};
        data.soLuong = $('#hd-soluong').val();
        data.thoiGian = $('#hd-thoigian').val();
        data.idChiDoan = $('#hd-chidoan').val();
        data.idDonVi = $('#hd-donvi').val();
        $.ajax({
            url: '/ho-so/danh-sach-hoat-dong',
            type: 'POST',
            contentType: 'application/json; charset=utf-8',
            dataType: 'JSON',
            data: JSON.stringify(data),
            success: function (data) {
                generateHtmlDanhSachHoatDongDoanVien(data);
            },
            error: function (e) {
                console.log(e);
            }
        })
    });

    //
    // If you're adding options from a collection of items, you can do the following:
    //
    // $.each(items, function (i, item) {
    //     $('#mySelect').append($('<option>', {
    //         value: item.value,
    //         text : item.text
    //     }));
    // });
});