/**
 * 
 */

$(function() {
	console.log('called function');
	$('#btn_submit').click(submitFeedback);

	function submitFeedback() {
		console.log('called inside submit feedback');
		var fname = $('#firstName').val();
		var lname = $('#lastName').val();
		var country = $('#country').val();
		var state = $('#state').val();
		var zip = $('#zip').val();
		var email = $('#email').val();
		var phone = $('#phone').val();
		var feedbackText = $('#feedback').val();

		var feedback = {
			fname : fname,
			lname : lname,
			country : country,
			state : state,
			zip : zip,
			email : email,
			phone : phone,
			feedbackText : feedbackText
		};

		console.log(feedback);
		// $.get('contact');

		$.post('contact', {
			feedback : JSON.stringify(feedback)
		}, processData, "json")

		// var saveData = $.ajax({
		// type : 'POST',
		// url : "contact",
		// data : feedback,
		// dataType : "text",
		// success : function(resultData) {
		// alert("Save Complete")
		// }
		// });
		//
		// saveData.error(function() {
		// alert("Something went wrong");
		// });

		// var productName = $('#product_name').val();
		// var productPrice = $('#product_price').val();
		// var product = {name:productName, price:productPrice};
		// $.post('product',{product: JSON.stringify(product)}, processData,
		// "json")
	}

	function processData(data) {
		// data = JSON.parse(data);
		// var td0=$('<td>').text(data.id);
		// var td1 = $('<td>').text(data.name);
		// var td2 = $('<td>').text(data.price);
		// var tr = $('<tr>').append(td0).append(td1).append(td2);
		// $('#tbl_products>tbody').append(tr);
		console.log(data);

		// $('#myTxt').append($('<p>'.text(data.fname).css("background-color","blue")));
	}

	function createSlick() {

	}
	createSlick();
	$(window).on('resize', createSlick);

	$(window)
			.on(
					'load',
					function() {
						console.log("slick called")
						$(".hello_slid")
								.not('.slick-initialized')
								.slick(
										{
											dots : true,
											infinite : false,
											slidesToShow : 1,
											slidesToScroll : 1,
											arrows : true,											
											autoplay : true,
											autoplaySpeed : 2000
										});
					});

})
