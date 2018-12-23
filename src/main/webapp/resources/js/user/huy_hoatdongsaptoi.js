$(document).ready(function () {
    /*function gnrHoatDong(data) {
        var html = '';
        $.each(data, function (i, item) {
            html += '<tr>';
            html += ' <td class="hd-id">'+item.id+'</td>';
            html += '<td class="hd-ten">' + item.tenHoatDong + '</td>';
            html += '<td class="hd-thoi-gian">' + "25/10/2018" + '</td>';
            html += '<td class="hd-dia-diem">' + item.diaDiem + '</td>';
            html += '<td class="hd-don-vi-to-chuc">' + item.dvToChuc + '</td>';
            html += '<td class="hd-doi-tuong-tham-gia">' + item.doiTuongThamGia + '</td>';
            html += '<td class="hd-trang-thai">' + item.trangThai + '</td>';

        });
        $('#danh-sach-hoat-dong tbody').html(html);
    }
    $.ajax({
        url:'/hoat-dong/list',
        type:'GET',
        dataTyPe:'JSON',
        data:{
            id: -1
        },
        success:function (data) {
            gnrHoatDong(data);
        },
        error: function (e) {
            console.log(e);
        }
    });*/


    $('#timKiem').keyup(function() {
        var value = $(this).val().toLowerCase();
        $("#danh-sach-thong-bao tbody tr").filter(function() {
            $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
        });
    });
})