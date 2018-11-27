<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin - <tiles:getAsString name="title"></tiles:getAsString></title>

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
<script
	src="${pageContext.servletContext.contextPath}/resources/js/jquery-3.2.1.min.js"></script>
</head>
<body>
	<div class="wrapper">
		<tiles:insertAttribute name="left"></tiles:insertAttribute>
		<div id="content">
			<div class="container-fluid">
				<tiles:insertAttribute name="top"></tiles:insertAttribute>
				<div class="container">
					<tiles:insertAttribute name="content"></tiles:insertAttribute>
				</div>
			</div>
		</div>
	</div>
	
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
	<script>
		window.contextRoot = '${pageContext.servletContext.contextPath}'
	</script>
	<script
		src="${pageContext.servletContext.contextPath}/resources/js/admin/sidebar.js"></script>
</body>
</html>