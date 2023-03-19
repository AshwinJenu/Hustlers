package com.example.hustlers;

import android.annotation.SuppressLint;
import android.os.StrictMode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {
    String uname, pass, ip, port, database;

    @SuppressLint("NewApi")

    public Connection connectionclass() throws SQLException, ClassNotFoundException {

        ip = "SERVER IP";
        database = "DATABASE NAME";
        uname = "USERNAME";
        pass = "PASSWORD";
        port = "PORT";


        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection connection = null;
        String ConnectionURL = null;


        Class.forName("net.sourceforge.jtds.jdbc.Driver");
        ConnectionURL = "jdbc:jtds:sqlserver://" + ip + ":" + port + ";" + "databasename=" + database + ";user=" + uname + ";password=" + pass + ";";
        connection = DriverManager.getConnection(ConnectionURL);


        return connection;
    }
}
