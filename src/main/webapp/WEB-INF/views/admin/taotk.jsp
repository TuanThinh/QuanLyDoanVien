<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<c:if test="${not empty message}">
	<div class="col-xs-12" style="margin-top:20px">
		<div class="alert alert-success alert-dismissible">
			<button type="button" class="close" data-dismiss="alert">&times;</button>
			${message}
		</div>
	</div>
</c:if>
<sf:form class="col-md-12" style="margin: 20px 0" modelAttribute="taiKhoanDto"
	action="${pageContext.servletContext.contextPath}/tai-khoan/add"
	method="POST">
	<div class="row">
		<fieldset class="col-md-12">
			<legend>Thêm tài khoản mới</legend>
			<div class="form-group row">
				<label for="inputMaSv" class="col-sm-2 col-form-label">Mã
					sinh viên<span class="required-field">*</span>
				</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" path="maSv"
						id="inputMaSv" placeholder="Mã sinh viên..."/>
				</div>
			</div>
			<div class="form-group">
				<label for="inputTenTaiKhoan">Tên tài khoản<span
					class="required-field">*</span></label>
				<sf:input type="text" path="tenTaiKhoan"
					class="form-control" id="inputTenTaiKhoan" placeholder="Tên tài khoản..."/>
			</div>
			<div class="form-group">
				<label for="inputPassword">Mật khẩu<span
					class="required-field">*</span></label>
				<sf:input type="password" path="matKhau"
					class="form-control" id="inputPassword" placeholder="Mật khẩu..."/>
			</div>
			<div class="form-group">
				<label for="inputConfirmPassword">Xác nhận mật khẩu<span
					class="required-field">*</span></label>
				<sf:input type="password" path="nhapLaiMatKhau"
					class="form-control" id="inputConfirmPassword"
					placeholder="Xác nhận mật khẩu..."/>
			</div>

			<div class="form-group">
				<label for="quyenSelect">Quyền hạn</label>
				<sf:select class="form-control" id="quyenSelect" path="quyen"
					items="${quyen}"
					itemLabel="tenQuyen"
					itemValue="id"
				/>
				<sf:errors path="quyen" cssClass="help-block" element="em"/>
			</div>

			<div class="form-group">
				<button type="submit" class="btn btn-primary col-md-1"
					style="margin-right: 10px">OK</button>
				<sf:hidden path="idHoSo"/>
				<sf:hidden path="kichHoat"/>
			</div>
		</fieldset>
	</div>
</sf:form>