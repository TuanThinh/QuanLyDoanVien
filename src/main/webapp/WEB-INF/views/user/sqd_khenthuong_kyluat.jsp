<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<div class="inner-top">
    <div class="inner-top__left">
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modalAdd">
            <i class="">Thêm</i>
        </button>
    </div>

    <div class="inner-top__right">
        <label>Tìm kiếm</label>
        <input type="text" class="form-control" id="search" placeholder="Enter value">
    </div>

</div>
<!-- inner-top -->

<table class="table table-striped table-hover" id="sqd-ktkl">
    <thead>
    <tr>
        <th>Tiêu đề</th>
        <th>Nội dung</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td class="sqd-tieude"></td>
        <td class="sqd-noidung"></td>
        <td>
            <span data-toggle="modal" data-target="#modalEdit">
					<i class="fa fa-wrench" data-toggle="tooltip" data-original-title="Sửa" data-placement="top"></i>
				</span> |

            <span data-toggle="modal" data-target="#modalDelete">
					<i class="fa fa-trash" data-toggle="tooltip" data-original-title="Xóa" data-placement="top"></i>
				</span>

        </td>
    </tr>
    </tbody>
</table>

<div class="inner-bottom">
    <a href="${pageContext.servletContext.contextPath}/user/dcs/khen-thuong-ky-luat">Quay lại</a>
</div>

<div id="modalAdd" class="modal" role="dialog">
    <!-- Modal content -->
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">&times;</button>
            <h4>Thêm mới nội dung</h4>
        </div>

        <div class="modal-body">
            <form action="" method="post">
                <div class="form-group">
                    <label>Tiêu đề</label>
                    <input type="text" name="" class="form-control" />
                </div>

                <div class="form-group">
                    <label>Nội dung</label>
                    <textarea class="form-control" name="" cols="30" rows="10"></textarea>
                </div>

                <div class="form-group">
                    <button type="submit" id="btnAdd" class="btn btn-primary">Thêm</button>
                    <span class="closeModalAdd btn btn-primary" data-dismiss="modal">Hủy</span>
                </div>
            </form>
        </div>
    </div>
</div>

<div id="modalEdit" class="modal" role="dialog">
    <!-- Modal content -->
    <div class="modal-content">
        <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal">&times;</button>
            <h4>Cập nhật</h4>
        </div>

        <div class="modal-body">
            <form action="" method="post">
                <div class="form-group">
                    <label>Tiêu đề</label>
                    <input type="text" name="" class="form-control" />
                </div>

                <div class="form-group">
                    <label>Nội dung</label>
                    <textarea class="form-control" name="" cols="30" rows="10"></textarea>
                </div>

                <div class="form-group">
                    <button type="submit" id="btnEdit" class="btn btn-primary">Thêm</button>
                    <span class="closeModalAdd btn btn-primary" data-dismiss="modal">Hủy</span>
                </div>
            </form>
        </div>
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
            <h4>Chi tiết</h4>
        </div>

        <div class="modal-body">
                <div class="form-group">
                    <label>Tiêu đề</label>
                    <input type="text" name="" class="form-control" />
                </div>

                <div class="form-group">
                    <label>Nội dung</label>
                    <textarea class="form-control" name="" id="" cols="30" rows="10"></textarea>
                </div>

                <div class="form-group">
                    <button type="submit" id="btnDetail" class="btn btn-primary">Thêm</button>
                    <span class="closeModalAdd btn btn-primary" data-dismiss="modal">Hủy</span>
                </div>
        </div>
    </div>
</div>



<style>
    .inner-top {
        display: flex;
        padding-top: 10px;
        position: relative;
        height: 50px;
    }

    .inner-top__left {
        position: absolute;
        left: 0px;
    }

    .inner-top__right {
        display: flex;
        position: absolute;
        right: 0px;
    }

    .inner-top__right label {
        width: 100px;
        line-height: 34px;
    }

    i.fa:hover {
        cursor: pointer;
        color: blue;
    }

    .modal-content {
        width: 45%;
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

    .inner-bottom {
        display: flex;
        flex-direction: row-reverse;
    }
</style>

<script src="${pageContext.servletContext.contextPath}/resources/js/user/sqd_ktkl.js"></script>