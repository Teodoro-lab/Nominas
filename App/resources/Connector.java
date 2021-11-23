package App.resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Properties;

public class Connector {
    /*"jdbc:mariadb://localhost:3306/test?user=App&password=" + Connector.password();*/
    private Connection conn = null;
    /*private String DBurl;*/
    private Properties DBurl = new Properties();
    private Properties DBCredentials = new Properties();

    private static final Connector connector = new Connector();

    private Connector() {
    }

    public static String password(String password){
        byte[] Bytes = Base64.getDecoder().decode(password);
        return new String(Bytes);
    }

    public static Connector getConnector() {
        return Connector.connector;
    }

    public void connect() {

        try {
            String DBUrl;
            getPropertiesDBurl("DBurl.properties");
            getPropertiesCredentials("DBCredentials.properties");
            DBUrl = getDBurlStringConnection(this.DBurl);
            this.conn = DriverManager.getConnection(DBUrl, DBCredentials);
            System.out.println("Success Connection \n");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void close(){
        try {
            this.conn.close();
            System.out.println("Closed connection \n");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void getPropertiesDBurl(String dbProperties){
        try{
            InputStream inputStream = new FileInputStream(dbProperties);
            this.DBurl.load(inputStream);
        } catch (IOException ioexc){
            ioexc.printStackTrace();
        }
    }

    private void getPropertiesCredentials(String dbCredentialsProperties){
        try{
            InputStream inputStream = new FileInputStream("DBCredentials.properties");
            this.DBCredentials.load(inputStream);
        } catch (IOException ex){
            ex.printStackTrace();
        }

    }

    private String getDBurlStringConnection(Properties DBurl){
       String urlStringConnection;
        urlStringConnection =
                DBurl.get("db.connector") + ":" +
                DBurl.get("db.dbms") + "://" +
                DBurl.get("db.serverName") + ":" +
                DBurl.get("db.portNumber") + "/" +
                DBurl.get("db.dbName");
        return urlStringConnection;
    }

    public Connection getConnection(){
        return this.conn;
    }

}