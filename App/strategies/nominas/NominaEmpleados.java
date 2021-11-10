package App.strategies.nominas;

import App.empleados.Empleado;
import App.strategies.NominaStrategy;

public class NominaEmpleados implements NominaStrategy {
    public double calculate(Empleado[] empleados) {
        double nominaQuincenal = 0.0;
        for (Empleado empleado : empleados) {
            if (empleado == null) break;
            nominaQuincenal += empleado.getSalario();
        }
        return nominaQuincenal;
    }
}
