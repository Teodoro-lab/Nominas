import empleados.Administrador;
import empleados.Jornalero;

public class main {

    public static void main(String[] args) {

        Controller.empleados[0] = new Jornalero("Juan", 17, 2);
        Controller.empleados[1] = new Administrador("Teo", 67);
        Controller.empleados[2] = new Jornalero("Sambo", 23, 4);
        Controller.empleados[3] = new Administrador("Johnson", 90);

        Controller.empleados[0].calcularSalario(17, 12);
        Controller.empleados[1].calcularSalario(67, 32);
        Controller.empleados[2].calcularSalario(23, 52);
        Controller.empleados[3].calcularSalario(90, 11);

        // Todo se puedecalcular utilizadno este método pasando el tipo de empleado

        System.out.println("Nomina total de todos los empleados: " + Controller.calcularNominaTotal(""));
        System.out.println("Numero de horas trabajadas por todos los empleados: " + Controller.calcularHorasTotales(""));
        System.out.println("Numero de empleados" + Controller.calcularNumeroDeEmpleados(""));

        System.out.println("\nNomina total de jornaleros: " + Controller.calcularNominaTotal("empleados.Jornalero"));
        System.out.println("Horas trabajadas por jornaleros: " + Controller.calcularHorasTotales("empleados.Jornalero"));
        System.out.println("Numero de jornaleros" + Controller.calcularNumeroDeEmpleados("empleados.Jornalero"));

        System.out.println("\nNomina total de Administrators: " +Controller.calcularNominaTotal("empleados.Administrador"));
        System.out.println("Horas trabajadas por Administradores: " +Controller.calcularHorasTotales("empleados.Administrador"));
        System.out.println("Numero de Administradores" + Controller.calcularNumeroDeEmpleados("empleados.Administrador"));

    }
}