<%@ page import="com.example.WebTest.Template"%>
<%@ page import="java.util.*"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">   

    <title>Users </title>
<script>
    function updateOperation()
    {
        window.alert('Successfully updated records');
    }
</script>
</head>
<body>
    <center><h1>The users currently registered in the system </h1>
    <div id="usertable">
       <table border="1">
        <tr>
            <th>ID</th>
            <th>username</th>
            <th>password</th>
            <th>gender</th>
            <th>Date registered</th>
        </tr>
            <tr> 
                <%
            for(Map<String,Object> list:Template.readUserData())
            {
                %>
                <td>
                    <%=list.get("ID").toString()
                    %>
                </td>
                <td>
                    <%=list.get("username").toString()
                    %>
                </td>
                <td>
                    <%=list.get("password").toString()
                    %>
                </td>
                <td>
                    <%=list.get("gender").toString()
                    %>
                </td>
                <td>
                    <%=list.get("date_registered").toString()
                    %>
                </td>
            </tr> 
          <% } %>
       </table>
    </div>
<h1>Update user records</h1>
<form autocomplete="on" method="post" >
    <fieldset>
    <legend> Update records</legend>
    <label for="idname">
    ID:
    </label>
    <br>
    <input type="text" id="ID" name ="ID"><br>
    <label for="uname">
    Username:
    </label>
    <br>
    <input type="text" id="name" name ="name" required><br>
    
    <label for="pass">
    Password:
    </label>
    <br>
    <input type="password" id="password" name ="password"><br>
     <br>
     <br>
     <input type="submit" onclick="updateOperation()"><br>
    </fieldset>
    </form>
</center>
<form autocomplete="on" method="post" >
    <fieldset>
    <legend> Delete user records</legend>
    <label for="idname">
    ID:
    </label>
    <br>
    <input type="text" id="ID" name ="ID">
    <br>
    <br>
    <input type="submit" onclick="window.alert('Successfully deleted')"><br>
    </fieldset>
    </form>
</body>
</html>