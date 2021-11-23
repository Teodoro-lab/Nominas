package App.resources;

import App.empleados.Empleado;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpleadoController {

    public static void addEmpleado(Empleado empleado){
        Connector connector = Connector.getConnector();
        connector.connect();
        Connection con = connector.getConnection();
        Statement stmt = null;


        String query = new StringBuilder().append("INSERT INTO `employees` (`ID`, `name`, `lastName`, `worked-hours`, `mail`)").append(String.format("VALUES ('%s', %s, '%f', %s)", empleado.getNombre(), "", empleado.getNumHorasTrabajadas(), "")).toString();
        try {
            stmt = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
