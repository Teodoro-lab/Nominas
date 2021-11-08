package App.strategies;

import App.empleados.Empleado;

public interface HorasLaboradasStrategy {
    double calculate(Empleado[] empleados);
}
