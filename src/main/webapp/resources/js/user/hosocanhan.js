$(document).ready(function () {
    function hienThiDiem(data) {
        var htmlTableDiem = '';
        var diem=data.listDiem;
        $.each(diem, function (i, item) {
            htmlTableDiem += '<tr>';
            htmlTableDiem += '<td class="detail">' + (i+1) + '</td>';
            htmlTableDiem += '<td class="detail">' + item.thoiGian + '</td>';
            htmlTableDiem += '<td class="detail">' + item.diem + '</td>';
            htmlTableDiem += '<td class="detail">' + item.xepLoai + '</td>';
            htmlTableDiem += '</tr>';
        });
        $('#diem-ren-luyen tbody').html(htmlTableDiem);
    }
    $.ajax({
        url: '/ho-so/detail',
        type: 'GET',
        dataType:'JSON',
        data: {
            id :-1
        },
        success:function (data) {
            hienThiDiem(data);
        },
        error: function (e) {
            console.log(e);
        }
    })


    function hienThiKhenThuongKyLuat(data) {
        var htmlTableKtkl = '';
        var ob=data.listKtkl;
        $.each(ob, function (i, item) {
            htmlTableKtkl += '<tr>';
            htmlTableKtkl += '<td class="detail">' + (i + 1) + '</td>';
            htmlTableKtkl += '<td class="detail">' + item.thoiGian + '</td>';
            htmlTableKtkl += '<td class="detail">' + item.tieuDe + '</td>';
            htmlTableKtkl += '<td class="detail">' + item.noiDung + '</td>';
            htmlTableKtkl += '</tr>';
        });
        $('#khenthuong-kyluat tbody').html(htmlTableKtkl);
    }
    $.ajax({
        url: '/ho-so/detail',
        type: 'GET',
        dataType:'JSON',
        data: {
            id :-1
        },
        success:function (data) {
            hienThiKhenThuongKyLuat(data);
        },
        error: function (e) {
            console.log(e);
        }
    })

    $.ajax({
        url: '/ho-so/detail',
        type: 'GET',
        dataType:'JSON',
        data: {
            id :-1
        },
        success: function (data) {
            var hoso = data.hoSo[0];
            $('#ma-doan-vien').html(hoso.maSv);
            $('#ho-ten').html(hoso.hoTen);
            $('#ngay-sinh').html(hoso.ngaySinh);
            $('#dia-chi').html('<input type="text"  disabled="disabled" class="form-control" ' + 'value="' + hoso.diaChi + '"' + '>');
            $('#so-dien-thoai').html('<input type="text" disabled="disabled" class="form-control" ' + 'value="' + hoso.sdt + '"' + '>');
            $('#dan-toc').html('<input type="text" disabled="disabled" class="form-control" ' + 'value="' + hoso.danToc + '"' + '>');
            $('#quoc-tich').html('<input type="text" disabled="disabled" class="form-control" ' + 'value="' + hoso.quocTich + '"' + '>');
            $('#ton-giao').html('<input type="text" disabled="disabled" class="form-control" ' + 'value="' + hoso.tonGiao + '"' + '>');
            $('#email').html('<input type="text" disabled="disabled" class="form-control" ' + 'value="' + hoso.email + '"' + '>');
            $('#doi-tuong-chinh-sach').html('<input type="text" disabled="disabled" class="form-control" ' + 'value="' + hoso.doiTuongChinhSach + '"' + '>');
            $('#ngay-vao-doan').html('<input type="text" disabled="disabled"  class="form-control" ' + 'value="' + hoso.ngayVaoDoan + '"' + '>');
            $('#ngay-vao-dang').html('<input type="text" disabled="disabled"  class="form-control" ' + 'value="' + hoso.ngayVaoDang + '"' + '>');
            $.each(data.hoSo[0], function (key, value) {
                if(key == "chucVu"){
                    $('#chuc-vu').html('<input type="text" disabled="disabled"  class="form-control" ' + 'value="' + value.tenChucVu + '"' + '>');
                } else if ((key == "chiDoan") || (key == "donVi")) {
                    $('#chi-doan').html('<input type="text" disabled="disabled"  class="form-control" ' + 'value="' + value.tenChiDoan + '"' + '>');
                    $('#don-vi').html('<input type="text" disabled="disabled"  class="form-control" ' + 'value="' + value.donVi.tenDonVi+ '"' + '>');
                } else if(key =="gioiTinh"){
                    $('#gioi-tinh').html(value==true?"Nam":"Nữ")
                } else {
                    $("strong[class*='hoSo-" + key + "']").html(value);
                }
            });

        },
        error: function (e) {
            console.log(e);
        }
    })
});