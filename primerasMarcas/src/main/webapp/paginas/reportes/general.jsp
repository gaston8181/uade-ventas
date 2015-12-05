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
						<label class="radio-inline"> <input type="radio"
							name="inlineRadioOptions" id="inlineRadio1" value="option1">
							Semanal
						</label> <label class="radio-inline"> <input type="radio"
							name="inlineRadioOptions" id="inlineRadio2" value="option2">
							Mensual
						</label> <label class="radio-inline"> <input type="radio"
							name="inlineRadioOptions" id="inlineRadio3" value="option3">
							Anual
						</label>
					</div>
				</div>
			</div>
		</div>

		<div class="row filters">

			<div class="col-xs-12 col-md-3 form-group">
				<div class="row">
					<label class="col-sm-4 control-label">Semana</label>
					<div class="col-sm-5">
						<s:textfield type="text" cssClass="form-control"
							name="form.fechaInicio" cssErrorClass="has-error" />
					</div>
				</div>

			</div>

			<div class="col-xs-12 col-md-3 form-group">
				<div class="row">
					<label class="col-sm-4 control-label">Mes</label>
					<div class="col-sm-5">
						<s:textfield type="text" cssClass="form-control"
							name="form.fechaFin" cssErrorClass="has-error" />
					</div>
				</div>
			</div>

			<div class="col-xs-12 col-md-3 form-group">
				<div class="row">
					<label class="col-sm-4 control-label">Año</label>
					<div class="col-sm-5">
						<s:textfield type="text" cssClass="form-control"
							name="form.fechaFin" cssErrorClass="has-error" />
					</div>
				</div>
			</div>


		</div>

		<div class="row filters">
			<div class="col-xs-12 col-md-3 form-group">
				<div class="row">
					<label class="col-sm-4 control-label">Semana</label>
					<div class="col-sm-5">
						<s:textfield type="text" cssClass="form-control"
							name="form.fechaInicio" cssErrorClass="has-error" />
					</div>
				</div>
			</div>

			<div class="col-xs-12 col-md-3 form-group">
				<div class="row">
					<label class="col-sm-4 control-label">Año</label>
					<div class="col-sm-5">
						<s:textfield type="text" cssClass="form-control"
							name="form.fechaFin" cssErrorClass="has-error" />
					</div>
				</div>
			</div>
		</div>

		<div class="row filters">
			<div class="col-xs-12 col-md-3 form-group">
				<div class="row">
					<label class="col-sm-4 control-label">Año</label>
					<div class="col-sm-5">
						<s:textfield type="text" cssClass="form-control"
							name="form.fechaInicio" cssErrorClass="has-error" />
					</div>
				</div>
			</div>
		</div>

		<div class="row filters">
			<div class="col-xs-12 col-md-3 form-group">
				<div class="row">
					<button type="submit" class="btn btn-default">
						<i class="fa fa-filter"></i> Aplicar
					</button>
				</div>
			</div>
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