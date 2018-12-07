<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<div class="row inner-top">
    <div class="col-md-6 inner-top__left">
        <span>Hiển thị</span>
        <select class="form-control">
            <option>10</option>
            <option>20</option>
            <option>30</option>
        </select>
        <span>bản ghi</span>
    </div>
    <div class="col-md-6 inner-top__right">
        <input type="text" class="form-control" placeholder="Enter value"/>
        <span>Tìm kiếm:</span>
    </div>
</div>

<div class="row">
    <div class="col-md-12">
        <table class="table table-striped table-bordered table-hover" id="diem-ho-so">
            <thead>
            <tr>
                <th width="120px;">Mã đoàn viên</th>
                <th>Họ tên</th>
                <th class="column-hidden">Ngày sinh</th>
                <th class="column-hidden">Chi đoàn</th>
                <th class="column-hidden">Đơn vị</th>
                <th>Điểm</th>
                <th>Thời gian</th>
                <th>Ghi chú</th>
                <th width="100px;"></th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td class="hs-ma"></td>
                <td class="hs-hoten"></td>
                <td class="hs-ngaysinh column-hidden"></td>
                <td class="hs-chidoan column-hidden"></td>
                <td class="hs-donvi column-hidden"></td>
                <td class="hs-diem"></td>
                <td class="hs-thoigian"></td>
                <td class="hs-ghichu"></td>
                <td>
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
</div>

<div class="row inner-bottom">
    <div class="col-md-6 inner-bottom__left">
        <span>Hiển thị từ a đến b của c bản ghi</span>
    </div>

    <div class="col-md-6 inner-bottom__right">
        <ul class="pagination">
            <li><a href = "">&laquo;</a></li>
            <li><a href = "">1</a></li>
            <li><a href = "">2</a></li>
            <li><a href = "">3</a></li>
            <li><a href = "">4</a></li>
            <li><a href = "">5</a></li>
            <li><a href = "">&raquo;</a></li>
        </ul>
    </div>
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
							<input type="text" name="" class="form-control input-datepicker" readonly="readonly"/>
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
						<input type="text" name="" class="form-control input-datepicker" readonly="readonly"/>
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
						<button type="button" id="btnDetail" class="btn btn-default" data-dismiss="modal">Đóng</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<style>
	.column-hidden{
		/*display: none;*/
	}

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

    .col-md-offset-4.col-md-8 {
        padding: 0px;
    }

    /*--------*/
    .inner-top__right span {
        line-height: 34px;
    }

    .inner-top {
        margin: 10px 0px;
    }

    .inner-top .col-md-6 {
        padding: 0PX;
    }

    .inner-top__left select {
        width: 70px;
        margin: 0px 5px;
    }

    .inner-top__left {
        display: flex;
    }

    .inner-top__left span {
        line-height: 34px;
    }

    .inner-top__right {
        display: flex;
        flex-flow: row-reverse;
    }

    .inner-top__right input {
        width: 40%;
        margin-left: 5px;
    }

    .inner-bottom {font-size: 16px;}

    .inner-bottom__left {
        line-height: 35px;
    }

    .inner-bottom__right {
        display: flex;
        flex-flow: row-reverse;
    }

    .inner-bottom__right .pagination {
        margin: 0px 0px 15px 0px;
    }
</style>
<script src="${pageContext.servletContext.contextPath}/resources/js/user/diem.js"></script>