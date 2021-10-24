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

    public static void main(String[] args) {

        empleados[0] = new Jornalero("Juan", 17, 2);
        empleados[1] = new Administrador("Teo", 67);
        empleados[2] = new Jornalero("Sambo", 23, 4);
        empleados[3] = new Administrador("Johnson", 90);

        empleados[0].calcularSalario(33, 12);
        empleados[1].calcularSalario(43, 32);
        empleados[2].calcularSalario(23, 52);
        empleados[3].calcularSalario(13, 11);

        Scanner sc = new Scanner(System.in);
        String tipoEmpleado;
        String opcion;
        String cerrarApp;
        while (true) {
            System.out.println("Elija la opción deseada: Administrador/Jornalero");
            tipoEmpleado = sc.nextLine();

            System.out.println("Elija Horas & Nomina: ");
            opcion = sc.nextLine();
            if (opcion.equals("Nomina")) {
                System.out.println(calcularNominaTotal(tipoEmpleado));
            } else if (opcion.equals("Horas")) {
                System.out.println(calcularHorasTotales(tipoEmpleado));
            } else {
                System.out.println("Ingrese una opcion valida");
            }

            System.out.println("Escriba 1 para terminar la ejecución");
            cerrarApp = sc.nextLine();
            if (cerrarApp.equals("1")) {
                break;
            }
        }

    }
}