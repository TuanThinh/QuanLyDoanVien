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
						data: 'hoTen'
					},
					{
						data: 'maSv'
					},
					{
						data: 'taiKhoan.tenTaiKhoan',
						defaultContent: ''
					},
					{
						data: 'chucVu.tenChucVu',
						defaultContent: '',
					},
					{
						data: 'id',
						bSortable: false,
						mRender: function(data, type, row){
							var str = '';
							str += '<a href="' + window.contextRoot + '/admin/tai-khoan/them/' + data + '"><button class="btn btn-outline-success btn-table" data-toggle="tooltip" title="Thêm tài khoản"><i class="fa fa-plus-circle icon-btn-table"></i></button></a>';
							return str;
						}
					}
				]
		});
	}
})