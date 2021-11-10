package App.empleados;

public abstract class Empleado implements Comparable<Empleado>{
    private String nombre;
    private double salario;
    private double numHorasTrabajadas;
    private int level;

    public Empleado(String nombre, double numHorasTrabajadas) {
        this.nombre = nombre;
        this.numHorasTrabajadas = numHorasTrabajadas;
    }

    public int getLevel() {
        return level;
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

    /*@Override
    public int compareTo(Empleado o) {
        if(this.getLevel() > o.getLevel()) {
            return 1;
        } else if (this.getLevel() == o.getLevel()) {
            if (this.getSalario() >= o.getSalario()){
                return 1;
            }
        }
        return 0;
    }*/

    @Override
    public int compareTo(Empleado o) {
        if(this.getLevel() > o.getLevel()) {
            return -1;
        } else if (this.getLevel() == o.getLevel()) {
            if (this.getSalario() > o.getSalario()) {
                return -1;
            }
            else if (this.getSalario() == o.getSalario()) {
                return 0;
            }
        }
        return 1;
    }
}