$(document).ready(function() {
	var $table = $('#table');
	if($table.length){
		var jsonUrl =  window.contextRoot + '/ho-so/chi-doan/' + window.idChiDoan + '/danh-sach';

		$table.DataTable({
			lengthMenu: [[10, 25, 50, 100], ['10', '25', '50', '100']],
			pageLength: 10,
			ajax: {
				url: jsonUrl,
				dataSrc: ''
			},
			columns:
				[
					{
						data: 'taiKhoan.tenTaiKhoan',
					},
					{
						data: 'hoTen'
					},
					{
						data: 'maSv'
					},
					{
						data: 'taiKhoan.listQuyen[0].tenQuyen'
					},
					{
						data: 'id',
						bSortable: false,
						mRender: function(data, type, row){
							var str = '';
							str += '<a href="' + window.contextRoot + '/admin/tai-khoan/them/' + data + '"><button class="btn btn-outline-success btn-table" data-toggle="tooltip" title="Thêm tài khoản"><i class="fa fa-plus-circle icon-btn-table"></i></button></a>';
							str += '<button class="btn btn-outline-danger btn-table" data-toggle="tooltip" title="Xóa"><i class="fa fa-trash icon-btn-table"></i></button>';
							return str;
						}
					}
				]
		});
	}
})