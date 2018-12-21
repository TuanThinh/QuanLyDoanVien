$(document).ready(function () {
    $('#submit').click(function () {
        tinyMCE.triggerSave();
        var data = {
            idHoSo : -1,
            tieuDe : $('#tieuDe').val(),
            noiDung : $('#noiDung').val()
        };
        $.ajax({
            url: '/phan-hoi/add',
            type: 'POST',
            dataType: 'JSON',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data),
            success: function (data) {
                if (data == true){
                    alert("Gửi thành công");
                    location.reload();
                } else {
                    alert("Gửi thất bại");
                }
            },
            error: function (e) {
                console.log(e);
            }
        })
    });
})