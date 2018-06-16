<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<style>
#janela{
	width: 60%;
	
}
</style>

<html>
<head>
<jsp:include page="../template/header.jsp" />
</head>
<body>
	<jsp:include page="../template/topnavbar.jsp" />

	<div class="page-container row-fluid">
		<jsp:include page="../template/sidebarleft.jsp" />

		<div class="page-content">
			<div class="content">

				<ul class="breadcrumb">
					<li>
						<p>Voc� est� Aqui</p>
					</li>
					<li><a href="#">In�cio</a></li>
					<li><a href="#">Revistas</a></li>
					<li><a href="#" class="active">Cadastrar Revistas</a></li>
				</ul>
				<div class="page-title">
					<i class="icon-custom-left"></i>
					<h3>
						Controle de Biblioteca - <span class="semi-bold">Cadastrar Revistas</span>
					</h3>
			
				</div>

				<div class="col-md-12">
					<div class="grid simple">
						<div class="grid-title no-border">
							<h4>Cadastro de Revistas</h4>
						</div>
						<div class="grid-body no-border">
							<div class="row" id="janela">
								<div class="col-md-8 col-sm-8 col-xs-8">
									<form:form method="POST" action="saveRevista"
										modelAttribute="revista">
										<form:hidden path="id" />
								
										<div class="form-group">
											<label class="form-label">Editora</label>
											<div class="controls">
												<form:input class="form-control" path="editora" />
											</div>
										</div>

										<div class="form-group">
											<label class="form-label">Edi��o</label>
											<div class="controls">
												<form:input class="form-control" path="edicao" />
											</div>
										</div>

										<div class="form-group">
											<label class="form-label">N� P�ginas</label>
											<div class="controls">
												<form:input class="form-control" path="numPaginas" />
											</div>
										</div>
							
										<div class="form-group">

											<div class="controls">
												<input type="submit" class="btn btn-info" value="Enviar" />
											</div>
										</div>

									</form:form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="../template/footer.jsp" />
</body>
</html>



