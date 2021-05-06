package com.CHMP.AppConfig;

public abstract class DatabaseConnector {
    private String url;
    private String username;
    private String password;
    private String driver_class_name;

    public abstract void connect();

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDriver_class_name() {
        return driver_class_name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDriver_class_name(String driver_class_name) {
        this.driver_class_name = driver_class_name;
    }
}