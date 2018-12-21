<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>

	<div class="form-group">
		<label>Tiêu đề</label>
		<input class="form-control" type="text" id="tieuDe" placeholder="Nhập tiêu đề"/>
	</div>

	<div class="form-group">
		<label>Nội dung</label>
		<textarea class="form-control" name="" id="noiDung" cols="30" rows="10" placeholder="Nhập nội dung"></textarea>
	</div>

	<div class="button">
		<button class="btn btn-primary" id="submit">Gửi</button>
	</div>

<style>
	.inner.bg-light.lter form {
		margin: 15px;
	}
</style>

<script src="${pageContext.servletContext.contextPath}/resources/js/user/phanhoi.js">

</script>