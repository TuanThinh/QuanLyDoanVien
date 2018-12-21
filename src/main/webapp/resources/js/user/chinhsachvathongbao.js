$(document).ready(function () {
    function gnrThongBaoChinhSach(data) {
        var html = '';
        $.each(data, function (i, item) {
            html += '<tr>';
            html += '<td class="cstb-thoigian">' + "20/11/2017" + '</td>';
            html += '<td class="cstb-tennguoigui">' + item.nguoiGui + '</td>';
            html += '<td class="cstb-tieude">' + item.tenThongBaoChinhSach + '</td>';
            html += '<td>' +
                '<input type="" class="tb-id" value="' + item.id + '"/>' +
                '<span data-toggle="modal" data-target="#modalDetail">' +
                '<i class="fa fa-eye" id="xem" data-toggle="tooltip" data-original-title="Chi tiết" data-placement="top"></i>' +
                '</span> ' +
                '</td>';
            html += '</tr>'

            html+='<textarea class="noi-dung">'+item.noiDung+'</textarea>';
        });
        $('#danh-sach-thong-bao tbody').html(html);
    }


    $.ajax({
        url: '/thong-bao-chinh-sach/list',
        type: 'GET',
        dataType: 'JSON',
        data: {
            id: -1
        },
        success: function (data) {
            gnrThongBaoChinhSach(data);
        },
        error: function (e) {
            console.log(e);
        }
    })

    function hienThiNoiDungThongBao(data){
        var html='';
        $.each(data,function (i, item) {
            html+='<textarea class="noi-dung">'+item.noiDung+'</textarea>';
        });
        $('#modalDetail textarea').html('<p>o day ko co gi</p>');
    }

    /*$.ajax({
        url: '/thong-bao-chinh-sach/id',
        type: 'GET',
        dataType: 'JSON',
        success: function (data) {
            hienThiNoiDungThongBao(data);
        },
        error: function (e) {
            console.log(e);
        }
    })*/

    $("#xem").on("click",function () {
        var html='';
        $.ajax({
            url: '/thong-bao-chinh-sach/id',
            type: 'GET',
            dataType: 'JSON',
            data:{
              id:  $(this).closest('tr').find('.tb-id').val()
            },
            success: function (data) {
                html+='<textarea class="noi-dung">'+data.noiDung+'</textarea>';
            },
            error: function (e) {
                console.log(e);
            }
        })
    });
});
