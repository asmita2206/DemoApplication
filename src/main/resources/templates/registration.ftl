<#import "/spring.ftl" as spring/>
<html lang="en">
    <head>
             <meta name="viewport" content="width=device-width, initial-scale=1">
                 <title>Spring Boot Registration Form Submission</title>
                 <link href="/main.css" rel="stylesheet">
             </head>

      <body>
            <form action="password">
                 <div class="container">
                      <h1>Register</h1>
                      <p>Please fill in this form to create an account.</p>
                      <hr>

                        <label for="uName"><b>Name</b></label>
                        <input type="text" placeholder="Enter Your FullName" name="uName" id="uName" required>

                         <label for="emailId"><b>Email</b></label>
                         <input type="text" placeholder="Enter Email" name="emailId" id="emailId" required>

                         <label for="city"><b>City</b></label>
                         <input type="text" placeholder="Enter City" name="city" id="city" required>

                         <label for="userName"><b>UserName</b></label>
                         <input type="text" placeholder="Enter UserName" name="userName" id="userName" required>
                         <hr>


                           <div class="registerbtn">
                           <input type="submit"  class="registerbtn" value="Register" />
                          </div>

                        <div class="sign">
                         <p>Already have an account? <a href="login">Sign in</a>.</p>
                         </div>

                       </div>

                 </form>


      </body>

   </html>