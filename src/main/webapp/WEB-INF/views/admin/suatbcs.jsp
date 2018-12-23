<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<sf:form class="col-md-12" style="margin: 20px 0"
	modelAttribute="tbcsDto"
	action="${pageContext.servletContext.contextPath}/thong-bao-chinh-sach/update"
	method="POST">
	<fieldset class="col-md-12">
		<legend>Sửa thông tin thông báo - chính sách</legend>
		<div class="form-group">
			<label for="inputTenTBCS">Tiêu đề<span class="required-field">*</span></label>
			<sf:input type="text" id="inputTenTBCS" path="tenThongBaoChinhSach"
				class="form-control" aria-describedby="tenTBCSHelp" value="${tbcs.tenThongBaoChinhSach }"/>
			<sf:errors path="tenThongBaoChinhSach" cssClass="invalid-feedback" element="div"></sf:errors>
		</div>
		<div class="form-group">
			<label for="inputNoiDung">Nội dung<span
				class="required-field">*</span></label>
			<sf:input type="text" path="noiDung"
				class="form-control" id="inputNoiDung"
				value="${tbcs.noiDung }"/>
			<sf:errors path="noiDung" cssClass="invalid-feedback" element="div"></sf:errors>
		</div>
		<div class="form-group">
			<label for="inputNguoiGui">Người gửi<span
				class="required-field">*</span></label>
			<sf:input type="text" path="nguoiGui"
				class="form-control" id="inputNguoiGui" value="${tbcs.nguoiGui }"/>
			<sf:errors path="nguoiGui" cssClass="invalid-feedback" element="div"></sf:errors>
		</div>
		<div class="form-group">
			<button type="submit" class="btn btn-primary col-md-1"
				style="margin-right: 10px">OK</button>
			<sf:hidden path="id"/>
		</div>
	</fieldset>
</sf:form>