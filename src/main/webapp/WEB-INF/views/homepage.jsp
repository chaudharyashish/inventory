<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Search For Nursery</title>

    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${contextPath}/resources/css/common.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    <script src="${contextPath}/resources/js/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
	<script src="${contextPath}/resources/js/home.js"></script>
</head>

<body>

<div id="main" class="container">
    <div class="searchDiv">
<!--     	Product Name: &nbsp; <input id="productName" /> &nbsp; -->
    	<input name="productName" id="productName" type="text" class="form-control" placeholder="Product Name"/>
    	<input type="hidden">&nbsp;</input>
    	<input type="button" class="btn btn-lg btn-primary btn-block" value="SEARCH" onclick="searchNurseries()" />
    </div>
    <hr/>
    <div id="resultDiv">
    	<table class="result-table">
    		<tr>
    			<th> ID </th>
    			<th> Product </th>
    			<th> Nursery </th>
    			<th> Cost </th>
    			<th> Select </th>
    		</tr>
    		<c:forEach items="${products}" var="product" varStatus="loopStatus">
    			<c:forEach items="${product.nurseries}" var="nursery">
	    		<tr>
	    			<td> ${product.id} </td>
	    			<td> ${product.productName} </td>
	    			<td> ${nursery.nurseryName} </td>
	    			<td> ${nursery.price} </td>
	    			<td align="center"> <input type="radio" name="product" onclick='fillData(${product.id},"${product.productName}",${nursery.id},"${nursery.nurseryName}", ${nursery.price})' /> </td>
    			</tr>
    			</c:forEach>
    		</c:forEach>
    	</table>
    </div>
    <hr/>
    <div>
    	<form:form commandName="purchaseData" method="POST" action="${contextPath}/purchase" class="form-signin">
    		<input name="nurseryName" id="nurName" type="text" class="form-control" placeholder="Nursery" readonly="readonly"/>
    		<input type="hidden" id="nursery" name="nursery" />
    		<input name="productName" id="prodName" type="text" class="form-control" placeholder="Product" readonly="readonly"/>
    		<input type="hidden" id="product" name="product" />
    		<input name="quantity" id="quantity" type="text" class="form-control" placeholder="Quantity" autofocus="true" onchange="calculatePrice()"/>
    		<input name="totalPrice" id="totalPrice" type="text" class="form-control" placeholder="Total Price"/>
    		<input name="totalPricePaid" id="totalPricePaid" type="text" class="form-control" placeholder="Total Price Paid"/>
    		<button class="btn btn-lg btn-primary btn-block" type="submit">Save</button>
    	</form:form>
    	<c:if test="${status}">
    		Saved Successfully.
    	</c:if>
    </div>
</div>


</body>
</html>
