<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quản lý đoàn viên - Ban Thanh niên</title>

<!-- Bootstrap -->
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath}/resources/css/admin/bootstrap-litera.css">
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath}/resources/css/admin/dataTables.bootstrap4.css">
<!-- Page style -->
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath}/resources/css/admin/webstyle.css">
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath}/resources/css/admin/sidebar.css">
<!-- Font awesome -->
<link rel="stylesheet"
	href="${pageContext.servletContext.contextPath}/resources/css/font-awesome.min.css">
</head>
<body>
	<div class="wrapper">
		<div class="container-fluid">
			<div id="top" class="row">
				<tiles:insertAttribute name="top" />
			</div>
		</div>
			<!-- Sidebar -->
		<div class="container-fluid">
			<div id="left">
				<tiles:insertAttribute name="left" />
			</div>
			<div id="content">
			</div>
			<!-- Main content -->
			<div id="main-content">
				<tiles:insertAttribute name="content" />
			</div>
		</div>
	</div>
	<script
		src="${pageContext.servletContext.contextPath}/resources/js/jquery-3.2.1.min.js"></script>
	<script
		src="${pageContext.servletContext.contextPath}/resources/js/admin/bootstrap.bundle.min.js"></script>
	<script type="text/javascript">
		$('[data-toggle="tooltip"]').tooltip();
		$('[data-toggle="popover"]').popover({
			container : 'body'
		});
	</script>
	<script
		src="${pageContext.servletContext.contextPath}/resources/js/admin/jquery.dataTables.js"></script>
	<script
		src="${pageContext.servletContext.contextPath}/resources/js/admin/dataTables.bootstrap4.js"></script>

	<!-- Page JS -->
	<script
		src="${pageContext.servletContext.contextPath}/resources/js/admin/sidebar.js"></script>
	<script
		src="${pageContext.servletContext.contextPath}/resources/js/admin/taikhoan.js"></script>
</body>
</html>