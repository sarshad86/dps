package main.structural.facade;

import java.sql.Connection;

/**
 * Created by Sara on 10/1/2017.
 */
public class MySqlHelper {

    public static Connection getMySqlDBConnection(){
        //get MySql DB connection using connection parameters
        return null;
    }
    public void generateMySqlPDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
    }
    public void generateMySqlHTMLReport(String tableName, Connection con){
        //get data from table and generate pdf report
    }

}
