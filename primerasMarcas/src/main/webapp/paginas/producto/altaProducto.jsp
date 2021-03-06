<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">

		<div class="page-header">
			<h1>Alta Producto</h1>
		</div>
		<!-- el contenido de las p�ginas internas va ac� -->

		<div class="row">
			<div class="col-xs-12 col-md-6 col-lg-8">

				<div class="panel panel-default panel-form">
					<div class="panel-body">

						<s:actionmessage cssClass="alert alert-success" />
						<s:actionerror cssClass="alert alert-danger" />
						<!-- formulario -->
						<s:form action="altaProducto" theme="simple">
							<div class="row form-group">
								<label class="col-sm-4 control-label">Codigo Barras</label>
								<div class="col-sm-4">
									<input id="idCodigoBarras" type="text" class="form-control"
										disabled />
									<s:hidden id="codigoBarrasHidden" key="form.id" />
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-4 control-label">Marca</label>
								<div class="col-sm-4">
									<s:select id="idMarca" cssClass="form-control" cssErrorClass="has-error"
										list="combos.marcas" listValue="descripcion" listKey="id"
										name="form.idMarca" onchange="generarCodigo()">

									</s:select>
									
									<s:fielderror fieldName="form.idMarca"
										cssClass="help-block has-error" />
								</div>
							</div>

							<div class="row form-group">
								<label for="inputPassword" class="col-sm-4 control-label">Color</label>
								<div class="col-sm-4">
									<s:select id="idColor" cssClass="form-control" cssErrorClass="has-error"
										list="combos.colores" name="form.idColor"
										listValue="descripcion" listKey="id"
										onchange="generarCodigo()" />
									<s:fielderror fieldName="form.idColor"
										cssClass="help-block has-error" />
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-4 control-label">Precio Venta</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control"
										name="form.precioVenta" cssErrorClass="has-error"
										onkeypress="return isNumberKey(event)" />
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-4 control-label">Precio Compra</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control"
										name="form.precioCompra" cssErrorClass="has-error"
										onkeypress="return isNumberKey(event)" />
								</div>
							</div>

							<div class="row form-group">
								<label for="inputPassword" class="col-sm-4 control-label">Proveedor</label>
								<div class="col-sm-4">
									<s:select cssClass="form-control" list="combos.proveedores"
										listValue="nombre" listKey="id" name="form.idProveedor" />
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-4 control-label">Dato Adicional</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control"
										name="form.datoAdicional" cssErrorClass="has-error" />
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-4 control-label">Stock</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control"
										name="form.stock" cssErrorClass="has-error"
										onkeypress="return isNumberKey(event)" />
								</div>
							</div>

							<div class="row form-group">
								<label for="inputPassword" class="col-sm-4 control-label">Tipo
									Producto</label>
								<div class="col-sm-4">
									<s:select id="idTipoProducto" cssClass="form-control" cssErrorClass="has-error"
										list="combos.tiposProductos" listValue="descripcion"
										listKey="id" onchange="generarCodigo()"
										name="form.idTipoProducto" />
									<s:fielderror fieldName="form.idTipoProducto"
										cssClass="help-block has-error" />
								</div>
							</div>

							<div class="row form-group">
								<label for="inputPassword" class="col-sm-4 control-label">Talle</label>
								<div class="col-sm-4">
									<s:select id="idTalle" cssClass="form-control"
										list="combos.talles" listValue="descripcion"
										listKey="id" onchange="generarCodigo()" cssErrorClass="has-error"
										name="form.idTalle" />
									<s:fielderror fieldName="form.idTalle"
										cssClass="help-block has-error" />
								</div>
							</div>

							<div class="row form-group action-row">
								<div class="col-sm-offset-10 col-sm-2">
									<button type="submit"
										class="btn btn-default btn-primary btn-block">Crear</button>
								</div>
							</div>

						</s:form>
						<!--! -->
					</div>
				</div>

			</div>
		</div>

		<!--! -->

	</div>
</div>