<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">

		<div class="page-header">
			<h1>Actualizar Proveedor</h1>
		</div>
		<!-- el contenido de las páginas internas va acá -->

		<div class="row">
			<div class="col-xs-12 col-md-6 col-lg-8">

				<div class="panel panel-default panel-form">
					<div class="panel-body">
						<!-- formulario -->
						<s:form action="modificarProveedor" theme="simple">
							<div class="row form-group">
								<label class="col-sm-4 control-label">Nombre</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control" cssErrorClass="has-error" name="form.nombre"/>
									<s:fielderror fieldName="form.nombre"
										cssClass="help-block has-error" />
								</div>
							</div>
							<div class="row form-group">
								<label class="col-sm-4 control-label">Direccion</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control" cssErrorClass="has-error" name="form.direccion"/>
									<s:fielderror fieldName="form.direccion"
										cssClass="help-block has-error" />
								</div>
							</div>
							<div class="row form-group">
								<label class="col-sm-4 control-label">Telefono</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control" cssErrorClass="has-error" name="form.telefono"/>
									<s:fielderror fieldName="form.telefono"
										cssClass="help-block has-error" />
								</div>
							</div>

							<div class="row form-group action-row">
								<div class="col-sm-offset-10 col-sm-2">
									<button type="submit"
										class="btn btn-default btn-primary btn-block">Actualizar</button>
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