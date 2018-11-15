<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<div class="inner-top">
    <div class="inner-top__left">
        <form action="" method="get" accept-charset="utf-8">
            <label class="col-md-1 search">Tìm theo</label>
            <div class="form-group">
                <div class="col-md-2 search-key">
                    <select name="" class="form-control">
                        <option value="">Tiêu đề</option>
                        <option value="">Có các từ</option>
                    </select>
                </div>

                <div class="col-md-5 search-value">
                    <input type="text" class="form-control" name="">
                </div>
                <button type="submit" class="btn btn-primary"><i class="fa fa-search"></i></button>
            </div>
        </form>
    </div>

    <div class="inner-top__right">
        <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#modalDelete">
            <i class="">Xóa</i>
        </button>
    </div>

</div>
<!-- inner-top -->

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
    .inner-top {
        display: flex;
        padding-top: 10px;
    }

    .inner-top__left {
        width: 100%;
    }

    label.col-md-1.search {
        width: 85px;
        line-height: 34px;
        font-size: 16px;
        padding: 0px;
    }

    .col-md-2.search-key {
        width: 16%;
        padding: 0px 1px;
    }

    .col-md-2.search-value {
        width: 16%;
        padding: 0px 2px;
    }

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

    .img-avatar {
        overflow: hidden;
        width: 91px;
    }

    .img-avatar img {
        margin: auto;
    }

    .custom {
        padding: 0px;
    }

    .form-group {
        padding-right: 40px;
    }
</style>