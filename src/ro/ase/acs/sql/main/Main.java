package ro.ase.acs.sql.main;

import ro.ase.acs.sql.classes.CreateConnection;
import ro.ase.acs.sql.classes.CreateTable;
import ro.ase.acs.sql.classes.InsertData;
import ro.ase.acs.sql.classes.ReadData;
import ro.ase.acs.sql.interfaces.DataInsert;
import ro.ase.acs.sql.interfaces.DataReader;
import ro.ase.acs.sql.interfaces.DbConnection;
import ro.ase.acs.sql.interfaces.TableCreate;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
    try {
        DbConnection dbConnection=new CreateConnection();
        Connection connection= dbConnection.createConnection();

        TableCreate tableCreate=new CreateTable();
        tableCreate.createTable(connection);

        DataInsert dataInsert=new InsertData();
        dataInsert.insertData(connection);

        DataReader dataReader=new ReadData();
        dataReader.readData(connection);
    }catch (Exception ex){
        ex.printStackTrace();
    }
    }
}