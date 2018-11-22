<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="wrapper">
	<!-- Sidebar -->
	<nav id="sidebar">
		<div class="sidebar-header">
			<h3>Admin Panel</h3>
		</div>
		<ul class="list-unstyled components">
			<li class="active"><a href="#" id="addNews">Add News</a></li>
			<li><a href="#">Add Products</a></li>
			<li><a href="#" id="viewFeedback">View Feedbacks</a></li>
		</ul>
	</nav>

	<div class="admin-content">
		<div class="row admin-nav">
			<div class="col-md-9"></div>
			<div class="col-md-2">Welcome ${role}</div>
			<div class="col-md-1">
				<a id="logoutLink" href="">Log Out</a>
			</div>
		</div>
		<div class="admin-body">
			<c:choose>

				<c:when test="${adminDisplay=='feedbacks'}">
					<h3>Feedbacks from Users</h3>
					<%-- <c:if test="${not empty feedbacks}"> --%>
					<table class="table table-striped">
						<thead class="thead-dark">
							<tr>
								<th scope="col">Name</th>
								<th scope="col">Email</th>
								<th scope="col">Feedbacks</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${feedbacks}" var="data">
								<tr>
									<td>${data.fname}</td>
									<td>${data.email}</td>
									<td>${data.feedbackText}</td>
								</tr>

							</c:forEach>
						</tbody>
					</table>
				</c:when>


				<c:otherwise>
					<input type="text" id="newsTitle" name="newsTitle"
						placeholder="Enter News Title" />
					<br />
					<input type="text" id="newsDescription" name="newsDescription"
						placeholder="Enter Description" />
					<br />
					<input type="button" id="addNewsButton" value="Post News" />
					<br />
					<h2>Latest News</h2>

					<c:if test="${not empty myNews}">
						<c:forEach items="${myNews}" var="item">
							<div class="newsList">
								<h3>
									<c:out value="${item.title}" default="Default value" />
								</h3>
								<img src="http://www.gapsco.com/images/logo-gapsco-small.png"
									alt="icon" />
								<p>
									<c:out value="${item.description}" default="Default value" />
								</p>
							</div>
						</c:forEach>
					</c:if>
					<c:if test="${empty myNews}">
				${"something"}
				</c:if>
				</c:otherwise>

			</c:choose>
		</div>
	</div>
</div>
