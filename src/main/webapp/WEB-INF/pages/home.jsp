<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<jsp:include page="template/header.jsp" />
</head>
<body>
	<jsp:include page="template/topnavbar.jsp" />

	<div class="page-container row-fluid">
		<jsp:include page="template/sidebarleft.jsp" />

		<div class="page-content">
			<div class="content">

				<ul class="breadcrumb">
					<li>
						<p>Voc� est� Aqui</p>
					</li>
					<li><a href="#" class="active">In�cio</a></li>
				</ul>
				<div class="page-title">
					<i class="icon-custom-left"></i>
					<h3>
						In�cio  <span class="semi-bold"></span>
					</h3>
			
				</div>

				<div class="col-md-12">
					<div class="grid simple">
						<div class="grid-title no-border">
							<h4>In�cio</h4>
						</div>
						<div class="grid-body no-border">
							<div class="row">
								<div class="col-md-8 col-sm-8 col-xs-8">
									<h1>Ol�, ${username}</h1>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="template/footer.jsp" />
</body>
</html>



