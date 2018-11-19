/**
 * 
 */

$(function() {
	"use strict";
	console.log('called function');
	$('#btn_submit').click(submitFeedback);
	
	var fname;
	var lname;
	var country;
	var state;
	var zip;
	var email;
	var phone;
	var feedbackText;
	let valid = true;

	function submitFeedback(event) {
		console.log('called inside submit feedback'); 
		
		fname = $('#firstName').val();
		lname = $('#lastName').val();
		country = $('#country').val();
		state = $('#state').val();
		zip = $('#zip').val();
		email = $('#email').val();
		phone = $('#phone').val();
		feedbackText = $('#feedback').val();
		
		//test data validity
		valid = checkData(event);
		
		if(!valid) {
			event.preventDefault();
			return;
		}

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
		// $.get('contact');
		
		$.post('contact', {feedback : JSON.stringify(feedback)}) 
				.done(processData, "json")  //json is the argument to the processData function
				.fail(function() {
					$("#response p")
					.text("Error during submission !")
					.css({"color":"red", "margin":"30px"});
				})
				.always(function() {
					setTimeout(function(){
						$("#response p")
						.text("");
					}, 4000);
				});
	}

	function processData(data) {
		//reset the fields
		$('input[type="text"],textarea').val('');
		
		console.log(data);	
//		$('#response').append($("<p>", {
//			"text" : "Submission Successful !!",
//			"css" : {
//				"color":"green",
//				"font-family":"monospace",
//				"margin": "30px"
//			}
//		}));
		$("#response p").text("Submission Successful !!").css({"color":"green", "margin":"30px"});	
	}

	function checkData(event) {
		if (fname == "" || lname == "" || country == "" || state == "" || email == "" || phone == "" || feedbackText == "") {
			
			$("#response p")
			.text("Error: Please check your inputs and submit again !")
			.css({"color":"red", "margin":"30px"});
			
			return false;
		}
		return true;
	}
})
