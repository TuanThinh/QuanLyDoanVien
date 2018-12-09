$(document).ready(function(){
	var $table = $('#tableThongbao');
	if($table.length){
		var jsonUrl =  window.contextRoot + '/thong-bao-chinh-sach/list';
		
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
						data: 'tenThongBaoChinhSach'
					},										
					{
						data: 'nguoiGui'
					},
					{
						data: 'id',
						bSortable: false,
						mRender: function(data, type, row){
							var str = '';
							str += '<a href="' + window.contextRoot + '/tb-cs/list"><button class="btn btn-outline-success btn-table" data-toggle="tooltip" title="Chi tiết"><i class="fa fa-info-circle icon-btn-table"></i></button></a>';
							str += '<a href="' + window.contextRoot + '/admin/tb-cs/them"><button class="btn btn-outline-primary btn-table" data-toggle="tooltip" title="Sửa"><i class="fa fa-wrench icon-btn-table"></i></button></a>';
							str += '<button class="btn btn-outline-danger btn-table" data-toggle="tooltip" title="Xóa"><i class="fa fa-trash icon-btn-table"></i></button>';
							return str;
						}
					}
				]
		});
	}
})