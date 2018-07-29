<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
<title>Select Lottery Number</title>
</head>
<body>
	<form:form modelAttribute="userForm" method="POST" actio="selectLotteryNumbers">
	<div>
		<h3>Filters</h3>
		<input type="text" id="startingNumber" placeholder="Starting Number" />
		<input type="text" id="endingNumber" placeholder="Ending Number" />
		<input type="button" onclick="filterlottery()" />
		<hr/>
		<hr/>
		<form:checkboxes id="lotteries" items="lotteryList" path="selectedLotteries"></form:checkboxes>
		
	</div>
	<input type="submit">
	</form:form>
</body>

<script type="text/javascript">
	function filterlottery() {
		var startingNumber = $("#startingNumber").val();
		var endingNumber = $("#endingNumber").val();
		var data = {start:startingNumber, end:endingNumber};
		 $.get("filterLotteryNumbers",{data:data}, function(data, status){
		        console.log("Data: " + data + "\nStatus: " + status);
		        $("#lotteries").html(data);
		    });
	}
</script>
</html>