$(document).ready(function () {
    $.when(
        $.ajax({
            url: '/ho-so/all',
            type: 'GET',
            dataType: 'JSON',
            success: function (data) {
                var html = '';
                $.each(data, function (i, item) {
                    html += '<tr>';
                    html += '<td class="hs-hinhanh">';
                    html += '<img src="' + item.hinhAnh + '" alt="Avatar"/>';
                    html += '</td>';

                    html += '<td class="hs-ma">' + item.maSv + '</td>';
                    html += '<td class="hs-hoten">' + item.hoTen + '</td>';
                    html += '<td class="hs-ngaysinh">' + item.ngaySinh + '</td>';
                    html += '<td class="hs-gioitinh">' + item.gioiTinh + '</td>';
                    html += '<td class="hs-diachi">' + item.diaChi + '</td>';
                    html += '<td class="hs-chidoan">' + item.chiDoan.tenChiDoan + '</td>';
                    html += '<td class="hs-donvi">' + item.chiDoan.donVi.tenDonVi + '</td>';

                    html += '<td class="hs-sdt column-hidden">' + item.sdt + '</td>';
                    html += '<td class="hs-email column-hidden">' + item.email + '</td>';
                    html += '<td class="hs-quoctich column-hidden">' + item.quocTich + '</td>';
                    html += '<td class="hs-dantoc column-hidden">' + item.danToc + '</td>';
                    html += '<td class="hs-tongoao column-hidden">' + item.tonGiao + '</td>';
                    html += '<td class="hs-dtcs column-hidden">' + item.doiTuongChinhSach + '</td>';
                    html += '<td class="hs-ngayvaodoan column-hidden">' + item.ngayVaoDoan + '</td>';
                    html += '<td class="hs-ngayvaodang column-hidden">' + item.ngayVaoDang + '</td>';
                    html += '<td class="hs-chucvu column-hidden">' + item.chucVu + '</td>';
                    html += '<td class="hs-taikhoan column-hidden">' + item.taiKhoan + '</td>';
                    html += '<td class="hs-quanly column-hidden">' + item.idQuanLy + '</td>';

                    html += '<td>' +
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
                    html += '</tr>'
                });
                $('#danh-sach-ho-so tbody').html(html);
            },
            error: function () {
                alert("Error");
            }
        })
    ).then(function () {
        $('[data-toggle="tooltip"]').tooltip();
    });

});