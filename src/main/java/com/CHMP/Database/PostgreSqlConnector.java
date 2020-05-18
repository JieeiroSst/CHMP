package com.CHMP.Database;

import com.CHMP.AppConfig.DatabaseConnector;

public class PostgreSqlConnector extends DatabaseConnector{
    @Override
    public void connect() {
        System.out.println("connection"+getUrl());
    }
}
