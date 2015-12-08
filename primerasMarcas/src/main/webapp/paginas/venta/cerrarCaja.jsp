<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">

		<div class="page-header">
			<h1>Ventas + Cambios</h1>
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

		<div class="page-header">
			<h1>Stock</h1>
		</div>

		<div class="row">
			<div class="col-xs-12 col-md-6 col-lg-8">

				<div class="panel panel-default panel-form">
					<div class="panel-body">

						<!-- Gráfico de Barras -->
						<canvas id="BarChart" class="barchart" width="800" height="500">Tu navegador no soporta canvas!</canvas>
						<!--! -->

					</div>
				</div>

			</div>
		</div>

		<div class="page-header">
			<h1>Total Vendido</h1>
		</div>

		<div class="row form-group">
			<label class="col-sm-2 control-label">Total Efectivo</label>
			<div class="col-sm-1">
				<s:textfield type="text" cssClass="form-control"
					name="totalEfectivo" cssErrorClass="has-error" disabled="true" />
			</div>

			<label class="col-sm-2 control-label">Total Tarjeta</label>
			<div class="col-sm-1">
				<s:textfield type="text" cssClass="form-control"
					name="totalEfectivo" cssErrorClass="has-error" disabled="true" />
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




<!-- js libs -->
<script src="js/libs/jquery-2.1.4.min.js"></script>
<script src="js/libs/core.min.js"></script>
<script src="js/libs/chart.min.js"></script>
<script src="js/main.js"></script>
<!-- scripts -->
<script>
	// Bar chart /////////////////////
	// 	var proveedores = $('#idProveedores').val().split("|");
	// 	var total = $('#idTotal').val().split("|");

	// line chart data
	var data = {
		labels : [ 'Remeras', 'Jeans' ],
		datasets : [ {
			label : "Data1",
			fillColor : "#2979FF",
			strokeColor : "#FFFFFF",
			pointColor : "rgba(220,220,220,0.5)",
			pointStrokeColor : "#fff",
			pointHighlightFill : "#fff",
			pointHighlightStroke : "rgba(220,220,220,0.5)",
			data : [ 2, 5 ]
		}

		]
	};

	optionsBarChart = {
		bezierCurve : true,
		datasetFill : false,
		pointDot : false,
		scaleShowVerticalLines : false,
		scaleShowHorizontalLines : false,
		datasetStroke : true,
		datasetStrokeWidth : 5,
		scaleLineColor : "#c1c1c1",
		scaleFontColor : "#727272",
		scaleFontFamily : "'Open Sans', sans-serif",
		scaleFontSize : 18,
	};

	// Get the context of the canvas element we want to select
	var ctx = document.getElementById("BarChart").getContext("2d");
	var myLineChart = new Chart(ctx).Bar(data, optionsBarChart);

	//Reload para el BarChart

	jQuery(function($) {
		var windowWidth = $(window).width();

		$(window).resize(function() {
			if (windowWidth != $(window).width()) {
				location.reload();
				return;
			}
		});
	});

	
</script>