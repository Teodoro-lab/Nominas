package App;

import App.empleados.Administrador;
import App.empleados.Jornalero;
import App.resources.EmpleadosDB;
import App.strategies.horasLaboradas.HorasLaboradasAdministradores;
import App.strategies.horasLaboradas.HorasLaboradasEmpleados;
import App.strategies.horasLaboradas.HorasLaboradasJornaleros;
import App.strategies.nominas.NominaAdministradores;
import App.strategies.nominas.NominaEmpleados;
import App.strategies.nominas.NominaJornaleros;

public class Main {

    public static void main(String[] args) {

        EmpleadosDB.add(new Jornalero());
        EmpleadosDB.add(new Jornalero());
        EmpleadosDB.add(new Jornalero());

        EmpleadosDB.add(new Administrador());
        EmpleadosDB.add(new Administrador());
        EmpleadosDB.add(new Administrador());

        for (int index = 0; index < EmpleadosDB.getUsedRegistros(); index++) {
            EmpleadosDB.get(index).calcularSalario();
        }

        //-------------  Empleados  ------------------
        System.out.println(
                "Nomina total: " + Nominas.calculate(new NominaEmpleados()) +
                "\nNumero de laboradas (Empleados): " + Nominas.calculate(new HorasLaboradasEmpleados()) +
                "\nTotal empleados: " + Jornalero.getNumeroInstancias() + Administrador.getNumeroInstancias()
        );

        //-------------  Jornaleros  ------------------
        System.out.println(
                "Nomina total  (jornaleros): " + Nominas.calculate(new NominaJornaleros()) +
                "\nHoras laboradas (jornaleros): " + Nominas.calculate(new HorasLaboradasJornaleros()) +
                "\nTotal Jornaleros: " + + Jornalero.getNumeroInstancias()
        );

        //-------------  Administradores  ------------------
        System.out.println(
                "Nomina total (Administratores): " + Nominas.calculate(new NominaAdministradores()) +
                "\nHoras laboradas (Administradores): " + Nominas.calculate(new HorasLaboradasAdministradores()) +
                "\nTotal Administradores" + Administrador.getNumeroInstancias()
        );

    }
}