package App.empleados;

public class Jornalero extends Empleado {
    private static int instanciasJornalero = 0;
    private double horasExtrasTrabajadas;
    private int level = 2;

    public Jornalero(String nombre, double numeroDeHorasTrabajadas, double horasExtrasTrabajadas) {
        super(nombre, numeroDeHorasTrabajadas);
        this.horasExtrasTrabajadas = horasExtrasTrabajadas;
        instanciasJornalero++;
    }

    public int getLevel() {
        return level;
    }

    public double getHorasExtrasTrabajadas() {
        return horasExtrasTrabajadas;
    }

    public void setHorasExtrasTrabajadas(double horasExtrasTrabajadas) {
        this.horasExtrasTrabajadas = horasExtrasTrabajadas;
    }

    @Override
    public double calcularSalario(int numHorasTrabajadas, double tarifa) {
        double JornaleroSalario = super.calcularSalario(numHorasTrabajadas, tarifa);
        JornaleroSalario += horasExtrasTrabajadas * 2 * tarifa;
        setSalario(JornaleroSalario);
        return JornaleroSalario;
    }

    @Override
    public String toString() {
        return "Puesto: Jornalero\n" + super.toString() + "\nHoras extras: " + horasExtrasTrabajadas;
    }

    public static int getNumeroInstancias() {
        return instanciasJornalero;
    }
}
