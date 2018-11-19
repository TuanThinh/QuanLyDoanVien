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
				<li><a href="#">Tạo tài khoản mới</a></li>
				<li><a href="taikhoan.html">Danh sách tài khoản</a></li>
			</ul></li>
		<li><a href="#doanCoSoMenu" data-toggle="collapse"
			aria-expanded="false" class="dropdown-toggle"> <i
				class="fa fa-users icon-margin-right"></i> Đoàn cơ sở
		</a>
			<ul class="collapse list-unstyled" id="doanCoSoMenu">
				<li><a href="#">Thành lập đoàn cơ sở</a></li>
				<li><a href="doancoso.html">Danh sách đoàn cơ sở</a></li>
			</ul></li>
		<li><a href="#hoatDongMenu" data-toggle="collapse"
			aria-expanded="false" class="dropdown-toggle"> <i
				class="fa fa-universal-access icon-margin-right"></i> Hoạt động
		</a>
			<ul class="collapse list-unstyled" id="hoatDongMenu">
				<li><a href="#">Hoạt động mới</a></li>
				<li><a href="#">Hoạt động đề xuất</a></li>
				<li><a href="hd-duyet.html">Hoạt động được phê duyệt</a></li>
				<li><a href="#">Hoạt động bị hủy bỏ</a></li>
			</ul></li>
		<li><a href="#tbcsMenu" data-toggle="collapse"
			aria-expanded="false" class="dropdown-toggle"> <i
				class="fa fa-scroll icon-margin-right"></i>Thông báo - Chính sách
		</a>
			<ul class="collapse list-unstyled" id="tbcsMenu">
				<li><a href="#">Thông báo, chính sách mới</a></li>
				<li><a href="thongbao.html">Danh sách thông báo</a></li>
			</ul></li>
	</ul>
</nav>