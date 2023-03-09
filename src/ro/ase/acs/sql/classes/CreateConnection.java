package ro.ase.acs.sql.classes;

import ro.ase.acs.sql.interfaces.DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection implements DbConnection {
    @Override
    public Connection createConnection() {
            Connection databaseConnection = null;
            try {
                Class.forName("org.sqlite.JDBC");
                databaseConnection = DriverManager.getConnection("jdbc:sqlite:database.db");
                databaseConnection.setAutoCommit(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return databaseConnection;
    }
}
