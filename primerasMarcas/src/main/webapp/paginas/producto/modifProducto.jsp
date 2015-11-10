
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">

		<div class="page-header">
			<h1>Modificar Producto</h1>
		</div>
		<!-- el contenido de las páginas internas va acá -->

		<div class="row">
			<div class="col-xs-12 col-md-6 col-lg-8">

				<div class="panel panel-default panel-form">
					<div class="panel-body">
						<!-- formulario -->
						<form>
							<div class="row form-group">
								<label class="col-sm-3 control-label">Codigo Barras</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" />

								</div>

								<div class="col-sm-2">
									<button type="submit"
										class="btn btn-default btn-primary btn-block">Buscar</button>
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-3 control-label">Marca</label>
								<div class="col-sm-4">
									<input type="text" class="form-control"  disabled="disabled" />
								</div>
							</div>

							<div class="row form-group">
								<label for="inputPassword" class="col-sm-3 control-label">Color</label>
								<div class="col-sm-4">
									<select class="form-control"  disabled="disabled" >
									</select>
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-3 control-label">Precio Venta</label>
								<div class="col-sm-4">
									<input type="number" pattern="([0-9]|[0-9]|[0-9])"  disabled="disabled" 
										class="form-control" onkeypress="return isNumberKey(event)">
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-3 control-label">Precio Compra</label>
								<div class="col-sm-4">
									<input type="number" pattern="([0-9]|[0-9]|[0-9])"  disabled="disabled" 
										class="form-control" onkeypress="return isNumberKey(event)">
								</div>
							</div>

							<div class="row form-group">
								<label for="inputPassword" class="col-sm-3 control-label">Proveedor</label>
								<div class="col-sm-4">
									<select class="form-control"  disabled="disabled" >
									</select>
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-3 control-label">Dato Adicional</label>
								<div class="col-sm-4">
									<input type="text" class="form-control"  disabled="disabled" />
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-3 control-label">Decripcion</label>
								<div class="col-sm-4">
									<textarea class="form-control" rows="3"  disabled="disabled" ></textarea>
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-3 control-label">Stock</label>
								<div class="col-sm-4">
									<input type="number" pattern="([0-9]|[0-9]|[0-9])"  disabled="disabled" 
										class="form-control" onkeypress="return isNumberKey(event)">
								</div>
							</div>

							<div class="row form-group">
								<label for="inputPassword" class="col-sm-3 control-label">Tipo
									Producto</label>
								<div class="col-sm-4">
									<select class="form-control"  disabled="disabled" >

									</select>
								</div>
							</div>

							<div class="row form-group action-row">
								<div class="col-sm-offset-10 col-sm-2">
									<button type="submit"
										class="btn btn-default btn-primary btn-block"  disabled="disabled" >Actualizar</button>
								</div>
							</div>

						</form>
						<!--! -->
					</div>
				</div>

			</div>
		</div>

		<!--! -->

	</div>
</div>