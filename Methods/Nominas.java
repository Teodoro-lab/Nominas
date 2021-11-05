package Methods;

import empleados.Administrador;
import empleados.Empleado;
import empleados.Jornalero;


public class Nominas {

    public static double getNominaEmpleados(Empleado[] empleados) {
        double nominaQuincenal = 0.0;
        for (Empleado empleado : empleados) {
            nominaQuincenal += empleado.getSalario();
        }
        return nominaQuincenal;
    }

    public static double getNominaAdministradores(Empleado[] empleados) {
        double nominaTotal = 0.0;
        for (Empleado empleado : empleados) {
            if (empleado.getClass() == Administrador.class) {
                nominaTotal += empleado.getSalario();
            }
        }
        return nominaTotal;
    }

    public static double getNominaJornaleros(Empleado[] empleados) {
        double nominaTotal = 0.0;
        for (Empleado empleado : empleados) {
            if (empleado.getClass() == Jornalero.class) {
                nominaTotal += empleado.getSalario();
            }
        }
        return nominaTotal;
    }
}
