<%@ taglib prefix="s" uri="/struts-tags"%>


<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">

		<div class="page-header">
			<h1>Modificar Producto</h1>
		</div>
		<!-- el contenido de las páginas internas va acá -->

		<div class="row">
			<div class="col-xs-12 col-md-6 col-lg-8">

				<div class="panel panel-default panel-form">
					<div class="panel-body">
						<!-- formulario -->
						<s:form action="buscarProducto" theme="simple">
							<div class="row form-group">
								<label class="col-sm-3 control-label">Codigo Barras</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control" name="form.id"
										cssErrorClass="has-error" />

								</div>

								<div class="col-sm-2">
									<button type="submit"
										class="btn btn-default btn-primary btn-block">Buscar</button>
								</div>
							</div>
						</s:form>
						<s:form action="modificarProducto" theme="simple">
							<s:hidden key="form.id" />
							<div class="row form-group">
								<label class="col-sm-3 control-label">Nuevo Codigo
									Barras</label> 
								<div class="col-sm-4">
									<input id="idCodigoBarras" type="text" class="form-control"
										disabled />
									<s:hidden id="codigoBarrasHidden" key="form.id" />
								</div>

							</div>

							<div class="row form-group">
								<label class="col-sm-3 control-label">Marca</label>
								<div class="col-sm-4">
									<s:select id="idMarca" cssClass="form-control"
										list="combos.marcas" listValue="descripcion" listKey="id"
										name="form.idMarca" onchange="generarCodigo()">
									</s:select>
								</div>
							</div>

							<div class="row form-group">
								<label for="inputPassword" class="col-sm-3 control-label">Color</label>
								<div class="col-sm-4">
									<s:select id="idColor" cssClass="form-control"
										list="combos.colores" name="form.idColor"
										listValue="descripcion" listKey="id"
										onchange="generarCodigo()" />
								</div>
							</div>

							<div class="row form-group">
								<label for="inputPassword" class="col-sm-3 control-label">Talle</label>
								<div class="col-sm-4">
									<s:select id="idTalle" cssClass="form-control"
										list="combos.talles" name="form.idTalle"
										listValue="descripcion" listKey="id"
										onchange="generarCodigo()" />
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-3 control-label">Precio Venta</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control"
										name="form.precioVenta" cssErrorClass="has-error"
										onkeypress="return isNumberKey(event)" />
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-3 control-label">Precio Compra</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control"
										name="form.precioCompra" cssErrorClass="has-error"
										onkeypress="return isNumberKey(event)" />
								</div>
							</div>

							<div class="row form-group">
								<label for="inputPassword" class="col-sm-3 control-label">Proveedor</label>
								<div class="col-sm-4">
									<s:select cssClass="form-control" list="combos.proveedores"
										listValue="nombre" listKey="id" name="form.idProveedor" />
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-3 control-label">Dato Adicional</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control"
										name="form.datoAdicional" cssErrorClass="has-error" />
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-3 control-label">Stock</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control"
										name="form.stock" cssErrorClass="has-error"
										onkeypress="return isNumberKey(event)" />
								</div>
							</div>

							<div class="row form-group">
								<label for="inputPassword" class="col-sm-3 control-label">Tipo
									Producto</label>
								<div class="col-sm-4">
									<s:select id="idTipoProducto" cssClass="form-control"
										list="combos.tiposProductos" listValue="descripcion"
										listKey="id" onchange="generarCodigo()"
										name="form.idTipoProducto" />
								</div>
							</div>

							<div class="row form-group action-row">
								<div class="col-sm-offset-10 col-sm-2">
									<button type="submit"
										class="btn btn-default btn-primary btn-block">Actualizar</button>
									<!-- 										disabled="disabled">Actualizar</button> -->

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