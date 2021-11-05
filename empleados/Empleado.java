package empleados;

public class Empleado {
    private String nombre;
    private double salario;
    private double numHorasTrabajadas;

    public Empleado(String nombre, double numHorasTrabajadas) {
        this.nombre = nombre;
        this.numHorasTrabajadas = numHorasTrabajadas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;

    }

    public void setNumHorasTrabajadas(double numHorasTrabajadas) {
        this.numHorasTrabajadas = numHorasTrabajadas;
    }

    public double getNumHorasTrabajadas() {
        return numHorasTrabajadas;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nSalario: " + salario;
    }

    public double calcularSalario(int numHorasTrabajadas, double tarifa) {
        salario = numHorasTrabajadas * tarifa;
        return salario;
    }

}