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

		<c:choose>
		
			<c:when test="${adminDisplay=='feedbacks'}">
				Test!!
			</c:when>

			<c:otherwise>
				<div class="admin-body">
					<input type="text" id="newsTitle" name="newsTitle"
						placeholder="Enter News Title" /><br /> <input type="text"
						id="newsDescription" name="newsDescription"
						placeholder="Enter Description" /><br /> <input type="button"
						id="addNewsButton" value="Post News" />
				</div>
			</c:otherwise>
		</c:choose>
	</div>


</div>