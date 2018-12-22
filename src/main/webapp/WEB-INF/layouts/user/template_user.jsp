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

<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/css/bootstrap.min.css">

<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/css/font-awesome.min.css">

<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/css/user/main.css">

<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/css/user/metisMenu.css">

<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/css/user/onoffcanvas.css">
<script src="${pageContext.servletContext.contextPath}/resources/js/jquery-3.2.1.min.js"></script>

<link rel="stylesheet" href="${pageContext.servletContext.contextPath}/resources/css/datepicker.css">
<script src="${pageContext.servletContext.contextPath}/resources/js/datepicker.js"></script>
<script src="${pageContext.servletContext.contextPath}/resources/js/highcharts.js"></script>
<script src="${pageContext.servletContext.contextPath}/resources/js/datatables.min.js"></script>
<script src="${pageContext.servletContext.contextPath}/resources/js/dataTables.bootstrap.min.js"></script>
<script src="${pageContext.servletContext.contextPath}/resources/tinymce/tinymce.min.js"></script>
<script>tinymce.init({ selector: 'textarea' });</script>

<style>
	#modalDoiMatKhau .form-group {
		line-height: 35px;
		height: 35px;
		padding-right: 0px;
	}

	#modalDoiMatKhau .form-group {
		line-height: 35px;
		height: 35px;
	}

	#modalDoiMatKhau .modal-content {
		width: 500px;
		height: 300px;
		margin: auto;
		top: 50px;
	}
	#modalDoiMatKhau .modal-body {
		padding: 15px;
	}

	#modalDoiMatKhau .form-control {
		position: relative;
		width: 273px;
		height: 34px;
	}

	#modalDoiMatKhau .password {
		color: red;
		position: absolute;
		right: 0px;
		top: 0px;
		padding-right: 5px;
	}

	#modalDoiMatKhau .confirm {
		color: red;
	}

	#modalDoiMatKhau .custom {
		padding: 0px;
	}

	#modalDoiMatKhau .col-md-5, #modalDoiMatKhau .col-md-7 {
		margin-top: 0px;
	}

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

	<div id="modalDoiMatKhau" class="modal" role="dialog">
		<!-- Modal content -->
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Đổi mật khẩu</h4>
				</div>
				<div class="modal-body">
					<div class="form-group">
						<label class="col-md-5 custom">Mật khẩu hiện tại: </label>
						<div class="col-md-7 custom">
							<input type="password" id="mat-khau-hien-tai" class="form-control" />
							<span class="password"></span>
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Mật khẩu mới: </label>
						<div class="col-md-7 custom">
							<input type="password" id="mat-khau-moi" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Nhập lại mật khẩu mới: </label>
						<div class="col-md-7 custom">
							<input type="password" id="xac-nhan-mat-khau" class="form-control" />
							<span class="confirm"></span>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" id="btnCapNhat" class="btn btn-primary">Cập nhật</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>
		</div>
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
		$(document).ready(function () {
		    $.ajax({
				url: '/tai-khoan/id',
				type: 'GET',
				dataType: 'JSON',
				data: {
				    id : -1
				},
				success: function (data) {
					var html = '';
					html += '<h5 class="media-heading"> Tài khoản: ' + data.tenTaiKhoan + '</h5>';
					html += '<ul class="list-unstyled user-info">';
					html += '<li><a href="#" data-toggle="modal" data-target="#modalDoiMatKhau">Đổi mật khẩu</a></li>';
					html += '<li>Lần truy cập cuối : <br> <small><i class="fa fa-calendar"></i>&nbsp;' + data.truyCapLanCuoi + '</small></li>';
					html += '</ul>';
					$('.media-body').html(html);
                },
				error: function (e) {
					console.log(e);
                }
			});

		    $('#mat-khau-moi').keyup(function () {
		        var matKhauMoi = $('#mat-khau-moi').val();
		        var xacNhanMatKhau = $('#xac-nhan-mat-khau').val();
                $('.confirm').html("");
                if (xacNhanMatKhau != ""){
                    if (matKhauMoi != xacNhanMatKhau) {
                        var html = 'Mật khẩu không khớp';
                        $('.confirm').html(html);
                    }
                }
            });

            $('#xac-nhan-mat-khau').keyup(function () {
                var matKhauMoi = $('#mat-khau-moi').val();
                var xacNhanMatKhau = $('#xac-nhan-mat-khau').val();
                $('.confirm').html("");
                if (matKhauMoi != ""){
                    if (matKhauMoi != xacNhanMatKhau) {
                        var html = 'Mật khẩu không khớp';
                        $('.confirm').html(html);
                    }
                }
            });

		    $('#btnCapNhat').click(function () {
                var matKhauHienTai = $('#mat-khau-hien-tai').val();
                var matKhauMoi = $('#mat-khau-moi').val();
                var xacNhanMatKhau = $('#xac-nhan-mat-khau').val();
                if (matKhauMoi != xacNhanMatKhau) {
                    return false;
                }
                var data = {};
                data.id = -1;
                data.matKhauHienTai = matKhauHienTai;
                data.matKhauMoi = matKhauMoi;
                data.xacNhanMatKhauMoi = xacNhanMatKhau;
                $.ajax({
                    url: '/tai-khoan/doi-mat-khau',
                    type: 'POST',
                    dataType: 'JSON',
                    contentType: 'application/json',
                    data: JSON.stringify(data),
                    success: function (data) {
                        if (data == false) {
                            var html = '<i class="fa fa-exclamation-circle" data-toggle="tooltip" data-original-title="Không&nbsp;chính&nbsp;xác" data-placement="top"></i>';
                            $('.password').html(html);
                            $('#mat-khau-hien-tai').css({"border-color" : "red"})
                        } else {
                            alert("Đổi mật khẩu thành công");
                            location.reload();
                        }
                    }
                });
            });

            $('.input-datepicker').datepicker({
                format: 'yyyy-MM-dd'
            });

            $(document).ajaxComplete(function () {
                $('[data-toggle="tooltip"]').tooltip();
            })
        });
    </script>
</body>

</html>
