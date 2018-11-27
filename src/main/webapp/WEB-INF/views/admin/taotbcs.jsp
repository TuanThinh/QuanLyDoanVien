<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<form class="col-md-12" style="margin: 20px 0">
	<fieldset class="col-md-12">
		<legend>Thông báo - chính sách mới</legend>
		<div class="form-group">
			<label for="inputTenTBCS">Tiêu đề<span class="required-field">*</span></label>
			<input type="text" class="form-control" id="inputTenTBCS"
				aria-describedby="tenTBCSHelp" placeholder="Tiêu đề..." required="">
		</div>
		<div class="form-group">
			<label for="inputNoiDung">Nội dung<span
				class="required-field">*</span></label> <input type="text"
				class="form-control" id="inputNoiDung"
				placeholder="Nội dung chính..." required="">
		</div>
		<div class="form-group">
			<label for="inputNguoiGui">Người gửi<span
				class="required-field">*</span></label> <input type="text"
				class="form-control" id="inputNguoiGui" placeholder="Người gửi..."
				required="">
		</div>
		<div class="form-group">
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
		</div>
		<div class="form-group">
			<button type="submit" class="btn btn-primary col-md-1"
				style="margin-right: 10px">OK</button>
			<button type="submit" class="btn btn-primary col-md-1">Hủy</button>
		</div>
	</fieldset>
</form>