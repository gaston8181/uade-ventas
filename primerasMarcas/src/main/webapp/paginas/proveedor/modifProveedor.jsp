<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">

		<div class="page-header">
			<h1>Modificar Proveedor</h1>
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
									<th class="col-md-1">Id</th>
									<th class="col-md-1">Nombre</th>
									<th class="col-md-1">Direccion</th>
									<th class="col-md-1">Telefono</th>
									<th class="col-md-1">Estado</th>
									<th class="col-md-1 text-center">Acciones</th>
								</tr>
							</thead>
						</table>
					</div>

					<div class="panel-body">

						<!-- Grilla de resultados -->

						<table class="table table-condensed table-hover">

							<tbody>
								<s:iterator value="proveedoresExistentes">
									<tr>
										<td class="col-md-1"><s:property value="id" /></td>
										<td class="col-md-1"><s:property value="nombre" /></td>
										<td class="col-md-1"><s:property value="direccion" /></td>
										<td class="col-md-1"><s:property value="telefono" /></td>
										<td class="col-md-1"><s:property value="estado" /></td>
										<td class="col-md-1 text-center"><a href="#"
											title="Modificar" class="detail-row"><i
												class="fa fa-angle-right"></i> Modificar</a></td>
									</tr>
								</s:iterator>
								<tr>
									<td class="col-md-1">3292</td>
									<td class="col-md-1">Martin</td>
									<td class="col-md-1">Independencia 1711</td>
									<td class="col-md-1">15-3232-2323</td>
									<td class="col-md-1 text-danger"><i
										class="fa fa-exclamation"></i>Inactivo</td>
									<td class="col-md-1 text-center"></td>
								</tr>

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