<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<form class="col-md-12" style="margin: 20px 0">
	<fieldset class="col-md-12">
		<legend>${baoCao.tieuDe }</legend>
		<div class="form-group">
			<label for="inputNoiDung">Nội dung</label>
			<div id="inputNoiDung">${baoCao.noiDung }</div>
		</div>
		<div class="form-group">
			<label for="inputNguoiGui">Người gửi</label>
			<p class="form-control" id="inputNguoiGui" style="font-style: italic">${nguoiGui }
			</p>
		</div>
		<div class="form-group">
			<a href="${pageContext.servletContext.contextPath}/admin/bao-cao/danh-sach">
				<button type="button" class="btn btn-primary col-md-1"
				style="margin-right: 10px">OK</button>
			</a>
		</div>
	</fieldset>
</form>