


<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
 <%@ taglib
    prefix="c"
    uri="http://java.sun.com/jsp/jstl/core" %>
<tiles:insertDefinition name="Template1">
    <tiles:putAttribute name="body">
 
 
 
        <div class="body">
        
        <form name="myForm" action="/result" method="post" >
        
		<h3>Hello Spring CRUD</h3>
		
		<h4>
			<h4>
				<c:if test="${not empty students}">
					<table class="table stripped">
					<tr>
					
					<th>NAME</th>
					
					
					
					</tr>
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
				
				<INPUT TYPE="SUBMIT" NAME="submit" VALUE="Button 1">
				 </form>
	</div>
 

 
    </tiles:putAttribute>
</tiles:insertDefinition>