package App.strategies.horasLaboradas;

import App.empleados.Administrador;
import App.empleados.Empleado;
import App.empleados.Jornalero;
import App.strategies.HorasLaboradasStrategy;

public class HorasLaboradasEmpleados implements HorasLaboradasStrategy {
    public double calculate(Empleado[] empleados) {
        double horasTotales = 0.0;
        for (Empleado empleado : empleados) {
            if (empleado == null) break;
            if (empleado.getClass() == Administrador.class) {
                horasTotales += empleado.getNumHorasTrabajadas();
            }
        }
        return horasTotales;
    }
}
