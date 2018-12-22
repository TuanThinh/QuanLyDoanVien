<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<form action="" method="post" accept-charset="utf-8">
    <div class="form-group">
        <label>Tiêu đề</label>
        <input class="form-control" type="text" id="tieuDe" placeholder="Nhập tiêu đề"/>
    </div>

    <div class="form-group">
        <label>Nội dung</label>
        <textarea class="form-control" name="noidung" id="noiDung" cols="30" rows="10" placeholder="Nhập nội dung"></textarea>
    </div>

    <div class="button">
        <button type="button" id="submit" class="btn btn-primary">Gửi</button>
    </div>
</form>

<script>
    $(document).ready(function () {
        $('#submit').click(function () {
            tinyMCE.triggerSave();
            var data = {
                idHoSo : -1,
                tieuDe : $('#tieuDe').val(),
                noiDung : $('#noiDung').val()
            };
            $.ajax({
                url: '/bao-cao/add',
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
</script>

<style>
    .inner.bg-light.lter form {
        margin: 15px;
    }
</style>