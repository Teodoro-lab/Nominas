package App.strategies.nominas;

import App.empleados.Administrador;
import App.empleados.Empleado;
import App.strategies.NominaStrategy;

public class NominaAdministradores implements NominaStrategy {
    public double calculate(Empleado[] empleados) {
        double nominaTotal = 0.0;
        for (Empleado empleado : empleados) {
            if (empleado == null) break;

            else if (empleado.getClass() == Administrador.class) {
                nominaTotal += empleado.getSalario();
            }
        }
        return nominaTotal;
    }
}


