$(document).ready(function () {
    function generateHtmlData(data) {
        var htmlTable = '';
        $.each(data.listHoSo, function (i, item) {
            htmlTable += '<tr>';
            htmlTable += '<td class="hs-hinhanh">';
            htmlTable += '<img src="' + item.hinhAnh + '" alt="Avatar"/>';
            htmlTable += '</td>';

            htmlTable += '<td class="hs-ma">' + item.maSv + '</td>';
            htmlTable += '<td class="hs-hoten">' + item.hoTen + '</td>';
            htmlTable += '<td class="hs-ngaysinh">' + item.ngaySinh + '</td>';
            htmlTable += '<td class="hs-gioitinh">' + (item.gioiTinh==true?"Nam":"Nữ") + '</td>';
            htmlTable += '<td class="hs-diachi">' + item.diaChi + '</td>';
            htmlTable += '<td class="hs-chidoan">' + item.chiDoan.tenChiDoan + '</td>';
            htmlTable += '<td class="hs-donvi">' + item.chiDoan.donVi.tenDonVi + '</td>';

            htmlTable += '<td class="hs-sdt column-hidden">' + item.sdt + '</td>';
            htmlTable += '<td class="hs-email column-hidden">' + item.email + '</td>';
            htmlTable += '<td class="hs-quoctich column-hidden">' + item.quocTich + '</td>';
            htmlTable += '<td class="hs-dantoc column-hidden">' + item.danToc + '</td>';
            htmlTable += '<td class="hs-tongoao column-hidden">' + item.tonGiao + '</td>';
            htmlTable += '<td class="hs-dtcs column-hidden">' + item.doiTuongChinhSach + '</td>';
            htmlTable += '<td class="hs-ngayvaodoan column-hidden">' + item.ngayVaoDoan + '</td>';
            htmlTable += '<td class="hs-ngayvaodang column-hidden">' + item.ngayVaoDang + '</td>';
            htmlTable += '<td class="hs-chucvu column-hidden">' + item.chucVu.tenChucVu + '</td>';
            htmlTable += '<td class="hs-taikhoan column-hidden">' + (item.taiKhoan==null?"NaN":item.taiKhoan.tenTaiKhoan) + '</td>';
            htmlTable += '<td class="hs-quanly column-hidden">' + item.idQuanLy + '</td>';

            htmlTable += '<td>' +
                '<input type="hidden" class="hs-id" value="' + item.id + '"/>' +
                '<span data-toggle="modal" data-target="#modalDetail">' +
                '<i class="fa fa-eye" data-toggle="tooltip" data-original-title="Chi tiết" data-placement="top" ></i>' +
                '</span> | ' +
                '<span data-toggle="modal" data-target="#modalEdit">' +
                '<i class="fa fa-wrench" data-toggle="tooltip" data-original-title="Sửa" data-placement="top"></i>' +
                '</span> | ' +
                '<span data-toggle="modal" data-target="#modalDelete">' +
                '<i class="fa fa-trash" data-toggle="tooltip" data-original-title="Xóa" data-placement="top"></i>' +
                '</span>' +
                '</td>';
            htmlTable += '</tr>'
        });
        var paging = data.paging[0];
        $('#danh-sach-ho-so tbody').html(htmlTable);
        var htmlInfRecord = 'Hiển thị từ ' + (paging.firstResult + 1) + ' đến ' + ((paging.maxResult + 1)>paging.totalRecord?paging.maxResult:(paging.maxResult + 1)) + ' của ' + (paging.totalRecord) + ' bản ghi';
        $('#info-record').html(htmlInfRecord);
        var htmlPaging = '';
        var size = 5;
        if(paging.numberPage != 1){
            htmlPaging += '<li class="previous"><a href = "#">&laquo;</a></li>';
        }
        if (paging.numberPage < 3){
            for(var i = 1 ; i <= size; i++){
                if(i > paging.totalPage){
                    break;
                }
                if(paging.numberPage == i){
                    htmlPaging += '<li class="active"><a href = "#">' + i + '</a></li>';
                } else {
                    htmlPaging += '<li><a href = "#">' + i + '</a></li>';
                }
            }
        } else if (paging.numberPage >= 3 && paging.numberPage <= (paging.totalPage - 3)){
            for(var i = 1; i <= size; i++){
                var temp = paging.numberPage - 3 + i;
                if(temp > paging.totalPage){
                    break;
                }
                if(paging.numberPage == temp){
                    htmlPaging += '<li class="active"><a href = "#">' + temp + '</a></li>';
                } else {
                    htmlPaging += '<li><a href = "#">' + temp + '</a></li>';
                }
            }
        } else {
            if(paging.totalPage <= 4){
                for(var i = 1; i <= paging.totalPage; i++){
                    if(paging.numberPage == i){
                        htmlPaging += '<li class="active"><a href = "#">' + i + '</a></li>';
                    } else {
                        htmlPaging += '<li><a href = "#">' + i + '</a></li>';
                    }
                }
            } else {
                for(var i = 5; i >= 1; i--){
                    var temp = paging.totalPage - i + 1;
                    if(temp < 0){
                        break;
                    }
                    if(paging.numberPage == temp){
                        htmlPaging += '<li class="active"><a href = "#">' + temp + '</a></li>';
                    } else {
                        htmlPaging += '<li><a href = "#">' + temp + '</a></li>';
                    }
                }
            }
        }
        if (paging.numberPage != paging.totalPage){
            htmlPaging += '<li class="next"><a href = "#">&raquo;</a></li>';
        }
        $('#pagination').html(htmlPaging);
    }
    function loadData(){
        var data = {};
        data.numberRecord = 10;
        data.txtSearch = '';
        data.columnName = '';
        data.sort = '';
        data.numberPage = 1;
        $.ajax({
            url: '/ho-so/list',
            type: 'POST',
            contentType: 'application/json; charset=utf-8',
            dataType: 'JSON',
            data: JSON.stringify(data),
            success: function (data) {
                generateHtmlData(data);
            },
            error: function (e) {
                console.log(e);
            }
        })
    }
    $.when(
        loadData(),
        $.ajax({
            url: '/chi-doan/list',
            type: 'GET',
            dataType: 'JSON',
            success: function (data) {
                $.each(data, function (i, item) {
                    $('.select-chidoan').append($('<option>', {
                        value: item.id,
                        text: item.tenChiDoan
                    }))
                })
            },
            error: function (e) {
                console.log(e);
            }
        }),
        $.ajax({
            url: '/don-vi/list',
            type: 'GET',
            dataType: 'JSON',
            success: function (data) {
                $.each(data, function (i, item) {
                    $('.select-donvi').append($('<option>', {
                        value: item.id,
                        text: item.tenDonVi
                    }))
                })
            },
            error: function (e) {
                console.log(e);
            }
        }),
        $.ajax({
            url: '/chuc-vu/list',
            type: 'GET',
            dataType: 'JSON',
            success: function (data) {
                $.each(data, function (i, item) {
                    if(item.id == 1){
                        $('.select-chucvu').append($('<option>', {
                            value: item.id,
                            text: item.tenChucVu,
                            selected: "selected"
                        }))
                    } else {
                        $('.select-chucvu').append($('<option>', {
                            value: item.id,
                            text: item.tenChucVu
                        }))
                    }
                })
            },
            error: function (e) {
                console.log(e);
            }
        })
    ).then(function () {
        $('#btnAdd').click(function (even) {
            even.preventDefault();
            var formData = $('#form-add-hoso').serializeArray();
            var dataForm = {};
            $.each(formData, function (i, item) {
                dataForm[item.name] = item.value;
            });
            $.ajax({
                url: '/ho-so/add',
                type: 'POST',
                dataType: 'JSON',
                contentType: "application/json; charset=utf-8",
                data: JSON.stringify(dataForm),
                success: function (check) {
                    if (check == true){
                        alert("Thêm thành công");
                        location.reload();
                    } else {
                        alert("Thêm thất bại");
                    }
                },
                error: function (e) {
                    console.log(e);
                }
            });
        });

        $('#btnEdit').click(function (even) {
            even.preventDefault();
            var formData = $('#form-edit-hoso').serializeArray();
            var dataForm = {};
            $.each(formData, function (i, item) {
                dataForm[item.name] = item.value;
            });
            $.ajax({
                url: '/ho-so/update',
                type: 'PUT',
                dataType: 'JSON',
                contentType: "application/json; charset=utf-8",
                data: JSON.stringify(dataForm),
                success: function (check) {
                    if (check == true){
                        alert("Update thành công");
                        location.reload();
                    } else {
                        alert("Update thất bại");
                    }
                },
                error: function (e) {
                    console.log(e);
                }
            });
        });

        $('#btnXoa').click(function () {
            $.ajax({
                url: '/ho-so/delete',
                type: 'POST',
                data: {
                    id : $('#delete-id').val()
                },
                success: function (check) {
                    if (check == true){
                        alert("Xóa thành công");
                        location.reload();
                    } else {
                        alert("Xóa thất bại");
                    }
                },
                error: function (e) {
                    console.log(e);
                }
            });
        });

        $('#number-record').change(function () {
            var data = {};
            data.numberRecord = $('#number-record').val();
            data.txtSearch = $('#txtSearch').val();
            data.columnName = '';
            data.sort = '';
            data.numberPage = 1;
            $.ajax({
                url: '/ho-so/list',
                type: 'POST',
                contentType: 'application/json; charset=utf-8',
                dataType: 'JSON',
                data: JSON.stringify(data),
                success: function (data) {
                    generateHtmlData(data);
                },
                error: function (e) {
                    console.log(e);
                }
            })
        });

        $('#txtSearch').keyup(function () {
            var data = {};
            data.numberRecord = $('#number-record').val();
            data.txtSearch = $('#txtSearch').val();
            data.columnName = '';
            data.sort = '';
            data.numberPage = 1;
            $.ajax({
                url: '/ho-so/list',
                type: 'POST',
                contentType: 'application/json; charset=utf-8',
                dataType: 'JSON',
                data: JSON.stringify(data),
                success: function (data) {
                    generateHtmlData(data);
                },
                error: function (e) {
                    console.log(e);
                }
            })
        });

        $('#danh-sach-ho-so th').click(function () {
            var columnName = $(this).attr("class");
            $('#column-name').val(columnName);
            var sort = $('#sort').val();
            var data = {};
            data.numberRecord = $('#number-record').val();
            data.txtSearch = $('#txtSearch').val();
            data.columnName = $('#column-name').val();
            data.sort = sort;
            data.numberPage = 1;
            $.ajax({
                url: '/ho-so/list',
                type: 'POST',
                contentType: 'application/json; charset=utf-8',
                dataType: 'JSON',
                data: JSON.stringify(data),
                success: function (data) {
                    if(sort == "asc"){
                        $('#sort').val("desc");
                    } else {
                        $('#sort').val("asc");
                    }
                    generateHtmlData(data);
                },
                error: function (e) {
                    console.log(e);
                }
            })
        });

        $(document).on("click", ".fa-eye", function () {
            $.ajax({
                url: '/ho-so/detail',
                type: 'GET',
                data: {
                    id : $(this).closest('tr').find('.hs-id').val()
                },
                success: function (data) {
                    $("strong[class*='hoSo-hoTen']").html("");
                    $("strong[class*='hoSo-ngaySinh']").html("");
                    $("strong[class*='hoSo-diaChi']").html("");
                    $("strong[class*='hoSo-sdt']").html("");
                    $("strong[class*='hoSo-email']").html("");
                    $("strong[class*='hoSo-ngayVaoDoan']").html("");
                    $("strong[class*='hoSo-ngayVaoDang']").html("");
                    $("strong[class*='hoSo-danToc']").html("");
                    $("strong[class*='hoSo-quocTich']").html("");
                    $("strong[class*='hoSo-tonGiao']").html("");
                    $("strong[class*='hoSo-doiTuongChinhSach']").html("");
                    $("strong[class*='hoSo-taiKhoan']").html("");
                    $.each(data.hoSo[0], function (key, value) {
                        if(key == "taiKhoan"){
                            $("strong[class*='hoSo-" + key + "']").html(value.tenTaiKhoan);
                        } else if(key == "chucVu"){
                            $("strong[class*='hoSo-" + key + "']").html(value.tenChucVu);
                        } else if ((key == "chiDoan") || (key == "donVi")) {
                            $("strong[class*='hoSo-chiDoan']").html(value.tenChiDoan);
                            $("strong[class*='hoSo-donVi']").html(value.donVi.tenDonVi);
                        } else if(key =="gioiTinh"){
                            $("strong[class*='hoSo-" + key + "']").html(value==true?"Nam":"Nữ");
                        } else {
                            $("strong[class*='hoSo-" + key + "']").html(value);
                        }
                    });
                    var htmlTableDiem = '';
                    $.each(data.listDiem, function (i, item) {
                        htmlTableDiem += '<tr>';
                        htmlTableDiem += '<td class="detail">' + (i + 1) + '</td>';
                        htmlTableDiem += '<td class="detail">' + item.thoiGian + '</td>';
                        htmlTableDiem += '<td class="detail">' + item.diem + '</td>';
                        htmlTableDiem += '<td class="detail">' + item.xepLoai + '</td>';
                        htmlTableDiem += '</tr>';
                    });
                    $('#diem-ren-luyen tbody').html(htmlTableDiem);
                    var htmlTableKtkl = '';
                    $.each(data.listKtkl, function (i, item) {
                        htmlTableKtkl += '<tr>';
                        htmlTableKtkl += '<td class="detail">' + (i + 1) + '</td>';
                        htmlTableKtkl += '<td class="detail">' + item.thoiGian + '</td>';
                        htmlTableKtkl += '<td class="detail">' + item.tieuDe + '</td>';
                        htmlTableKtkl += '<td class="detail">' + item.noiDung + '</td>';
                        htmlTableKtkl += '</tr>';
                    });
                    $('#khenthuong-kyluat tbody').html(htmlTableKtkl);
                },
                error: function (e) {
                    console.log(e);
                }
            })
        });
        
        $(document).on("click", ".fa-wrench", function () {
            $.ajax({
                url: '/ho-so/id',
                type: 'GET',
                dataType: 'JSON',
                data: {
                    id : $(this).closest('tr').find('.hs-id').val()
                },
                success: function (data) {
                    $.each(data, function (key, value) {
                        if(key == "chucVu"){
                            $("select[class*='edit-idChucVu']").val(value.id);
                        } else if ((key == "chiDoan") || (key == "donVi")) {
                            $("select[class*='edit-idChiDoan']").val(value.id);
                            $("select[class*='edit-idDonVi']").val(value.donVi.id);
                        } else if(key =="gioiTinh"){
                            $("select[class*='edit-" + key + "']").val(value==true?1:0);
                        } else if(key =="taiKhoan"){
                            $("input[class*='edit-idTaiKhoan']").val(value==null?"":value.id);
                        } else {
                            $("input[class*='edit-" + key + "']").val(value);
                        }
                    });
                },
                error: function (e) {
                    console.log(e);
                }
            })
        });

        $(document).on("click", ".fa-trash", function () {
            var id = $(this).closest('tr').find('.hs-id').val();
            $('#delete-id').val(id);
        });

        $(document).on("click", "#pagination li", function () {
            var check = $(this).find('a').text();
            var previous = "«";
            var next = "»";
            var active = parseInt($('#pagination .active').text());
            var sort = $('#sort').val();
            if(sort == "asc"){
                sort = "desc";
            } else {
                sort = "asc"
            }
            if(check.localeCompare(previous) == 0){
                var data = {};
                data.numberRecord = $('#number-record').val();
                data.txtSearch = $('#txtSearch').val();
                data.columnName = $('#column-name').val();
                data.sort = sort;
                data.numberPage = (active - 1);
                $.ajax({
                    url: '/ho-so/list',
                    type: 'POST',
                    contentType: 'application/json; charset=utf-8',
                    dataType: 'JSON',
                    data: JSON.stringify(data),
                    success: function (data) {
                        generateHtmlData(data);
                    },
                    error: function (e) {
                        console.log(e);
                    }
                })
            } else if(check.localeCompare(next) == 0){
                var data = {};
                data.numberRecord = $('#number-record').val();
                data.txtSearch = $('#txtSearch').val();
                data.columnName = $('#column-name').val();
                data.sort = sort;
                data.numberPage = (active + 1);
                $.ajax({
                    url: '/ho-so/list',
                    type: 'POST',
                    contentType: 'application/json; charset=utf-8',
                    dataType: 'JSON',
                    data: JSON.stringify(data),
                    success: function (data) {
                        generateHtmlData(data);
                    },
                    error: function (e) {
                        console.log(e);
                    }
                })
            } else {
                var data = {};
                data.numberRecord = $('#number-record').val();
                data.txtSearch = $('#txtSearch').val();
                data.columnName = $('#column-name').val();
                data.sort = sort;
                data.numberPage = check;
                $.ajax({
                    url: '/ho-so/list',
                    type: 'POST',
                    contentType: 'application/json; charset=utf-8',
                    dataType: 'JSON',
                    data: JSON.stringify(data),
                    success: function (data) {
                        generateHtmlData(data);
                    },
                    error: function (e) {
                        console.log(e);
                    }
                })
            }
        });
        $('[data-toggle="tooltip"]').tooltip();
        $(document).ajaxComplete(function () {
            $('[data-toggle="tooltip"]').tooltip();
        })
    });
});