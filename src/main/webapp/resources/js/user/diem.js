$(document).ready(function () {
    $.when(
        $.ajax({
            url: '/diem/all',
            type: 'GET',
            dataType: 'JSON',
            success: function (data) {
                var html = '';
                $.each(data, function (i, item) {
                    html += '<tr>';
                    html += '<td class="hs-ma">' + item.maSv + '</td>';
                    html += '<td class="hs-hoten">' + item.hoTen + '</td>';
                    html += '<td class="hs-ngaysinh column-hidden">' + item.ngaySinh + '</td>';
                    html += '<td class="hs-chidoan column-hidden">' + item.chiDoan + '</td>';
                    html += '<td class="hs-donvi column-hidden">' + item.donVi + '</td>';
                    html += '<td class="hs-diem">' + item.diem + '</td>';
                    html += '<td class="hs-thoigian">' + item.thoiGian + '</td>';
                    html += '<td class="hs-ghichu">' + item.ghiChu + '</td>';
                    html += '<td>' +
                        '<span data-toggle="modal" data-target="#modalAdd">' +
                        '<i class="fa fa-plus-circle" data-toggle="tooltip" data-original-title="Thêm" data-placement="top" ></i>' +
                        '</span> | ' +
                        '<span data-toggle="modal" data-target="#modalEdit">' +
                        '<i class="fa fa-wrench" data-toggle="tooltip" data-original-title="Sửa" data-placement="top"></i>' +
                        '</span> | ' +
                        '<span data-toggle="modal" data-target="#modalDelete">' +
                        '<i class="fa fa-trash" data-toggle="tooltip" data-original-title="Xóa" data-placement="top"></i>' +
                        '</span>' +
                        '</td>';
                    html += '</tr>';
                });
                $('#diem-ho-so tbody').html(html);
            }
        })
    ).then(function () {
        $('[data-toggle="tooltip"]').tooltip();
    })
});