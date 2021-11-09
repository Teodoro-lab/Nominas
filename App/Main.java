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

        EmpleadosDB.add(new Administrador("María", 43));
        EmpleadosDB.add(new Jornalero("Juan", 17, 2));
        EmpleadosDB.add(new Jornalero("Jacinto", 32, 3));
        EmpleadosDB.add(new Administrador("Samuel", 52));
        EmpleadosDB.add(new Jornalero("Johnson", 67, 5));
        EmpleadosDB.add(new Administrador("Adam", 90));

        //(int)(Math.random()*6+1)
        for (int index = 0; index < EmpleadosDB.getUsedRegistros(); index++) {
            EmpleadosDB.get(index).calcularSalario(10 , 5);
        }

        //-------------  Empleados  ------------------
        System.out.println(
                "Nomina total: " + Nominas.calculate(new NominaEmpleados()) +
                "\nNumero de laboradas (Empleados): " + Nominas.calculate(new HorasLaboradasEmpleados()) +
                "\nTotal empleados: " + EmpleadosDB.getUsedRegistros() +
                "\n"
        );

        //-------------  Jornaleros  ------------------
        System.out.println(
                "Nomina total  (jornaleros): " + Nominas.calculate(new NominaJornaleros()) +
                "\nHoras laboradas (jornaleros): " + Nominas.calculate(new HorasLaboradasJornaleros()) +
                "\nTotal Jornaleros: " +  Jornalero.getNumeroInstancias() +
                "\n"
        );

        //-------------  Administradores  ------------------
        System.out.println(
                "\nNomina total (Administratores): " + Nominas.calculate(new NominaAdministradores()) +
                "\nHoras laboradas (Administradores): " + Nominas.calculate(new HorasLaboradasAdministradores()) +
                "\nTotal Administradores: " + Administrador.getNumeroInstancias() +
                "\n"
        );

        EmpleadosDB.sort(true);
        EmpleadosDB.show();

    }
}