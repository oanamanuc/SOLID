package ro.ase.acs.sql.interfaces;

import ro.ase.acs.sql.classes.CreateConnection;

import java.sql.Connection;

public interface DbConnection {
    Connection createConnection();
}
