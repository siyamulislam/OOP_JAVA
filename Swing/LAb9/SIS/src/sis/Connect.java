package sis;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Administrator
 */
public class Connect {

    /**
     * @param args the command line arguments
     */
    Connection con;

    public Connect() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(e);

        }

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sis","root","root");

        } catch (Exception e) {
            System.err.println(e);

        }

    }

    Connection obtainConnection() {
        return con;
    }
}
