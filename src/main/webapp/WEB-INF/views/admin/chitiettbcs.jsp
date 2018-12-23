<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<form class="col-md-12" style="margin: 20px 0">
	<fieldset class="col-md-12">
		<legend>Thông báo - chính sách</legend>
		<div class="form-group">
			<label for="inputTenTBCS">Tiêu đề</label>
			<p id="inputTenTBCS" class="form-control" value="${tbcs.tenThongBaoChinhSach }"
				style="font-style: italic"></p>
		</div>
		<div class="form-group">
			<label for="inputNoiDung">Nội dung</label>
			<p class="form-control" id="inputNoiDung" value="${tbcs.noiDung }"></p>
		</div>
		<div class="form-group">
			<label for="inputNguoiGui">Người gửi</label>
			<p class="form-control" id="inputNguoiGui" value="${tbcs.nguoiGui }"
				style="font-style: italic">
			</p>
		</div>
		<div class="form-group">
			<a href="${pageContext.servletContext.contextPath}/admin/tb-cs/danh-sach">
				<button type="button" class="btn btn-primary col-md-1"
				style="margin-right: 10px">OK</button>
			</a>
		</div>
	</fieldset>
</form>