<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container-fluid p-5 bg-primary text-white text-center">
  <h1>My First Bootstrap Page</h1>
  <p>Resize this responsive page to see the effect!</p> 
</div>
  
<div class="container mt-5">
  <div class="row">
    <div class="col-sm-4">
    </div>
    <div class="col-sm-4">
      <h3>Product Admin Page </h3>
		<form method="post" action="/product/dml" enctype="multipart/form-data">
			Id: <input type="number" class="form-control" name="id" />
			Name: <input type="text" class="form-control" name="name" />
			Price: <input type="number" class="form-control" name="price" />
			Expiry date: <input type="date" class="form-control" name="expiryDate" />
			Category: <select class="form-select" name="category">
				<c:forEach var="c" items="${categories }">
					<option>${c }</option>
				</c:forEach>
			</select>
			Picture: <input type="file" class="form-control" name="picture" />
			<br/>
			<input type="submit" name="add" value="Add" class="btn btn-success" />
		</form>
    </div>
    <div class="col-sm-4">

    </div>
  </div>
</div>
<div class="container mt-5">
  <div class="row">
    <div class="col-sm-2">
    </div>
    <div class="col-sm-8">
      <h3>List of Product</h3>
      Category: <form action="/product/search">
      <select class="form-select" name="category">
				<c:forEach var="c" items="${categories }">
					<option>${c }</option>
				</c:forEach>
			</select>
			<input type="submit" class="btn btn-info" value="Search" />
      </form>
			
		<c:if test="${products.size() ne 0 }">
		<table class="table table-bordered table-striped table-hover">
			<thead>
				<tr>
					<th>Id</th><th>Name</th><th>Price</th><th>Expiry date</th><th>Category</th><th>Picture</th><th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="p" items="${products }">
					<tr>
						<td>${p.id }</td>
						<td>${p.name }</td>
						<td>${p.price }</td>
						<td>${p.expiryDate1 }</td>
						<td>${p.category }</td>
						<td>
							<img src="data:image/jpg;base64,${p.picture}" width="150" />
						</td>
						<td></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</c:if>
		<c:if test="${products.size() eq 0 }">
		No Products to display
		</c:if>
    </div>
    <div class="col-sm-2">

    </div>
  </div>
</div>
</body>
</html>