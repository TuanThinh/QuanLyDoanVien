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
							if(window.loaiHoatDong == 'Chờ duyệt'){
								str += '<a href="' + window.contextRoot + '/admin/hoat-dong/' + data + '/phe-duyet"><button class="btn btn-outline-success btn-table" data-toggle="tooltip" title="Chấp nhận"><i class="fa fa-check-circle icon-btn-table"></i></button></a>';
								str += '<a href="' + window.contextRoot + '/admin/hoat-dong/' + data + '/huy-bo"><button class="btn btn-outline-danger btn-table" data-toggle="tooltip" title="Hủy bỏ"><i class="fa fa-times-circle icon-btn-table"></i></button></a>';
								
							} else if(window.loaiHoatDong == 'Đã duyệt'){
								str += '<a href="' + window.contextRoot + '/admin/hoat-dong/update/' + data + '"><button class="btn btn-outline-primary btn-table" data-toggle="tooltip" title="Sửa"><i class="fa fa-wrench icon-btn-table"></i></button></a>';
								str += '<a href="' + window.contextRoot + '/admin/hoat-dong/' + data + '/huy-bo"><button class="btn btn-outline-danger btn-table" data-toggle="tooltip" title="Hủy bỏ"><i class="fa fa-times-circle icon-btn-table"></i></button></a>';
							} else {
								str += '<a href="' + window.contextRoot + '/admin/hoat-dong/' + data + '/phe-duyet"><button class="btn btn-outline-success btn-table" data-toggle="tooltip" title="Chấp nhận"><i class="fa fa-check-circle icon-btn-table"></i></button></a>';
							}
							
							return str;
						}
					}
				]
		});
	}
})