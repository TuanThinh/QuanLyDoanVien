<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<sf:form class="col-md-12" style="margin: 20px 0" modelAttribute="hoatDong">
	<fieldset class="col-md-12">
		<legend>Phát động hoạt động mới</legend>
		<div class="form-group">
			<label for="inputTenHoatDong">Tên hoạt động<span
				class="required-field">*</span></label>
				<sf:input type="text" path="tenHoatDong"
				class="form-control" id="inputTenHoatDong"
				aria-describedby="tenHDHelp" placeholder="Hoạt động..." required=""/>
		</div>
		<div class="form-group">
			<label for="inputThoiGian">Thời gian tổ chức<span
				class="required-field">*</span></label>
				<sf:input type="text" path="thoiGian"
				class="form-control" id="inputThoiGian" placeholder="Thời gian..."
				required=""/>
		</div>
		<div class="form-group">
			<label for="inputDiaDiem">Địa điểm tổ chức<span
				class="required-field">*</span></label>
				<sf:input type="text" path="diaDiem"
				class="form-control" id="inputDiaDiem" placeholder="Địa điểm..."
				required=""/>
		</div>
		<div class="form-group">
			<label for="inputDoiTuong">Đối tượng tham gia<span
				class="required-field">*</span></label>
				<sf:input type="text" path="doiTuongThamGia"
				class="form-control" id="inputDoiTuong" placeholder="Đối tượng..."
				required=""/>
		</div>
		<div class="form-group">
			<button type="submit" class="btn btn-primary col-md-1"
				style="margin-right: 10px">OK</button>
			<button type="submit" class="btn btn-primary col-md-1">Hủy</button>

			<sf:hidden path="id"/>
			<sf:hidden path="dvToChuc"/>
			<sf:hidden path="trangThai"/>
		</div>
	</fieldset>
</sf:form>