/**
 * 
 */

$(function(){
	$('#btn_submit').click(submitFeedback);
	
	function submitFeedback(){
		var fname = $('#validationDefault01').val();
		var lname = $('#validationDefault02').val();
		var country = $('#validationDefault03').val();
		var state = $('#validationDefault04').val();
		var zip = $('#validationDefault05').val();
		var email = $('#validationDefaultEmail').val();
		var phone = $('#validationDefaultPhone').val();
		var feedbackText = $('#validationDefaultFeedback').val();
		var feedback = {fname:fname, lname:lname, country:country, state:state,
						zip:zip, email:email, phone:phone, feedbackText:feedbackText};
		
		$.post('contact',{feedback: JSON.stringify(feedback)}, processData, "json")
		
		
//		var productName = $('#product_name').val();
//		var productPrice = $('#product_price').val();
//		var product = {name:productName, price:productPrice};
//		$.post('product',{product: JSON.stringify(product)}, processData, "json")
	}

	function processData(data){
		//data = JSON.parse(data);
//		var td0=$('<td>').text(data.id);
//		var td1 = $('<td>').text(data.name);
//		var td2 = $('<td>').text(data.price);
//		var tr = $('<tr>').append(td0).append(td1).append(td2);
//		$('#tbl_products>tbody').append(tr);
		
		$('#myTxt').append($('<p>'.text(data.fname).css("background-color","blue")));
	}
})
