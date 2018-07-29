function searchNurseries() {
	var productName = $("#productName").val();
	$.get('getNursery/'+productName, function(response){ 
		$("#main").html(response);
	});
}

var totalPrice;
function fillData(productId, productName, nurseryId, nurseryName, price) {
	$("#nursery").val(nurseryId);
	$("#nurName").val(nurseryName);
	totalPrice = price;
	$("#product").val(productId);
	$("#prodName").val(productName);
}

function calculatePrice() {
	var quan = $("#quantity").val();
	var totalP = quan * totalPrice;
	$("#totalPrice").val(totalP);
}