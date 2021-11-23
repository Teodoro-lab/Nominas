package App.controllers;

import App.empleados.Administrador;
import App.empleados.Empleado;
import App.resources.NominaDBCRUD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AdministradorController {
    NominaDBCRUD nominaDBCRUD;
    ArrayList<Empleado> empleados = new ArrayList<Empleado>();

    public AdministradorController(){
    }

    public void recuperaDatosAdministradores() {
        Administrador administrador;
        ResultSet table;

        nominaDBCRUD = new NominaDBCRUD();
        table = nominaDBCRUD.consultTable("employees");
        try{
            while (table.next()){
                administrador = new Administrador(
                        1,
                        table.getString("nombre"),
                        table.getString("apellido"),
                        table.getInt("horasLaboradas")
                );
                empleados.add(administrador);
            }

        } catch (SQLException sqlex){
            sqlex.printStackTrace();
        }
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public String toStringListaEmpleados(){
        String result = "";
        for (Empleado administrador: this.empleados) {
            result += administrador.toString() + "\n";
        }
        return result;
    }
}
