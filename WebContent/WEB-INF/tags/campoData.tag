<%@ attribute name="id" required="true"%>
<input type="text" id="${id}" name="${id}" />
<script>
	$(function() {
		$("#${id}").datepicker({
			dateFormat : 'dd/mm/yy'
		});
		console.log("rodei");
		<% System.out.print("rodei");%>
	});
</script>