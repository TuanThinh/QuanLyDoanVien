<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
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

			</div>
		</div>
	</div>
	<!-- #menu -->
	<ul id="menu" class="bg-blue dker">
		<security:authorize access="hasAnyRole('ROLE_DCS', 'ROLE_DV')">
			<li class="nav-header">Menu</li>
			<li class="nav-divider"></li>
			<li class=""><a href="${pageContext.servletContext.contextPath}/user"> <i class="fa fa-home"></i><span
					class="link-title">&nbsp;Trang chủ</span>
			</a></li>

			<li><a href="${pageContext.servletContext.contextPath}/user/ho-so-ca-nhan"> <i class="fa fa-address-book"></i> <span
					class="link-title">Hồ sơ cá nhân</span>
			</a></li>

			<li><a href="${pageContext.servletContext.contextPath}/user/cap-nhat-ho-so"> <i class="fa fa-edit"></i> <span
					class="link-title">Cập nhật hồ sơ</span>
			</a></li>
			<li class=""><a href=""> <i class="fa fa-star "></i> <span
					class="link-title">Hoạt động</span> <span class="fa arrow"></span>
			</a>
				<ul class="collapse">
					<li><a href="${pageContext.servletContext.contextPath}/user/hoat-dong"> <i class="fa fa-angle-right"></i> Tất cả các
						hoạt động
					</a></li>
					<li><a href="${pageContext.servletContext.contextPath}/user/hoat-dong-sap-toi"> <i class="fa fa-angle-right"></i> Các hoạt
						động sắp tới
					</a></li>
					<li><a href="${pageContext.servletContext.contextPath}/user/hoat-dong-da-qua"> <i class="fa fa-angle-right"></i> Các hoạt
						động đã qua
					</a></li>
					<li><a href="${pageContext.servletContext.contextPath}/user/hoat-dong-da-tham-gia"> <i
							class="fa fa-angle-right"></i> Các hoạt động đã tham gia
					</a></li>
					<li><a href="${pageContext.servletContext.contextPath}/user/de-xuat-hoat-dong"> <i class="fa fa-angle-right"></i> Đề xuất
						hoạt động
					</a></li>
				</ul></li>
			<li><a href="${pageContext.servletContext.contextPath}/user/chinh-sach-va-thong-bao"> <i class="fa fa-flash"></i> <span
					class="link-title"> Chính sách &amp; Thông báo </span>
			</a></li>
			<li><a href="${pageContext.servletContext.contextPath}/user/dong-gop-va-phan-hoi"> <i class="fa fa-flickr"></i><span
					class="link-title"> Đóng góp ý kiến &amp; phản hồi </span>
			</a></li>
		</security:authorize>
		<%--Đoàn cơ sở--%>

		<security:authorize access="hasAnyRole('ROLE_DCS')">
			<li class="nav-divider"></li>
			<li><a href="${pageContext.servletContext.contextPath}/user/dcs/danh-sach-ho-so"> <i class="fa fa-list-alt"></i> <span
					class="link-title"> Danh sách hồ sơ </span>
			</a></li>

			<li><a href="${pageContext.servletContext.contextPath}/user/dcs/thong-ke"> <i class="fa fa-bar-chart-o "></i> <span
					class="link-title">Thống kê</span>
			</a>
			</li>

			<li class="">
				<a href="">
					<i class="fa fa-flag "></i>
					<span class="link-title">Báo cáo</span>
					<span class="fa arrow"></span>
				</a>
				<ul class="collapse">
					<li><a href="${pageContext.servletContext.contextPath}/user/dcs/soan-bao-cao"> <i class="fa fa-angle-right"></i> Soạn báo cáo
					</a></li>
					<li><a href="${pageContext.servletContext.contextPath}/user/dcs/bao-cao-da-gui"> <i class="fa fa-angle-right"></i> Các báo cáo đã gửi
					</a></li>
				</ul>
			</li>
		</security:authorize>

	</ul>
	<!-- /#menu -->