import java.util.Scanner;

public class main {
    public static Empleado[] empleados = new Empleado[4];

    public static double getNominaEmpleados() {
        double nominaQuincenal = 0.0;
        for (Empleado empleado : empleados) {
            nominaQuincenal += empleado.getSalario();
        }
        return nominaQuincenal;
    }

    public static double getNominaAdministradores() {
        double nominaTotal = 0.0;
        for (Empleado empleado : empleados) {
            if (empleado.getClass() == Administrador.class) {
                nominaTotal += empleado.getSalario();
            }
        }
        return nominaTotal;
    }

    public static double getNominaJornaleros() {
        double nominaTotal = 0.0;
        for (Empleado empleado : empleados) {
            if (empleado.getClass() == Jornalero.class) {
                nominaTotal += empleado.getSalario();
            }
        }
        return nominaTotal;
    }

    /**
     * @param type
     * @return nominaQuincenal default, in other case by type
     */
    public static double calcularNominaTotal(String type) {
        double result;
        switch (type) {
        case "Administrador":
            result = getNominaAdministradores();
            break;
        case "Jornalero":
            result = getNominaJornaleros();
            break;
        default:
            result = getNominaEmpleados();
        }
        return result;
    }

    public static double getTotalHorasTrabajadasJornaleros() {
        double horasTotales = 0.0;
        for (Empleado empleado : empleados) {
            if (empleado.getClass() == Jornalero.class) {
                Jornalero jornalero = (Jornalero) empleado;
                horasTotales += jornalero.getNumHorasTrabajadas() + jornalero.getHorasExtrasTrabajadas();
            }
        }
        return horasTotales;
    }

    public static double getTotalHorasTrabajadasAdministradores() {
        double horasTotales = 0.0;
        for (Empleado empleado : empleados) {
            if (empleado.getClass() == Administrador.class) {
                horasTotales += empleado.getNumHorasTrabajadas();
            }
        }
        return horasTotales;
    }

    public static double calcularHorasTotales(String type) {
        double result;
        switch (type) {
        case "Administrador":
            result = getTotalHorasTrabajadasAdministradores();
            break;
        case "Jornalero":
            result = getTotalHorasTrabajadasJornaleros();
            break;
        default:
            result = calcularHorasTotales("Administrador") + calcularHorasTotales("Jornalero");
        }
        return result;
    }

    public static int calcularNumeroDeEmpleados(String type) {
        int result;
        switch (type) {
        case "Administrador":
            result = Administrador.getNumeroInstancias();
            break;
        case "Jornalero":
            result = Jornalero.getNumeroInstancias();
            break;
        default:
            result = calcularNumeroDeEmpleados("Administrador") + calcularNumeroDeEmpleados("Jornalero");
        }
        return result;
    }

    public static void main(String[] args) {

        empleados[0] = new Jornalero("Juan", 17, 2);
        empleados[1] = new Administrador("Teo", 67);
        empleados[2] = new Jornalero("Sambo", 23, 4);
        empleados[3] = new Administrador("Johnson", 90);

        empleados[0].calcularSalario(17, 12);
        empleados[1].calcularSalario(67, 32);
        empleados[2].calcularSalario(23, 52);
        empleados[3].calcularSalario(90, 11);

        // Todo se puedecalcular utilizadno este método pasando el tipo de empleado

        System.out.println("Nomina total de todos los empleados: " + calcularNominaTotal(""));
        System.out.println("Numero de horas trabajadas por todos los empleados: " + calcularHorasTotales(""));
        System.out.println("Numero de empleados" + calcularNumeroDeEmpleados(""));

        System.out.println("\nNomina total de jornaleros: " + calcularNominaTotal("Jornalero"));
        System.out.println("Horas trabajadas por jornaleros: " + calcularHorasTotales("Jornalero"));
        System.out.println("Numero de jornaleros" + calcularNumeroDeEmpleados("Jornalero"));

        System.out.println("\nNomina total de Administradores: " +calcularNominaTotal("Administrador"));
        System.out.println("Horas trabajadas por Administradores: " +calcularHorasTotales("Administrador"));
        System.out.println("Numero de Administradores" + calcularNumeroDeEmpleados("Administrador"));

        /*
         * ? UI
         */
        // Scanner sc = new Scanner(System.in);
        // String tipoEmpleado;
        // ng opcion;
        // ng cerrarApp;
        // while (true) {
        // System.out.println("Elija la

        // em.out.println("Elija Horas & Nomina: ");
        // opcion = sc.nextLine();
        // on.equals("Nomina")) {
        // System.out.println(calcularNominaTotal(tipoEmpleado));
        // f (opcion.equals("Horas")) {
        // System.out.println(calcularHorasTotales(tipoEmpleado));
        // } else {
        //

        // em.out.println("Escriba 1 para terminar la ejecución");
        // arApp = sc.nextLine();
        // cerrarApp.equals("1")) {
        // break;
        // }
        // }

    }
}