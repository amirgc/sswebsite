<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="wrapper">
	<!-- Sidebar -->
	<nav id="sidebar">
		<div class="sidebar-header">
			<h3>Admin Panel</h3>
		</div>
		<ul class="list-unstyled components">
			<li class="active"><a href="#">Add News</a></li>
			<li><a href="#">Add Products</a></li>
			<li><a href="#">View Feedbacks</a></li>
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
		  
    <input type="text" id="newsTitle" name="newsTitle" placeholder="Enter News Title"/><br/>
    <input type="text" id="newsDescription" name="newsDescription" placeholder="Enter Description"/><br/>
  
    <input type= "button" id="addNewsButton" value= "Post News"/>
    
		</br>
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

 			</div>
		</div>
	</div>


</div>