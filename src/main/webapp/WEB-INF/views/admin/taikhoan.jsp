<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div id="main">
	<div class="col-md-12">
		<h3 class="page-title">Danh sách tài khoản</h3>
	</div>

	<!-- Table -->
	<table id="tableTaiKhoan"class="table table-striped table-hover">
		<thead>
			<tr>
				<th scope="col">Tên tài khoản</th>
				<th scope="col">Họ tên</th>
				<th scope="col">Mã sinh viên</th>
				<th scope="col">Quyền</th>
				<th scope="col">Tác vụ</th>
			</tr>
		</thead>
	</table>
</div>
<script src="${pageContext.servletContext.contextPath}/resources/js/admin/taikhoan.js"></script>

