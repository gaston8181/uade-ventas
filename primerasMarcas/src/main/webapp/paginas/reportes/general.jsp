<%@ taglib prefix="s" uri="/struts-tags"%>


<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">

		<div class="page-header">
			<h1>Generar reporte balance semanal/mensual/anual</h1>
		</div>
		<!-- el contenido de las páginas internas va acá -->

		<div class="row">
			<div class="col-xs-12 col-md-6 col-lg-8">
				<div class="panel panel-default panel-form">
					<div class="panel-body">
						<div class="row filters">
							<div class="col-xs-12 col-md-6 form-group">

								<label class="radio-inline"> <input type="radio"
									name="form.reporte" value="0" id="radioSemanal"
									onclick="mostrarReporteSemanal()"> Semanal
								</label> <label class="radio-inline"> <input type="radio"
									name="form.reporte" value="1" id="radioMensual"
									onclick="mostrarReporteMensual()"> Mensual
								</label> <label class="radio-inline"> <input type="radio"
									name="form.reporte" value="2" id="radioAnual"
									onclick="mostrarReporteAnual()"> Anual
								</label>
							</div>
						</div>

						<s:form id="idFormSemanal" action="reporteSemanal" theme="simple"
							cssStyle="display: none;">
							<div class="row filters">

								<div class="col-xs-12 col-md-3 form-group">
									<div class="row">
										<label class="col-sm-4 control-label">Semana</label>
										<div class="col-sm-5">
											<s:textfield type="text" cssClass="form-control"
												name="form.semana" cssErrorClass="has-error" />
										</div>
									</div>

								</div>

								<div class="col-xs-12 col-md-3 form-group">
									<div class="row">
										<label class="col-sm-4 control-label">Mes</label>
										<div class="col-sm-5">
											<s:textfield type="text" cssClass="form-control"
												name="form.mes" cssErrorClass="has-error" />
										</div>
									</div>
								</div>

								<div class="col-xs-12 col-md-3 form-group">
									<div class="row">
										<label class="col-sm-4 control-label">A&ntilde;o</label>
										<div class="col-sm-5">
											<s:textfield type="text" cssClass="form-control"
												name="form.anio" cssErrorClass="has-error" />
										</div>
									</div>
								</div>


							</div>

							<div class="row filters">
								<div class="col-xs-12 col-md-3 form-group">
									<div class="row">
										<div class="col-sm-5">
											<button type="submit" class="btn btn-primary">Aplicar</button>
										</div>
									</div>
								</div>
							</div>
						</s:form>

						<s:form id="idFormMensual" action="reporteMensual" theme="simple"
							cssStyle="display: none;">
							<div class="row filters">
								<div class="col-xs-12 col-md-3 form-group">
									<div class="row">
										<label class="col-sm-4 control-label">Mes</label>
										<div class="col-sm-5">
											<s:textfield type="text" cssClass="form-control"
												name="form.mes" cssErrorClass="has-error" />
										</div>
									</div>
								</div>

								<div class="col-xs-12 col-md-3 form-group">
									<div class="row">
										<label class="col-sm-4 control-label">A&ntilde;o</label>
										<div class="col-sm-5">
											<s:textfield type="text" cssClass="form-control"
												name="form.anio" cssErrorClass="has-error" />
										</div>
									</div>
								</div>
							</div>

							<div class="row filters">
								<div class="col-xs-12 col-md-3 form-group">
									<div class="row">
										<div class="col-sm-5">
											<button type="submit" class="btn btn-primary">Aplicar</button>
										</div>
									</div>
								</div>
							</div>
						</s:form>

						<s:form id="idFormAnual" action="reporteAnual" theme="simple"
							cssStyle="display: none;">
							<div class="row filters">
								<div class="col-xs-12 col-md-3 form-group">
									<div class="row">
										<label class="col-sm-4 control-label">A&ntilde;o</label>
										<div class="col-sm-5">
											<s:textfield type="text" cssClass="form-control"
												name="form.anio" cssErrorClass="has-error" />
										</div>
									</div>
								</div>
							</div>

							<div class="row filters">
								<div class="col-xs-12 col-md-3 form-group">
									<div class="row">
										<div class="col-sm-5">
											<button type="submit" class="btn btn-primary">Aplicar</button>
										</div>
									</div>
								</div>
							</div>
						</s:form>
					</div>
				</div>
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
