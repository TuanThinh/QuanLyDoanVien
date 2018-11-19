<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-lg navbar-primary bg-primary">
	<button type="button" id="sidebarToggle" class="btn btn-primary">
		<i class="fa fa-bars"></i>
	</button>
	<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor02"
	aria-controls="navbarColor02" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarColor02">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item active"><a class="nav-link"
				href="${pageContext.servletContext.contextPath}/admin">Trang chủ<span class="sr-only">(current)</span></a>
			</li>
			<li class="nav-item"><a class="nav-link" href="#">Trợ giúp</a>
			</li>
		</ul>
		<button class="btn btn-primary nav-btn" data-toggle="popover" title="Notification" data-placement="bottom"
		data-html="true" data-content=
		"
			<ul style='list-style: none; padding-left: 10px'>
				<li><i class='fa fa-info-circle' style='margin-right: 10px'></i><a href='#'>Thông báo thứ nhất</a></li>
				<li><i class='fa fa-info-circle' style='margin-right: 10px'></i><a href='#'>Thông báo thứ hai</a></li>
				<li><i class='fa fa-info-circle' style='margin-right: 10px'></i><a href='#'>Thông báo thứ ba</a></li>
			</ul>			
		"
		>
			<i class="fa fa-bell"></i>
		</button>
		<button class="btn btn-primary nav-btn" data-toggle="tooltip" title="Đăng xuất">
			<i class="fa fa-sign-out"></i>
		</button>
	</div>
</nav>