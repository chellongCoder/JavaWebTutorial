$(document).ready(function() {


		const firstname = $("#firstname");
		const lastname = $("#lastname");
		const username = $("#username");
		const email = $("#email");
		const address = $("#address");
		const address2 = $("#address2");
		const countries = $("#countries");
		const states = $("#states");
		const zipcode = $('#zipcode');
		const checkbox1 = $('#checkbox1'); 
		const checkbox2 = $('#checkbox2');
		const elementInputs = [
			firstname,
			lastname,
			username,
			email,
			address,
			address2,
			zipcode,
		];
		const elementDropdown = [
			countries,
			states,
		]
		const elementCheckboxs = [
			checkbox1,
			checkbox2,
		]
	
		$('input[type=text]').focus(function(event) {
			/* Act on the event */
			$('input[type=text]').attr({
				style: '',
			});
			$('input[type=text]').next().css('color', 'black');
			$('input[type=text]').next().attr({
				hidden: 'true'
			});
		});
		$('input[type=checkbox]').on('click', function(event) {
			/* Act on the event */
			$('input[type=checkbox]').attr({
				style: '',
			});
		});
		for (index in elementInputs) {
			// statement
			elementInputs[index].keyup(function(event) {
				/* Act on the event */
				if(elementInputs[index].val()!=='') {
					elementInputs[index].css({
						'box-shadow': '1px 1px 2px , 0 0 25px green, 0 0 5px green',
					});
				}
			});
		}
		$("#register").submit(function(event) {

		
		for (index in elementInputs) {
			// statement
			console.log(elementInputs[index].val());
			if(elementInputs[index].val()==='') {
				elementInputs[index].css({
					'box-shadow': '1px 1px 2px , 0 0 25px red, 0 0 5px red',
				});
				elementInputs[index].next().removeAttr('hidden');
				elementInputs[index].next().css( "color", "red" );
			} else {
				elementInputs[index].css({
					'box-shadow': '1px 1px 2px , 0 0 25px green, 0 0 5px green',
				});
			}
		}

		for (index in elementCheckboxs) {
			// statement
			if (!elementCheckboxs[index].is(':checked')) {
				elementCheckboxs[index].css({
					'box-shadow': '1px 1px 2px , 0 0 25px red, 0 0 5px red',
				});
			}
		}
		event.preventDefault();
	});
});

