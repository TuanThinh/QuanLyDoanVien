<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<div class="row inner-top">
    <div class="col-md-6 inner-top__left">
        <span>Hiển thị</span>
        <select class="form-control">
            <option>10</option>
            <option>20</option>
            <option>30</option>
        </select>
        <span>bản ghi</span>
    </div>
    <div class="col-md-6 inner-top__right">
        <input type="text" class="form-control" placeholder="Enter value"/>
        <span>Tìm kiếm:</span>
    </div>
</div>

<div class="row">
    <div class="col-md-12">
        <button type="button" class="btn btn-danger" style="margin-bottom: 10px;">Xóa</button>
        <table class="table table-striped table-bordered table-hover">
            <thead>
            <tr>
                <th style="width: 30px;"></th>
                <th>Tiêu đề</th>
                <th>Nội dung</th>
                <th>Ngày gửi</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><input type="checkbox" name=""/></td>
                <td></td>
                <td></td>
                <td></td>
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

<div class="row inner-bottom">
    <div class="col-md-6 inner-bottom__left">
        <span>Hiển thị từ a đến b của c bản ghi</span>
    </div>

    <div class="col-md-6 inner-bottom__right">
        <ul class="pagination">
            <li><a href = "">&laquo;</a></li>
            <li><a href = "">1</a></li>
            <li><a href = "">2</a></li>
            <li><a href = "">3</a></li>
            <li><a href = "">4</a></li>
            <li><a href = "">5</a></li>
            <li><a href = "">&raquo;</a></li>
        </ul>
    </div>
</div>

<div id="modalDelete" class="modal" role="dialog">
    <!-- Modal content -->
    <div class="modal-content" style="width: 280px; padding: 15px">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <p>
            Bạn có muốn xóa <span style="color: red;"> item </span>này không?
        </p>
        <button type="button" class="btn btn-primary" style="width: 49%;">
            Xácnhận
        </button>
        <span class="closeModalDelete btn btn-primary" style="width: 49%;" data-dismiss="modal">Hủy</span>
    </div>

</div>

<div id="modalDetail" class="modal" role="dialog">
    <!-- Modal content -->
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">&times;</button>
            <h4>Thông tin chi tiết</h4>
        </div>

        <div class="modal-body">
            <div class="form-horizontal">
                    <div class="form-group">
                        <label>Tiêu đề</label>
                        
                    </div>

                    <div class="form-group">
                        <label>Nội dung</label>
                        <textarea name="" id="" cols="30" rows="10"></textarea>
                    </div>

                <div class="form-group">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Đóng</button>
                </div>

            </div>

        </div>
    </div>
</div>


<style>

    i.fa:hover {
        cursor: pointer;
        color: blue;
    }

    .modal-content {
        width: 75%;
        margin: auto;
        top: 50px;
    }
    .modal-body {
        padding: 25px;
    }

    .img-avatar img {
        margin: auto;
    }

    .form-group {
        padding-right: 40px;
    }

    /*-------*/
    .inner-top__right span {
        line-height: 34px;
    }

    .inner-top {
        margin: 10px 0px;
    }

    .inner-top .col-md-6 {
        padding: 0PX;
    }

    .inner-top__left select {
        width: 70px;
        margin: 0px 5px;
    }

    .inner-top__left {
        display: flex;
    }

    .inner-top__left span {
        line-height: 34px;
    }

    .inner-top__right {
        display: flex;
        flex-flow: row-reverse;
    }

    .inner-top__right input {
        width: 40%;
        margin-left: 5px;
    }

    .inner-bottom {font-size: 16px;}

    .inner-bottom__left {
        line-height: 35px;
    }

    .inner-bottom__right {
        display: flex;
        flex-flow: row-reverse;
    }

    .inner-bottom__right .pagination {
        margin: 0px 0px 15px 0px;
    }
</style>