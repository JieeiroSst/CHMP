package com.CHMP.AppConfig;

import ch.qos.logback.core.db.dialect.MySQLDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.CHMP.Database.MySqlConnector;
import com.CHMP.Database.MongoDbConnector;
import com.CHMP.Database.PostgreSqlConnector;

@Configuration
public class AppConfig {
    @Bean("mysqlConnector")
    DatabaseConnector mysqlConfigure(){
        DatabaseConnector mysqlConnector= new MySqlConnector();
        mysqlConnector.setUrl("jdbc:mysql://localhost:3306/CHMP?useSSL=false");
        mysqlConnector.setUsername("root");
        mysqlConnector.setPassword("manhquan");
        mysqlConnector.setDriver_class_name("com.mysql.jdbc.Driver");
        return mysqlConnector;
    }
    @Bean("mongodbConnector")
    DatabaseConnector mongodbConfigure() {
        DatabaseConnector mongoDbConnector=new MongoDbConnector();
        mongoDbConnector.setUrl("mongodb://mongodb0.example.com:27017/CHMP");
        mongoDbConnector.setUsername("root");
        mongoDbConnector.setPassword("manhquan");
        mongoDbConnector.setDriver_class_name("mongodb.jdbc.MongoDriver");
        return mongoDbConnector;
    }

    @Bean("postgresqlConnector")
    DatabaseConnector postgresqlConfigure() {
        DatabaseConnector postgreSqlConnector = new PostgreSqlConnector();
        postgreSqlConnector.setUrl("postgresql://localhost/CHMP");
        postgreSqlConnector.setUsername("root");
        postgreSqlConnector.setPassword("manhquan");
        postgreSqlConnector.setDriver_class_name("org.postgresql.Driver");
        return postgreSqlConnector;
    }
}
