<%@ page language="java" contentType="text/html; charset=UTF-8; encoding=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${not empty message}">
	<div class="col-xs-12" style="margin-top: 20px">
		<div class="alert alert-success alert-dismissible">
			<button type="button" class="close" data-dismiss="alert">&times;</button>
			${message}
		</div>
	</div>
</c:if>
<sf:form class="col-md-12" style="margin: 20px 0" accept-charset="UTF-8"
	modelAttribute="hoatDongDto"
	action="${pageContext.servletContext.contextPath}/hoat-dong/add"
	method="POST">
	<fieldset class="col-md-12">
		<legend>Tổ chức hoạt động mới</legend>
		<div class="form-group">
			<label for="inputTenHoatDong">Tên hoạt động<span
				class="required-field">*</span></label>
			<sf:input type="text" path="tenHoatDong"
				class="form-control" id="inputTenHoatDong"
				aria-describedby="tenHDHelp" placeholder="Hoạt động..."/>
			<sf:errors path="tenHoatDong" cssClass="help-block" element="em"></sf:errors>
		</div>
		<div class="form-group">
			<label for="inputThoiGian">Thời gian tổ chức
				<span class="required-field">*</span>
			</label>
			
                <sf:input id="inputThoiGian" type='date' path="thoiGian"
                	class="form-control" placeholder="Thời gian..."/>
                <i class="fa fa-calendar"></i>
            
            <sf:errors path="thoiGian" cssClass="invalid-feedback" element="div"></sf:errors>
		</div>
		<div class="form-group">
			<label for="inputDiaDiem">Địa điểm tổ chức<span
				class="required-field">*</span></label>
			<sf:input type="text" path="diaDiem"
				class="form-control" id="inputDiaDiem" placeholder="Địa điểm..."/>
			<sf:errors path="diaDiem" cssClass="help-block" element="em"></sf:errors>
		</div>
		<div class="form-group">
			<label for="inputDoiTuong">Đối tượng tham gia<span
				class="required-field">*</span></label>
			<sf:input type="text" path="doiTuongThamGia"
				class="form-control" id="inputDoiTuong" placeholder="Đối tượng..."/>
			<sf:errors path="doiTuongThamGia" cssClass="help-block" element="em"></sf:errors>
		</div>
		<div class="form-group">
			<button type="submit" class="btn btn-primary col-md-1"
				style="margin-right: 10px">OK</button>
			<button type="submit" class="btn btn-primary col-md-1">Hủy</button>
			<sf:hidden path="dvToChuc"/>
			<sf:hidden path="trangThai"/>
		</div>
	</fieldset>
</sf:form>