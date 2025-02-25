package com.java.webapp.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnUtils_JTDS {

	 // Connect to SQLServer
    // (Using JDBC Driver of JTDS library)
    public static Connection getSQLServerConnection_JTDS() //
            throws SQLException, ClassNotFoundException {
 
        // Note: Change the connection parameters accordingly.
        String hostName = "localhost";
        String sqlInstanceName = "SQLEXPRESS";
        String database = "mytest";
        String userName = "sa";
        String password = "12345";
 
        return getSQLServerConnection_JTDS(hostName, sqlInstanceName, database, userName, password);
    }
 
    // Connect to SQLServer, using JTDS library
    private static Connection getSQLServerConnection_JTDS(String hostName, //
            String sqlInstanceName, String database, String userName, String password)
            throws ClassNotFoundException, SQLException {
 
        Class.forName("net.sourceforge.jtds.jdbc.Driver");
 
        // Example:
        // jdbc:jtds:sqlserver://localhost:1433/simplehr;instance=SQLEXPRESS
        String connectionURL = "jdbc:jtds:sqlserver://" + hostName + ":1433/" //
                + database + ";instance=" + sqlInstanceName;
 
        Connection conn = DriverManager.getConnection(connectionURL, userName, password);
        return conn;
    }
}
