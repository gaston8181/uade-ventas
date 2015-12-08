<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">

		<div class="page-header">
			<h1>Baja Producto</h1>
		</div>
		<!-- el contenido de las páginas internas va acá -->

		<div class="row">
			<div class="col-xs-12 col-md-6 col-lg-8">

				<div class="panel panel-default panel-form">
					<div class="panel-body">
						
						<s:actionmessage cssClass="alert alert-success" />
						<s:actionerror cssClass="alert alert-danger" />
						<!-- formulario -->
						<s:form action="bajaProducto" theme="simple">
							<div class="row form-group">
								<label class="col-sm-4 control-label">Codigo Producto</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control" name="form.id" onkeypress="return isNumberKey(event)"
										cssErrorClass="has-error" />
								</div>
							</div>

							<div class="row form-group action-row">
								<div class="col-sm-offset-10 col-sm-2">
									<button type="submit"
										class="btn btn-default btn-primary btn-block">Eliminar</button>
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