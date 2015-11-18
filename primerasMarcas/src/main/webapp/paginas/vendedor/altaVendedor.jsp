<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">

		<div class="page-header">
			<h1>Alta Vendedor</h1>
		</div>
		<!-- el contenido de las páginas internas va acá -->

		<div class="row">
			<div class="col-xs-12 col-md-6 col-lg-8">

				<div class="panel panel-default panel-form">
					<div class="panel-body">
						<!-- formulario -->
						<s:form action="altaVendedor" method="altaVendedor()" theme="simple">

							<div class="row form-group">
								<label class="col-sm-4 control-label">Nombre</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control" name="form.nombre"/>
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-4 control-label">Apellido</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control" name="form.apellido"/>
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-4 control-label">DNI</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control" name="form.dni"/>
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-4 control-label">Fecha Nacimiento</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control" name="form.fechaNac"/>
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-4 control-label">Telefono</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control" name="form.telefono"/>
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-4 control-label">Domicilio</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control" name="form.domicilio"/>
								</div>
							</div>
							
							<div class="row form-group">
								<label class="col-sm-4 control-label">Fecha de Ingreso</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control" name="form.fechaIngreso"/>
								</div>
							</div>

							<div class="row form-group action-row">
								<div class="col-sm-offset-10 col-sm-2">
									<button type="submit"
										class="btn btn-default btn-primary btn-block">Crear</button>
								</div>
							</div>
						</s:form>
						<!--! -->
					</div>
				</div>

			</div>
		</div>

		<!--! -->

	</div>
</div>