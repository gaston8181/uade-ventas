<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">

		<div class="page-header">
			<h1>Modificar Vendedor</h1>
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
									<th class="col-md-1">Telefono</th>
									<th class="col-md-1">Domicilio</th>
									<th class="col-md-1">Fecha Ingreso</th>
									<th class="col-md-1">Fecha Egreso</th>
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

									<tr>
										<td class="col-md-1"><s:property value="legajo" /></td>
										<td class="col-md-1"><s:property value="nombre" /></td>
										<td class="col-md-1"><s:property value="apellido" /></td>
										<td class="col-md-1"><s:property value="dni" /></td>
										<td class="col-md-1"><s:date name="fechaNac"
												format="dd/MM/yyyy" /></td>
										<td class="col-md-1"><s:property value="telefono" /></td>
										<td class="col-md-1"><s:property value="domicilio" /></td>
										<td class="col-md-1"><s:date name="fechaIngreso"
												format="dd/MM/yyyy" /></td>

										<s:if test="fechaBaja == null">
											<td class="col-md-1"></td>
											<td class="col-md-1 text-center"><a href="cargarVendedor?form.legajo=${legajo}"
												title="Modificar" class="detail-row"><i
													class="fa fa-angle-right"></i> Modificar</a></td>
										</s:if>

										<s:else>
											<td class="col-md-1 text-danger"><i class="fa fa-exclamation"></i> <s:date
													name="fechaBaja" format="dd/MM/yyyy" /></td>
											<td class="col-md-1 text-center"></td>
										</s:else>
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

		<!--! -->

	</div>
</div>