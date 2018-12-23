<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${not empty message}">
	<div class="col-xs-12" style="margin-top:20px">
		<div class="alert alert-success alert-dismissible">
			<button type="button" class="close" data-dismiss="alert">&times;</button>
			${message}
		</div>
	</div>
</c:if>
<div id="main">
	<script>
		window.idChiDoan = '${idChiDoan}';
	</script>
	<div class="col-md-12">
		<h3 class="page-title"></h3>
	</div>

	<!-- Table -->
	<table id="table"class="table table-striped table-hover">
		<thead>
			<tr>
				<th scope="col">Họ tên</th>
				<th scope="col">Mã sinh viên</th>
				<th scope="col">Tên tài khoản</th>
				<th scope="col">Chức vụ</th>
				<th scope="col">Tác vụ</th>
			</tr>
		</thead>
	</table>
</div>
<script src="${pageContext.servletContext.contextPath}/resources/js/admin/doanvien.js"></script>

