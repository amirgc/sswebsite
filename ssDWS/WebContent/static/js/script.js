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
		
		//reset the fields
		$('input[type="text"],textarea').val('');

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
				.done(processData, "json");  //json is the argument to the processData function
	}

	function processData(data) {
		console.log(data);	
		$('#response').append($("<p>", {
			"text" : "Submission Successful !!",
			"css" : {
				"color":"green",
				"font-family":"monospace",
				"margin": "30px"
			}
		}));
//		$("<p>").text("Submission Successful !!").css("color","green").appendTo($("#response"));	
	}
})
