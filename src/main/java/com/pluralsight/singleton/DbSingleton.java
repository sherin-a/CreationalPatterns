package com.pluralsight.singleton;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbSingleton {
//    volatile makes it thread safe
    private static volatile DbSingleton instance = null;
//    private static volatile Connection conn = null;

    private DbSingleton(){

//        DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
//        if(conn != null){
//            throw new RuntimeException("Use getConnection() to create");
//        }
        //prevents reflection classes from instantiating this class
        if(instance != null){
            throw new RuntimeException("Use getInstance() to create.");
        }
    }

    public static DbSingleton getInstance(){
        //lazily loaded
        if(instance == null) {
            synchronized (DbSingleton.class) {
                if(instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }
}
