<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="main">
	<div class="col-md-12">
		<h3 class="page-title">
			<tiles:getAsString name="title"></tiles:getAsString>
		</h3>
	</div>
	<!-- Search -->
	<div class="col-md-12">
		<div class="search-container">
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2 search-input" id="myInput"
					onkeyup="myFunction()" type="text" placeholder="Search">
				<button class="nav-btn" id="btn-search" type="submit">
					<i class="fa fa-search"></i>
				</button>
			</form>
		</div>
	</div>

	<!-- Table -->
	<table class="table table-striped table-hover">
		<thead>
			<tr>
				<th scope="col">STT<i class="fa fa-sort icon-float-right"></i></th>
				<th scope="col">Tên hoạt động<i
					class="fa fa-sort icon-float-right"></i></th>
				<th scope="col">Đơn vị tổ chức<i
					class="fa fa-sort icon-float-right"></i></th>
				<th scope="col">Thời gian<i class="fa fa-sort icon-float-right"></i></th>
				<th scope="col">Địa điểm<i class="fa fa-sort icon-float-right"></i></th>
				<th scope="col">Trạng thái<i
					class="fa fa-sort icon-float-right"></i></th>
				<th scope="col">Tác vụ</th>
			</tr>
		</thead>
		<tbody id="myTable">
			<tr>
				<th scope="row">1</th>
				<td>Column content</td>
				<td>Column content</td>
				<td>Column content</td>
				<td>Column content</td>
				<td>Chấp nhận</td>
				<td>
					<button class="btn btn-outline-success">
						<i class="fa fa-info-circle btn-table"></i>
					</button>
					<button class="btn btn-outline-primary">
						<i class="fa fa-wrench btn-table"></i>
					</button>
					<button class="btn btn-outline-danger">
						<i class="fa fa-trash btn-table"></i>
					</button>
				</td>
			</tr>
			<tr>
				<th scope="row">2</th>
				<td>Column content</td>
				<td>Column content</td>
				<td>Column content</td>
				<td>Column content</td>
				<td>Chấp nhận</td>
				<td>
					<button class="btn btn-outline-success">
						<i class="fa fa-info-circle btn-table"></i>
					</button>
					<button class="btn btn-outline-primary">
						<i class="fa fa-wrench btn-table"></i>
					</button>
					<button class="btn btn-outline-danger">
						<i class="fa fa-trash btn-table"></i>
					</button>
				</td>
			</tr>
			<tr>
				<th scope="row">3</th>
				<td>Column content</td>
				<td>Column content</td>
				<td>Column content</td>
				<td>Column content</td>
				<td>Chấp nhận</td>
				<td>
					<button class="btn btn-outline-success">
						<i class="fa fa-info-circle btn-table"></i>
					</button>
					<button class="btn btn-outline-primary">
						<i class="fa fa-wrench btn-table"></i>
					</button>
					<button class="btn btn-outline-danger">
						<i class="fa fa-trash btn-table"></i>
					</button>
				</td>
			</tr>
			<tr>
				<th scope="row">4</th>
				<td>Column content</td>
				<td>Column content</td>
				<td>Column content</td>
				<td>Column content</td>
				<td>Chấp nhận</td>
				<td>
					<button class="btn btn-outline-success">
						<i class="fa fa-info-circle btn-table"></i>
					</button>
					<button class="btn btn-outline-primary">
						<i class="fa fa-wrench btn-table"></i>
					</button>
					<button class="btn btn-outline-danger">
						<i class="fa fa-trash btn-table"></i>
					</button>
				</td>
			</tr>
			<tr>
				<th scope="row">5</th>
				<td>Column content</td>
				<td>Column content</td>
				<td>Column content</td>
				<td>Column content</td>
				<td>Chấp nhận</td>
				<td>
					<button class="btn btn-outline-success">
						<i class="fa fa-info-circle btn-table"></i>
					</button>
					<button class="btn btn-outline-primary">
						<i class="fa fa-wrench btn-table"></i>
					</button>
					<button class="btn btn-outline-danger">
						<i class="fa fa-trash btn-table"></i>
					</button>
				</td>
			</tr>
			<tr>
				<th scope="row">6</th>
				<td>Column content</td>
				<td>Column content</td>
				<td>Column content</td>
				<td>Column content</td>
				<td>Chấp nhận</td>
				<td>
					<button class="btn btn-outline-success">
						<i class="fa fa-info-circle btn-table"></i>
					</button>
					<button class="btn btn-outline-primary">
						<i class="fa fa-wrench btn-table"></i>
					</button>
					<button class="btn btn-outline-danger">
						<i class="fa fa-trash btn-table"></i>
					</button>
				</td>
			</tr>
			<tr>
				<th scope="row">7</th>
				<td>Column content</td>
				<td>Column content</td>
				<td>Column content</td>
				<td>Column content</td>
				<td>Chấp nhận</td>
				<td>
					<button class="btn btn-outline-success">
						<i class="fa fa-info-circle btn-table"></i>
					</button>
					<button class="btn btn-outline-primary">
						<i class="fa fa-wrench btn-table"></i>
					</button>
					<button class="btn btn-outline-danger">
						<i class="fa fa-trash btn-table"></i>
					</button>
				</td>
			</tr>
			<tr>
				<th scope="row">8</th>
				<td>Column content</td>
				<td>Column content</td>
				<td>Column content</td>
				<td>Column content</td>
				<td>Chấp nhận</td>
				<td>
					<button class="btn btn-outline-success">
						<i class="fa fa-info-circle btn-table"></i>
					</button>
					<button class="btn btn-outline-primary">
						<i class="fa fa-wrench btn-table"></i>
					</button>
					<button class="btn btn-outline-danger">
						<i class="fa fa-trash btn-table"></i>
					</button>
				</td>
			</tr>
			<tr>
				<th scope="row">9</th>
				<td>Column content</td>
				<td>Column content</td>
				<td>Column content</td>
				<td>Column content</td>
				<td>Chấp nhận</td>
				<td>
					<button class="btn btn-outline-success">
						<i class="fa fa-info-circle btn-table"></i>
					</button>
					<button class="btn btn-outline-primary">
						<i class="fa fa-wrench btn-table"></i>
					</button>
					<button class="btn btn-outline-danger">
						<i class="fa fa-trash btn-table"></i>
					</button>
				</td>
			</tr>
			<tr>
				<th scope="row">10</th>
				<td>Column content</td>
				<td>Column content</td>
				<td>Column content</td>
				<td>Column content</td>
				<td>Chấp nhận</td>
				<td>
					<button class="btn btn-outline-success">
						<i class="fa fa-info-circle btn-table"></i>
					</button>
					<button class="btn btn-outline-primary">
						<i class="fa fa-wrench btn-table"></i>
					</button>
					<button class="btn btn-outline-danger">
						<i class="fa fa-trash btn-table"></i>
					</button>
				</td>
			</tr>
		</tbody>
	</table>

	<!-- Pagination -->
	<div>
		<ul class="pagination justify-content-center pagination-pos">
			<li class="page-item disabled"><a class="page-link" href="#">&laquo;</a>
			</li>
			<li class="page-item active"><a class="page-link" href="#">1</a>
			</li>
			<li class="page-item"><a class="page-link" href="#">2</a></li>
			<li class="page-item"><a class="page-link" href="#">3</a></li>
			<li class="page-item"><a class="page-link" href="#">4</a></li>
			<li class="page-item"><a class="page-link" href="#">5</a></li>
			<li class="page-item"><a class="page-link" href="#">&raquo;</a>
			</li>
		</ul>
	</div>
</div>