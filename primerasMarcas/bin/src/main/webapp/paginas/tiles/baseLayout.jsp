<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!doctype html>
<!--[if lt IE 9 ]> <html class="no-js ie oldie" lang="es-419"> <![endif]-->
<!--[if IE 9 ]>    <html class="no-js ie ie9" lang="es-419"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html class="no-js" lang="es-419">
<!--<![endif]-->

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Primeras Marcas</title>

<link rel="shortcut icon" href="img/favicon.ico?v=2">
<link rel="icon" type="image/vnd.microsoft.icon" href="img/favicon.ico">
<link rel="icon" type="image/png" sizes="16x16 24x24 32x32 48x48" href="favicon-48x48.png">
<link rel="icon" type="image/png" sizes="196x196" href="favicon-196x196.png">

<link rel="stylesheet" href="css/core.min.css" data-noprefix>
<link rel="stylesheet" href="css/main.css">

<script src="js/libs/prefixfree.min.js"></script>
<script src="js/libs/modernizr-2.8.3.min.js"></script>
</head>

<body>

	<!--[if lt IE 9]><div class="browserupgrade">¡Tu navegador es muy viejo! <a href="http://browsehappy.com/?locale=es" title="actualizar navegador" target="_blank">Actualizalo a uno más nuevo y moderno</a> para tener una mejor experiencia y velocidad en la aplicación. <a href="#" class="close_message" title="cerrar aviso" onclick="document.getElementById('aviso').style.display='none';return false">&times;</a>
	</div><![endif]-->
	<div class="wrapper">

		<header role="banner">
			<tiles:insertAttribute name="menu" />
		</header>

		<!-- app body  -->

		<section class="container-fluid appbody" role="main">

			<div class="row">
				<div class="col-xs-12 col-md-12 col-lg-12">

					<!-- el contenido de las páginas internas va acá -->
					<tiles:insertAttribute name="body" />
					<!--! -->

				</div>
			</div>

		</section>

		<!--! -->

		<!-- footer -->
		<tiles:insertAttribute name="pie" />
		<!--! -->

	</div>
	<!-- ./ wrapper -->

	<noscript>
		<div class="noscriptmsg">
			<h1>Primeras Marcas</h1>
			<h2>
				<strong>No tenés javascript habilitado</strong>. Es necesario para utilizar la app
			</h2>
		</div>
	</noscript>


	<!-- js libs -->
	<script src="js/libs/jquery-2.1.4.min.js"></script>
	<script src="js/libs/core.min.js"></script>
	<script src="js/main.js"></script>

	<!-- scripts -->
	<script>
		WebFontConfig = {
			google : {
				families : [ 'Open+Sans:400,600,700:latin' ]
			}
		};
		(function() {
			var wf = document.createElement('script');
			wf.src = ('https:' == document.location.protocol ? 'https' : 'http')
					+ '://ajax.googleapis.com/ajax/libs/webfont/1/webfont.js';
			wf.type = 'text/javascript';
			wf.async = 'true';
			var s = document.getElementsByTagName('script')[0];
			s.parentNode.insertBefore(wf, s);
		})();
	</script>
	<!-- -->
</body>
</html>