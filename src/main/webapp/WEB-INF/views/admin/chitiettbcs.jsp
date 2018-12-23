<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<form class="col-md-12" style="margin: 20px 0">
	<fieldset class="col-md-12">
		<legend>Thông báo - chính sách</legend>
		<div class="form-group">
			<label for="inputTenTBCS">Tiêu đề</label>
			<input type="text" id="inputTenTBCS"
				class="form-control" aria-describedby="tenTBCSHelp" value="${tbcs.tenThongBaoChinhSach }"
				disabled/>
		</div>
		<div class="form-group">
			<label for="inputNoiDung">Nội dung</label>
			<input type="text" class="form-control" id="inputNoiDung" value="${tbcs.noiDung }" disabled/>
		</div>
		<div class="form-group">
			<label for="inputNguoiGui">Người gửi</label>
			<input type="text" class="form-control" id="inputNguoiGui" value="${tbcs.nguoiGui }"
			disabled/>
		</div>
		<div class="form-group">
			<a href="${pageContext.servletContext.contextPath}/admin/tb-cs/danh-sach">
				<button type="button" class="btn btn-primary col-md-1"
				style="margin-right: 10px">OK</button>
			</a>
		</div>
	</fieldset>
</form>