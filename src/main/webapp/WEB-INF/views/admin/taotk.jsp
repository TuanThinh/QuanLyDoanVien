<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<c:if test="${not empty message }">
	<div class="col-xs-12">
		<div class="alert alert-success alert-dismissible">
			<button type="button" class="close" data-dismiss="alert">@times;</button>
			${message}
		</div>
	</div>
</c:if>
<sf:form class="col-md-12" style="margin: 20px 0" modelAttribute="taiKhoan"
	action="${pageContext.servletContext.contextPath}/admin/tai-khoan/them"
	method="POST">
	<div class="row">
		<fieldset class="col-md-12">
			<legend>Thêm tài khoản mới</legend>
			<!-- <div class="form-group row">
				<label for="staticMaSV" class="col-sm-2 col-form-label">Mã
					sinh viên<span class="required-field">*</span>
				</label>
				<div class="col-sm-10">
					<sf:input type="text" class="form-control" path=""
						id="staticMaSV" placeholder="Mã sinh viên..."/>
				</div>
			</div> -->
			<div class="form-group">
				<label for="inputTenTaiKhoan">Tên tài khoản<span
					class="required-field">*</span></label>
					<sf:input type="text" path="tenTaiKhoan"
					class="form-control" id="inputTenTaiKhoan"
					aria-describedby="tenDNHelp" placeholder="Tên tài khoản..."
					required=""/>
			</div>
			<div class="form-group">
				<label for="inputPassword">Mật khẩu<span
					class="required-field">*</span></label>
					<sf:input type="password" path="matKhau"
					class="form-control" id="inputPassword" placeholder="Mật khẩu..."
					required=""/>
			</div>
			<div class="form-group">
				<label for="inputConfirmPassword">Xác nhận mật khẩu<span
					class="required-field">*</span></label>
					<input type="password"
					class="form-control" id="inputConfirmPassword"
					placeholder="Xác nhận mật khẩu..." required=""/>
			</div>

			<fieldset>
				<div class="form-group">
					<label for="quyenSelect">Quyền hạn</label>
					<sf:select class="form-control" id="quyenSelect" path="listQuyen"
						items="${quyen}"
						itemLabel="tenQuyen"
						itemValue="id"
					/>
				</div>
			</fieldset>

			<div class="form-group">
				<button type="submit" class="btn btn-primary col-md-1"
					style="margin-right: 10px">OK</button>
				<sf:hidden path="id"/>
				<sf:hidden path="ngayLap"/>
				<sf:hidden path="kichHoat"/>
				<sf:hidden path="truyCapLanCuoi"/>
			</div>
	</div>
</sf:form>