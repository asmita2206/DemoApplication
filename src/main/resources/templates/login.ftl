
<#import "/spring.ftl" as spring/>
<html lang="en">
          <head>
              <meta charset="UTF-8">
              <title>Spring Boot Login Form Submission</title>
              <link href="/main.css" rel="stylesheet">


          </head>

   <body>
          <form action="details" method="post" >
          <div class="container">
            <h1>Login</h1>
            <p>Please sign_in to your account.</p>
            <hr>
           <label for="userName"><b>UserName</b></label>
            <input type="text" placeholder="Enter UserName" name="userName" id="userName" required>

            <label for="password"><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="password" id="password" required>

            <hr>


             <div class="signin">
             <input type="submit"  class="signin" value="Login" />
             </div>
             <div class="sign">
             <p>New User? <a href="register">Create an account </a>.</p>
             </div>

             </div>
             </form>


   </body>

</html>