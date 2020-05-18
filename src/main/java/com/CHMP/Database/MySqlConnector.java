package com.CHMP.Database;

import com.CHMP.AppConfig.DatabaseConnector;

public class MySqlConnector extends DatabaseConnector{
    @Override
    public void connect() {
        System.out.println("connection url"+getUrl());
    }
}
