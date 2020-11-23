<#import "/spring.ftl" as spring/>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>


</head>
<body>
  <form action="login">
    <div class="table-responsive">
	    <table class="table table-striped table-bordered text-left">
	       <thead>
	       <tr>

				<th><h6>Name<h6></th>
				<th><h6>AccountNumber<h6></th>
				<th><h6>AccountBalance<h6></th>
				<th><h6>TransactionNumber<h6></th>
               	<th><h6>TransactionDescription<h6></th>
                <th><h6>TransactionDate<h6></th>

	    	</tr>

	     </thead>
	     <tbody>


                        ${personalDetails}

                       ${transactionDetails}

		 </tbody>
	 </table>
	</div>

	</form>
</body>
</html>