$(document).ready(function () {
    $.when(
        $.ajax({
            url: '/khen-thuong-ky-luat/all',
            type: 'GET',
            dataType: 'JSON',
            success: function (data) {
                var html = '';
                $.each(data, function (i, item) {
                    html += '<tr>';
                    html += '<td class="hs-ma">' + item.maSv + '</td>';
                    html += '<td class="hs-hoten">' + item.hoTen + '</td>';
                    html += '<td class="hs-ngaysinh">' + item.ngaySinh + '</td>';
                    html += '<td class="hs-chidoan column-hidden">' + item.chiDoan + '</td>';
                    html += '<td class="hs-donvi column-hidden">' + item.donVi + '</td>';
                    html += '<td class="hs-tieude">' + item.tieuDe + '</td>';
                    html += '<td class="hs-noidung">' + item.noiDung + '</td>';
                    html += '<td class="hs-thoigian">' + item.thoiGian + '</td>';
                    html += '<td>' +
                        '<span data-toggle="modal" data-target="#modalDetail">' +
                        '<i class="fa fa-eye" data-toggle="tooltip" data-original-title="Chi tiết" data-placement="top" ></i>' +
                        '</span> | ' +
                        '<span data-toggle="modal" data-target="#modalAdd">' +
                        '<i class="fa fa-plus-circle" data-toggle="tooltip" data-original-title="Thêm" data-placement="top" ></i>' +
                        '</span> | ' +
                        '<span data-toggle="modal" data-target="#modalEdit">' +
                        '<i class="fa fa-wrench" data-toggle="tooltip" data-original-title="Sửa" data-placement="top"></i>' +
                        '</span> | ' +
                        '<span data-toggle="modal" data-target="#modalDelete">' +
                        '<i class="fa fa-trash" data-toggle="tooltip" data-original-title="Xóa" data-placement="top"></i>' +
                        '</span>';
                    html += '</td>';
                })
                $('#khen-thuong-ky-luat tbody').html(html);
            }
        })
    ).then(function () {
        $('[data-toggle="tooltip"]').tooltip();
    })
});
