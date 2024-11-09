package com.vivek.springboot_transaction_mgmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringbootTransactionMgmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTransactionMgmtApplication.class, args);
	}

}
