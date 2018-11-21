<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<div class="row">
    <!-- .col-lg-12 -->
    <div class="col-lg-12">
        <div class="box">
            <header>
                <h5>Đề xuất hoạt động</h5>
                <div class="toolbar">
                    <div class="btn-group">
                        <a href="#borderedTable" data-toggle="collapse" class="btn btn-default btn-sm minimize-box">
                            <i class="fa fa-angle-up"></i>
                        </a>

                    </div>
                </div>
            </header>
            <div id="borderedTable" class="body collapse in">
                <div class="well">
                    <form action="#" method="post" accept-charset="utf-8" id="messageForm">
                        <fieldset>
                            <legend>Gửi yêu cầu xét duyệt hoạt động Đoàn Học viện</legend>

                            <div class="form-group">
                                <label class="control-label" for="name">Tên hoạt động</label>
                                <input class="form-control" type="text" name="name" id="name"
                                       placeholder="Nhập tên hoạt động"
                                       required="required">
                            </div>
                            <div class="form-group">
                                <label class="control-label" for="email">Thời gian</label>
                                <br>
                                <input  class="datetime" type="date" style="width: 980px" name="email" id="email"
                                        placeholder="Enter your e-mail" required="required"></br>
                            </div>
                            <div class="form-group">
                                <label class="control-label" for="subject">Địa điểm dự kiến</label>
                                <input class="form-control" type="text" name="subject" id="subject"
                                       placeholder="nhập địa điểm dự kiến" required="required">
                            </div>
                            <div class="form-group">
                                <label class="control-label">Đơn vị tổ chức dự kiến</label>
                                <select name="DV" id="sport" class="validate[required] form-control">
                                    <option value="">Chọn đơn vị tổ chức dự kiến</option>
                                    <option value="option1">Đoàn Cơ sở</option>
                                    <option value="option1">Đoàn Học viện</option>
                                    <option value="option2">Ban Thanh niên</option>
                                    <option value="option3">Chi đoàn hiện tại</option>
                                    <option value="option3">Đơn vị hiện tại</option>
                                </select>
                            </div>

                            <div class="form-group">
                                <label class="control-label">Đối tượng dự kiến</label>
                                <select name="DV" id="sport" class="validate[required] form-control">
                                    <option value="">Chọn đối tượng dự kiến</option>
                                    <option value="option1">Sinh viên dân sự</option>
                                    <option value="option1">Học viên Quân sự</option>
                                    <option value="option2">Thành viên chi đoàn hiện tại</option>
                                    <option value="option3">Thành viên đơn vị hiện tại</option>
                                    <option value="option3">Tất cả Sinh viên và Học viên</option>
                                    <option value="option3">Tất cả đoàn viên</option>
                                </select>
                            </div>
                            <div class="row">
                                <div class="form-group col-lg-6 col-sm-6 col-6">
                                    <button class="btn btn-warning btn-block" type="submit">Gửi chờ phê duyệt</button>
                                </div>
                                <div class="form-group col-lg-6 col-sm-6 col-6">
                                    <button class="btn btn-block btn-default" type="reset">Hủy bỏ</button>
                                </div>
                            </div>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <!-- /.col-lg-6 -->

</div>