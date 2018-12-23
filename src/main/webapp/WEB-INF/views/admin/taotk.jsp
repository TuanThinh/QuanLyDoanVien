<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<sf:form class="col-md-12" style="margin: 20px 0" modelAttribute="taiKhoanDto"
	action="${pageContext.servletContext.contextPath}/tai-khoan/add"
	method="POST">
	<div class="row">
		<fieldset class="col-md-12">
			<legend>Thêm tài khoản mới</legend>
			<div class="form-group">
				<label for="inputTenTaiKhoan">Tên tài khoản<span
					class="required-field">*</span></label>
				<sf:input type="text" path="tenTaiKhoan"
					class="form-control" id="inputTenTaiKhoan" placeholder="Tên tài khoản..."/>
				<sf:errors path="tenTaiKhoan" cssClass="invalid-feedback" element="div"></sf:errors>
			</div>
			<div class="form-group">
				<label for="inputPassword">Mật khẩu<span
					class="required-field">*</span></label>
				<sf:input type="password" path="matKhau"
					class="form-control" id="inputPassword" placeholder="Mật khẩu..."/>
				<sf:errors path="matKhau" cssClass="invalid-feedback" element="div"></sf:errors>
			</div>
			<div class="form-group">
				<label for="inputConfirmPassword">Xác nhận mật khẩu<span
					class="required-field">*</span></label>
				<sf:input type="password" path="nhapLaiMatKhau"
					class="form-control" id="inputConfirmPassword"
					placeholder="Xác nhận mật khẩu..."/>
				<sf:errors path="nhapLaiMatKhau" cssClass="invalid-feedback" element="div"></sf:errors>
			</div>

			<div class="form-group">
				<label for="quyenSelect">Quyền hạn</label>
				<sf:select class="form-control" id="quyenSelect" path="quyen"
					items="${listQuyen}"
					itemLabel="tenQuyen"
					itemValue="id"
				/>
				<sf:errors path="quyen" cssClass="invalid-feedback" element="div"/>
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