


<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
 <%@ taglib
    prefix="c"
    uri="http://java.sun.com/jsp/jstl/core" %>
<tiles:insertDefinition name="Template1">

    <tiles:putAttribute name="body">
 
 
 
        <div class="body">
        
        <script
   src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
 <script type="text/javascript">
   function fillstates() {
     var val = $('#dropdown').val();
     $.ajax({
       url : '/result',
       method : 'get',
       ContentType : 'json',
       data : {
         dropdown : val
       },
       success : function(response) {
         var options = '';
         if (response != null) {
           $(response).each(function(index, value) {
 
             options = options + '<option>' + value + '</option>';
           });
           $('#states').html(options);
         }
       }
     });
   }
 </script>
        
        <form name="myForm" action="/hardi/result" method="post" >
        
		<h3>Hello Spring CRUD</h3>
		
		<h4>
			<h4>
				<c:if test="${not empty students}">
					<table class="table stripped">
					<tr>
					
					<th>NAME</th>
					
					
					
					</tr>
					<tr>
						<select id="dropdown" name="dropdown" onchange="fillstates();">
    <c:forEach var="item" items="${students}">
        <option value="<c:out value='${item.tableName}' />"
            <c:if test="${param.selectValue == item})"> selected </c:if>  >
            <c:out value="${item.tableName}" />
        </option>
    </c:forEach>
</select>

</tr>						
						
					<h4>
			<h4>
				<c:if test="${not empty students}">
					<table class="table stripped">
					<tr>
					
					<th>NAME</th>
					
					
					
					</tr>
					<tr><td>this is from ajax</td>
						<select id="states">
    </tr>

</th>			
					
					<tr>
						<select id="dropdown">
    <c:forEach var="item" items="${students}">
        <option value="<c:out value='${item.tableColumns}' />"
            <c:if test="${param.selectValue == item})"> selected </c:if>  >
            <c:out value="${item.tableColumns}" />
        </option>
    </c:forEach>
</select>

</tr>						
						
						
						
						
						
					</table>
				</c:if>	
						
						
						
					</table>
				</c:if>
				
				<INPUT TYPE="SUBMIT" NAME="submit" VALUE="Button 1">
				 </form>
	</div>
 

 
    </tiles:putAttribute>
</tiles:insertDefinition>