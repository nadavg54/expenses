package com.myExpenses.expenses;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan(basePackageClasses = IExpensesController.class)
public class MyExpensesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyExpensesApplication.class, args);
	}
}
