<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<form class="col-md-12" style="margin: 20px 0">
	<fieldset class="col-md-12">
		<legend>Thành lập đoàn cơ sở mới</legend>
		<div class="form-group">
			<label for="inputTenCoSo">Tên đoàn cơ sở<span
				class="required-field">*</span></label> <input type="text"
				class="form-control" id="inputTenCoSo" aria-describedby="tenCSHelp"
				placeholder="Đoàn cơ sở..." required="">
			<!--<small id="tenDNHelp" class="form-text text-muted">Tên đăng nhập không được trùng.</small>-->
		</div>
		<div class="form-group">
			<label for="inputBiThu">Bí thư đoàn cơ sở</label> <input type="text"
				class="form-control" id="inputBiThu" placeholder="Bí thư...">
		</div>
		<div class="form-group">
			<label for="inputKhoa">Khoa<span class="required-field">*</span></label>
			<input type="text" class="form-control" id="inputKhoa"
				placeholder="Tên khoa..." required="">
		</div>
		<div class="form-group">
			<button type="submit" class="btn btn-primary col-md-1"
				style="margin-right: 10px">OK</button>
			<button type="submit" class="btn btn-primary col-md-1">Hủy</button>
		</div>
	</fieldset>
</form>