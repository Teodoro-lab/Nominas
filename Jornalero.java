public class Jornalero extends Empleado {
    private double horasExtrasTrabajadas;

    public Jornalero(String nombre, double numeroDeHorasTrabajadas, double horasExtrasTrabajadas) {
        super(nombre, numeroDeHorasTrabajadas);
        this.horasExtrasTrabajadas = horasExtrasTrabajadas;
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
        return super.toString() + "\nHoras extras" + horasExtrasTrabajadas;
    }
}