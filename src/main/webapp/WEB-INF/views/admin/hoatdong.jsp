<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:if test="${not empty message}">
	<div class="col-xs-12" style="margin-top: 20px">
		<div class="alert alert-success alert-dismissible">
			<button type="button" class="close" data-dismiss="alert">&times;</button>
			${message}
		</div>
	</div>
</c:if>
<div id="main">
	<div class="col-md-12">
		<c:if test="${loaiHoatDong == 1}">
			<script>
				window.loaiHoatDong = 'Chờ duyệt';
			</script>
			<h3 class="page-title">
				Danh sách hoạt động chờ duyệt
			</h3>
		</c:if>
		<c:if test="${loaiHoatDong == 2}">
			<script>
				window.loaiHoatDong = 'Đã duyệt';
			</script>
			<h3 class="page-title">
				Danh sách hoạt động được duyệt
			</h3>
		</c:if>
		<c:if test="${loaiHoatDong == 3}">
			<script>
				window.loaiHoatDong = 'Hủy bỏ';
			</script>
			<h3 class="page-title">
				Danh sách hoạt động hủy bỏ
			</h3>
		</c:if>
	</div>

	<!-- Table -->
	<table id="tableHoatDong" class="table table-striped table-hover">
		<thead>
			<tr>
				<th scope="col">Tên hoạt động</th>				
				<th scope="col">Đôi tượng tham gia</th>
				<th scope="col">Trạng thái</th>
				<th scope="col">Tác vụ</th>
			</tr>
		</thead>
	</table>	
</div>
<script src="${pageContext.servletContext.contextPath}/resources/js/admin/hoatdong.js"></script>
