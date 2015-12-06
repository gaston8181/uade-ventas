<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">

		<div class="page-header">
			<h1>Cerrar Caja</h1>
		</div>
		<!-- el contenido de las páginas internas va acá -->

		<div class="row">
			<div class="col-xs-12 col-md-12 col-lg-12"></div>
		</div>

		<div class="row">
			<div class="col-xs-12 col-md-12 col-lg-12">

				<div class="panel panel-default panel-table">

					<div class="panel-heading">

						<table class="table table-condensed table-hover">
							<thead>
								<tr>
									<th class="col-md-1">Codigo Barras</th>
									<th class="col-md-1">Tipo Producto</th>
									<th class="col-md-1">Marca</th>
									<th class="col-md-1">Talle</th>
									<th class="col-md-1">Color</th>
									<th class="col-md-1">Stock</th>
									<th class="col-md-1">Vendedor</th>
									<th class="col-md-1">Precio Venta</th>
									<th class="col-md-1">Dato Adicional</th>
								</tr>
							</thead>
						</table>
					</div>

					<div class="panel-body">

						<!-- Grilla de resultados -->

						<table class="table table-condensed table-hover">

							<tbody>
								<s:iterator value="operaciones">
									<tr>
										<td class="col-md-1"><s:property value="stock" /></td>
										<td class="col-md-1"><s:property value="stock" /></td>
										<td class="col-md-1"><s:property value="stock" /></td>
										<td class="col-md-1"><s:property value="stock" /></td>
										<td class="col-md-1"><s:property value="stock" /></td>
										<td class="col-md-1"><s:property value="stock" /></td>
										<td class="col-md-1"><s:property value="stock" /></td>
										<td class="col-md-1"><s:property value="stock" /></td>
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


		<div class="row form-group">
			<label class="col-sm-2 control-label">Total Efectivo</label>
			<div class="col-sm-1">
				<s:textfield type="text" cssClass="form-control"
					name="totalEfectivo" cssErrorClass="has-error"
					disabled="true" />
			</div>

			<label class="col-sm-2 control-label">Total Tarjeta</label>
			<div class="col-sm-1">
				<s:textfield type="text" cssClass="form-control"
					name="totalEfectivo" cssErrorClass="has-error"
					disabled="true" />
			</div>
		</div>


		<div class="row">
			<div class="col-xs-12 col-md-6 col-lg-8">


				<!-- Button trigger modal -->
				<button type="button" class="btn btn-primary btn-lg">Cerrar</button>


			</div>
		</div>
	</div>
</div>
