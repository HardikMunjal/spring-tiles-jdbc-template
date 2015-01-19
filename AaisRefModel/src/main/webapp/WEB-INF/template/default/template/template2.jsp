<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Default tiles template</title>
    <style type="text/css">
    body {
        margin:0px;
        padding:0px;
        height:100%;
        overflow:hidden;
    }
 
    .page {
        min-height:100%;
        position:relative;
    }
    
     
    .header {
        padding:10px;
        width:100%;
        text-align:center;
    }
    
    .search {
        padding:30px;
        width:50%;
        text-align:right;
    }
     
    .content {
            padding:10px;
            padding-bottom:20px; /* Height of the footer element */
            overflow:hidden;
    }
    
     
    .menu {
        padding:50px 10px 0px 10px;
        width:200px;
        float:left;
    }
     .show {
        padding:150px 10px 0px 50;
        width:50px;
        float:right;
    }
      .list {
        padding:50px 10px 0px 10px;
        width:50px;
        float:left;
    }
       .body {
        margin:50px 10px 0px 200px;
    }
     
    .footer {
        clear:both;
        position:absolute;
        bottom:0;
        left:0;
        text-align:center;
        width:100%;
        height:20px;
    }
     
    </style>
 
    
</head>
<body>

    <div class="page">
        <tiles:insertAttribute name="header" />
        
        <tiles:insertAttribute name="search"/>
        
        <div class="content">
            <tiles:insertAttribute name="menu" />
            <tiles:insertAttribute name="body" />
             <tiles:insertAttribute name="show" />
            <tiles:insertAttribute name="list" />
         </div>
        <tiles:insertAttribute name="footer" />
      </div>

</body>
</html>