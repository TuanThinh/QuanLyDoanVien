<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<div class="media user-media bg-dark dker">
		<div class="user-media-toggleHover">
			<span class="fa fa-user"></span>
		</div>
		<div class="user-wrapper bg-dark">
			<a class="user-link" href=""> <img
				class="media-object img-thumbnail user-img" alt="User Picture"
				src="${pageContext.servletContext.contextPath}/resources/imgs/user.gif">
			</a>
	
			<div class="media-body">
				<h5 class="media-heading">Welcome</h5>
				<ul class="list-unstyled user-info">
					<li><a href="">(Tên người dùng)</a></li>
					<li>Last Access : (Thời gian)<br> <small><i
							class="fa fa-calendar"></i>&nbsp;16 Mar 16:32</small>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<!-- #menu -->
	<ul id="menu" class="bg-blue dker">
		<li class="nav-header">Menu</li>
		<li class="nav-divider"></li>
		<li class=""><a href="${pageContext.servletContext.contextPath}/user"> <i class="fa fa-home"></i><span
				class="link-title">&nbsp;Trang chủ</span>
		</a></li>
	
		<li><a href=""> <i class="fa fa-address-book"></i> <span
				class="link-title">Hồ sơ cá nhân</span>
		</a></li>
	
		<li><a href=""> <i class="fa fa-edit"></i> <span
				class="link-title">Cập nhật hồ sơ</span>
		</a></li>
		<li class=""><a href=""> <i class="fa fa-star "></i> <span
				class="link-title">Hoạt động</span> <span class="fa arrow"></span>
		</a>
			<ul class="collapse">
				<li><a href=""> <i class="fa fa-angle-right"></i> Tất cả các
						hoạt động
				</a></li>
				<li><a href=""> <i class="fa fa-angle-right"></i> Các hoạt
						động sắp tới
				</a></li>
				<li><a href=""> <i class="fa fa-angle-right"></i> Các hoạt
						động đã qua
				</a></li>
				<li><a href="fixed-header-menu.html"> <i
						class="fa fa-angle-right"></i> Các hoạt động đã tham gia
				</a></li>
				<li><a href=""> <i class="fa fa-angle-right"></i> Đề xuất
						hoạt động
				</a></li>
			</ul></li>
		<li><a href=""> <i class="fa fa-flash"></i> <span
				class="link-title"> Chính sách &amp; Thông báo </span>
		</a></li>
		<li><a href=""> <i class="fa fa-flickr"></i><span
				class="link-title"> Đóng góp ý kiến &amp; phản hồi </span>
		</a></li>
	
		<li class="nav-divider"></li>
		<li><a href="${pageContext.servletContext.contextPath}/user/danh-sach-ho-so"> <i class="fa fa-list-alt"></i> <span
				class="link-title"> Danh sách hồ sơ </span>
		</a></li>
		
		<li><a href="${pageContext.servletContext.contextPath}/user/diem"> <i class="fa fa-asterisk"></i> <span
				class="link-title"> Điểm rèn luyện </span>
		</a></li>
		
		<li><a href="${pageContext.servletContext.contextPath}/user/khen-thuong-ky-luat"> <i class="fa fa-rebel"></i> <span
				class="link-title"> Khen thưởng - kỷ luật </span>
		</a></li>
	
		<li class=""><a href=""> <i class="fa fa-bar-chart-o "></i> <span
				class="link-title">Thống kê</span> <span class="fa arrow"></span>
		</a>
			<ul class="collapse">
				<li><a href=""> <i class="fa fa-angle-right"></i> Thống kê 1
				</a></li>
				<li><a href=""> <i class="fa fa-angle-right"></i> Thống kê 2
				</a></li>
				<li><a href=""> <i class="fa fa-angle-right"></i> Thống kê 3
				</a></li>
				<li><a href="fixed-header-menu.html"> <i
						class="fa fa-angle-right"></i> Thống kê 4
				</a></li>
				<li><a href=""> <i class="fa fa-angle-right"></i> Thống kê 5
				</a></li>
			</ul></li>
	
		<li class=""><a href=""> <i class="fa fa-flag "></i> <span
				class="link-title">Báo cáo</span> <span class="fa arrow"></span>
		</a>
			<ul class="collapse">
				<li><a href=""> <i class="fa fa-angle-right"></i> Báo cáo đã
						gửi
				</a></li>
				<li><a href=""> <i class="fa fa-angle-right"></i> Viết báo
						cáo
				</a></li>
			</ul></li>
	</ul>
	<!-- /#menu -->