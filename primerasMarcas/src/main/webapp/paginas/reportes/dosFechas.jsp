<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">

		<div class="page-header">
			<h1>Generar reporte de productos vendidos entre fechas</h1>
		</div>
		<!-- el contenido de las páginas internas va acá -->

		<div class="row">
			<div class="col-xs-12 col-md-12 col-lg-12">
				<s:form action="consultarProductos" theme="simple">
					<div class="row filters">

						<div class="col-xs-12 col-md-2 form-group">
							<div class="row">
								<label for="inputPassword" class="col-sm-3 control-label">Marca</label>
								<div class="col-sm-9">
									<s:select id="idMarca" cssClass="form-control"
										list="combos.marcas" listValue="descripcion" listKey="id"
										name="form.idMarca">

									</s:select>
								</div>
							</div>
						</div>

						<div class="col-xs-12 col-md-2 form-group">
							<div class="row">
								<label for="inputPassword" class="col-sm-4 control-label">Producto</label>
								<div class="col-sm-8">
									<s:select id="idTipoProducto" cssClass="form-control"
										list="combos.tiposProductos" listValue="descripcion"
										listKey="id" name="form.idTipoProducto" />
								</div>
							</div>
						</div>

						<div class="col-xs-12 col-md-2 form-group">
							<div class="row">
								<label for="inputPassword" class="col-sm-4 control-label">Color</label>
								<div class="col-sm-8">
									<s:select id="idColor" cssClass="form-control"
										list="combos.colores" name="form.idColor"
										listValue="descripcion" listKey="id" />
								</div>
							</div>
						</div>

						<div class="col-xs-12 col-md-2 form-group">
							<div class="row">
								<label for="inputPassword" class="col-sm-4 control-label">Talle</label>
								<div class="col-sm-8">
									<s:select cssClass="form-control" list="combos.talles"
										name="form.idTalle" listValue="descripcion" listKey="id" />
								</div>
							</div>
						</div>
					</div>
				</s:form>
				<!-- ./ filters -->

			</div>
		</div>


		<!--! -->

	</div>
</div>