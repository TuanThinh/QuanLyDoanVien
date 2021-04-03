<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>



<div class="row">
    <!-- .col-lg-12 -->
    <div class="col-md-12">
        <div class="box">
            <header>
                <h5>Danh sách đoàn viên - điểm</h5>
                <div class="toolbar">
                    <div class="btn-group">
                        <a href="#ds-doanvien-diem" data-toggle="collapse" class="btn btn-default btn-sm minimize-box">
                            <i class="fa fa-angle-up"></i>
                        </a>

                    </div>
                </div>
            </header>
            <div id="ds-doanvien-diem" class="body collapse in ds-doanvien">
                <div class="col-md-3 form-horizontal">
                    <h4>Thống kê</h4>
                    <div class="form-group">
                        <label class="col-md-4">Số lượng</label>
                        <div class="col-md-8">
                            <select id="diem-soluong" class="soluong">
                                <option value="5">5</option>
                                <option value="10">10</option>
                                <option value="20">20</option>
                                <option value="50">50</option>
                                <option value="100">100</option>
                            </select>
                            <select id="diem-top" class="xephang">
                                <option value="desc" selected>Top đầu</option>
                                <option value="asc">Top dưới</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4">Thời gian</label>
                        <div class="col-md-8">
                            <select id="diem-thoigian" class="form-control select-date previous-datenow">

                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4">Học lực</label>
                        <div class="col-md-8">
                            <select id="diem-hocluc" class="form-control">
                                <option value="NaN">--- Tất cả ---</option>
                                <option value="XS">Xuất sắc (3.60 - 4.00)</option>
                                <option value="G">Giỏi (3.20 - 3.59)</option>
                                <option value="K" selected>Khá (2.50 - 3.19)</option>
                                <option value="TBK">TB khá (2.30 - 2.49)</option>
                                <option value="TB">Trung bình (2.00 - 2.29)</option>
                                <option value="TBY">TB yếu (1.50 - 1.99)</option>
                                <option value="Y">Yếu (1.00 - 1.49)</option>
                                <option value="K">Kém (Dưới 1.00)</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4">Chi đoàn</label>
                        <div class="col-md-8">
                            <select id="diem-chidoan" class="form-control ten-chi-doan">
                                <option value="-1">--- Tất cả ---</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4">Đơn vị</label>
                        <div class="col-md-8">
                            <select id="diem-donvi" class="form-control ten-don-vi">
                                <option value="-1">--- Tất cả ---</option>
                            </select>
                        </div>
                    </div>

                    <div class="button form-group">
                        <button id="hoso-diem" class="btn btn-primary">Tìm</button>
                    </div>
                </div>

                <div class="col-md-9">
                    <input class="form-control" id="search-hoso-diem" type="text" placeholder="Search"/>
                    <button class="btn btn-info">Xuất ra excel</button>
                    <input type="hidden" class="sort"/>
                    <table class="table table-striped table-bordered table-hover" id="danh-sach-diem-doan-vien">
                        <thead>
                        <tr>
                            <th class="stt">STT</th>
                            <th width="120px;">Mã đoàn viên</th>
                            <th>Họ tên</th>
                            <th class="column-hidden">Ngày sinh</th>
                            <th class="column-hidden">Chi đoàn</th>
                            <th class="column-hidden">Đơn vị</th>
                            <th>Điểm</th>
                            <th>Thời gian</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td class ="stt"></td>
                            <td class="diem-ma"></td>
                            <td class="diem-hoten"></td>
                            <td class="diem-ngaysinh column-hidden"></td>
                            <td class="diem-chidoan column-hidden"></td>
                            <td class="diem-donvi column-hidden"></td>
                            <td class="diem"></td>
                            <td class="diem-thoigian"></td>
                            <td>
                                <span data-toggle="modal" data-target="#modalDetail">
                                    <i class="fa fa-eye" data-toggle="tooltip" data-original-title="Chi tiết" data-placement="top" ></i>
                                </span>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <!-- /.col-lg-6 -->
</div>

<div class="row">
    <!-- .col-lg-12 -->
    <div class="col-md-12">
        <div class="box">
            <header>
                <h5>Danh sách đoàn viên - hoạt động</h5>
                <div class="toolbar">
                    <div class="btn-group">
                        <a href="#ds-doanvien-hd" data-toggle="collapse" class="btn btn-default btn-sm minimize-box">
                            <i class="fa fa-angle-up"></i>
                        </a>

                    </div>
                </div>
            </header>
            <div id="ds-doanvien-hd" class="body collapse in ds-doanvien">
                <div class="col-md-3 form-horizontal">
                    <h4>Thống kê</h4>
                    <div class="form-group">
                        <label class="col-md-4">Số lượng</label>
                        <div class="col-md-8">
                            <select id="hd-soluong" class="soluong">
                                <option value="5">5</option>
                                <option value="10">10</option>
                                <option value="20">20</option>
                                <option value="50">50</option>
                                <option value="100">100</option>
                            </select>
                            <select id="hd-top" class="xephang">
                                <option value="desc" selected>Top đầu</option>
                                <option value="asc">Top dưới</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4">Thời gian</label>
                        <div class="col-md-8">
                            <select id="hd-thoigian" class="form-control select-date previous-datenow">

                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4">Chi đoàn</label>
                        <div class="col-md-8">
                            <select id="hd-chidoan" class="form-control ten-chi-doan">
                                <option value="-1">--- Tất cả ---</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4">Đơn vị</label>
                        <div class="col-md-8">
                            <select id="hd-donvi" class="form-control ten-don-vi">
                                <option value="-1">--- Tất cả ---</option>
                            </select>
                        </div>
                    </div>

                    <div class="button form-group">
                        <button id="hoso-hoatdong" class="btn btn-primary">Tìm</button>
                    </div>
                </div>

                <div class="col-md-9">
                    <input class="form-control" id="search-hoso-hd" type="text" placeholder="Search"/>
                    <button class="btn btn-info">Xuất ra excel</button>
                    <table class="table table-striped table-bordered table-hover" id="danh-sach-hoat-dong-doan-vien">
                        <thead>
                        <tr>
                            <th width="120px;">Mã đoàn viên</th>
                            <th>Họ tên</th>
                            <th class="column-hidden">Ngày sinh</th>
                            <th class="column-hidden">Chi đoàn</th>
                            <th class="column-hidden">Đơn vị</th>
                            <th>Thời gian</th>
                            <th>Số HĐ</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td class="hd-ma"></td>
                            <td class="hd-hoten"></td>
                            <td class="hd-ngaysinh column-hidden"></td>
                            <td class="hd-chidoan column-hidden"></td>
                            <td class="hd-donvi column-hidden"></td>
                            <td class="hd-thoigian"></td>
                            <td class="hd-sohoatdongthamgia"></td>
                            <td>
						<span data-toggle="modal" data-target="#modalDetail">
							<i class="fa fa-eye" data-toggle="tooltip" data-original-title="Chi tiết" data-placement="top" ></i>
						</span>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <!-- /.col-lg-6 -->
</div>


<div class="row">
    <!-- .col-lg-12 -->
    <div class="col-md-12">
        <div class="box">
            <header>
                <h5>Số lượng đoàn viên và đảng viên qua các thời kỳ</h5>
                <div class="toolbar" style="display: inline-flex; line-height: 34px;">
                    <label>start</label>
                    <select class="form-control select-date start-date" id="start-date">
                    </select>
                    <label>end</label>
                    <select class="form-control select-date end-date" id="end-date">
                    </select>
                    <div class="btn-group">
                        <a href="#doanvien-dangvien-tk" data-toggle="collapse" class="btn btn-default btn-sm minimize-box">
                            <i class="fa fa-angle-up"></i>
                        </a>

                    </div>
                </div>
            </header>
            <div id="doanvien-dangvien-tk" class="body collapse in">

            </div>
        </div>
    </div>
    <!-- /.col-lg-6 -->
</div>

<div class="row">

    <div class="col-md-6">
        <div class="box">
            <header>
                <h5>Thành tích học tập theo chi đoàn</h5>
                <div class="toolbar">
                    <div class="btn-group">
                        <a href="#doanvien-chidoan" data-toggle="collapse" class="btn btn-default btn-sm minimize-box">
                            <i class="fa fa-angle-up"></i>
                        </a>
                    </div>
                </div>
            </header>

            <div id="doanvien-chidoan" class="body collapse in pie">
                <div class="col-md-12 form-group">
                    <label class="col-md-2">Chi đoàn</label>
                    <div class="col-md-5">
                        <select class="form-control ten-chi-doan" id="hl-chidoan-tenchidoan">

                        </select>
                    </div>
                    <label class="col-md-2">Thời gian</label>
                    <div class="col-md-3">
                        <select class="form-control select-date previous-datenow" id="hl-chidoan-thoigian">

                        </select>
                    </div>
                </div>

                <div id="doanvien-chidoan-tk">

                </div>
            </div>
        </div>
    </div>

    <div class="col-md-6">
        <div class="box">
            <header>
                <h5>Thành tích học tập theo đơn vị</h5>
                <div class="toolbar">
                    <div class="btn-group">
                        <a href="#doanvien-donvi" data-toggle="collapse" class="btn btn-default btn-sm minimize-box">
                            <i class="fa fa-angle-up"></i>
                        </a>

                    </div>
                </div>
            </header>
            <div id="doanvien-donvi" class="body collapse in pie">
                <div class="col-md-12 form-group">
                    <label class="col-md-2">Đơn vị</label>
                    <div class="col-md-5">
                        <select class="form-control ten-don-vi" id="hl-donvi-tendonvi">

                        </select>
                    </div>
                    <label class="col-md-2">Thời gian</label>
                    <div class="col-md-3">
                        <select class="form-control select-date previous-datenow" id="hl-donvi-thoigian">

                        </select>
                    </div>
                </div>

                <div id="doanvien-donvi-tk">

                </div>
            </div>
        </div>
    </div>
</div>

<style>
    .column-hidden {

    }

    .collapse.in {
        display: flow-root;
    }

    .pie label {
        padding: 0px;
        line-height: 32px;
        margin: 0px;
        width: 13%;
    }

    .pie .form-group {
        padding: 0px;
    }

    .ds-doanvien {

    }

    .ds-doanvien input {
        width: 25%;
        margin-bottom: 10px;
        float: left;
    }

    .ds-doanvien button {
        float: right;
    }

    .ds-doanvien label {
        padding-right: 0px;
        line-height: 36px;
    }

    .ds-doanvien .form-group {
        margin-bottom: 5px;
    }

    .ds-doanvien .col-md-3 {
        background-color: whitesmoke;
        padding: 10px;
        min-height: 400px;
    }

    .ds-doanvien h4 {
        background-color: #e6e6e6;
        text-align: center;
        padding: 10px 0px;
    }

    select.soluong {
        height: 34px;
        border: 1px solid #cccccc;
        border-radius: 10%;
        padding-left: 9px;
    }

    select.xephang {
        height: 34px;
        border: 1px solid #cccccc;
        border-radius: 10%;
        padding-left: 8px;
    }

    .toolbar label {
        padding: 0px 10px;
    }

    .toolbar select {
        height: 31px;
        margin: 4px;
        padding: 4px 12px;
    }

    .button.form-group {
        text-align: center;
        padding-right: 15px;
    }

    .button.form-group .btn.btn-primary {
        width: 95%;
    }
</style>

<script src="${pageContext.servletContext.contextPath}/resources/js/user/thongke.js"></script>

<script language = "JavaScript">
    // $(document).ready(function() {
        // $('#doanvien-dangvien-tk').highcharts({
        //     title : {
        //         text: 'Số lượng đoàn viên và đảng viên qua các thời kỳ'
        //     },
        //     subtitle : {
        //         text: 'Từ năm 2007 - 2018'
        //     },
        //     xAxis : {
        //         title: {
        //             text: 'Năm'
        //         }
        //     },
        //     yAxis : {
        //         title: {
        //             text: 'Số lượng'
        //         }
        //     },
        //     plotOptions : {
        //         line: {
        //             dataLabels: {
        //                 enabled: true
        //             },
        //             enableMouseTracking: false
        //         },
        //         series: {
        //             label: {
        //                 connectorAllowed: false
        //             },
        //             pointStart: 2007
        //         }
        //     },
        //     series : [{
        //         name: 'Đoàn viên',
        //         data: [7.0, 6.9, 9.5, 14.5, 18.4, 21.5, 25.2, 26.5, 23.3, 18.3,
        //             13.9, 35.5]
        //     },
        //     {
        //         name: 'Đảng viên',
        //         data: [4.0, 3.9, 7.5, 6.5, 9.4, 15.5, 14.2, 20.5, 16.3, 13.3,
        //             19.9, 26.5]
        //     }
        //     ]
        // });

        // $('#doanvien-chidoan-tk').highcharts({
        //     chart : {
        //         plotBackgroundColor: null,
        //         plotBorderWidth: null,
        //         plotShadow: false
        //     },
        //     title : {
        //         text: 'Biểu đồ thành tích học tập'
        //     },
        //     subtitle : {
        //         text: 'Chi đoàn KTMP14 - Năm 2017'
        //     },
        //     tooltip : {
        //         pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
        //     },
        //     plotOptions : {
        //         pie: {
        //             allowPointSelect: true,
        //             cursor: 'pointer',
        //             size: 220,
        //             dataLabels: {
        //                 enabled: true,
        //                 format: '<b>{point.name}%</b>: {point.percentage:.2f} %',
        //                 style: {
        //                     color: (Highcharts.theme && Highcharts.theme.contrastTextColor)||
        //                         'black'
        //                 }
        //             }
        //         }
        //     },
        //     series : [{
        //         type: 'pie',
        //         name: 'doanvien',
        //         data: [
        //             ['Xuất sắc',   2.71],
        //             {
        //                 name: 'Giỏi',
        //                 y: 10.83,
        //                 sliced: true,
        //                 selected: true
        //             },
        //
        //             ['Khá',    45.56],
        //             ['Trung bình khá',     30.22],
        //             ['Trung bình',   5.72],
        //             ['Trung bình yếu',   3.09],
        //             ['Yếu',   2.07],
        //             ['Kém',   0.80]
        //         ]
        //     }]
        // });

        // $('#doanvien-donvi-tk').highcharts({
        //     chart : {
        //         plotBackgroundColor: null,
        //         plotBorderWidth: null,
        //         plotShadow: false
        //     },
        //     title : {
        //         text: 'Biểu đồ thành tích học tập'
        //     },
        //     subtitle : {
        //         text: 'Khoa công nghệ thông tin - Năm 2017'
        //     },
        //     tooltip : {
        //         pointFormat: '{series.name}: <b>{point.percentage:.2f}%</b>'
        //     },
        //     plotOptions : {
        //         pie: {
        //             allowPointSelect: true,
        //             cursor: 'pointer',
        //             size: 220,
        //             dataLabels: {
        //                 enabled: true,
        //                 format: '<b>{point.name}%</b>: {point.percentage:.2f} %',
        //                 style: {
        //                     color: (Highcharts.theme && Highcharts.theme.contrastTextColor)||
        //                         'black'
        //                 }
        //             }
        //         }
        //     },
        //     series : [{
        //         type: 'pie',
        //         name: 'doanvien',
        //         data: [
        //             ['Xuất sắc',   2.71],
        //             {
        //                 name: 'Giỏi',
        //                 y: 10.83,
        //                 sliced: true,
        //                 selected: true
        //             },
        //
        //             ['Khá',    45.56],
        //             ['Trung bình khá',     30.22],
        //             ['Trung bình',   5.72],
        //             ['Trung bình yếu',   3.09],
        //             ['Yếu',   2.07],
        //             ['Kém',   0.80]
        //         ]
        //     }]
        // });
    // });
</script>