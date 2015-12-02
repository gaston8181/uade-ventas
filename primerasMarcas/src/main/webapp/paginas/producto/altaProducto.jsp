
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">

		<div class="page-header">
			<h1>Alta Producto</h1>
		</div>
		<!-- el contenido de las páginas internas va acá -->

		<div class="row">
			<div class="col-xs-12 col-md-6 col-lg-8">

				<div class="panel panel-default panel-form">
					<div class="panel-body">
						<!-- formulario -->
						<form>
							<div class="row form-group">
								<label class="col-sm-4 control-label">Marca</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" />
								</div>
							</div>

							<div class="row form-group">
								<label for="inputPassword" class="col-sm-4 control-label">Color</label>
								<div class="col-sm-4">
									<select class="form-control">
										<option>BLANCO</option>
										<option>NEGRO</option>
										<option>ROJO</option>
										<option>AZUL</option>
										<option>GRIS</option>
									</select>
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-4 control-label">Precio Venta</label>
								<div class="col-sm-4">
									<input type="number" pattern="([0-9]|[0-9]|[0-9])"
										class="form-control" onkeypress="return isNumberKey(event)">
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-4 control-label">Precio Compra</label>
								<div class="col-sm-4">
									<input type="number" pattern="([0-9]|[0-9]|[0-9])"
										class="form-control" onkeypress="return isNumberKey(event)">
								</div>
							</div>

							<div class="row form-group">
								<label for="inputPassword" class="col-sm-4 control-label">Proveedor</label>
								<div class="col-sm-4">
									<select class="form-control">
										<option>RAPSODIA</option>
										<option>PINGUIN</option>
										<option>GOLA</option>
										<option>TUCCI</option>
									</select>
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-4 control-label">Dato Adicional</label>
								<div class="col-sm-4">
									<input type="text" class="form-control" />
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-4 control-label">Stock</label>
								<div class="col-sm-4">
									<input type="number" pattern="([0-9]|[0-9]|[0-9])"
										class="form-control" onkeypress="return isNumberKey(event)">
								</div>
							</div>

							<div class="row form-group">
								<label for="inputPassword" class="col-sm-4 control-label">Tipo Producto</label>
								<div class="col-sm-4">
									<select class="form-control">
										<option>tipo1</option>
										<option>tipo2</option>
										<option>tipo3</option>
										<option>tipo4</option>
									</select>
								</div>
							</div>

							<div class="row form-group action-row">
								<div class="col-sm-offset-10 col-sm-2">
									<button type="submit"
										class="btn btn-default btn-primary btn-block">Crear</button>
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