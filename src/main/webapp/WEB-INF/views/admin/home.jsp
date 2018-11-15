<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="main">
	<div class="container">
		<div class="col-md-12"
			style="border-bottom: 2px solid #005d35; padding-left: 0">
			<ul class="ul-title">
				<li class="li-title">
					<p class="p-title">Tài khoản đoàn viên</p>
				</li>
				<li>
					<div class="triangle"></div>
				</li>
			</ul>
		</div>
	</div>

	<div class="container">
		<div>
			<ul class="ul-group-btn col-md-12">
				<li class="li-group-btn col-md-3"><a href="#">
						<button type="button" class="btn btn-outline-success group-btn">
							<i class="fa fa-plus-circle icon-margin-right"></i>Tạo tài khoản
							mới
						</button>
				</a></li>
				<li class="li-group-btn col-md-3"><a
					href="${pageContext.servletContext.contextPath}/admin/tai-khoan">
						<button type="button" class="btn btn-outline-success group-btn">
							<i class="fa fa-list-alt icon-margin-right"></i>Danh sách tài
							khoản
						</button>
				</a></li>
			</ul>
		</div>
	</div>

	<div class="container">
		<div class="col-md-12"
			style="border-bottom: 2px solid #005d35; padding-left: 0">
			<ul class="ul-title">
				<li class="li-title">
					<p class="p-title">Đoàn cơ sở</p>
				</li>
				<li>
					<div class="triangle"></div>
				</li>
			</ul>
		</div>
	</div>

	<div class="container">
		<div>
			<ul class="ul-group-btn col-md-12">
				<li class="li-group-btn col-md-3">
					<button type="button" class="btn btn-outline-success group-btn">
						<i class="fa fa-plus-circle icon-margin-right"></i>Thành lập đoàn
						cơ sở
					</button>
				</li>
				<li class="li-group-btn col-md-3"><a
					href="${pageContext.servletContext.contextPath}/admin/doan-co-so">
						<button type="button" class="btn btn-outline-success group-btn">
							<i class="fa fa-list-alt icon-margin-right"></i>Danh sách đoàn cơ
							sở
						</button>
				</a></li>
			</ul>
		</div>
	</div>

	<div class="container">
		<div class="col-md-12"
			style="border-bottom: 2px solid #005d35; padding-left: 0">
			<ul class="ul-title">
				<li class="li-title">
					<p class="p-title">Thông báo - Chính sách</p>
				</li>
				<li>
					<div class="triangle"></div>
				</li>
			</ul>
		</div>
	</div>

	<div class="container">
		<div>
			<ul class="ul-group-btn col-md-12">
				<li class="li-group-btn col-md-3">
					<button type="button" class="btn btn-outline-success group-btn">
						<i class="fa fa-plus-circle icon-margin-right"></i>Thông báo,
						chính sách mới
					</button>
				</li>
				<li class="li-group-btn col-md-3"><a
					href="${pageContext.servletContext.contextPath}/admin/tb-cs">
						<button type="button" class="btn btn-outline-success group-btn">
							<i class="fa fa-bullhorn icon-margin-right"></i>Danh sách thông
							báo
						</button>
				</a></li>
			</ul>
		</div>
	</div>

	<div class="container">
		<div class="col-md-12"
			style="border-bottom: 2px solid #005d35; padding-left: 0">
			<ul class="ul-title">
				<li class="li-title">
					<p class="p-title">Hoạt động</p>
				</li>
				<li>
					<div class="triangle"></div>
				</li>
			</ul>
		</div>
	</div>

	<div class="container">
		<div>
			<ul class="ul-group-btn col-md-12">
				<li class="li-group-btn col-md-3">
					<button type="button" class="btn btn-outline-success group-btn">
						<i class="fa fa-plus-circle icon-margin-right"></i>Hoạt động mới
					</button>
				</li>
				<li class="li-group-btn col-md-3">
					<a href="${pageContext.servletContext.contextPath}/admin/hd-de-xuat">
						<button type="button" class="btn btn-outline-success group-btn">
							<i class="fa fa-list-alt icon-margin-right"></i>Hoạt động đề xuất
						</button>
					</a>
				</li>
				<li class="li-group-btn col-md-3">
					<a href="${pageContext.servletContext.contextPath}/admin/hd-duyet">
						<button type="button" class="btn btn-outline-success group-btn">
							<i class="fa fa-list-alt icon-margin-right"></i>Hoạt động được duyệt
						</button>
					</a>
				</li>
				<li class="li-group-btn col-md-3">
					<a href="${pageContext.servletContext.contextPath}/admin/hd-huy">
						<button type="button" class="btn btn-outline-success group-btn">
							<i class="fa fa-list-alt icon-margin-right"></i>Hoạt động bị hủy bỏ
						</button>
					</a>
				</li>
			</ul>
		</div>
	</div>
</div>