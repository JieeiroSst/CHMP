package com.CHMP.Database;

import com.CHMP.AppConfig.DatabaseConnector;

public class MongoDbConnector extends DatabaseConnector{
    @Override
    public void connect() {
        System.out.println("conection"+getUrl());
    }
}
