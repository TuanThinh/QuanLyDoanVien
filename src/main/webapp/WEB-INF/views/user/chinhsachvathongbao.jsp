<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div class="form-data">
    <table class="table table-striped table-bordered table-hover"
           id="danh-sach-thong-bao">
        <thead>
        <tr>
            <th style="width: 10%;">Thời gian</th>
            <th style="width: 10%;">Tên người gửi</th>
            <th>Tiêu đề</th>
            <th style="width: 10%;">Trạng thái</th>
        </tr>
        </thead>

        <tbody>
        <tr>
            <td class="cstb-thoigian"></td>
            <td class="cstb-idnguoigui"></td>
            <td class="cstb-tennguoigui"></td>
            <td class="cstb-tieude"></td>
            <td><span data-toggle="modal" data-target="#modalDetail">
						<i class="fa fa-eye" data-toggle="tooltip"
                           data-original-title="Chi tiết" data-placement="top"></i>
				</span></td>
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
                        <textarea name="" id="" class="noi-dung" cols="50" rows="50"
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

<script
        src="${pageContext.servletContext.contextPath}/resources/js/user/chinhsachvathongbao.js"></script>
