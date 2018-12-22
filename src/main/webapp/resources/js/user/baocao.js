$(document).ready(function () {
    $.when(
        $.ajax({
            url: '/bao-cao/list',
            type: 'GET',
            dataType: 'JSON',
            data: {
                id : -1
            },
            success: function (data) {
                var html = '';
                $.each(data, function (i, item) {
                    html += '<tr>';
                    html += '<td><input type="checkbox" name=""/></td>';
                    html += '<td>' + item.tieuDe + '</td>';
                    html += '<td>' + item.noiDung + '</td>';
                    html += '<td>' + item.ngayGui + '</td>';
                    html += '<td>' +
                        '<span data-toggle="modal" data-target="#modalDetail">' +
                        '<i class="fa fa-eye" data-toggle="tooltip" data-original-title="Chi tiết" data-placement="top" ></i>' +
                        '</span>' +
                        '</td>';
                    html += '</tr>';
                });
                $('#table-baocao tbody').html(html);
            }
        })
    ).then(function (value) {
        $('#search').keyup(function() {
            var value = $(this).val().toLowerCase();
            $("#table-baocao tbody tr").filter(function() {
                $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
            });
        });
    })
});