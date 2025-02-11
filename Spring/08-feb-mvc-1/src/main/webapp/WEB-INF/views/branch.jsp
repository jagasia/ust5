<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container-fluid p-5 bg-primary text-white text-center">
		<h1>My First Bootstrap Page</h1>
		<p>Resize this responsive page to see the effect!</p>
	</div>

	<div class="container mt-5">
		<div class="row text-center">
			<div class="col-sm-4"></div>
			<div class="col-sm-4">
			<h3>Branch Form here</h3>
			<form method="post" action="/08-feb-mvc-1/branch/dml">
				Id:<input type="text" class="form-control" name="bid" value="${branch.bid }" />
				Name:<input type="text" class="form-control" name="bname" value="${branch.bname }" />
				City:<input type="text" class="form-control" name="bcity" value="${branch.bcity }" /><br/>
				<input type="submit" class="btn btn-success" value="Add" name="add" />&nbsp;
				<input type="submit" class="btn btn-warning" value="Update" name="update" />&nbsp;
				<input type="submit" class="btn btn-danger" value="Delete" name="delete" />&nbsp;
			</form>
			</div>
			<div class="col-sm-4"></div>
		</div>

		<div class="row text-center">
			<div class="col-sm-2"></div>
			<div class="col-sm-8">
				<table class="table table-bordered table-striped table-hover">
					<thead>
						<tr>
							<th>Bid</th>
							<th>BName</th>
							<th>BCity</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="b" items="${branches }">
							<tr>
								<td>${b.bid }</td>
								<td>${b.bname }</td>
								<td>${b.bcity }</td>
								<td>
									<a class="btn btn-info" href="/08-feb-mvc-1/branch/select/${b.bid }">Select</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="col-sm-2"></div>
		</div>
	</div>
</body>
</html>
