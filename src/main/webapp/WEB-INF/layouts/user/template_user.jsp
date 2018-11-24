<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<!--IE Compatibility modes-->
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!--Mobile first-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title><tiles:getAsString name="title" /></title>

<meta name="description"
	content="Free Admin Template Based On Twitter Bootstrap 3.x">
<meta name="author" content="">

<meta name="msapplication-TileColor" content="#5bc0de" />
<meta name="msapplication-TileImage"
	content="${pageContext.servletContext.contextPath}/resources/imgs/metis-tile.png" />

<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/css/bootstrap.min.css">

<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/css/font-awesome.min.css">

<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/css/user/main.css">

<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/css/user/metisMenu.css">

<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/css/user/onoffcanvas.css">
<script src="${pageContext.servletContext.contextPath}/resources/js/jquery-3.2.1.min.js"></script>

<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/css/datepicker.css">
<script src="${pageContext.servletContext.contextPath}/resources/js/datepicker.js"></script>
<script src="${pageContext.servletContext.contextPath}/resources/js/highcharts.js"></script>
<script src="${pageContext.servletContext.contextPath}/resources/tinymce/tinymce.min.js"></script>
<script>tinymce.init({ selector: 'textarea' });</script>

<style>
	.datepicker-container {
		z-index: 1051 !important;
	}
</style>
</head>
<body class="  ">
	<div class="bg-dark dk" id="wrap">
	
		<div id="top">
			<tiles:insertAttribute name="top" />
			<header class="head">
				<div class="search-bar">
					<form class="main-search" action="">
						<div class="input-group">
							<input type="text" class="form-control"
								placeholder="Live Search ..."> <span
								class="input-group-btn">
								<button class="btn btn-primary btn-sm text-muted" type="button">
									<i class="fa fa-search"></i>
								</button>
							</span>
						</div>
					</form>
					<!-- /.main-search -->
				</div>
				<!-- /.search-bar -->
				<div class="main-bar">
					<h3>
						<i class="fa fa-home"></i>&nbsp;
						<tiles:getAsString name="title"></tiles:getAsString>
					</h3>
				</div>
				<!-- /.main-bar -->
			</header>
			<!-- /.head -->
		</div>
	</div>
		<!-- /#top -->

		<div id="left">
			<tiles:insertAttribute name="left" />
		</div>
		<!-- /#left -->

		<div id="content">
			<div class="outer">
				<div class="inner bg-light lter">
					<tiles:insertAttribute name="content" />
				</div>
				<!-- /.inner -->
			</div>
			<!-- /.outer -->
		</div>
		<!-- /#content -->

		<div id="right" class="onoffcanvas is-right is-fixed bg-light"
			aria-expanded=false>
			<tiles:insertAttribute name="right" />
		</div>
		<!-- /#right -->

	<!-- /#wrap -->
	<footer class="Footer bg-dark dker">
		<tiles:insertAttribute name="footer" />
	</footer>
	<!-- /#footer -->

	<!-- #helpModal -->
	<div id="helpModal" class="modal fade">
		<tiles:insertAttribute name="help"></tiles:insertAttribute>
	</div>

	<!-- /.modal -->
	<!-- /#helpModal -->
	<!--jQuery -->
	<!--For Development Only. Not required -->
	<!-- <script>
                less = {
                    env: "development",
                    relativeUrls: false,
                    rootpath: "/assets/"
                };
            </script> -->
	<!-- <script src="https://cdnjs.cloudflare.com/ajax/libs/less.js/2.7.1/less.js"></script> -->

	<!--Bootstrap -->
	<script src="${pageContext.servletContext.contextPath}/resources/js/bootstrap.min.js"></script>

	<!-- MetisMenu -->
	<script src="${pageContext.servletContext.contextPath}/resources/js/user/metisMenu.js"></script>
	<!-- onoffcanvas -->
	<script src="${pageContext.servletContext.contextPath}/resources/js/user/onoffcanvas.js"></script>
	<!-- Screenfull -->
	<script src="${pageContext.servletContext.contextPath}/resources/js/user/screenfull.js"></script>


	<!-- Metis core scripts -->
	<script src="${pageContext.servletContext.contextPath}/resources/js/user/core.js"></script>
	<!-- Metis demo scripts -->
	<!-- <script src="assets/js/app.js"></script> -->


	<!-- <script src="assets/js/style-switcher.js"></script> -->

    <script>
        $('.input-datepicker').datepicker({
            format: 'yyyy-MM-dd'
        })
    </script>
</body>

</html>
