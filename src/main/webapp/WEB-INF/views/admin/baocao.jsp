<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${not empty message}">
	<div class="col-xs-12" style="margin-top:20px">
		<div class="alert alert-success alert-dismissible">
			<button type="button" class="close" data-dismiss="alert">&times;</button>
			${message}
		</div>
	</div>
</c:if>
<div id="main">
	<div class="col-md-12">
		<h3 class="page-title">Danh sách báo cáo</h3>
	</div>

	<!-- Table -->
	<table id="tableBaoCao"class="table table-striped table-hover">
		<thead>
			<tr>
				<th scope="col">Tiêu đề</th>
				<th scope="col">Ngày gửi</th>
				<th scope="col">Tác vụ</th>
			</tr>
		</thead>
	</table>
</div>
<script src="${pageContext.servletContext.contextPath}/resources/js/admin/baocao.js"></script>