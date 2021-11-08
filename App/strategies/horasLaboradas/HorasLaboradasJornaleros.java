package App.strategies.horasLaboradas;

import App.empleados.Empleado;
import App.empleados.Jornalero;
import App.strategies.HorasLaboradasStrategy;

public class HorasLaboradasJornaleros implements HorasLaboradasStrategy {
    public double calculate(Empleado[] empleados) {
        double horasTotales = 0.0;
        for (Empleado empleado : empleados) {
            if (empleado.getClass() == Jornalero.class) {
                Jornalero jornalero = (Jornalero) empleado;
                horasTotales += jornalero.getNumHorasTrabajadas() + jornalero.getHorasExtrasTrabajadas();
            }
        }
        return horasTotales;
    }
}
