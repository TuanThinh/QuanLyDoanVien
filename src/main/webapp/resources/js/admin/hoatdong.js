$(document).ready(function() {
	var $table = $('#tableHoatDong');
	
	if($table.length){
		if(window.loaiHoatDong == 'Chờ duyệt'){
			var jsonUrl =  window.contextRoot + '/hoat-dong/list/pending';
		} else if(window.loaiHoatDong == 'Đã duyệt'){
			var jsonUrl =  window.contextRoot + '/hoat-dong/list/approved';
		} else {
			var jsonUrl =  window.contextRoot + '/hoat-dong/list/denied';
		}
		
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
						data: 'tenHoatDong'
					},										
					{
						data: 'doiTuongThamGia'
					},
					{
						data: 'trangThai'
					},
					{
						data: 'id',
						bSortable: false,
						mRender: function(data, type, row){
							var str = '';
							str += '<a href="' + window.contextRoot + '/hoat-dong/list"><button class="btn btn-outline-success btn-table" data-toggle="tooltip" title="Chi tiết"><i class="fa fa-info-circle icon-btn-table"></i></button></a>';
							str += '<a href="' + window.contextRoot + '/admin/hoat-dong/them"><button class="btn btn-outline-primary btn-table" data-toggle="tooltip" title="Sửa"><i class="fa fa-wrench icon-btn-table"></i></button></a>';
							str += '<button class="btn btn-outline-danger btn-table" data-toggle="tooltip" title="Xóa"><i class="fa fa-trash icon-btn-table"></i></button>';
							return str;
						}
					}
				]
		});
	}
})