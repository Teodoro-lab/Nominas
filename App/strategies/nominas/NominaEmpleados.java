package App.strategies.nominas;

import App.empleados.Empleado;
import App.strategies.NominaStrategy;
import org.jetbrains.annotations.NotNull;

public class NominaEmpleados implements NominaStrategy {
    public double calculate(Empleado @NotNull [] empleados) {
        double nominaQuincenal = 0.0;
        for (Empleado empleado : empleados) {
            if (empleado == null) break;
            nominaQuincenal += empleado.getSalario();
        }
        return nominaQuincenal;
    }
}
