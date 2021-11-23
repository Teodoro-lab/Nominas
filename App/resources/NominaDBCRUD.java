package App.resources;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NominaDBCRUD {
    Connector db;
    String query;

    public NominaDBCRUD(){
    }

    public ResultSet consultTable(String tableName){
        ResultSet resultSet = null;
        try{
            db = Connector.getConnector();
            db.connect();
            Connection con = db.getConnection();
            Statement stmt = con.createStatement();
            query =  "SELECT * FROM " + tableName;
            resultSet = stmt.executeQuery(query);
        } catch (SQLException sqlex){
            sqlex.printStackTrace();
        }
        return resultSet;
    }

}
