package App.empleados;

public class Administrador extends Empleado {
    private long ID;
    private static int instanciasAdministrador = 0;
    private double porcentajeCompensacion;
    private int level = 1;

    public Administrador(long ID, String nombre,String apellido, double numHorasTrabajadas) {
        super(nombre, apellido, numHorasTrabajadas);
        this.ID = ID;
        instanciasAdministrador++;
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
        return "Puesto: Administrador\n" + super.toString() + "\nPorcentaje: " + this.porcentajeCompensacion;
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