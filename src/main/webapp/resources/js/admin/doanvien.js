$(document).ready(function() {
	var $table = $('#tableDoanVien');
	if($table.length){
		var jsonUrl =  window.contextRoot + '/tai-khoan/list';
		
		$table.DataTable({
			lengthMenu: [[10, 25, 50, 100], ['10', '25', '50', '100']],
			pageLength: 5,
			ajax: {
				url: jsonUrl,
				dataSrc: ''
			},
			columns:
				[
					{
						data: 'maSv'
					},
					{
						data: 'hoTen'
					},
					{
						data: 'chiDoan.tenChiDoan'
					},
					{
						data: 'chiDoan.donVi.tenDonVi'
					},
					{
						data: 'gioiTinh',
						mRender: function(data, type, row){
							return (data == true ? 'Nam' : 'Nữ');
						}
					},
					{
						data: 'ngaySinh'
					},
					{
						data: 'id',
						bSortable: false,
						mRender: function(data, type, row){
							var str = '';
							str += '<a href="' + window.contextRoot + '/tai-khoan/list"><button class="btn btn-outline-success btn-table" data-toggle="tooltip" title="Chi tiết"><i class="fa fa-info-circle icon-btn-table"></i></button></a>';
							str += '<button class="btn btn-outline-danger btn-table" data-toggle="tooltip" title="Xóa"><i class="fa fa-trash icon-btn-table"></i></button>';
							return str;
						}
					}
				]
		});
	}
})