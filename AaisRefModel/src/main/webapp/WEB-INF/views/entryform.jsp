 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ page session="false"%>
 <html>
 <head>
 <title>Get States By Counties</title>
 <script
   src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
 <script type="text/javascript">
   function fillstates() {
     var val = $('#country').val();
     $.ajax({
       url : 'getstates',
       method : 'get',
       ContentType : 'json',
       data : {
         country : val
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
 </head>
 <body>
   <h1>Change countries Dropdown</h1>
 
   <select id="country" onchange="fillstates();">
     <c:forEach items="${countrylist}" var="item">
       <option>${item}</option>
     </c:forEach>
   </select>
 
   <select id="states"></select>
    <c:forEach items="${statelist}" var="item">
       <option>${item}</option>
     </c:forEach>
   </select>
 
 </body>
 </html>