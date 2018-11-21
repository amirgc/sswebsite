/**
 * 
 */

$(function() {
	"use strict";
	console.log('called function');
	$('#btn_submit').click(submitFeedback);

	$("input[type='text'], textarea").click(function() {
		$("#response p").text("");
	});

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

		// test data validity
		valid = checkData(event);

		if (!valid) {
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

		$.post('contact', {
			feedback : JSON.stringify(feedback)
		}).done(processData, "json") // putting "json" here tells the called
		// function that data we are passing is
		// json data so it doesnot need to do
		// JSON.stringfy() inside it. By default
		// it is text data
		.fail(function() {
			$("#response p").text("Error during submission !").css({
				"color" : "red",
				"margin" : "30px"
			});
		}).always(function() {
			setTimeout(function() {
				$("#response p").text("");
			}, 4000);
		});

	}

	function processData(data) {
		// reset the fields
		$('input[type="text"],textarea').val('');

		console.log(data);
		// $('#response').append($("<p>", {
		// "text" : "Submission Successful !!",
		// "css" : {
		// "color":"green",
		// "font-family":"monospace",
		// "margin": "30px"
		// }
		// }));
		$("#response p").text("Submission Successful !!").css({
			"color" : "green",
			"margin" : "30px"
		});
	}

	function checkData(event) {
		if (fname == "" || lname == "" || country == "" || state == ""
				|| email == "" || phone == "" || feedbackText == "") {

			$("#response p").text(
					"Error: Please check your inputs and submit again !").css({
				"color" : "red",
				"margin" : "30px"
			});

			return false;
		}
		return true;
	}

	function createSlick() {
		$(".slider")
				.not('.slick-initialized')
				.slick(
						{
							dots : true,
							infinite : true,
							slidesToShow : 1,
							slidesToScroll : 1,
							arrows : true,
							prevArrow : "<i class='fa fa-angle-left main_home nextprevleft' style='font-size:48px;color:white'></i>",
							nextArrow : "<i class='fa fa-angle-right main_home nextprevright' style='font-size:48px;color:white'></i>",
							autoplay : true,
							autoplaySpeed : 2000
						});

	}

	createSlick();

	// Now it will not throw error, even if called multiple times.
	$(window).on('resize', createSlick);

	$("#login-form").submit(function(e) {
		let userName = $("#username").val();
		let password = $("#password").val();

		var loginData = {
			userName : userName,
			password : password
		}

		console.log(loginData);

		// console.log($("#login-form").serialize())
		// var data = $("#login-form").serialize().split("&");
		// console.log(data);
		// var loginData = {};
		// for ( var key in data) {
		// console.log(data[key]);
		// loginData[data[key].split("=")[0]] = data[key].split("=")[1];
		// }
		//
		// console.log(loginData);
		$.post('login', {
			loginData : JSON.stringify(loginData)
		}).done(location.reload());

		e.preventDefault();

	});

	$('#sidebarCollapse').on('click', function() {
		$('#sidebar').toggleClass('active');
	});

	$("#logoutLink").on('click', function(e) {
		$.post("admin").done(location.reload());
		e.preventDefault();
	});

})
