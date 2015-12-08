<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="row">
	<div class="col-xs-12 col-md-12 col-lg-12">

		<div class="page-header">
			<h1>Cargar Producto</h1>
		</div>
		<!-- el contenido de las páginas internas va acá -->

		<div class="row">
			<div class="col-xs-12 col-md-6 col-lg-8">

				<div class="panel panel-default panel-form">
					<div class="panel-body">
						<!-- formulario -->
						<s:form action="buscarProductoCargaProducto" theme="simple">
							<div class="row form-group">
								<label class="col-sm-3 control-label">Codigo Barras</label>
								<div class="col-sm-4">
									<s:textfield type="text" cssClass="form-control" name="form.id" onkeypress="return isNumberKey(event)"
										cssErrorClass="has-error" />

								</div>

								<div class="col-sm-2">
									<button type="submit"
										class="btn btn-default btn-primary btn-block">Buscar</button>
								</div>
							</div>
						</s:form>
						<s:form action="cargarProducto" theme="simple">
							<s:hidden key="form.id" />
							<div class="row form-group">
								<label class="col-sm-3 control-label">Marca</label>
								<div class="col-sm-4">
									<s:select id="idMarca" cssClass="form-control"
										list="combos.marcas" listValue="descripcion" listKey="id"
										name="form.idMarca" disabled="true">
									</s:select>
								</div>

							</div>

							<div class="row form-group">
								<label class="col-sm-3 control-label">Tipo Producto</label>
								<div class="col-sm-4">
									<s:select id="idTipoProducto" cssClass="form-control"
										list="combos.tiposProductos" listValue="descripcion"
										listKey="id" name="form.idTipoProducto" disabled="true" />
								</div>

							</div>

							<div class="row form-group">
								<label class="col-sm-3 control-label">Color</label>
								<div class="col-sm-4">
									<s:select id="idColor" cssClass="form-control"
										list="combos.colores" name="form.idColor"
										listValue="descripcion" listKey="id"
										disabled="true" />
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-3 control-label">Talle</label>
								<div class="col-sm-4">
									<s:select id="idTalle" cssClass="form-control"
										list="combos.talles" listValue="descripcion" listKey="id"
										disabled="true" name="form.idTalle" />
								</div>
							</div>

							<div class="row form-group">
								<label class="col-sm-3 control-label">Stock</label>
								<div class="col-sm-2">
									<s:textfield type="text" cssClass="form-control"
										name="form.stock" cssErrorClass="has-error"
										onkeypress="return isNumberKey(event)" disabled="true" />


								</div>
								<div class="col-sm-1">
									<label class="col-sm-2 control-label">+</label>
								</div>
								<div class="col-sm-2">
									<s:textfield type="text" cssClass="form-control"
										name="form.agregarStock" cssErrorClass="has-error"
										onkeypress="return isNumberKey(event)" />
								</div>

							</div>

							<div class="row form-group action-row">
								<div class="col-sm-offset-10 col-sm-2">
									<button type="submit"
										class="btn btn-default btn-primary btn-block">Actualizar</button>
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