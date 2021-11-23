package App;

import App.controllers.AdministradorController;
import App.empleados.Administrador;
import App.empleados.Empleado;
import App.empleados.Jornalero;
import App.resources.Connector;
import App.resources.EmpleadoController;
import App.resources.EmpleadosDB;
import App.resources.NominaDBCRUD;
import App.strategies.horasLaboradas.HorasLaboradasAdministradores;
import App.strategies.horasLaboradas.HorasLaboradasEmpleados;
import App.strategies.horasLaboradas.HorasLaboradasJornaleros;
import App.strategies.nominas.NominaAdministradores;
import App.strategies.nominas.NominaEmpleados;
import App.strategies.nominas.NominaJornaleros;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws SQLException {

/*
        NominaDBCRUD nomina = new NominaDBCRUD();
        ResultSet result = nomina.consultTable("employees");
*/

        String nombre;
        String apellido;
        int salario;
        int horasLaboradas;
        int level;

        AdministradorController adC = new AdministradorController();
        adC.recuperaDatosAdministradores();
        for (Empleado empleado: adC.getEmpleados()
             ) {
            System.out.println(empleado);
        }

       /* while(result.next())
        {
            nombre = result.getString("nombre");
            apellido = result.getString("apellido");
            salario = result.getInt("salario");
            horasLaboradas = result.getInt("horasLaboradas");
            level = result.getInt("level");
            System.out.println( nombre + "\t" + apellido + "\t" + salario + "\t" + horasLaboradas + "\t" + level);
        }*/

        /*Connector.getConnector().close();*/


    }
}