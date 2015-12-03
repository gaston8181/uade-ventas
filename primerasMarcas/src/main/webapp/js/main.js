
$(window).on("load", function() {
     
      $("body").removeClass("preload").addClass("loaded");

});

var retina = (window.retina || window.devicePixelRatio > 1);
if (retina) {
    $('body').addClass('retina');
}

$(document).ready(function(){
		
		    /*$(function(){
		    	$(".dropdown").hover(            
		            function() {
		                $('.dropdown-menu', this).stop( true, true ).fadeIn(100);
		                $(this).toggleClass('open');
		                $('b', this).toggleClass("caret caret-up");                
		            },
		            function() {
		                $('.dropdown-menu', this).stop( true, true ).fadeOut(1);
		                $(this).toggleClass('open');
		                $('b', this).toggleClass("caret caret-up");                
		        });
		    });*/
	$(function() {
		$('.action-row .counter').text(' ');
		
		var generallen = $(".table input[name='pp[]']:checked").length;
		if(generallen>0){$(".action-row .counter").text('('+generallen+')');}else{$(".action-row .counter").text(' ');}
	});

	function updateCounter() {
	    var len = $(".table input[name='pp[]']:checked").length;
		if(len>0){$(".action-row .counter").text('('+len+') Registro/s seleccionado/s para procesar...');}else{$(".action-row .counter").text(' ');}
	}

	$(".table input:checkbox").on("change", function() {
		updateCounter();
	});

	$(".panel-body .table tr").click(function(event) {
        if (event.target.type !== 'checkbox') {
            $(':checkbox', this).trigger('click');
        }
    });

	//Funcion para seleccionar todos en una tabla

	$(function() {
		$('.select_all').change(function() {
			var checkthis = $(this);
			var checkboxes = $('.table td').find(":checkbox");

			if(checkthis.is(':checked')) {
				checkboxes.prop('checked', true);
			} else {
				checkboxes.prop('checked', false);
			}
	        updateCounter();
		});
	    
	});

	//Button busy function
	$(".btn-process").click(function() {

	    var $btn = $(this);
	    var $btnrefresh = $('.action-row .btn-refresh');
	    var $process = $('.process-indicator');

	    $btn.button('loading');
	    $btnrefresh.prop('disabled', true);
	    $process.fadeIn();

	    setTimeout(function () {
	        $btn.button('reset');
	        $btnrefresh.prop('disabled', false);
	        $process.fadeOut();
	    }, 5000);

	});
    
});

function isNumberKey(evt){
    var charCode = (evt.which) ? evt.which : evt.keyCode;
    if (charCode > 31 && (charCode < 48 || charCode > 57))
        return false;
    return true;
}

function generarCodigo() {
	var codigo = $('#idMarca').val() + $('#idColor').val() + $('#idTipoProducto').val();
	$('#idCodigoBarras').val(codigo);
}