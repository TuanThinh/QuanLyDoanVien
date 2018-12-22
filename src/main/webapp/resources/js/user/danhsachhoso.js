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
                '<i class="fa fa-wrench update-hoso" data-toggle="tooltip" data-original-title="Sửa" data-placement="top"></i>' +
                '</span> | ' +
                '<span data-toggle="modal" data-target="#modalDelete">' +
                '<i class="fa fa-trash delete-hoso" data-toggle="tooltip" data-original-title="Xóa" data-placement="top"></i>' +
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
        }),
        $.ajax({
            url: '/hoat-dong/list',
            type: 'GET',
            dataType: 'JSON',
            success: function (data) {
                $.each(data, function (i, item) {
                    $('.select-hoatdong').append($('<option>', {
                        value: item.id,
                        text: item.tenHoatDong
                    }))
                })
            },
            error: function (e) {
                console.log(e);
            }
        }),
        $.ajax({
            url: '/sqd-khen-thuong-ky-luat/list',
            type: 'GET',
            dataType: 'JSON',
            success: function (data) {
                $.each(data, function (i, item) {
                    $('.select-ktkl').append($('<option>', {
                        value: item.id,
                        text: item.tieuDe
                    }))
                })
            },
            error: function (e) {
                console.log(e);
            }
        })
    ).then(function () {
        function validateEmail(email){
            var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
            if (email != ""){
                if (!filter.test(email)) {
                    return false;
                } else {
                    return true;
                }
            }
        }

        $('#add-email').blur(function () {
            var email = $('#add-email').val();
            $('.email').html("");
            $('#add-email').css({"border-color" : "#ccc"});
            if (!validateEmail(email)){
                var html = '<i class="fa fa-exclamation-circle" data-toggle="tooltip" data-original-title="Email&nbsp;không&nbsp;hợp&nbsp;lệ" data-placement="top"></i>';
                $('.email').html(html);
                $('#add-email').css({"border-color" : "red"});
                // $('#add-email').focus();
                return false;
            } else {
                $('.email').html("");
                $('#add-email').css({"border-color" : "#ccc"});
                return true;
            }
        });

        $('#edit-email').blur(function () {
            var email = $('#edit-email').val();
            $('.email').html("");
            $('#edit-email').css({"border-color" : "#ccc"});
            if (!validateEmail(email)){
                var html = '<i class="fa fa-exclamation-circle" data-toggle="tooltip" data-original-title="Email&nbsp;không&nbsp;hợp&nbsp;lệ" data-placement="top"></i>';
                $('.email').html(html);
                $('#edit-email').css({"border-color" : "red"});
                // $('#add-email').focus();
                return false;
            } else {
                $('.email').html("");
                $('#edit-email').css({"border-color" : "#ccc"});
                return true;
            }
        });

        $('#btnAdd').click(function (even) {
            even.preventDefault();
            var email = $('#add-email').val();
            if (!validateEmail(email)){
                $('#add-email').focus();
                return false;
            }
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
            var email = $('#edit-email').val();
            if (!validateEmail(email)){
                $('#edit-email').focus();
                return false;
            }
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
                    id : $('#id-hs-selected').val()
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

        function tableDiem(data){
            var htmlTableDiem = '';
            $.each(data, function (i, item) {
                htmlTableDiem += '<tr>';
                htmlTableDiem += '<td>' + (i + 1) + '</td>';
                htmlTableDiem += '<td>' + item.thoiGian + '</td>';
                htmlTableDiem += '<td>' + item.diem + '</td>';
                htmlTableDiem += '<td>' + item.xepLoai + '</td>';
                htmlTableDiem += '<td>';
                htmlTableDiem += '<input type="hidden" class="id-diem" value="' + item.id + '">';
                htmlTableDiem += '<span data-toggle="modal" data-target="#modal-edit-diem">' +
                    '<i class="fa fa-wrench update-diem" data-toggle="tooltip" data-original-title="Sửa" data-placement="top"></i>' +
                    '</span> | ' +
                    '<span data-toggle="modal" data-target="#modal-delete-diem">' +
                    '<i class="fa fa-trash delete-diem" data-toggle="tooltip" data-original-title="Xóa" data-placement="top"></i>' +
                    '</span>';
                htmlTableDiem += '</td>';
                htmlTableDiem += '</tr>';
            });
            $('#diem-ren-luyen tbody').html(htmlTableDiem);
        }

        function tableKtkl(data){
            var htmlTableKtkl = '';
            $.each(data, function (i, item) {
                htmlTableKtkl += '<tr>';
                htmlTableKtkl += '<td>' + (i + 1) + '</td>';
                htmlTableKtkl += '<td>' + item.thoiGian + '</td>';
                htmlTableKtkl += '<td>' + item.tieuDe + '</td>';
                htmlTableKtkl += '<td>' + item.noiDung + '</td>';
                htmlTableKtkl += '<td>';
                htmlTableKtkl += '<input type="hidden" class="id-ktkl" value="' + item.id + '">';
                htmlTableKtkl += '<span data-toggle="modal" data-target="#modal-edit-ktkl">' +
                    '<i class="fa fa-wrench update-ktkl" data-toggle="tooltip" data-original-title="Sửa" data-placement="top"></i>' +
                    '</span> | ' +
                    '<span data-toggle="modal" data-target="#modal-delete-ktkl">' +
                    '<i class="fa fa-trash delete-ktkl" data-toggle="tooltip" data-original-title="Xóa" data-placement="top"></i>' +
                    '</span>';
                htmlTableKtkl += '</td>';
                htmlTableKtkl += '</tr>';
            });
            $('#khenthuong-kyluat tbody').html(htmlTableKtkl);
        }

        function tableHdtg(data){
            var htmlTableHdtg = '';
            $.each(data, function (i, item) {
                htmlTableHdtg += '<tr>';
                htmlTableHdtg += '<td>' + (i + 1) + '</td>';
                htmlTableHdtg += '<td>' + item.thoiGian + '</td>';
                htmlTableHdtg += '<td>' + item.tenHoatDong + '</td>';
                htmlTableHdtg += '<td>' + item.diaDiem + '</td>';
                htmlTableHdtg += '<td>';
                htmlTableHdtg += '<input type="hidden" class="id-hdtg" value="' + item.id + '">';
                htmlTableHdtg += '<span data-toggle="modal" data-target="#modal-edit-hdtg">' +
                    '<i class="fa fa-wrench update-hdtg" data-toggle="tooltip" data-original-title="Sửa" data-placement="top"></i>' +
                    '</span> | ' +
                    '<span data-toggle="modal" data-target="#modal-delete-hdtg">' +
                    '<i class="fa fa-trash delete-hdtg" data-toggle="tooltip" data-original-title="Xóa" data-placement="top"></i>' +
                    '</span>';
                htmlTableHdtg += '</td>';
                htmlTableHdtg += '</tr>';
            });
            $('#hoat-dong-tham-gia tbody').html(htmlTableHdtg);
        }

        function hoSoDetail(idHoSo){
            $.ajax({
                url: '/ho-so/detail',
                type: 'GET',
                data: {
                    id : idHoSo
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

                    tableDiem(data.listDiem);
                    tableKtkl(data.listKtkl);
                    tableHdtg(data.listHdtg);
                },
                error: function (e) {
                    console.log(e);
                }
            })
        }

        $(document).on("click", ".fa-eye", function () {
            var idHoSo = $(this).closest('tr').find('.hs-id').val();
            $('#id-hs-selected').val(idHoSo);
            hoSoDetail(idHoSo)
        });
        
        $(document).on("click", ".update-hoso", function () {
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

        $(document).on("click", ".delete-hoso", function () {
            var id = $(this).closest('tr').find('.hs-id').val();
            $('#id-hs-selected').val(id);
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

        $('.modal-hidden').on('hidden.bs.modal', function () {
            var idHoSo = $('#id-hs-selected').val();
            hoSoDetail(idHoSo);
            $('#modalDetail').modal('hide');
            $('#modalDetail').modal('show')
        });

        // $('.modal-hidden').on('shown.bs.modal', function () {
        //     $('#modalDetail').modal('hide');
        //     $('#modalDetail').modal('show')
        // });

        // ------- Diem ------
        $('#btn-save-diem').click(function () {
            var data = {
                idHoSo : $('#id-hs-selected').val(),
                diem : $('#diem-add').val(),
                thoiGian : $('#diem-thoigian-add').val()
            };
            $.ajax({
                url: '/diem/add',
                type: 'POST',
                dataType: 'JSON',
                contentType: 'application/json',
                data: JSON.stringify(data),
                success: function (data) {
                    if (data == true){
                        alert("Thêm thành công");
                        $('.modal-hidden').modal('hide');
                    } else {
                        alert("Thêm thất bại");
                    }
                }
            })
        });

        $(document).on("click", ".update-diem", function () {
            $.ajax({
                url: '/diem/id',
                type: 'GET',
                dataType: 'JSON',
                data: {
                    id : $(this).closest('tr').find('.id-diem').val()
                },
                success: function (data) {
                    $('#id-diem-select').val(data.id);
                    $('#diem-edit').val(data.diem);
                    $('#diem-thoigian-edit').val(data.thoiGian);
                },
                error: function (e) {
                    console.log(e)
                }
            })
        });

        $('#btn-update-diem').click(function () {
            var data = {
                id :  $('#id-diem-select').val(),
                diem : $('#diem-edit').val(),
                thoiGian : $('#diem-thoigian-edit').val()
            };
            $.ajax({
              url: '/diem/update',
              type: 'PUT',
              dataType: 'JSON',
              contentType: 'application/json',
              data: JSON.stringify(data),
              success: function (data) {
                  if (data == true){
                      alert("Cập nhật thành công");
                      $('.modal-hidden').modal('hide');
                  } else {
                      alert("Cập nhật thất bại");
                  }
              },
              error: function (e) {
                  console.log(e)
              }
            })
        });

        $(document).on("click", ".delete-diem", function () {
            $('#id-diem-select').val($(this).closest('tr').find('.id-diem').val());
        });

        $('#btn-delete-diem').click(function () {
            $.ajax({
                url: '/diem/delete',
                type: 'POST',
                dataType: 'JSON',
                data: {
                    id : $('#id-diem-select').val()
                },
                success: function (data) {
                    if (data == true){
                        alert("Xóa thành công");
                        $('.modal-hidden').modal('hide');
                    } else {
                        alert("Xóa thất bại");
                    }
                },
                error: function (e) {
                    console.log(e)
                }
            })
        });

        $('#search-diem').keyup(function() {
            var value = $(this).val().toLowerCase();
            $("#diem-ren-luyen tbody tr").filter(function() {
                $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
            });
        });

        // ------- Khen thuong ky luat ---------
        $('#btn-save-ktkl').click(function () {
            var data = {
                idHoSo : $('#id-hs-selected').val(),
                idSqdKtkl : $('#ktkl-add').val(),
                thoiGian : $('#ktkl-thoigian-add').val()
            };
            $.ajax({
                url: '/khen-thuong-ky-luat/add',
                type: 'POST',
                dataType: 'JSON',
                contentType: 'application/json',
                data: JSON.stringify(data),
                success: function (data) {
                    if (data == true){
                        alert("Thêm thành công");
                        $('.modal-hidden').modal('hide');
                    } else {
                        alert("Thêm thất bại");
                    }
                }
            })
        });

        $(document).on("click", ".update-ktkl", function () {
            $.ajax({
                url: '/khen-thuong-ky-luat/id',
                type: 'GET',
                dataType: 'JSON',
                data: {
                    id : $(this).closest('tr').find('.id-ktkl').val()
                },
                success: function (data) {
                    $('#id-ktkl-select').val(data.id);
                    $('#ktkl-edit').val(data.sqdKhenThuongKyLuat.id);
                    $('#ktkl-thoigian-edit').val(data.thoiGian);
                },
                error: function (e) {
                    console.log(e)
                }
            })
        });

        $('#btn-update-ktkl').click(function () {
            var data = {
                id :  $('#id-ktkl-select').val(),
                idSqdKtkl : $('#ktkl-edit').val(),
                thoiGian : $('#ktkl-thoigian-edit').val()
            };
            $.ajax({
                url: '/khen-thuong-ky-luat/update',
                type: 'PUT',
                dataType: 'JSON',
                contentType: 'application/json',
                data: JSON.stringify(data),
                success: function (data) {
                    if (data == true){
                        alert("Cập nhật thành công");
                        $('.modal-hidden').modal('hide');
                    } else {
                        alert("Cập nhật thất bại");
                    }
                },
                error: function (e) {
                    console.log(e)
                }
            })
        });

        $(document).on("click", ".delete-ktkl", function () {
            $('#id-ktkl-select').val($(this).closest('tr').find('.id-ktkl').val());
        });

        $('#btn-delete-ktkl').click(function () {
            $.ajax({
                url: '/khen-thuong-ky-luat/delete',
                type: 'POST',
                dataType: 'JSON',
                data: {
                    id : $('#id-ktkl-select').val()
                },
                success: function (data) {
                    if (data == true){
                        alert("Xóa thành công");
                        $('.modal-hidden').modal('hide');
                    } else {
                        alert("Xóa thất bại");
                    }
                },
                error: function (e) {
                    console.log(e)
                }
            })
        });

        $('#search-ktkl').keyup(function() {
            var value = $(this).val().toLowerCase();
            $("#khenthuong-kyluat tbody tr").filter(function() {
                $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
            });
        });

        //--------- Hoat dong tham gia ---------
        $('#btn-save-hdtg').click(function () {
            var data = {
                idHoSo : $('#id-hs-selected').val(),
                idHoatDong : $('#hdtg-add').val(),
                thoiGian : $('#hdtg-thoigian-add').val()
            };
            $.ajax({
                url: '/tham-gia/add',
                type: 'POST',
                dataType: 'JSON',
                contentType: 'application/json',
                data: JSON.stringify(data),
                success: function (data) {
                    if (data == true){
                        alert("Thêm thành công");
                        $('.modal-hidden').modal('hide');
                    } else {
                        alert("Thêm thất bại");
                    }
                }
            })
        });

        $(document).on("click", ".update-hdtg", function () {
            $.ajax({
                url: '/tham-gia/id',
                type: 'GET',
                dataType: 'JSON',
                data: {
                    id : $(this).closest('tr').find('.id-hdtg').val()
                },
                success: function (data) {
                    $('#id-hdtg-select').val(data.id);
                    $('#hdtg-edit').val(data.hoatDong.id);
                    $('#hdtg-thoigian-edit').val(data.thoiGian);
                },
                error: function (e) {
                    console.log(e)
                }
            })
        });

        $('#btn-update-hdtg').click(function () {
            var data = {
                id :  $('#id-hdtg-select').val(),
                idHoatDong : $('#hdtg-edit').val(),
                thoiGian : $('#hdtg-thoigian-edit').val()
            };
            $.ajax({
                url: '/tham-gia/update',
                type: 'PUT',
                dataType: 'JSON',
                contentType: 'application/json',
                data: JSON.stringify(data),
                success: function (data) {
                    if (data == true){
                        alert("Cập nhật thành công");
                        $('.modal-hidden').modal('hide');
                    } else {
                        alert("Cập nhật thất bại");
                    }
                },
                error: function (e) {
                    console.log(e)
                }
            })
        });

        $(document).on("click", ".delete-hdtg", function () {
            $('#id-hdtg-select').val($(this).closest('tr').find('.id-hdtg').val());
        });

        $('#btn-delete-hdtg').click(function () {
            $.ajax({
                url: '/tham-gia/delete',
                type: 'POST',
                dataType: 'JSON',
                data: {
                    id : $('#id-hdtg-select').val()
                },
                success: function (data) {
                    if (data == true){
                        alert("Xóa thành công");
                        $('.modal-hidden').modal('hide');
                    } else {
                        alert("Xóa thất bại");
                    }
                },
                error: function (e) {
                    console.log(e)
                }
            })
        });

        $('#search-hoatdong').keyup(function() {
            var value = $(this).val().toLowerCase();
            $("#hoat-dong-tham-gia tbody tr").filter(function() {
                $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
            });
        });

        $('[data-toggle="tooltip"]').tooltip();
        $(document).ajaxComplete(function () {
            $('[data-toggle="tooltip"]').tooltip();
        })
    });
});