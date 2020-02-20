<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	
	<link rel="stylesheet" href="css/login.css">	
		
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<div class="login-wrap">
    <div class="login-html">
        
        <input id="tab-2" type="radio" name="tab" class="sign-up" checked><label for="tab-2" class="tab">Accedi</label>
        <div class="login-form">
            <div class="sign-up-htm">
           <form action="LoginUtente" method="post" >
                <div class="group">
                    <label for="user" class="label">Username</label>
                    <input id="user" type="text" class="input">
                </div>
                <div class="group">
                    <label for="pass" class="label">Password</label>
                    <input id="pass" type="password" class="input" data-type="password">
                </div>
                
                <div class="group">
                    <input type="submit" class="button" value="Accedi">
                </div>
               </form>
                <div class="hr"></div>
                
            </div>
        </div>
    </div>
</div>



</body>
</html>