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
<sf:form class="col-md-12" style="margin: 20px 0" accept-charset="UTF-8"
	modelAttribute="tbcsDto"
	action="${pageContext.servletContext.contextPath}/thong-bao-chinh-sach/add"
	method="POST">
	<fieldset class="col-md-12">
		<legend>Thông báo - chính sách mới</legend>
		<div class="form-group">
			<label for="inputTenTBCS">Tiêu đề<span class="required-field">*</span></label>
			<sf:input type="text" id="inputTenTBCS" path="tenThongBaoChinhSach"
				class="form-control" aria-describedby="tenTBCSHelp" placeholder="Tiêu đề..."/>
			<sf:errors path="tenThongBaoChinhSach" cssClass="invalid-feedback" element="div"></sf:errors>
		</div>
		<div class="form-group">
			<label for="inputNoiDung">Nội dung<span
				class="required-field">*</span></label>
			<sf:input type="text" path="noiDung"
				class="form-control" id="inputNoiDung"
				placeholder="Nội dung chính..."/>
			<sf:errors path="noiDung" cssClass="invalid-feedback" element="div"></sf:errors>
		</div>
		<div class="form-group">
			<label for="inputNguoiGui">Người gửi<span
				class="required-field">*</span></label>
			<sf:input type="text" path="nguoiGui"
				class="form-control" id="inputNguoiGui" placeholder="Người gửi..."/>
			<sf:errors path="nguoiGui" cssClass="invalid-feedback" element="div"></sf:errors>
		</div>
		<!-- <div class="form-group">
			<label>Thông tin chi tiết</label>
			<div class="input-group mb-3">
				<div class="custom-file">
					<input type="file" id="inputFile" class="custom-file-input">
					<label id="fileName" class="custom-file-label">Choose file</label>
				</div>
				<div class="input-group-append">
					<span class="input-group-text">Upload</span>
				</div>
			</div>
		</div> -->
		<div class="form-group">
			<button type="submit" class="btn btn-primary col-md-1"
				style="margin-right: 10px">OK</button>
		</div>
	</fieldset>
</sf:form>