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
                    html += '<td><input type="checkbox" class="checkbox-id" value="' + item.id + '"/>' +
                        '<input type="hidden" class="id" value="' + item.id + '"/></td>';
                    html += '<td class="tieude">' + item.tieuDe + '</td>';
                    // html += '<td class="noidung">' + item.noiDung + '</td>';
                    html += '<td class="ngaygui">' + item.ngayGui + '</td>';
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
    ).then(function () {
        $('#btn-delete').click(function () {
            $('.checkbox-id input:checked').each(function () {
                alert($(this).val())
            })
        });
        
        $('.fa-eye').click(function () {
            $.ajax({
                url: '/bao-cao/id',
                type: 'GET',
                dataType: 'JSON',
                data: {
                    id : $(this).closest('tr').find('.id').val()
                },
                success: function (data) {
                    $('#detail-tieude').html(data.tieuDe);
                    $('#detail-noidung').html(data.noiDung);
                    $('#detail-ngaygui').html(data.ngayGui);
                }
            })
        });

        $('#search').keyup(function() {
            var value = $(this).val().toLowerCase();
            $("#table-baocao tbody tr").filter(function() {
                $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
            });
        });
    })
});