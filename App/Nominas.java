package App;

import App.resources.EmpleadosDB;
import App.strategies.HorasLaboradasStrategy;
import App.strategies.NominaStrategy;

public class Nominas {
    public static double calculate(NominaStrategy algorithm){
        return algorithm.calculate(EmpleadosDB.empleados);
    }

    public static double calculate(HorasLaboradasStrategy algorithm){
        return algorithm.calculate(EmpleadosDB.empleados);
    }
}


