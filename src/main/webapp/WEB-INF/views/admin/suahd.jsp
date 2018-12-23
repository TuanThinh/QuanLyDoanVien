<%@ page language="java" contentType="text/html; charset=UTF-8; encoding=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<sf:form class="col-md-12" style="margin: 20px 0" accept-charset="UTF-8"
	modelAttribute="hoatDongDto"
	action="${pageContext.servletContext.contextPath}/hoat-dong/update"
	method="POST">
	<fieldset class="col-md-12">
		<legend>Sửa thông tin hoạt động</legend>
		<div class="form-group">
			<label for="inputTenHoatDong">Tên hoạt động<span
				class="required-field">*</span></label>
			<sf:input type="text" path="tenHoatDong"
				class="form-control" id="inputTenHoatDong"
				aria-describedby="tenHDHelp" value="${hoatDong.tenHoatDong }" />
			<sf:errors path="tenHoatDong" cssClass="invalid-feedback" element="div"></sf:errors>
		</div>
		<div class="form-group">
			<label for="inputThoiGian">Thời gian tổ chức
				<span class="required-field">*</span>
			</label>
            <sf:input id="inputThoiGian" type='date' path="thoiGian"
            	class="form-control" value="${hoatDong.thoiGian }"/>
            <i class="fa fa-calendar"></i>
            <sf:errors path="thoiGian" cssClass="invalid-feedback" element="div"></sf:errors>
		</div>
		<div class="form-group">
			<label for="inputDiaDiem">Địa điểm tổ chức<span
				class="required-field">*</span></label>
			<sf:input type="text" path="diaDiem"
				class="form-control" id="inputDiaDiem" value="${hoatDong.diaDiem }"/>
			<sf:errors path="diaDiem" cssClass="invalid-feedback" element="div"></sf:errors>
		</div>
		<div class="form-group">
			<label for="inputDoiTuong">Đối tượng tham gia<span
				class="required-field">*</span></label>
			<sf:input type="text" path="doiTuongThamGia"
				class="form-control" id="inputDoiTuong" value="${hoatDong.doiTuongThamGia }"/>
			<sf:errors path="doiTuongThamGia" cssClass="invalid-feedback" element="div"></sf:errors>
		</div>
		<div class="form-group">
			<label for="quyenSelect">Trạng thái</label>
			<sf:select class="form-control" id="trangThaiSelect" path="trangThai"
				items="${listTrangThai}"
			/>
			<sf:errors path="trangThai" cssClass="invalid-feedback" element="div"/>
		</div>
		<div class="form-group">
			<button type="submit" class="btn btn-primary col-md-1"
				style="margin-right: 10px">OK</button>
			<button type="submit" class="btn btn-primary col-md-1">Hủy</button>
			<sf:hidden path="dvToChuc"/>
			<sf:hidden path="id"/>
		</div>
	</fieldset>
</sf:form>