<%--
  Created by IntelliJ IDEA.
  User: 曹令洋
  Date: 2019/11/18
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/com/js/jquery-3.3.1.min.js"></script>
</head>
<body>
<h1>index jsp</h1>

<input type="button" value="list" id="btnList"/>
<input type="button" value="insert" id="btnInsert"/>
<input type="button" value="insert2" id="btnInsert2"/>

<script>

    $(function () {
        $("#btnList").click(function () {
            $.ajax({
                url:"/list",
                type:"GET",
                success:function (data) {
                    console.log(data);
                    alert(data.username);
                }
            })
        })
    })
</script>
</body>
</html>
