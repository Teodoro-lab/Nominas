package Methods;

import empleados.Administrador;
import empleados.Empleado;
import empleados.Jornalero;

public class HorasDeTrabajo {
    public static double getTotalHorasTrabajadasJornaleros(Empleado[] empleados) {
        double horasTotales = 0.0;
        for (Empleado empleado : empleados) {
            if (empleado.getClass() == Jornalero.class) {
                Jornalero jornalero = (Jornalero) empleado;
                horasTotales += jornalero.getNumHorasTrabajadas() + jornalero.getHorasExtrasTrabajadas();
            }
        }
        return horasTotales;
    }

    public static double getTotalHorasTrabajadasAdministradores(Empleado[] empleados) {
        double horasTotales = 0.0;
        for (Empleado empleado : empleados) {
            if (empleado.getClass() == Administrador.class) {
                horasTotales += empleado.getNumHorasTrabajadas();
            }
        }
        return horasTotales;
    }
}
