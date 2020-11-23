package com.springboot.springsecurityapp;

import com.springboot.springsecurityapp.model.LoginModel;
import com.springboot.springsecurityapp.model.PersonalDetailsModel;
import com.springboot.springsecurityapp.model.TransactionDetailsModel;
import com.springboot.springsecurityapp.repository.LoginRepo;
import com.springboot.springsecurityapp.repository.PersonalDetailsRepo;
import com.springboot.springsecurityapp.repository.TransactionDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = LoginRepo.class)

public class SpringsecurityappApplication implements CommandLineRunner{

	@Autowired
	LoginRepo loginRepo;

	@Autowired
	PersonalDetailsRepo personalDetailsRepo;

	@Autowired
	TransactionDetailsRepo transactionDetailsRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityappApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		/*loginRepo.deleteAllInBatch();
		personalDetailsRepo.deleteAllInBatch();*/

		LoginModel loginModel=new LoginModel("asmita","1@32$");

		PersonalDetailsModel detailsModel=new PersonalDetailsModel("asmi","123","100","asmita");

		TransactionDetailsModel transactionDetailsModel=new TransactionDetailsModel("123","341","transaction from pune","2020-06-01");

		/*loginModel.setDetails(detailsModel);

		detailsModel.setLoginModel(loginModel);
*/
		/*loginRepo.save(loginModel);
		personalDetailsRepo.save(detailsModel)*/;

		//transactionDetailsRepo.save(transactionDetailsModel);



	}
}
