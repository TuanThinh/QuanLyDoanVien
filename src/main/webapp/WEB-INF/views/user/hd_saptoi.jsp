<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<div class="form-data">
    <input type="text" id="timKiem" placeholder="Tìm kiếm" class="form-control" style="width: 25%; margin-bottom: 7px;">
    <table class="table table-striped table-bordered table-hover"
           id="danh-sach-hoat-dong">
        <thead>
        <tr>
            <th style="width: 10%;">Mã hoạt động</th>
            <th>Tên hoạt động</th>
            <th style="width: 10%;">Thời gian</th>
            <th>Địa điểm</th>
            <th>Đơn vị tổ chức</th>
            <th style="width: 10%;">Đối tượng</th>
            <th>Trạng thái</th>
        </tr>
        </thead>

        <tbody>

        <tr>
            <td >1</td>
            <td >Tuần sinh hoạt công dân Quý I/2015(KSDS)</td>
            <td >18/03/2015</td>
            <td >Hội trường S1- Khu A</td>
            <td >Đoàn cơ sở Học viện/ Ban Thanh niên Học viện</td>
            <td >Sinh viên dân sự</td>
            <td >Đã tổ chức</td>
        </tr>
        <tr>
            <td>2</td>
            <td>Tuần sinh hoạt công dân Quý IV/2018(KSQS)</td>
            <td>28/12/2018</td>
            <td>Hội trường H1- Khu Xuân Phương</td>
            <td>Ban Thanh niên Học viện/ Đoàn cơ sở học viện</td>
            <td>Học viên quân sự</td>
            <td>Dự kiến</td>
        </tr>
        </tbody>
    </table>

    <div id="modalDetail" class="modal modal-fix" role="dialog">
        <!-- Modal content -->
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal">&times;</button>
                <h4>Thông tin chi tiết</h4>
            </div>

            <div class="modal-body">
                <div class="form-horizontal">
                    <div class="form-group">
                        <label>Nội dung</label>
                        <textarea name="" class="noi-dung" cols="50" rows="50"
                                  style="resize: none; height: max-content"></textarea>
                    </div>
                </div>

            </div>
        </div>
    </div>

</div>


<style>
    .modal-fix {
        margin-top: 123px;
        margin-left: 262px;
        margin-right: 80px;
    }

    .form-data {
        margin-top: 10px;
    }

    .table-bordered {
        border: 1px solid #ddd;
    }

    .table {
        width: 100%;
        max-width: 100%;
        margin-bottom: 20px;
    }

    table {
        background-color: transparent;
    }

    table {
        border-spacing: 0;
        border-collapse: collapse;
    }

    thead {
        display: table-header-group;
        vertical-align: middle;
        border-color: inherit;
    }

    th {
        width: 20%;
    }

    tbody {
        display: table-row-group;
        vertical-align: middle;
        border-color: inherit;
    }
</style>

<script src="${pageContext.servletContext.contextPath}/resources/js/user/huy_hoatdong.js">
</script>