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
		 <form id="frmLogin" action="newspost" method = "post">
    <input type="text" id="newsTitle" name="newsTitle" placeholder="Enter News Title"/><br/>
    <input type="text" id="newsDescription" name="newsDescription" placeholder="Enter Description"/><br/>
  
    <input type= "submit" value= "Post News"/>
    </form>
		
		</div>
	</div>


</div>