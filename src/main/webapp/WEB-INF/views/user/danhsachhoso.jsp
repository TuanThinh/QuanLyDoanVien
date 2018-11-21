<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="inner-top">
	<div class="inner-top__left">
		<form action="" method="get" accept-charset="utf-8">
			<label class="col-md-1 search">Tìm theo</label>
			<div class="form-group">
				<div class="col-md-2 search-key">
					<select name="" class="form-control">
						<option value="">Mã</option>
						<option value="">Họ tên</option>
						<option value="">Địa chỉ</option>
						<option value="">Chi đoàn</option>
						<option value="">Đơn vị</option>
					</select>
				</div>
				
				<div class="col-md-2 search-value">
					<input type="text" class="form-control" name="">
				</div>
				
				<button type="submit" class="btn btn-primary">
					<i class="fa fa-search"></i>
				</button>
				<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modalSearch">Advance</button>
			</div>
		</form>
	</div>
	
	<div class="inner-top__right">
		<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modalAdd">
			<i class="">Thêm</i>
		</button>
	</div>

</div>
<!-- inner-top -->

<table class="table table-striped table-bordered table-hover">
	<thead>
		<tr>
			<th width="70px;">Hình ảnh</th>
			<th width="120px;">Mã đoàn viên</th>
			<th>Họ tên</th>
			<th>Ngày sinh</th>
			<th>Giới tính</th>
			<th>Địa chỉ</th>
			<th>Chi đoàn</th>
			<th>Đơn vị</th>
			<th width="80px;"></th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td>
				<span data-toggle="modal" data-target="#modalDetail">
					<i class="fa fa-eye" data-toggle="tooltip" data-original-title="Chi tiết" data-placement="top" ></i>
				</span> |
				
				<span data-toggle="modal" data-target="#modalEdit">
					<i class="fa fa-wrench" data-toggle="tooltip" data-original-title="Sửa" data-placement="top"></i>
				</span> |  
				
				<span data-toggle="modal" data-target="#modalDelete">
					<i class="fa fa-trash" data-toggle="tooltip" data-original-title="Xóa" data-placement="top"></i>
				</span>
				
			</td>
		</tr>
	</tbody>
</table>


<div id="modalAdd" class="modal" role="dialog">
	<!-- Modal content -->
	<div class="modal-content">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">&times;</button>
			<h4>Thêm mới đoàn viên</h4>
		</div>

		<div class="modal-body">
			<form action="" method="post" class="form-horizontal">
			
				<div class="col-md-2">
					<label>Ảnh đại diện</label>
					<div class="img-avatar">
						<img class="media-object img-thumbnail user-img"
							alt="User Picture"
							src="${pageContext.servletContext.contextPath}/resources/imgs/user.gif">
						<input type="file" name="">
					</div>
				</div>
				
				<div class="col-md-5">
					<div class="form-group">
						<label class="col-md-5 custom">Mã đoàn viên</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
				
					<div class="form-group">
						<label class="col-md-5 custom">Họ tên</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Ngày sinh</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control input-datepicker" readonly="readonly"/>
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Giới tính</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Địa chỉ</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Chi đoàn</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Đơn vị</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-md-5 custom">Số điện thoại</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-md-5 custom">Email</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
					
				</div>
				
				<div class="col-md-5">
					<div class="form-group">
						<label class="col-md-5 custom">Ngày vào đoàn</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control input-datepicker" readonly="readonly"/>
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Ngày vào đảng</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control input-datepicker" readonly="readonly"/>
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-md-5 custom">Chức vụ</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-md-5 custom">Dân tộc</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Quốc tịch</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Tôn giáo</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Đối tượng chính sách</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-md-5 custom">Tài khoản</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
					
				</div>
				
				<div class="form-group">
					<div class="col-md-offset-2 col-md-10">
						<button type="submit" id="btnAdd" class="btn btn-primary">Thêm</button>
						<span class="closeModalAdd btn btn-primary" data-dismiss="modal">Hủy</span>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>


<div id="modalEdit" class="modal" role="dialog">
	<!-- Modal content -->
	<div class="modal-content">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">&times;</button>
			<h4>Cập nhật hồ sơ</h4>
		</div>

		<div class="modal-body">
			<form action="" method="post" class="form-horizontal">
			
				<div class="col-md-2">
					<label>Ảnh đại diện</label>
					<div class="img-avatar">
						<img class="media-object img-thumbnail user-img"
							alt="User Picture"
							src="${pageContext.servletContext.contextPath}/resources/imgs/user.gif">
						<input type="file" name="">
					</div>
				</div>
				
				<div class="col-md-5">
					<div class="form-group">
						<label class="col-md-5 custom">Mã đoàn viên</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
				
					<div class="form-group">
						<label class="col-md-5 custom">Họ tên</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Ngày sinh</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control input-datepicker" readonly="readonly"/>
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Giới tính</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Địa chỉ</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Chi đoàn</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Đơn vị</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-md-5 custom">Số điện thoại</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-md-5 custom">Email</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
					
				</div>
				
				<div class="col-md-5">
					<div class="form-group">
						<label class="col-md-5 custom">Ngày vào đoàn</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control input-datepicker" readonly="readonly"/>
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Ngày vào đảng</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control input-datepicker" readonly="readonly"/>
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-md-5 custom">Chức vụ</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-md-5 custom">Dân tộc</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Quốc tịch</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Tôn giáo</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Đối tượng chính sách</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-md-5 custom">Tài khoản</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
					
				</div>
				
				<div class="form-group">
					<div class="col-md-offset-2 col-md-10">
						<button type="submit" id="btnEdit" class="btn btn-primary">Cập nhật</button>
						<span class="closeModalAdd btn btn-primary" data-dismiss="modal">Hủy</span>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>

<div id="modalDelete" class="modal" role="dialog">
	<!-- Modal content -->
	<div class="modal-content" style="width: 280px; padding: 15px">
		<button type="button" class="close" data-dismiss="modal">&times;</button>
		<p>
			Bạn có muốn xóa <span style="color: red;"> item </span>này không?
		</p>
		<button type="button" class="btn btn-primary" style="width: 49%;">
			Xácnhận
		</button>
		<span class="closeModalDelete btn btn-primary" style="width: 49%;" data-dismiss="modal">Hủy</span>
	</div>

</div>

<div id="modalDetail" class="modal" role="dialog">
	<!-- Modal content -->
	<div class="modal-content">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">&times;</button>
			<h4>Thông tin chi tiết</h4>
		</div>

		<div class="modal-body">
			<div class="form-horizontal">
				<div class="col-md-2">
					<label>Ảnh đại diện</label>
					<div class="img-avatar">
						<img class="media-object img-thumbnail user-img"
							 alt="User Picture"
							 src="${pageContext.servletContext.contextPath}/resources/imgs/user.gif">
					</div>
				</div>

				<div class="col-md-5">
					<div class="form-group">
						<label class="col-md-5 custom">Mã đoàn viên</label>
						<div class="col-md-7 custom">

						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Họ tên</label>
						<div class="col-md-7 custom">

						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Ngày sinh</label>
						<div class="col-md-7 custom">

						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Giới tính</label>
						<div class="col-md-7 custom">

						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Địa chỉ</label>
						<div class="col-md-7 custom">

						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Chi đoàn</label>
						<div class="col-md-7 custom">

						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Đơn vị</label>
						<div class="col-md-7 custom">

						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Số điện thoại</label>
						<div class="col-md-7 custom">

						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Email</label>
						<div class="col-md-7 custom">

						</div>
					</div>

				</div>

				<div class="col-md-5">
					<div class="form-group">
						<label class="col-md-5 custom">Ngày vào đoàn</label>
						<div class="col-md-7 custom">

						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Ngày vào đảng</label>
						<div class="col-md-7 custom">

						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Chức vụ</label>
						<div class="col-md-7 custom">

						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Dân tộc</label>
						<div class="col-md-7 custom">

						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Quốc tịch</label>
						<div class="col-md-7 custom">

						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Tôn giáo</label>
						<div class="col-md-7 custom">

						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Đối tượng chính sách</label>
						<div class="col-md-7 custom">

						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Tài khoản</label>
						<div class="col-md-7 custom">

						</div>
					</div>
				</div>

				<div class="form-group">
					<div class="col-md-offset-2 col-md-10">
						<button type="button" id="btnDetail" class="btn btn-default" data-dismiss="modal">Đóng</button>
					</div>
				</div>

			</div>

		</div>
	</div>
</div>

<div id="modalSearch" class="modal" role="dialog">
	<!-- Modal content -->
	<div class="modal-content">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">&times;</button>
			<h4>Tìm kiếm</h4>
		</div>

		<div class="modal-body">
			<form action="" method="post" class="form-horizontal">
			
				<div class="col-md-6">
					<div class="form-group">
						<label class="col-md-5 custom">Mã đoàn viên</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
				
					<div class="form-group">
						<label class="col-md-5 custom">Họ tên</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Ngày sinh</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Giới tính</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Địa chỉ</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Chi đoàn</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Đơn vị</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-md-5 custom">Số điện thoại</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-md-5 custom">Email</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
					
				</div>
				
				<div class="col-md-6">
					<div class="form-group">
						<label class="col-md-5 custom">Ngày vào đoàn</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Ngày vào đảng</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-md-5 custom">Chức vụ</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-md-5 custom">Dân tộc</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Quốc tịch</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Tôn giáo</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-5 custom">Đối tượng chính sách</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
					
					<div class="form-group">
						<label class="col-md-5 custom">Tài khoản</label>
						<div class="col-md-7 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
					
				</div>
				
				<div class="form-group">
					<div class="col-md-offset-5 col-md-7">
						<button type="submit" id="btnSearch" class="btn btn-primary">Tìm kiếm</button>
						<span class="closeModalAdd btn btn-primary" data-dismiss="modal">Hủy</span>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>

<style>
	.inner-top {
	    display: flex;
        padding-top: 10px;
	}

	.inner-top__left {
    	width: 100%;
	}
	
	label.col-md-1.search {
	    width: 85px;
	    line-height: 34px;
    	font-size: 16px;
    	padding: 0px;
	}
	
	.col-md-2.search-key {
	    width: 16%;
	    padding: 0px 1px;
	}
	
	.col-md-2.search-value {
	    width: 16%;
	    padding: 0px 2px;
	}
	
	i.fa:hover {
		cursor: pointer;
		color: blue;
	}
	
	.modal-content {
		width: 75%;
	    margin: auto;
	    top: 50px;
	}
	.modal-body {
		padding: 25px;
	}
	
	.img-avatar {
		overflow: hidden;
		width: 74px;
	}
	
	.img-avatar img {
		margin: auto;
	}
	
	.custom {
		padding: 0px;
	}
	
	.form-group {
	    padding-right: 40px;
	}
</style>