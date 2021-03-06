<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">

		<div class="page-header">
			<h1>Baja Proveedor</h1>
		</div>
		<!-- el contenido de las p�ginas internas va ac� -->

		<div class="row">
			<div class="col-xs-12 col-md-12 col-lg-12"></div>
		</div>

		<s:actionmessage cssClass="alert alert-success" />
		<s:actionerror cssClass="alert alert-danger" />
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
									<s:if test="activo">
										<tr>
											<td class="col-md-1"><s:property value="id" /></td>
											<td class="col-md-1"><s:property value="nombre" /></td>
											<td class="col-md-1"><s:property value="direccion" /></td>
											<td class="col-md-1"><s:property value="telefono" /></td>
											<td class="col-md-1 text-center"><a
												href="bajaProveedor?form.id=<s:property value="id" />"
												title="Eliminar Registro" class="delete-row"><i
													class="fa fa-trash-o"></i> Eliminar</a></td>
										</tr>
									</s:if>
								</s:iterator>
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