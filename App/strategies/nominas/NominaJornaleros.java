package App.strategies.nominas;

import App.empleados.Empleado;
import App.empleados.Jornalero;
import App.strategies.NominaStrategy;

public class NominaJornaleros implements NominaStrategy {
    public double calculate(Empleado[] empleados) {
        double nominaTotal = 0.0;
        for (Empleado empleado : empleados) {
            if (empleado == null) break;
            if (empleado.getClass() == Jornalero.class) {
                nominaTotal += empleado.getSalario();
            }
        }
        return nominaTotal;
    }
}
