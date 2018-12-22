<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="row inner-top">
	<div class="col-md-6 inner-top__left">
		<span>Hiển thị</span>
		<select class="form-control" id="number-record">
			<option>10</option>
			<option>25</option>
			<option>50</option>
            <option>100</option>
		</select>
		<span>bản ghi</span>
	</div>
	<div class="col-md-6 inner-top__right">
		<input type="text" id="txtSearch" class="form-control" placeholder="Enter value"/>
		<span>Tìm kiếm:</span>
	</div>
</div>

<div class="row">
	<div class="col-md-12">
		<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modalAdd" style="margin-bottom: 5px;">Thêm</button>
		<input type="hidden" id="sort" value="asc"/>
		<input type="hidden" id="column-name" value=""/>
		<input type="hidden" id="id-hs-selected">
		<table class="table table-striped table-bordered table-hover" id="danh-sach-ho-so">
			<thead>
			<tr>
				<th width="70px;">Hình ảnh</th>
				<th class="maSv" width="120px;"><i class="fa fa-sort"></i>Mã đoàn viên</th>
				<th class="hoTen"><i class="fa fa-sort"></i>Họ tên</th>
				<th class="ngaySinh"><i class="fa fa-sort"></i>Ngày sinh</th>
				<th class="gioiTinh"><i class="fa fa-sort"></i>Giới tính</th>
				<th class="diaChi"><i class="fa fa-sort"></i>Địa chỉ</th>
				<th class="chiDoan.tenChiDoan"><i class="fa fa-sort"></i>Chi đoàn</th>
				<th class="chiDoan.donVi.tenDonVi"><i class="fa fa-sort"></i>Đơn vị</th>

				<th class="column-hidden">Số điện thoại</th>
				<th class="column-hidden">Email</th>
				<th class="column-hidden">Quốc tịch</th>
				<th class="column-hidden">Dân tộc</th>
				<th class="column-hidden">Tôn giáo</th>
				<th class="column-hidden">Đối tượng chính sách</th>
				<th class="column-hidden">Ngày vào đoàn</th>
				<th class="column-hidden">Ngày vào đảng</th>
				<th class="column-hidden">Chức vụ</th>
				<th class="column-hidden">Tài khoản</th>
				<th class="column-hidden">Mã người quản lý</th>
				<th width="80px;"></th>
			</tr>
			</thead>
			<tbody>

			</tbody>
		</table>
	</div>
</div>

<div class="row inner-bottom">
	<div class="col-md-6 inner-bottom__left">
		<span id="info-record"></span>
	</div>

	<div class="col-md-6 inner-bottom__right">
		<ul class="pagination" id="pagination">

		</ul>
	</div>
</div>

<div class="modal-ho-so">
	<div id="modalAdd" class="modal" role="dialog">
		<!-- Modal content -->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4>Thêm mới đoàn viên</h4>
			</div>
			<div class="modal-body">
				<form id="form-add-hoso" class="form-horizontal">

					<div class="col-md-2">
						<label>Ảnh đại diện</label>
						<div class="img-avatar">
							<img class="media-object img-thumbnail user-img"
								 alt="User Picture"
								 src="${pageContext.servletContext.contextPath}/resources/imgs/user.gif">
							<input type="file" name="hinhAnh">
						</div>
					</div>

					<div class="col-md-5">
						<div class="form-group">
							<label class="col-md-5 custom">Mã đoàn viên</label>
							<div class="col-md-7 custom">
								<input type="text" name="maSv" class="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Họ tên</label>
							<div class="col-md-7 custom">
								<input type="text" name="hoTen" class="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Ngày sinh</label>
							<div class="col-md-7 custom">
								<input type="text" name="ngaySinh" class="form-control input-datepicker" readonly="readonly"/>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Giới tính</label>
							<div class="col-md-7 custom">
								<select name="gioiTinh" class="form-control">
									<option value="1">Nam</option>
									<option value="0">Nữ</option>
								</select>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Địa chỉ</label>
							<div class="col-md-7 custom">
								<input type="text" name="diaChi" class="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Đơn vị</label>
							<div class="col-md-7 custom">
								<select name="idDonVi" class="form-control select-donvi">

								</select>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Chi đoàn</label>
							<div class="col-md-7 custom">
								<select name="idChiDoan" class="form-control select-chidoan">

								</select>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Chức vụ</label>
							<div class="col-md-7 custom">
								<select name="idChucVu" class="form-control select-chucvu">

								</select>
							</div>
						</div>

					</div>

					<div class="col-md-5">
						<div class="form-group">
							<label class="col-md-5 custom">Số điện thoại</label>
							<div class="col-md-7 custom">
								<input type="text" name="soDienThoai" class="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Email</label>
							<div class="col-md-7 custom">
								<input type="text" id="add-email" name="email" class="form-control" />
                                <span class="email"></span>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Ngày vào đoàn</label>
							<div class="col-md-7 custom">
								<input type="text" name="ngayVaoDoan" class="form-control input-datepicker" readonly="readonly"/>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Ngày vào đảng</label>
							<div class="col-md-7 custom">
								<input type="text" name="ngayVaoDang" class="form-control input-datepicker" readonly="readonly"/>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Dân tộc</label>
							<div class="col-md-7 custom">
								<input type="text" name="danToc" class="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Quốc tịch</label>
							<div class="col-md-7 custom">
								<input type="text" name="quocTich" class="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Tôn giáo</label>
							<div class="col-md-7 custom">
								<input type="text" name="tonGiao" class="form-control" />
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Đối tượng chính sách</label>
							<div class="col-md-7 custom">
								<input type="text" name="doiTuongChinhSach" class="form-control" />
							</div>
						</div>
					</div>

					<div class="form-group">
						<div class="col-md-offset-2 col-md-10">
							<button id="btnAdd" class="btn btn-primary">Thêm</button>
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
				<form id="form-edit-hoso" class="form-horizontal">
					<input type="hidden" name="id" class="edit-id">
					<div class="col-md-2">
						<label>Ảnh đại diện</label>
						<div class="img-avatar">
							<img class="media-object img-thumbnail user-img"
								 alt="User Picture"
								 src="${pageContext.servletContext.contextPath}/resources/imgs/user.gif">
							<input type="file" name="hinhAnh">
						</div>
					</div>

					<div class="col-md-5">
						<div class="form-group">
							<label class="col-md-5 custom">Mã đoàn viên</label>
							<div class="col-md-7 custom">
								<input type="text" name="maSv" class="form-control edit-maSv" />
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Họ tên</label>
							<div class="col-md-7 custom">
								<input type="text" name="hoTen" class="form-control edit-hoTen" />
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Ngày sinh</label>
							<div class="col-md-7 custom">
								<input type="text" name="ngaySinh" class="form-control input-datepicker edit-ngaySinh" readonly="readonly"/>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Giới tính</label>
							<div class="col-md-7 custom">
								<select name="gioiTinh" class="form-control edit-gioiTinh">
									<option value="1">Nam</option>
									<option value="0">Nữ</option>
								</select>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Địa chỉ</label>
							<div class="col-md-7 custom">
								<input type="text" name="diaChi" class="form-control edit-diaChi" />
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Đơn vị</label>
							<div class="col-md-7 custom">
								<select name="idDonVi" class="form-control select-donvi edit-idDonVi">

								</select>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Chi đoàn</label>
							<div class="col-md-7 custom">
								<select name="idChiDoan" class="form-control select-chidoan edit-idChiDoan">

								</select>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Chức vụ</label>
							<div class="col-md-7 custom">
								<select name="idChucVu" class="form-control select-chucvu edit-idChucVu">

								</select>
							</div>
						</div>
					</div>

					<div class="col-md-5">
						<div class="form-group">
							<label class="col-md-5 custom">Số điện thoại</label>
							<div class="col-md-7 custom">
								<input type="text" name="soDienThoai" class="form-control edit-soDienThoai" />
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Email</label>
							<div class="col-md-7 custom">
								<input type="text" id="edit-email" name="email" class="form-control edit-email" />
                                <span class="email"></span>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Ngày vào đoàn</label>
							<div class="col-md-7 custom">
								<input type="text" name="ngayVaoDoan" class="form-control input-datepicker edit-ngayVaoDoan" readonly="readonly"/>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Ngày vào đảng</label>
							<div class="col-md-7 custom">
								<input type="text" name="ngayVaoDang" class="form-control input-datepicker edit-ngayVaoDang" readonly="readonly"/>
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Dân tộc</label>
							<div class="col-md-7 custom">
								<input type="text" name="danToc" class="form-control edit-danToc" />
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Quốc tịch</label>
							<div class="col-md-7 custom">
								<input type="text" name="quocTich" class="form-control edit-quocTich" />
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Tôn giáo</label>
							<div class="col-md-7 custom">
								<input type="text" name="tonGiao" class="form-control edit-tonGiao" />
							</div>
						</div>

						<div class="form-group">
							<label class="col-md-5 custom">Đối tượng chính sách</label>
							<div class="col-md-7 custom">
								<input type="text" name="doiTuongChinhSach" class="form-control edit-doiTuongChinhSach" />
							</div>
						</div>
						<input type="hidden" name="idTaiKhoan" class="form-control edit-idTaiKhoan" />
					</div>

					<div class="form-group">
						<div class="col-md-offset-2 col-md-10">
							<button id="btnEdit" class="btn btn-primary">Cập nhật</button>
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
			<button id="btnXoa" type="button" class="btn btn-primary" style="width: 49%;">Xác nhận</button>
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
				<div class="row">
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
									<strong class="hoSo-maSv detail"></strong>
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-5 custom">Họ tên</label>
								<div class="col-md-7 custom">
									<strong class="hoSo-hoTen detail"></strong>
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-5 custom">Ngày sinh</label>
								<div class="col-md-7 custom">
									<strong class="hoSo-ngaySinh detail"></strong>
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-5 custom">Giới tính</label>
								<div class="col-md-7 custom">
									<strong class="hoSo-gioiTinh detail"></strong>
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-5 custom">Địa chỉ</label>
								<div class="col-md-7 custom">
									<strong class="hoSo-diaChi detail"></strong>
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-5 custom">Chi đoàn</label>
								<div class="col-md-7 custom">
									<strong class="hoSo-chiDoan detail"></strong>
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-5 custom">Đơn vị</label>
								<div class="col-md-7 custom">
									<strong class="hoSo-donVi detail"></strong>
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-5 custom">Số điện thoại</label>
								<div class="col-md-7 custom">
									<strong class="hoSo-sdt detail"></strong>
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-5 custom">Email</label>
								<div class="col-md-7 custom">
									<strong class="hoSo-email detail"></strong>
								</div>
							</div>

						</div>

						<div class="col-md-5">
							<div class="form-group">
								<label class="col-md-5 custom">Ngày vào đoàn</label>
								<div class="col-md-7 custom">
									<strong class="hoSo-ngayVaoDoan detail"></strong>
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-5 custom">Ngày vào đảng</label>
								<div class="col-md-7 custom">
									<strong class="hoSo-ngayVaoDang detail"></strong>
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-5 custom">Chức vụ</label>
								<div class="col-md-7 custom">
									<strong class="hoSo-chucVu detail"></strong>
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-5 custom">Dân tộc</label>
								<div class="col-md-7 custom">
									<strong class="hoSo-danToc detail"></strong>
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-5 custom">Quốc tịch</label>
								<div class="col-md-7 custom">
									<strong class="hoSo-quocTich detail"></strong>
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-5 custom">Tôn giáo</label>
								<div class="col-md-7 custom">
									<strong class="hoSo-tonGiao detail"></strong>
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-5 custom">Đối tượng chính sách</label>
								<div class="col-md-7 custom">
									<strong class="hoSo-doiTuongChinhSach detail"></strong>
								</div>
							</div>

							<div class="form-group">
								<label class="col-md-5 custom">Tài khoản</label>
								<div class="col-md-7 custom">
									<strong class="hoSo-taiKhoan detail"></strong>
								</div>
							</div>
						</div>

					</div>
				</div>
				<br>
				<div class="row">
					<div class="col-md-12">
						<fieldset>
							<legend>Điểm rèn luyện</legend>
							<input type="text" id="search-diem" class="form-control search" placeholder="Search">
							<button type="button" id="btn-add-diem" class="btn btn-primary btn-add" data-toggle="modal" data-target="#modal-add-diem">Thêm</button>
							<table class="table table-bordered table-hover table-whitesmoke" id="diem-ren-luyen">
								<thead>
								<tr>
									<th class="stt">STT</th>
									<th class="thoi-gian">Thời gian</th>
									<th>Điểm rèn luyện</th>
									<th>Xếp loại</th>
									<th class="stt"></th>
								</tr>
								</thead>
								<tbody>

								</tbody>
							</table>
						</fieldset>

					</div>
				</div>

				<div class="row">
					<div class="col-md-12">
						<fieldset>
							<legend>Khen thưởng - kỷ luật</legend>
							<input type="text" id="search-ktkl" class="form-control search" placeholder="Search">
							<button type="button" id="btn-add-ktkl" class="btn btn-primary btn-add" data-toggle="modal" data-target="#modal-add-ktkl">Thêm</button>
							<table class="table table-bordered table-hover table-whitesmoke" id="khenthuong-kyluat">
								<thead>
								<tr>
									<th class="stt">STT</th>
									<th class="thoi-gian">Thời gian</th>
									<th>Tiêu đề</th>
									<th>Nội dung</th>
									<th class="stt"></th>
								</tr>
								</thead>
								<tbody>

								</tbody>
							</table>
						</fieldset>
					</div>
				</div>

				<div class="row">
					<div class="col-md-12">
						<fieldset>
							<legend>Các hoạt động tham gia</legend>
							<input type="text" id="search-hoatdong" class="form-control search" placeholder="Search">
							<button type="button" id="btn-add-hoatdong" class="btn btn-primary btn-add" data-toggle="modal" data-target="#modal-add-hdtg">Thêm</button>
							<table class="table table-bordered table-hover table-whitesmoke" id="hoat-dong-tham-gia">
								<thead>
								<tr>
									<th class="stt">STT</th>
									<th class="thoi-gian">Thời gian</th>
									<th>Tên hoạt động</th>
									<th>Địa điểm</th>
									<th class="stt"></th>
								</tr>
								</thead>
								<tbody>

								</tbody>
							</table>
						</fieldset>
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" id="btnDetail" class="btn btn-default" data-dismiss="modal">Đóng</button>
			</div>
		</div>
	</div>
</div>

<div class="modal-noname">
	<%--------- Diem --------%>
	<div id="modal-add-diem" class="modal modal-hidden" role="dialog">
		<!-- Modal content -->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4>Thêm mới</h4>
			</div>
			<div class="modal-body">
				<div class="row">
					<div class="form-group">
						<label class="col-md-4">Điểm: </label>
						<div class="col-md-8">
							<input type="text" id="diem-add" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-4">Thời gian: </label>
						<div class="col-md-8">
                            <input type="text" id="diem-thoigian-add" class="form-control input-datepicker" readonly="readonly"/>
						</div>
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" id="btn-save-diem" class="btn btn-primary">Thêm</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">Đóng</button>
			</div>
		</div>
	</div>

	<div id="modal-edit-diem" class="modal modal-hidden" role="dialog">
		<!-- Modal content -->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4>Cập nhật</h4>
			</div>
			<div class="modal-body">
				<div class="row">
					<input type="hidden" id="id-diem-select">
					<div class="form-group">
						<label class="col-md-4">Điểm: </label>
						<div class="col-md-8">
							<input type="text" id="diem-edit" class="form-control" />
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-4">Thời gian: </label>
						<div class="col-md-8">
                            <input type="text" id="diem-thoigian-edit" class="form-control input-datepicker" readonly="readonly"/>
						</div>
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" id="btn-update-diem" class="btn btn-primary">Cập nhật</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">Đóng</button>
			</div>
		</div>
	</div>

	<div id="modal-delete-diem" class="modal modal-hidden" role="dialog">
		<!-- Modal content -->
		<div class="modal-content modal-delete">
			<button type="button" class="close" data-dismiss="modal">&times;</button>
			<p>
				Bạn có muốn xóa <span style="color: red;"> item </span>này không?
			</p>
			<input type="hidden" id="id-diem">
			<button id="btn-delete-diem" type="button" class="btn btn-primary" style="width: 49%;">Xác nhận</button>
			<span class="closeModalDelete btn btn-primary" style="width: 49%;" data-dismiss="modal">Hủy</span>
		</div>
	</div>

	<%--------- Khen thuong ky luat ----------%>
	<div id="modal-add-ktkl" class="modal modal-hidden" role="dialog">
		<!-- Modal content -->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4>Thêm mới</h4>
			</div>
			<div class="modal-body">
				<div class="row">
					<div class="form-group">
						<label class="col-md-4">Tiêu đề: </label>
						<div class="col-md-8">
							<select type="text" id="ktkl-add" class="form-control select-ktkl" >
							</select>
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-4">Thời gian: </label>
						<div class="col-md-8">
                            <input type="text" id="ktkl-thoigian-add" class="form-control input-datepicker" readonly="readonly"/>
						</div>
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" id="btn-save-ktkl" class="btn btn-primary">Thêm</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">Đóng</button>
			</div>
		</div>
	</div>

	<div id="modal-edit-ktkl" class="modal modal-hidden" role="dialog">
		<!-- Modal content -->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4>Cập nhật</h4>
			</div>
			<div class="modal-body">
				<div class="row">
					<input type="hidden" id="id-ktkl-select">
					<div class="form-group">
						<label class="col-md-4">Tiêu đề: </label>
						<div class="col-md-8">
							<select type="text" id="ktkl-edit" class="form-control select-ktkl" >
							</select>
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-4">Thời gian: </label>
						<div class="col-md-8">
                            <input type="text" id="ktkl-thoigian-edit" class="form-control input-datepicker" readonly="readonly"/>
						</div>
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" id="btn-update-ktkl" class="btn btn-primary">Cập nhật</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">Đóng</button>
			</div>
		</div>
	</div>

	<div id="modal-delete-ktkl" class="modal modal-hidden" role="dialog">
		<!-- Modal content -->
		<div class="modal-content modal-delete">
			<button type="button" class="close" data-dismiss="modal">&times;</button>
			<p>
				Bạn có muốn xóa <span style="color: red;"> item </span>này không?
			</p>
			<input type="hidden" id="id-ktkl">
			<button id="btn-delete-ktkl" type="button" class="btn btn-primary" style="width: 49%;">Xác nhận</button>
			<span class="closeModalDelete btn btn-primary" style="width: 49%;" data-dismiss="modal">Hủy</span>
		</div>
	</div>

	<%------------- Hoat dong tham gia ------------%>
	<div id="modal-add-hdtg" class="modal modal-hidden" role="dialog">
		<!-- Modal content -->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4>Thêm mới</h4>
			</div>
			<div class="modal-body">
				<div class="row">
					<div class="form-group">
						<label class="col-md-4">Tên hoạt động: </label>
						<div class="col-md-8">
							<select type="text" id="hdtg-add" class="form-control select-hoatdong" >
							</select>
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-4">Thời gian: </label>
						<div class="col-md-8">
                            <input type="text" id="hdtg-thoigian-add" class="form-control input-datepicker" readonly="readonly"/>
						</div>
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" id="btn-save-hdtg" class="btn btn-primary">Thêm</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">Đóng</button>
			</div>
		</div>
	</div>

	<div id="modal-edit-hdtg" class="modal modal-hidden" role="dialog">
		<!-- Modal content -->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4>Cập nhật</h4>
			</div>
			<div class="modal-body">
				<div class="row">
					<input type="hidden" id="id-hdtg-select">
					<div class="form-group">
						<label class="col-md-4">Tên hoạt động: </label>
						<div class="col-md-8">
							<select type="text" id="hdtg-edit" class="form-control select-hoatdong" >
							</select>
						</div>
					</div>

					<div class="form-group">
						<label class="col-md-4">Thời gian: </label>
						<div class="col-md-8">
                            <input type="text" id="hdtg-thoigian-edit" class="form-control input-datepicker" readonly="readonly"/>
						</div>
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" id="btn-update-hdtg" class="btn btn-primary">Cập nhật</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">Đóng</button>
			</div>
		</div>
	</div>

	<div id="modal-delete-hdtg" class="modal modal-hidden" role="dialog">
		<!-- Modal content -->
		<div class="modal-content modal-delete">
			<button type="button" class="close" data-dismiss="modal">&times;</button>
			<p>
				Bạn có muốn xóa <span style="color: red;"> item </span>này không?
			</p>
			<input type="hidden" id="id-hdtg">
			<button id="btn-delete-hdtg" type="button" class="btn btn-primary" style="width: 49%;">Xác nhận</button>
			<span class="closeModalDelete btn btn-primary" style="width: 49%;" data-dismiss="modal">Hủy</span>
		</div>
	</div>
</div>

<style>
	.stt {
		width: 70px;
	}

	th.thoi-gian {
		width: 170px;
	}

	.column-hidden{
		display: none;
	}

    table#danh-sach-ho-so th .fa {
        float: right;
        line-height: 19px;
        font-size: 12px;
        color: #9e9e9e;
    }

    #danh-sach-ho-so th {
        cursor: pointer;
    }

	i.fa:hover {
		cursor: pointer;
		color: blue;
	}
	
	.modal-ho-so .modal-content {
		width: 75%;
	    margin: auto;
	    /*top: 50px;*/
	}
	.modal-ho-so .modal-body {
		padding: 25px;
	}
	
	.img-avatar {
		overflow: hidden;
		width: 74px;
	}
	
	.img-avatar img {
		margin: auto;
	}

	.modal-ho-so .custom {
		padding: 0px;
	}

	.modal-ho-so .form-group {
	    padding-right: 40px;
	}

	.modal-noname .modal-content {
		width: 30%;
		top: 50px;
		margin: auto;
		background-color: whitesmoke;
	}

	.modal-noname .form-group {
		height: 34px;
		line-height: 34px;
	}

	.modal-delete {
		width: 280px !important;
		padding: 15px;
	}

    .email {
        color: red;
        position: absolute;
        right: 0px;
        top: 7px;
        padding-right: 5px;
    }
	/*---------*/

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
		width: 75px;
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

	strong.detail {
		color: #af0b0b;
	}

	.table-whitesmoke th {
		background-color: whitesmoke;
	}

	input.search {
		width: 20%;
		float: right;
		margin-bottom: 5px;
	}

	button.btn-add {
		float: left;
	}
</style>

<script src="${pageContext.servletContext.contextPath}/resources/js/user/danhsachhoso.js"></script>