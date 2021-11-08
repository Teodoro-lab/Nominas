package empleados;

public class Administrador extends Empleado {
    private static int instanciasAdministrador = 0;
    private double porcentajeCompensacion;
    private final int level = 1;

    public Administrador(String nombre, double numHorasTrabajadas) {
        super(nombre, numHorasTrabajadas);

    }

    public int getLevel() {
        return level;
    }

    public void setPorcentaje(double porcentajeCompensacion) {
        this.porcentajeCompensacion = porcentajeCompensacion;
    }

    public double getPorcentaje() {
        return this.porcentajeCompensacion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPorcentaje: " + this.porcentajeCompensacion;
    }

    @Override
    public double calcularSalario(int numHorasTrabajadas, double tarifa) {
        if (numHorasTrabajadas >= 80) {
            porcentajeCompensacion = .30;
        } else if (numHorasTrabajadas >= 0) {
            porcentajeCompensacion = .20;
        }
        super.calcularSalario(numHorasTrabajadas, tarifa);
        double salarioConCompensacion = this.getSalario() * (1 + porcentajeCompensacion);
        setSalario(salarioConCompensacion);
        return salarioConCompensacion;
    }

    public static int getNumeroInstancias() {
        return instanciasAdministrador;
    }
}