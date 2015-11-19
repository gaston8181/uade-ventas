<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">

		<div class="page-header">
			<h1>Baja Vendedor</h1>
		</div>
		<!-- el contenido de las páginas internas va acá -->

		<div class="row">
			<div class="col-xs-12 col-md-12 col-lg-12">
				<s:actionmessage cssClass="alert alert-success" />
				<s:actionerror cssClass="alert alert-danger" />
			</div>
		</div>

		<div class="row">
			<div class="col-xs-12 col-md-12 col-lg-12">

				<div class="panel panel-default panel-table">

					<div class="panel-heading">

						<table class="table table-condensed table-hover">
							<thead>
								<tr>
									<th class="col-md-1">Legajo</th>
									<th class="col-md-1">Nombre</th>
									<th class="col-md-1">Apellido</th>
									<th class="col-md-1">Dni</th>
									<th class="col-md-1">Fecha Nacimiento</th>
									<th class="col-md-1 text-center">Acciones</th>
								</tr>
							</thead>
						</table>
					</div>

					<div class="panel-body">

						<!-- Grilla de resultados -->

						<table class="table table-condensed table-hover">

							<tbody>
								<s:iterator value="vendedoresExistentes">
									<s:if test="fechaBaja == null">
										<tr>
											<td class="col-md-1"><s:property value="legajo" /></td>
											<td class="col-md-1"><s:property value="nombre" /></td>
											<td class="col-md-1"><s:property value="apellido" /></td>
											<td class="col-md-1"><s:property value="dni" /></td>
											<td class="col-md-1"><s:date name="fechaNac"
													format="dd/MM/yyyy" /></td>
											<td class="col-md-1 text-center"><a
												href="bajaVendedor?form.legajo=<s:property value="legajo" />"
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