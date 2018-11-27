$(document).ready(function(){
	var $table = $('#tableChiDoan');
	if($table.length){
		var jsonUrl =  window.contextRoot + '/chi-doan/list';
		
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
						data: 'lop.tenChiDoan'
					},										
					{
						data: 'hs.hoTen'
					},
					{
						data: 'lop.donVi'
					},
					{
						data: 'lop.id',
						bSortable: false,
						mRender: function(data, type, row){
							var str = '';
							str += '<a href="' + window.contextRoot + '/chi-doan/list"><button class="btn btn-outline-success btn-table" data-toggle="tooltip" title="Chi tiết"><i class="fa fa-info-circle icon-btn-table"></i></button></a>';
							str += '<a href="' + window.contextRoot + '/admin/doan-co-so/them"><button class="btn btn-outline-primary btn-table" data-toggle="tooltip" title="Sửa"><i class="fa fa-wrench icon-btn-table"></i></button></a>';
							str += '<button class="btn btn-outline-danger btn-table" data-toggle="tooltip" title="Xóa"><i class="fa fa-trash icon-btn-table"></i></button>';
							return str;
						}
					}
				]
		});
	}
})