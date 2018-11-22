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
			<div class="col-md-2">welcome ${role}</div>
			<div class="col-md-1">
				<a id="logoutLink" href="">Log Out</a>
			</div>
		</div>
		<div class="admin-body">
			<c:choose>
				<c:when test="${adminDisplay=='feedbacks'}">
				Test!!
			</c:when>

				<c:otherwise>
					<input type="text" id="newsTitle" name="newsTitle"
						placeholder="Enter News Title" />
					<br />
					<br/>
					<textarea row = "10" cols = "80" id="newsDescription" name="newsDescription"
						placeholder="Enter Description" ></textarea>
				 
					<br /></br>
					<input type="button" id="addNewsButton" value="Post News" />
					</br></br>
					<h2>Latest News</h2>
					<div id="listNews">
						<c:forEach items="${myNews}" var="news">
							<h3>
								<c:out value="${news.title}" />
							</h3>
							<p>
								<c:out value="${news.description}" />
							</p>
							</br>

						</c:forEach>
					</div>

				</c:otherwise>

			</c:choose>
		</div>
	</div>
</div>
</div>