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
<sf:form class="col-md-12" style="margin: 20px 0" modelAttribute="doanCoSoDto"
	action="${pageContext.servletContext.contextPath}/chi-doan/add"
	method="POST">
	<fieldset class="col-md-12">
		<legend>Thành lập đoàn cơ sở mới</legend>
		<div class="form-group">
			<label for="inputTenCoSo">Tên đoàn cơ sở<span
				class="required-field">*</span></label>
			<sf:input type="text" path="tenChiDoan"
				class="form-control" id="inputTenCoSo" aria-describedby="tenCSHelp"
				placeholder="Đoàn cơ sở..."/>
			<!--<small id="tenDNHelp" class="form-text text-muted">Tên đăng nhập không được trùng.</small>-->
		</div>
		<div class="form-group">
			<label for="inputKhoa">Khoa<span class="required-field">*</span></label>
			<sf:select class="form-control" id="quyenSelect" path="donVi"
					items="${khoa}"
					itemLabel="tenDonVi"
					itemValue="id"
				/>
			<sf:errors path="donVi" cssClass="help-block" element="em"/>
		</div>
		<div class="form-group">
			<button type="submit" class="btn btn-primary col-md-1"
				style="margin-right: 10px">OK</button>
			<button type="submit" class="btn btn-primary col-md-1">Hủy</button>
		</div>
	</fieldset>
</sf:form>