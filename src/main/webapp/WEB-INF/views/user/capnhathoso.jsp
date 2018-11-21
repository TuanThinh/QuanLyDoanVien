<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div>
	<div class="modal-content">
		<div class=modal-header>
			
			<div class="capnhathoso-h">
				<label class="custom">Mã đoàn viên: </label>
				<label class="custom">15150217</label>
			</div>
			
			<div class="capnhathoso-h">
				<label class="custom">Họ và tên: </label>
				<label class="custom">Nguyễn Quang Huy</label>
			</div>
			
			<div class="capnhathoso-h">
				<label class="custom">Ngày sinh: </label>
				<label class="custom">10/07/1997</label>
			</div>
			
			<div class="capnhathoso-h">
				<label class="custom">Giới tính: </label>
				<label class="custom">Nam</label>
			</div>
		</div>
			
		
		<div >
			<div class="col-md-2">
			<label>Ảnh đại diện</label>
			<div class="img-avatar">
				<img class="media-object img-thumbnail user-img" alt="User Picture" src="/QuanLyDoanVien/resources/imgs/user.gif">
				<input type="file">
			</div>
			</div>
			
			<div class="col-md-5">
				<div class="form-group">
					<label class="col-md-5 custom">Địa chỉ</label>
					<div class="col-md-7 custom">
						<input type="text" name="" class="form-control">
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-5 custom">Chi đoàn</label>
					<div class="col-md-7 custom">
						<input type="text" name="" class="form-control">
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-5 custom">Đơn vị</label>
					<div class="col-md-7 custom">
						<input type="text" name="" class="form-control">
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-5 custom">Số điện thoại</label>
					<div class="col-md-7 custom">
						<input type="text" name="" class="form-control">
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-5 custom">Email</label>
					<div class="col-md-7 custom">
						<input type="text" name="" class="form-control">
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-5 custom">Ngày vào đoàn</label>
					<div class="col-md-7 custom">
						<input type="text" name="" class="form-control input-datepicker" readonly="readonly">
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-5 custom">Ngày vào đảng</label>
					<div class="col-md-7 custom">
						<input type="text" name="" class="form-control input-datepicker" readonly="readonly">
					</div>
				</div>
			</div>
			
			<div class="col-md-5">
				<div class="form-group">
					<label class="col-md-5 custom">Chức vụ</label>
					<div class="col-md-7 custom">
						<input type="text" name="" class="form-control">
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-5 custom">Dân tộc</label>
					<div class="col-md-7 custom">
						<input type="text" name="" class="form-control">
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-5 custom">Quốc tịch</label>
					<div class="col-md-7 custom">
						<input type="text" name="" class="form-control">
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-5 custom">Tôn giáo</label>
					<div class="col-md-7 custom">
						<input type="text" name="" class="form-control">
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-5 custom">Đối tượng chính sách</label>
					<div class="col-md-7 custom">
						<input type="text" name="" class="form-control">
					</div>
				</div>
				
				<div class="form-group">
					<label class="col-md-5 custom">Tài Khoản</label>
					<div class="col-md-7 custom">
						<input type="text" name="" class="form-control">
					</div>
				</div>
			</div>
			<div class="form-group">
				<div class="col-md-offset-10 col-md-2">
					<button type="submit" id="btnAdd" class="btn btn-primary">Lưu</button>
					<!-- <button type="submit" id="btnHuy" class="btn btn-primary">Hủy</button> -->
					<span class="btn btn-primary">Hủy</span>
				</div>
			</div>
			
		</div>
		
	</div>
</div>

<style>
	.col-md-offset-10 {
		margin-left: 86.333333%;
	}
	.capnhathoso{
	width: 20%;
	float: left;
	}
	
	.capnhathoso-h{
	width: 20%;
	float: left;
    margin: 0px 20px;
	}
	
	.modal-header {
    width: 100%
	}

	.col-md-2 {
	    width: 16,6666667%;
	    margin-top: 20px;
	}
	
	.col-md-5 {
    width: 41.66666667%;
    margin-top: 20px;
    }
	
	.col-md-7 {
    width: 58.33333333%;
    margin-top: 20px;
	}
	
	.custom{
	padding: 0px;
	}
	
	.modal-content {
		width: 100%;
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
	
	.custom {
		padding: 0px;
	}
	
	.form-group {
	    padding-right: 40px;
	}
	
	.form-control {
    display: block;
    width: 100%;
    height: 30px;
    padding: 6px 12px;
    font-size: 14px;
    line-height: 1.42857143;
    color: #555;
    background-color: #fff;
    background-image: none;
    border: 1px solid #ccc;
    border-radius: 4px;
    }
	
	.h4, h4 {
    font-size: 18px;
	}
	
	.btn-primary {
    color: #fff;
    background-color: #337ab7;
    border-color: #2e6da4;
	}
	
	.btn {
    display: inline-block;
    padding: 6px 12px;
    font-size: 14px;
    font-weight: 400;
    line-height: 1.42857143;
    text-align: center;
    white-space: nowrap;
    vertical-align: middle;
    touch-action: manipulation;
    cursor: pointer;
    user-select: none;
    border: 1px solid transparent;
    border-radius: 4px;
	}
	
	/*.btn-magn{*/
	/*margin-left:330px;*/
	/*margin-top: 320px;*/
	/*}*/
</style>
