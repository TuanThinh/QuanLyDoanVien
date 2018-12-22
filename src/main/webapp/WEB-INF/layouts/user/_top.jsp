<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>	
	
	<!-- .navbar -->
	<nav class="navbar navbar-inverse navbar-static-top">
		<div class="container-fluid">
	
			<!-- Brand and toggle get grouped for better mobile display -->
			<header class="navbar-header">
	
				<a href="user" class="navbar-brand"><img
					src="${pageContext.servletContext.contextPath}/resources/imgs/logo.png" alt=""></a>
	
			</header>
	
			<div class="topnav">
				<%--<div class="btn-group">--%>
					<%--<a data-placement="bottom" data-original-title="Fullscreen"--%>
						<%--data-toggle="tooltip" class="btn btn-default btn-sm"--%>
						<%--id="toggleFullScreen"> <i--%>
						<%--class="glyphicon glyphicon-fullscreen"></i>--%>
					<%--</a>--%>
				<%--</div>--%>
				<div class="btn-group">
					<a data-placement="bottom" data-original-title="Thông báo"
						data-toggle="tooltip" class="btn btn-default btn-sm"> <i
						class=" fa fa-bell"></i> <span class="label label-warning">5</span>
					</a> <a data-placement="bottom" data-original-title="Tin nhắn" href="#"
						data-toggle="tooltip" class="btn btn-default btn-sm"> <i
						class="fa fa-comments"></i> <span class="label label-danger">4</span>
					</a> <a data-placement="bottom" data-original-title="Help"
						data-toggle="modal" class="btn btn-default btn-sm"
						href="#helpModal"> <i class="fa fa-question"></i>
					</a>
				</div>
				<div class="btn-group">
					<a href="/logout" data-toggle="tooltip"
						data-original-title="Đăng xuất" data-placement="bottom"
						class="btn btn-metis-1 btn-sm"> <i class="fa fa-power-off"></i>
					</a>
				</div>
				<div class="btn-group">
					<a data-placement="bottom" data-original-title="Show / Hide Left"
						data-toggle="tooltip" class="btn btn-primary btn-sm toggle-left"
						id="menu-toggle"> <i class="fa fa-bars"></i>
					</a> <a href="#right" data-toggle="onoffcanvas"
						class="btn btn-default btn-sm" aria-expanded="false"> <span
						class="fa fa-fw fa-comment"></span>
					</a>
				</div>
	
			</div>
	
	
	
	
			<div class="collapse navbar-collapse navbar-ex1-collapse">
	
				<!-- .nav -->
				<ul class="nav navbar-nav">
					<li><a href="dashboard.html">Trang chủ</a></li>
					<li><a href="${pageContext.servletContext.contextPath}/user/chinh-sach-va-thong-bao">Thông báo - Chính sách</a></li>
					<li class='dropdown '><a href="#" class="dropdown-toggle"
						data-toggle="dropdown"> Hoạt động <b class="caret"></b>
					</a>
						<ul class="dropdown-menu">
							<li><a href="form-general.html">Các hoạt động sắp tới</a></li>
							<li><a href="form-validation.html">Các hoạt động trước
									đây</a></li>
							<li><a href="form-wysiwyg.html">Tất cả hoạt động</a></li>
						</ul></li>
				</ul>
				<!-- /.nav -->
			</div>
		</div>
		<!-- /.container-fluid -->
	</nav>
	<!-- /.navbar -->