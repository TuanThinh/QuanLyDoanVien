$(document).ready(function() {
	$('#hoso-diem').click(function () {
		var data = {};
		data.maSv = $('#inputMaSv').val();
		data.tenTaiKhoan = $('#inputTenTaiKhoan').val();
		data.matKhau = $('#inputPassword').val();
		data.xacNhanMatKhau = $('#inputConfirmPassword').val();
		data.kichHoat = true;
		data.quyen = $('#quyenSelect').val();
		$.ajax({
	        url: '/tai-khoan/tao-tai-khoan',
	        type: 'POST',
	        contentType: 'application/json; charset=utf-8',
	        dataType: 'JSON',
	        data: JSON.stringify(data),
	        success: function (data) {
	            alert("Success!")
	        },
	        error: function (e) {
	            console.log(e);
	        }
	    })
	})
})