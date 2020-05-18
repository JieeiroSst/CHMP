package com.CHMP;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.CHMP.AppConfig.DatabaseConnector;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ChmpApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(ChmpApplication.class, args);

		DatabaseConnector mysql=(DatabaseConnector) context.getBean("mysqlConnector");
		mysql.connect();

		DatabaseConnector mongodb=(DatabaseConnector) context.getBean("mongodbConnector");
		mongodb.connect();

		DatabaseConnector postgreDB=(DatabaseConnector) context.getBean("postgresqlConnector");
		postgreDB.connect();

	}

}
