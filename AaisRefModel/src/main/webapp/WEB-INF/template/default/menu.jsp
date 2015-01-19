<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<div class="menu">
Menu
    <ul>
        <li>
            <spring:url value="/home" var="homeUrl" htmlEscape="true"/>
            <a href="${homeUrl}">Home</a>
        </li>
        <li>
            <spring:url value="/about" var="aboutUrl" htmlEscape="true"/>
            <a href="${aboutUrl}">About</a>
        </li>
        <li>
            <spring:url value="/register" var="registerUrl" htmlEscape="true"/>
            <a href="${registerUrl}">Add New Table</a>
        </li>
        <li>
            <spring:url value="/login" var="loginUrl" htmlEscape="true"/>
            <a href="${loginUrl}">Login</a>
            
        </li>
        <li>
            <spring:url value="/hotels/main" var="MyHotelsUrl" htmlEscape="true"/>
            <a href="${MyHotelsUrl}">Meta Table</a>
            
        </li>
        
    </ul>
</div>