package main.java.com.application.util;

import java.sql.*;

import static main.java.com.application.util.ServiceConstants.*;

public class DBUtil {

    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName(DRIVER).newInstance(); // creating an object..
            connection = DriverManager.getConnection(DB_URL+DB_NAME, USERNAME, PASSWORD); // establish connection
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
       return connection;
    }


    public static void closeConnection(Connection connection){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void closeResultSet(ResultSet resultSet){
        if(resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public static void closeStatement(Statement statement){
        if(statement != null){
            try {
                statement.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
