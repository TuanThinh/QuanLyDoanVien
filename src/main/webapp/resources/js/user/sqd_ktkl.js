$(document).ready(function () {
    $.when(
        $.ajax({
            url: '/sqd-khen-thuong-ky-luat/list',
            type: 'GET',
            dataType: 'JSON',
            success: function (data) {
                var html = '';
                $.each(data, function (i, item) {
                    html += '<tr>';
                    html += '<td class="sqd-tieude">' + item.tieuDe + '</td>';
                    html += '<td class="sqd-noidung">' + item.noiDung + '</td>';
                    html += '<td>' +
                        '<span data-toggle="modal" data-target="#modalEdit">' +
                        '<i class="fa fa-wrench" data-toggle="tooltip" data-original-title="Sửa" data-placement="top"></i>' +
                        '</span> | ' +
                        '<span data-toggle="modal" data-target="#modalDelete">' +
                        '<i class="fa fa-trash" data-toggle="tooltip" data-original-title="Xóa" data-placement="top"></i>' +
                        '</span>' +
                        '</td>';
                    html += '</tr>';
                })
                $('#sqd-ktkl tbody').html(html);
            }
        })
    ).then(function () {
        $('[data-toggle="tooltip"]').tooltip();
    })
});
