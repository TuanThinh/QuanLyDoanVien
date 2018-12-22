$(document).ready(function () {
    /*function hienThiHoSo() {
        $.ajax({
            url: '/ho-so/detail',
            type: 'GET',
            dataType: 'JSON',
            data: {
                id: -1
            },
            success: function (data) {

                var hoso = data.hoSo[0];
                $('#ma-doan-vien').html(hoso.maSv);
                $('#ho-ten').html(hoso.hoTen);
                $('#ngay-sinh').html(hoso.ngaySinh);
                $('#up-ma-doan-vien').html('<input type="text" disabled="disabled" class="form-control" ' + 'value="' + (hoso.maSv) + '"' + '>');
                $('#up-ho-va-ten').html('<input type="text" disabled="disabled"  class="form-control" ' + 'value="' + hoso.hoTen + '"' + '>');
                $('#up-ngay-sinh').html('<input type="text" disabled="disabled" class="form-control" ' + 'value="' + hoso.ngaySinh + '"' + '>');
                $('#dia-chi').html('<input type="text"   class="form-control" ' + 'value="' + hoso.diaChi + '"' + '>');
                $('#so-dien-thoai').html('<input type="text"  name class="form-control" ' + 'value="' + hoso.sdt + '"' + '>');
                $('#dan-toc').html('<input type="text"  class="form-control" ' + 'value="' + hoso.danToc + '"' + '>');
                $('#quoc-tich').html('<input type="text" class="form-control" ' + 'value="' + hoso.quocTich + '"' + '>');
                $('#ton-giao').html('<input type="text"  class="form-control" ' + 'value="' + hoso.tonGiao + '"' + '>');
                $('#email').html('<input type="text"  class="form-control" ' + 'value="' + hoso.email + '"' + '>');
                $('#doi-tuong-chinh-sach').html('<input type="text"  class="form-control" ' + 'value="' + hoso.doiTuongChinhSach + '"' + '>');
                $('#ngay-vao-doan').html('<input type="text" disabled="disabled"  class="form-control" ' + 'value="' + hoso.ngayVaoDoan + '"' + '>');
                $('#ngay-vao-dang').html('<input type="text" disabled="disabled"  class="form-control" ' + 'value="' + hoso.ngayVaoDang + '"' + '>');
                $.each(data.hoSo[0], function (key, value) {
                    if (key == "chucVu") {
                        $('#chuc-vu').html('<input type="text" disabled="disabled"  class="form-control" ' + 'value="' + value.tenChucVu + '"' + '>');
                    } else if ((key == "chiDoan") || (key == "donVi")) {
                        $('#chi-doan').html('<input type="text" disabled="disabled"  class="form-control" ' + 'value="' + value.tenChiDoan + '"' + '>');
                        $('#don-vi').html('<input type="text" disabled="disabled"  class="form-control" ' + 'value="' + value.donVi.tenDonVi + '"' + '>');
                    } else if (key == "gioiTinh") {
                        var gt = value == true ? "Nam" : "Nữ";
                        var mm = " " + gt;
                        $('#gioi-tinh').html(value == true ? "Nam" : "Nữ");
                        $('#up-gioi-tinh').html('<input type="text" disabled="disabled"  class="form-control" ' + 'value="' + mm + '"' + '>');
                    } else {
                        $("strong[class*='hoSo-" + key + "']").html(value);
                    }
                });
            },
            error: function (e) {
                console.log(e);
            }
        })
    }*/
    function view(data) {
        var hoso = data.hoSo[0];
        $('#ma-doan-vien').html(hoso.maSv);
        $('#ho-ten').html(hoso.hoTen);
        $('#ngay-sinh').html(hoso.ngaySinh);
        // $('#hinh-anh').html('<input type="text" disabled="disabled" class="form-control" ' + 'value="' + (hoso.maSv) + '"' + '>');
        $('#up-ma-doan-vien').html('<input type="text"  name="maSv" readonly class="form-control" ' + 'value="' + (hoso.maSv) + '"' + '>');
        $('#up-ma-doan-vien').append('<input type="hidden"  name="id" readonly class="form-control" ' + 'value="' + (hoso.id) + '"' + '>');
        $('#up-ho-va-ten').html('<input type="text" name="hoTen" readonly  class="form-control" ' + 'value="' + hoso.hoTen + '"' + '>');
        $('#up-ngay-sinh').html('<input type="text" name="ngaySinh" readonly class="form-control" ' + 'value="' + hoso.ngaySinh + '"' + '>');
        $('#dia-chi').html('<input type="text" name="diaChi" class="form-control" ' + 'value="' + hoso.diaChi + '"' + '>');
        $('#so-dien-thoai').html('<input type="text" name="soDienThoai" name class="form-control" ' + 'value="' + hoso.sdt + '"' + '>');
        $('#dan-toc').html('<input type="text" name="danToc" class="form-control" ' + 'value="' + hoso.danToc + '"' + '>');
        $('#quoc-tich').html('<input type="text" name="quocTich" class="form-control" ' + 'value="' + hoso.quocTich + '"' + '>');
        $('#ton-giao').html('<input type="text" name="tonGiao" class="form-control" ' + 'value="' + hoso.tonGiao + '"' + '>');
        $('#email').html('<input type="text" name="email" class="form-control" ' + 'value="' + hoso.email + '"' + '>');
        $('#doi-tuong-chinh-sach').html('<input type="text" name="doiTuongChinhSach" class="form-control" ' + 'value="' + hoso.doiTuongChinhSach + '"' + '>');
        $('#ngay-vao-doan').html('<input type="text" name="ngayVaoDoan" readonly  class="form-control" ' + 'value="' + hoso.ngayVaoDoan + '"' + '>');
        $('#ngay-vao-dang').html('<input type="text" name="ngayVaoDang" readonly  class="form-control" ' + 'value="' + hoso.ngayVaoDang + '"' + '>');
        $.each(data.hoSo[0], function (key, value) {
            if (key == "chucVu") {
                $('#chuc-vu').html('<input type="text" readonly  class="form-control" ' + 'value="' + value.tenChucVu + '"' + '>');

                $('#chuc-vu').append('<input type="hidden" name="idChucVu" readonly  class="form-control" ' + 'value="' + value.id + '"' + '>');
            } else if ((key == "chiDoan") || (key == "donVi")) {
                $('#chi-doan').html('<input type="text"readonly  class="form-control" ' + 'value="' + value.tenChiDoan + '"' + '>');
                $('#don-vi').html('<input type="text" readonly  class="form-control" ' + 'value="' + value.donVi.tenDonVi + '"' + '>');

                $('#chi-doan').append('<input type="hidden" name="idChiDoan" readonly  class="form-control" ' + 'value="' + value.id + '"' + '>');
                $('#don-vi').append('<input type="hidden" name="idDonVi" readonly  class="form-control" ' + 'value="' + value.donVi.id + '"' + '>');
            } else if (key == "gioiTinh") {
                if(value == true){
                    $('#up-gioi-tinh').html('<input type="text" readonly  class="form-control" value="Nam">');

                    $('#up-gioi-tinh').append('<input type="hidden" name="gioiTinh" readonly  class="form-control" value="1">');
                } else {
                    $('#up-gioi-tinh').html('<input type="text" readonly  class="form-control" value="Nữ">');

                    $('#up-gioi-tinh').append('<input type="hidden" name="gioiTinh" readonly  class="form-control" value="0">');
                }
                // var gt = value == true ? "Nam" : "Nữ";
                // var mm = " " + gt;
                // $('#gioi-tinh').html(value == true ? "Nam" : "Nữ");
                // $('#up-gioi-tinh').html('<input type="text" readonly  class="form-control" ' + 'value="' + mm + '"' + '>');
                //
                // $('#up-gioi-tinh').html('<input type="hidden" name="gioiTinh" readonly  class="form-control" ' + 'value="' + mm + '"' + '>');
            } else {
                $("strong[class*='hoSo-" + key + "']").html(value);
            }
        });
    }

    $.ajax({
        url: '/ho-so/detail',
        type: 'GET',
        dataType: 'JSON',
        data: {
            id: -1
        },
        success: function (data) {
            view(data);

        }
    });

    function loadData() {
        $.ajax({
            url: '/ho-so/detail',
            type: 'GET',
            dataType: 'JSON',
            data: {
                id: -1
            },
            success: function (data) {
                view(data);
            }
        })
    }

    $(document).on("click", "#btn-cap-nhat", function (event) {
        event.preventDefault();
        var formData = $('#modal-ho-so-form').serializeArray();
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
            success: function (data) {
                if(data == true){
                    alert("Update thành công");
                    location.reload();
                }
            },
            error: function (e) {
                console.log(e);
            }
        });
    });



    /*$.ajax({
        url: '/ho-so/detail',
        type: 'GET',
        dataType: 'JSON',
        data: {
            id: -1
        },
        success: function (data) {

            var hoso = data.hoSo[0];
            $('#ma-doan-vien').html(hoso.maSv);
            $('#ho-ten').html(hoso.hoTen);
            $('#ngay-sinh').html(hoso.ngaySinh);
            $('#up-ma-doan-vien').html('<input type="text" disabled="disabled" class="form-control" ' + 'value="' + (hoso.maSv) + '"' + '>');
            $('#up-ho-va-ten').html('<input type="text" disabled="disabled"  class="form-control" ' + 'value="' + hoso.hoTen + '"' + '>');
            $('#up-ngay-sinh').html('<input type="text" disabled="disabled" class="form-control" ' + 'value="' + hoso.ngaySinh + '"' + '>');
            $('#dia-chi').html('<input type="text"   class="form-control" ' + 'value="' + hoso.diaChi + '"' + '>');
            $('#so-dien-thoai').html('<input type="text"  name class="form-control" ' + 'value="' + hoso.sdt + '"' + '>');
            $('#dan-toc').html('<input type="text"  class="form-control" ' + 'value="' + hoso.danToc + '"' + '>');
            $('#quoc-tich').html('<input type="text" class="form-control" ' + 'value="' + hoso.quocTich + '"' + '>');
            $('#ton-giao').html('<input type="text"  class="form-control" ' + 'value="' + hoso.tonGiao + '"' + '>');
            $('#email').html('<input type="text"  class="form-control" ' + 'value="' + hoso.email + '"' + '>');
            $('#doi-tuong-chinh-sach').html('<input type="text"  class="form-control" ' + 'value="' + hoso.doiTuongChinhSach + '"' + '>');
            $('#ngay-vao-doan').html('<input type="text" disabled="disabled"  class="form-control" ' + 'value="' + hoso.ngayVaoDoan + '"' + '>');
            $('#ngay-vao-dang').html('<input type="text" disabled="disabled"  class="form-control" ' + 'value="' + hoso.ngayVaoDang + '"' + '>');
            $.each(data.hoSo[0], function (key, value) {
                if (key == "chucVu") {
                    $('#chuc-vu').html('<input type="text" disabled="disabled"  class="form-control" ' + 'value="' + value.tenChucVu + '"' + '>');
                } else if ((key == "chiDoan") || (key == "donVi")) {
                    $('#chi-doan').html('<input type="text" disabled="disabled"  class="form-control" ' + 'value="' + value.tenChiDoan + '"' + '>');
                    $('#don-vi').html('<input type="text" disabled="disabled"  class="form-control" ' + 'value="' + value.donVi.tenDonVi + '"' + '>');
                } else if (key == "gioiTinh") {
                    var gt = value == true ? "Nam" : "Nữ";
                    var mm = " " + gt;
                    $('#gioi-tinh').html(value == true ? "Nam" : "Nữ");
                    $('#up-gioi-tinh').html('<input type="text" disabled="disabled"  class="form-control" ' + 'value="' + mm + '"' + '>');
                } else {
                    $("strong[class*='hoSo-" + key + "']").html(value);
                }
            });
        },
        error: function (e) {
            console.log(e);
        }
    })*/
});