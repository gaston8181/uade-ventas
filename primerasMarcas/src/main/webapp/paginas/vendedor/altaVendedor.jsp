<%@ taglib prefix="s" uri="/struts-tags"%>
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

						<s:actionmessage cssClass="alert alert-success" />
						<s:actionerror cssClass="alert alert-danger" />
						<!-- formulario -->
						<s:form action="altaVendedor" theme="simple">

							<div class="row form-group">
								<label class="col-sm-4 control-label">Nombre</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control"
										name="form.nombre" cssErrorClass="has-error" />
									<s:fielderror fieldName="form.nombre"
										cssClass="help-block has-error" />
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-4 control-label">Apellido</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control"
										name="form.apellido" cssErrorClass="has-error" />
									<s:fielderror fieldName="form.apellido"
										cssClass="help-block has-error" />
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-4 control-label">DNI</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control" onkeypress="return isNumberKey(event)"
										name="form.dni" cssErrorClass="has-error" />
									<s:fielderror fieldName="form.dni"
										cssClass="help-block has-error" />
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-4 control-label">Fecha Nacimiento</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control"
										name="form.fechaNac" cssErrorClass="has-error" />
									<s:fielderror fieldName="form.fechaNac"
										cssClass="help-block has-error" />
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-4 control-label">Telefono</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control" onkeypress="return isNumberKey(event)"
										name="form.telefono" cssErrorClass="has-error" />
									<s:fielderror fieldName="form.telefono"
										cssClass="help-block has-error" />
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-4 control-label">Domicilio</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control"
										name="form.domicilio" cssErrorClass="has-error" />
									<s:fielderror fieldName="form.domicilio"
										cssClass="help-block has-error" />
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-4 control-label">Fecha de Ingreso</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control"
										name="form.fechaIngreso" cssErrorClass="has-error" />
									<s:fielderror fieldName="form.fechaIngreso"
										cssClass="help-block has-error" />
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