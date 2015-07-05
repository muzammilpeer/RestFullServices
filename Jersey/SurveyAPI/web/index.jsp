<%--
  Created by IntelliJ IDEA.
  User: muzammilpeer
  Date: 05/07/15
  Time: 3:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h1>File Upload with Jersey</h1>

<form action="api/file/upload" method="post" enctype="multipart/form-data">

  <p>
    Select a file : <input type="file" name="file" size="45" />
  </p>

  <input type="submit" value="Upload It" />
</form>

</body>
</html>