<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="main">
	<div class="col-md-12">
		<h3 class="page-title">Danh sách đoàn viên</h3>
	</div>
	<!-- Table -->
	<table id="tableDoanVien" class="table table-striped table-hover">
		<thead>
			<tr>
				<th scope="col">Họ tên</th>
				<th scope="col">Chi đoàn</th>
				<th scope="col">Khoa</th>
				<th scope="col">Giới tính</th>
				<th scope="col">Ngày sinh</th>
				<th scope="col">Tác vụ</th>
			</tr>
		</thead>
	</table>
</div>
<script src="${pageContext.servletContext.contextPath}/resources/js/admin/doanvien.js"></script>