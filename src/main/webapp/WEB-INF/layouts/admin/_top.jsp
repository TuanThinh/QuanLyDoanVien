<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="container-fluid">
	<div class="container">
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
			<a class="navbar-brand" href="${pageContext.servletContext.contextPath}/admin">
				<img src="${pageContext.servletContext.contextPath}/resources/imgs/huy-hieu.png" alt="Huy hiệu Đoàn">
			</a>
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
					<i class="fa fa-bell"></i> <span class="number-label">0</span>
				</button>
				<button class="btn btn-primary nav-btn" data-toggle="tooltip" title="Hiện sidebar" onclick="openNav()">
					<i class="fa fa-bars"></i>
				</button>
				<button class="btn btn-primary nav-btn" data-toggle="tooltip" title="Đăng xuất">
					<i class="fa fa-sign-out"></i>
				</button>
			</div>
		</nav>
	</div>
</div>