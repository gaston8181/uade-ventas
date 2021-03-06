<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">

		<div class="page-header">
			<h1>Generar reporte de productos vendidos entre fechas</h1>
		</div>
		<!-- el contenido de las p�ginas internas va ac� -->

		<div class="row">
			<div class="col-xs-12 col-md-12 col-lg-12">
				<s:form action="reporteDosFechas" theme="simple">

					<div class="row filters">
						<br>

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

					<div class="row filters">

						<div class="col-xs-12 col-md-3 form-group">
							<div class="row">
								<label class="col-sm-4 control-label">Fecha Inicio</label>
								<div class="col-sm-5">
									<s:textfield type="text" cssClass="form-control"
										name="form.fechaInicio" cssErrorClass="has-error" />
								</div>
							</div>

						</div>

						<div class="col-xs-12 col-md-3 form-group">
							<div class="row">
								<label class="col-sm-4 control-label">Fecha Fin</label>
								<div class="col-sm-5">
									<s:textfield type="text" cssClass="form-control"
										name="form.fechaFin" cssErrorClass="has-error" />
								</div>
							</div>
						</div>

						<div class="col-xs-12 col-md-3 form-group">
							<div class="row">
								<button type="submit" class="btn btn-default">
									<i class="fa fa-filter"></i> Aplicar
								</button>
							</div>
						</div>


					</div>


				</s:form>
				<!-- ./ filters -->

			</div>
		</div>


		<s:if test="productosVentas != null">
			<div class="row">
				<div class="col-xs-12 col-md-12 col-lg-12">

					<div class="panel panel-default panel-table">

						<div class="panel-heading">

							<table class="table table-condensed table-hover">
								<thead>
									<tr>
										<th class="col-md-2">Nro Venta</th>
										<th class="col-md-1">Fecha Venta</th>
										<th class="col-md-1">Cod Barras</th>
										<th class="col-md-1">Marca</th>
										<th class="col-md-1">Color</th>
										<th class="col-md-1">Talle</th>
										<th class="col-md-1">Tipo</th>
										<th class="col-md-1">Precio Venta</th>
										<th class="col-md-1">Stock</th>
									</tr>
								</thead>
							</table>
						</div>

						<div class="panel-body">

							<!-- Grilla de resultados -->

							<table class="table table-condensed table-hover">

								<tbody>
									<s:iterator value="productosVentas">
										<tr>
											<td class="col-md-2"><s:property value="idVentaCambio" /></td>
											<td class="col-md-1"><s:property
													value="fechaVentaCambio" /></td>
											<td class="col-md-1"><s:property value="codigoBarras" /></td>
											<td class="col-md-1"><s:property value="descMarca" /></td>
											<td class="col-md-1"><s:property value="descColor" /></td>
											<td class="col-md-1"><s:property value="descTalle" /></td>
											<td class="col-md-1"><s:property value="descProducto" /></td>
											<td class="col-md-1"><s:property value="precioVenta" /></td>
											<td class="col-md-1"><s:property value="stock" /></td>
										</tr>
									</s:iterator>
								</tbody>

							</table>

							<!--! -->

						</div>

					</div>
					<!-- ./panel -->

				</div>
			</div>
		</s:if>
		<!--! -->


	</div>
</div>