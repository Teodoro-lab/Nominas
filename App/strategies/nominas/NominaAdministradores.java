package App.strategies.nominas;

import App.empleados.Administrador;
import App.empleados.Empleado;
import App.strategies.NominaStrategy;
import org.jetbrains.annotations.NotNull;

public class NominaAdministradores implements NominaStrategy {
    public double calculate(Empleado @NotNull [] empleados) {
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


