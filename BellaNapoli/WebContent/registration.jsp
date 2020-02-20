<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	
	 <link rel="stylesheet" href="css/registrazione.css">

<meta charset="ISO-8859-1">
<title>Registrati</title>
</head>
<body>

<div class="login-wrap">
    <div class="login-html">
        
        <input id="tab-2" type="radio" name="tab" class="sign-up" checked><label for="tab-2" class="tab">Registrati</label>
        <div class="login-form">
            <div class="sign-up-htm">
           <form action="RegistrazioneUtente" method="post" >
                <div class="group">
                    <label for="user" class="label">Username</label>
                    <input id="user" name="user" type="text" class="input" required>
                </div>
                <div class="group">
                    <label for="pass" class="label">Password</label>
                    <input id="pass" name="pass" type="password" class="input" data-type="password" required>
                </div>
                <div class="group">
                    <label for="passr" class="label">Repeat Password</label>
                    <input id="passr" name="passr" type="password" class="input" data-type="password" required>
                </div>
                <div class="group">
                    <label for="email" class="label">Email</label>
                    <input id="email" name="email" type="text" class="input" required>
                </div>
                <div class="group">
                    <label for="nome" class="label">Nome</label>
                    <input id="nome" name="nome" type="text" class="input" required>
                </div>
                <div class="group">
                    <label for="cognome" class="label">Cognome</label>
                    <input id="cognome" name="cognome" type="text" class="input" required>
                </div>
                <div class="group">
                    <label for="data" class="label">Data</label>
                    <input id="data" name="data" type="date" class="input" required>
                </div>
                <div class="group">
                    <input type="submit" class="button" value="Sign Up">
                </div>
               </form>
                <div class="hr"></div>
                
            </div>
        </div>
    </div>
</div>



</body>
</html>