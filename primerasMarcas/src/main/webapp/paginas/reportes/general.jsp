<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">

		<div class="page-header">
			<h1>Generar reporte balance semanal/mensual/anual</h1>
		</div>
		<!-- el contenido de las páginas internas va acá -->

		<div class="row">
<!-- 			ACA VA EL CONTENIDO DE LA BUSQUEDA -->
		</div>


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
								<%-- 								<s:iterator value="productosExistentes"> --%>
								<tr>
									<td class="col-md-2">1213</td>
									<td class="col-md-1">1213</td>
									<td class="col-md-1">2312</td>
									<td class="col-md-1">3423</td>
									<td class="col-md-1">23423</td>
									<td class="col-md-1">23432</td>
									<td class="col-md-1">23432</td>
									<td class="col-md-1">234</td>
									<td class="col-md-1">3243</td>
								</tr>
								<%-- 								</s:iterator> --%>
							</tbody>

						</table>

						<!--! -->

					</div>

				</div>
				<!-- ./panel -->

			</div>
		</div>

		<!--! -->

	</div>
</div>