$(document).ready(function(){
	var $table = $('#tableBaoCao');
	if($table.length){
		var jsonUrl =  window.contextRoot + '/bao-cao/list';
		
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
						data: 'tieuDe'
					},										
					{
						data: 'ngayGui'
					},
					{
						data: 'id',
						bSortable: false,
						mRender: function(data, type, row){
							var str = '';
							str += '<a href="' + window.contextRoot + '/admin/bao-cao/' + data +'/chi-tiet"><button class="btn btn-outline-success btn-table" data-toggle="tooltip" title="Chi tiết"><i class="fa fa-info-circle icon-btn-table"></i></button></a>';
							return str;
						}
					}
				]
		});
	}
})