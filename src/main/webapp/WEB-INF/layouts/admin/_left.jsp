<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<nav id="sidebar">
	<div class="sidebar-header">
		<img src="${pageContext.servletContext.contextPath}/resources/imgs/huy-hieu.png" id="bigImg">
		<img src="${pageContext.servletContext.contextPath}/resources/imgs/huy-hieu.png" id="smallImg">
	</div>

	<ul class="list-unstyled components">
		<li><a href="#taiKhoanMenu" data-toggle="collapse"
			aria-expanded="false" class="dropdown-toggle"> <i
				class="fa fa-user-circle icon-margin-right"></i> Tài khoản đoàn
				viên
		</a>
			<ul class="collapse list-unstyled" id="taiKhoanMenu">
				<li><a href="${pageContext.servletContext.contextPath}/admin/tai-khoan/them">Tạo tài khoản mới</a></li>
				<li><a href="${pageContext.servletContext.contextPath}//admin/tai-khoan/danh-sach">Danh sách tài khoản</a></li>
			</ul></li>
		<li><a href="#doanCoSoMenu" data-toggle="collapse"
			aria-expanded="false" class="dropdown-toggle"> <i
				class="fa fa-users icon-margin-right"></i> Đoàn cơ sở
		</a>
			<ul class="collapse list-unstyled" id="doanCoSoMenu">
				<li><a href="${pageContext.servletContext.contextPath}/admin/doan-co-so/them">Thành lập đoàn cơ sở</a></li>
				<li><a href="${pageContext.servletContext.contextPath}/admin/doan-co-so/danh-sach">Danh sách đoàn cơ sở</a></li>
			</ul></li>
		<li><a href="#hoatDongMenu" data-toggle="collapse"
			aria-expanded="false" class="dropdown-toggle"> <i
				class="fa fa-universal-access icon-margin-right"></i> Hoạt động
		</a>
			<ul class="collapse list-unstyled" id="hoatDongMenu">
				<li><a href="${pageContext.servletContext.contextPath}/admin/hoat-dong/them">Hoạt động mới</a></li>
				<li><a href="${pageContext.servletContext.contextPath}/admin/hoat-dong/danh-sach-de-xuat">Hoạt động đề xuất</a></li>
				<li><a href="${pageContext.servletContext.contextPath}/admin/hoat-dong/danh-sach-duoc-duyet">Hoạt động được phê duyệt</a></li>
				<li><a href="${pageContext.servletContext.contextPath}/admin/hoat-dong/danh-sach-hd-huy">Hoạt động bị hủy bỏ</a></li>
			</ul></li>
		<li><a href="#tbcsMenu" data-toggle="collapse"
			aria-expanded="false" class="dropdown-toggle"> <i
				class="fa fa-scroll icon-margin-right"></i>Thông báo - Chính sách
		</a>
			<ul class="collapse list-unstyled" id="tbcsMenu">
				<li><a href="${pageContext.servletContext.contextPath}/admin/tb-cs/them">Thông báo, chính sách mới</a></li>
				<li><a href="${pageContext.servletContext.contextPath}/admin/tb-cs/danh-sach">Danh sách thông báo</a></li>
			</ul></li>
	</ul>
</nav>