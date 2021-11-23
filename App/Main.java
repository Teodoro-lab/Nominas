package App;

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

        /*Empleado empleado = new Administrador("María", 43);
        EmpleadoController.addEmpleado(empleado);*/




        /*Connector db = Connector.getConnector();
        db.connect();
        Connection con = db.getConnection();
        Statement stmt = con.createStatement();

        String query = "SELECT * FROM EMPLOYEES";
        ResultSet result = stmt.executeQuery(query);*/

        NominaDBCRUD nomina = new NominaDBCRUD();
        ResultSet result = nomina.consultTable("employees");

        String nombre;
        String apellido;
        int salario;
        int horasLaboradas;
        int level;

        while(result.next())
        {
            nombre = result.getString("nombre");
            apellido = result.getString("apellido");
            salario = result.getInt("salario");
            horasLaboradas = result.getInt("horasLaboradas");
            level = result.getInt("level");
            System.out.println( nombre + "\t" + apellido + "\t" + salario + "\t" + horasLaboradas + "\t" + level);
        }

        Connector.getConnector().close();







        /*EmpleadosDB.add(new Administrador("María", 43));
        EmpleadosDB.add(new Jornalero("Juan", 17, 2));
        EmpleadosDB.add(new Jornalero("Jacinto", 32, 3));
        EmpleadosDB.add(new Administrador("Samuel", 52));
        EmpleadosDB.add(new Jornalero("Johnson", 67, 5));
        EmpleadosDB.add(new Administrador("Adam", 90));
        EmpleadosDB.add(new Administrador("Adaly", 230));
        EmpleadosDB.add(new Administrador("Francis", 40));
        EmpleadosDB.add(new Jornalero("Guillermo", 23, 10));

        for (int index = 0; index < EmpleadosDB.getUsedRegistros(); index++) {
            EmpleadosDB.get(index).calcularSalario((int)(Math.random()*6+1) , (int)(Math.random()*6+1));
        }

        //-------------  Empleados  ------------------
        System.out.println(
                "Nomina total: " + Nominas.calculate(new NominaEmpleados()) + "\n" +
                "Numero de laboradas (Empleados): " + Nominas.calculate(new HorasLaboradasEmpleados()) + "\n" +
                "Total empleados: " + EmpleadosDB.getUsedRegistros() + "\n"
        );

        //-------------  Jornaleros  ------------------
        System.out.println(
                "Nomina total  (jornaleros): " + Nominas.calculate(new NominaJornaleros()) + "\n" +
                "Horas laboradas (jornaleros): " + Nominas.calculate(new HorasLaboradasJornaleros()) + "\n" +
                "Total Jornaleros: " +  Jornalero.getNumeroInstancias() + "\n"
        );

        //-------------  Administradores  ------------------
        System.out.println(
                "Nomina total (Administratores): " + Nominas.calculate(new NominaAdministradores()) + "\n" +
                "Horas laboradas (Administradores): " + Nominas.calculate(new HorasLaboradasAdministradores()) + "\n" +
                "Total Administradores: " + Administrador.getNumeroInstancias() + "\n"
        );


        Arrays.sort(EmpleadosDB.empleados, 0, EmpleadosDB.getUsedRegistros());
        EmpleadosDB.delete(0);
        EmpleadosDB.delete(0);
        EmpleadosDB.show();

        System.out.println("---------- MY SORT -------------\n");
        EmpleadosDB.BubbleSort(true);
        EmpleadosDB.show();*/

    }
}