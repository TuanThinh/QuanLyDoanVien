<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="inner-left">
	<h4>Tìm kiếm</h4>
		<form action="" method="post" accept-charset="utf-8">
			<div class="form-group">
				<label>Họ tên</label>
				<input class="form-control" id="" type="text" name="" placeholder="Nhập họ tên"/>
			</div>
	
			<div class="form-group">
				<label>Điểm</label>
				<input class="form-control" id="" type="text" name="" placeholder="Nhập điểm"/>
			</div>
			
			<div class="form-group">
				<label>Thời gian</label>
				<input class="form-control" id="" type="text" name="" placeholder="Nhập thời gian"/>
			</div>
			
			<div class="button">
				<button type="submit" class="btn btn-primary" onclick="return validateFormLogin()">Tìm</button>
				<button type="reset" class="btn btn-default">Đặt lại</button>
			</div>
		</form>
</div>

<div class="inner-right">
		<table class="table table-striped table-bordered table-hover">
			<thead>
				<tr>
					<th width="120px;">Mã đoàn viên</th>
					<th>Họ tên</th>
					<th>Điểm</th>
					<th>Thời gian</th>
					<th>Ghi chú</th>
					<th width="101px;"></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td>
						<span data-toggle="modal" data-target="#modalDetail">
							<i class="fa fa-eye" data-toggle="tooltip" data-original-title="Chi tiết" data-placement="top" ></i>
						</span> |
						
						<span data-toggle="modal" data-target="#modalAdd">
							<i class="fa fa-plus-circle" data-toggle="tooltip" data-original-title="Thêm" data-placement="top" ></i>
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
</div>



<div id="modalAdd" class="modal" role="dialog">
	<!-- Modal content -->
	<div class="modal-content">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal">&times;</button>
			<h4>Thêm mới</h4>
		</div>

		<div class="modal-body">
			<form action="" method="post" class="form-horizontal">
					<div class="form-group">
						<label class="col-md-4 custom">Mã sinh viên</label>
						<div class="col-md-8 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>
				
					<div class="form-group">
						<label class="col-md-4 custom">Họ tên</label>
						<div class="col-md-8 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-4 custom">điểm</label>
						<div class="col-md-8 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-4 custom">Thời gian</label>
						<div class="col-md-8 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-4 custom">Ghi chú</label>
						<div class="col-md-8 custom">
							<input type="text" name="" class="form-control" />
						</div>
					</div>

				<div class="form-group">
					<div class="col-md-offset-4 col-md-8">
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
			<h4>Cập nhật</h4>
		</div>

		<div class="modal-body">
			<form action="" method="post" class="form-horizontal">
				<div class="form-group">
					<label class="col-md-4 custom">Mã sinh viên</label>
					<div class="col-md-8 custom">
						<input type="text" name="" class="form-control" />
					</div>
				</div>
			
				<div class="form-group">
					<label class="col-md-4 custom">Họ tên</label>
					<div class="col-md-8 custom">
						<input type="text" name="" class="form-control" />
					</div>
				</div>
	
				<div class="form-group">
					<label class="col-md-4 custom">điểm</label>
					<div class="col-md-8 custom">
						<input type="text" name="" class="form-control" />
					</div>
				</div>
	
				<div class="form-group">
					<label class="col-md-4 custom">Thời gian</label>
					<div class="col-md-8 custom">
						<input type="text" name="" class="form-control" />
					</div>
				</div>
	
				<div class="form-group">
					<label class="col-md-4 custom">Ghi chú</label>
					<div class="col-md-8 custom">
						<input type="text" name="" class="form-control" />
					</div>
				</div>
					
				<div class="form-group">
					<div class="col-md-offset-4 col-md-8">
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
				<div class="form-group">
					<label class="col-md-4 custom">Mã sinh viên</label>
					<div class="col-md-8 custom">
						
					</div>
				</div>
			
				<div class="form-group">
					<label class="col-md-4 custom">Họ tên</label>
					<div class="col-md-8 custom">
						
					</div>
				</div>
	
				<div class="form-group">
					<label class="col-md-4 custom">điểm</label>
					<div class="col-md-8 custom">
						
					</div>
				</div>
	
				<div class="form-group">
					<label class="col-md-4 custom">Thời gian</label>
					<div class="col-md-8 custom">
						
					</div>
				</div>
	
				<div class="form-group">
					<label class="col-md-4 custom">Ghi chú</label>
					<div class="col-md-8 custom">
						
					</div>
				</div>
				<hr>
				<div class="form-group">
					<div class="col-md-offset-10 col-md-2">
						<button type="button" id="btnEdit" class="btn btn-default">Đóng</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<style>	
	i.fa:hover {
		cursor: pointer;
		color: blue;
	}
	
	.modal-content {
		width: 50%;
	    margin: auto;
	    top: 50px;
	}
	.modal-body {
		padding: 25px 50px;
	}
	
	.custom {
		padding: 0px;
	}
	
	.inner.bg-light.lter {
	    display: flex;
	}
	
	.inner-left {
	    width: 23%;
	    padding: 5px 20px;
	    background-color: #847c7c47;
	    margin-right: 30px;
	}
	
	.inner-left h4 {
	    background-color: #403535;
	    text-align: center;
	    color: white;
	    padding: 5px 0px;
	}
	
	.inner-right {
	    width: 74%;
	}
		
</style>
