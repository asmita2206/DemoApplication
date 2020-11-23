<#import "/spring.ftl" as spring/>
<html>
          <head>
              <meta charset="UTF-8">

         </head>
<body>
   <form action="login">
   password:<input id="password" name="password" value=${registrationModel.password}/>
   <button type="submit">Login</button>
   </form>

</body>
</html>