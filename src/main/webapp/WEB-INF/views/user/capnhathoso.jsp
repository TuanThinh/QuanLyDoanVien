<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<div>
    <div class="modal-content" id="modal-ho-so">
        <div class=modal-header id="modal-head">
            <div class="capnhathoso-mdv" id="capnhat-mdv">
                <label class="custom left">Mã đoàn viên: </label>
                <label class="custom " id="ma-doan-vien"></label>
            </div>

            <div class="capnhathoso-ht" id="capnhat-ht">
                <label class="custom left">Họ và tên: </label>
                <label class="custom" id="ho-ten"></label>
            </div>

            <div class="capnhathoso-ns">
                <label class="custom left">Ngày sinh: </label>
                <label class="custom" id="ngay-sinh"></label>
            </div>

            <div class="capnhathoso-gt">
                <label class="custom left">Giới tính: </label>
                <label class="custom" id="gioi-tinh"></label>
            </div>
        </div>


        <div id="tbody">
            <form id="modal-ho-so-form">
                <div class="col-md-2">
                    <label>Ảnh đại diện</label>
                    <div class="img-avatar">
                        <img class="media-object img-thumbnail user-img" alt="User Picture"
                             src="/QuanLyDoanVien/resources/imgs/user.gif">
                        <input type="file" id="hinh-anh" name="hinhAnh">
                    </div>
                </div>

                <div class="col-md-5">

                    <div class="form-group">
                        <label class="col-md-5 custom">Mã đoàn viên</label>
                        <div class="col-md-7 custom" id="up-ma-doan-vien">
                            <input type="text" class="form-control" disabled="disabled">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-5 custom">Họ và tên</label>
                        <div class="col-md-7 custom" id="up-ho-va-ten">
                            <input type="text" class="form-control" disabled="disabled">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-5 custom">Ngay Sinh</label>
                        <div class="col-md-7 custom" id="up-ngay-sinh">
                            <input type="text" class="form-control" disabled="disabled">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-5 custom">Giới tính</label>
                        <div class="col-md-7 custom" id="up-gioi-tinh">
                            <select class="form-control">
                                <option value="1">Nam</option>
                                <option value="0">Nữ</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-5 custom">Địa chỉ</label>
                        <div class="col-md-7 custom" id="dia-chi">
                            <input type="text" class="form-control">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-5 custom">Chi đoàn</label>
                        <div class="col-md-7 custom" id="chi-doan">
                            <input type="text"  class="form-control" disabled="disabled">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-5 custom">Đơn vị</label>
                        <div class="col-md-7 custom" id="don-vi">
                            <input type="text" class="form-control" disabled="disabled">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-5 custom">Số điện thoại</label>
                        <div class="col-md-7 custom" id="so-dien-thoai">
                            <input type="text"  class="form-control">
                        </div>
                    </div>


                </div>

                <div class="col-md-5">

                    <div class="form-group">
                        <label class="col-md-5 custom">Email</label>
                        <div class="col-md-7 custom" id="email">
                            <input type="text"  class="form-control">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-5 custom">Ngày vào đoàn</label>
                        <div class="col-md-7 custom" id="ngay-vao-doan">
                            <input type="text"  class="form-control" disabled="disabled">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-5 custom">Ngày vào đảng</label>
                        <div class="col-md-7 custom" id="ngay-vao-dang">
                            <input type="text"  class="form-control" disabled="disabled">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-5 custom">Chức vụ</label>
                        <div class="col-md-7 custom" id="chuc-vu">
                            <input type="text"  class="form-control" disabled="disabled">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-5 custom">Dân tộc</label>
                        <div class="col-md-7 custom" id="dan-toc">
                            <input type="text"  class="form-control">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-5 custom">Quốc tịch</label>
                        <div class="col-md-7 custom" id="quoc-tich">
                            <input type="text"  class="form-control">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-5 custom">Tôn giáo</label>
                        <div class="col-md-7 custom" id="ton-giao">
                            <input type="text"  class="form-control">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-5 custom">Đối tượng chính sách</label>
                        <div class="col-md-7 custom" id="doi-tuong-chinh-sach">
                            <input type="text"  class="form-control">
                        </div>
                    </div>


                    <div class="form-group btn-magn">
                        <button type="button" class="btn btn-primary" id="btn-cap-nhat">Cập nhật</button>
                        <!-- <button type="submit" id="btnHuy" class="btn btn-primary">Hủy</button> -->
                    </div>
                </div>
            </form>
        </div>

    </div>
</div>


<style>
    .capnhathoso-mdv {
        width: 20%;
        float: left;
    }

    .capnhathoso-ht {
        width: 40%;
        float: left;
    }

    .capnhathoso-ns {
        width: 20%;
        float: left;
    }

    .capnhathoso-gt {
        width: 20%;
        float: left;
    }

    .modal-header {
        width: 100%
    }

    .left {
        float: left;
        margin-right: 3px;
    }

    .col-md-2 {
        width: 16, 6666667%;
        margin-top: 20px;
    }

    .col-md-5 {
        width: 41.66666667%;
        margin-top: 20px;
    }

    .col-md-7 {
        width: 58.33333333%;
        margin-top: 20px;
    }

    .custom {
        padding: 0px;
    }

    .modal-content {
        width: 100%;
        margin: auto;
        top: 10px;
    }

    .modal-body {
        padding: 25px;
    }

    .img-avatar {
        overflow: hidden;
        width: 74px;
    }

    .custom {
        padding: 0px;
    }

    .form-group {
        padding-right: 40px;
    }

    .form-control {
        display: block;
        width: 100%;
        height: 30px;
        padding: 6px 12px;
        font-size: 14px;
        line-height: 1.42857143;
        color: #555;
        background-color: #fff;
        background-image: none;
        border: 1px solid #ccc;
        border-radius: 4px;
    }

    .h4, h4 {
        font-size: 18px;
    }

    .btn-primary {
        color: #fff;
        background-color: #337ab7;
        border-color: #2e6da4;
    }

    .btn {
        display: inline-block;
        padding: 6px 12px;
        font-size: 14px;
        font-weight: 400;
        line-height: 1.42857143;
        text-align: center;
        white-space: nowrap;
        vertical-align: middle;
        touch-action: manipulation;
        cursor: pointer;
        user-select: none;
        border: 1px solid transparent;
        border-radius: 4px;
    }

    .btn-magn {
        margin-left: 352px;
        margin-top: 413px;
    }
</style>

<script src="${pageContext.servletContext.contextPath}/resources/js/user/capnhathoso.js">

</script>
