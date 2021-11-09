package App.resources;

import App.empleados.Empleado;

public class EmpleadosDB {

    // WARNING:
    //      El array 'empleados' debería ser privado, pero para fines del problema lo haré publico

    public static Empleado[] empleados = new Empleado[100];
    private static int registros = 100;
    private static int registrosUsados = 0;

    private EmpleadosDB(){}

    public static void add(Empleado empleado){
        for(int i = 0; i < registros; i++){
            if (empleados[i] == null){
                empleados[i] = empleado;
                EmpleadosDB.registrosUsados++;
                return;
            }
        }
    }

    public static int getUsedRegistros(){
        return registrosUsados;
    }


    public static Empleado get(int index){
        return empleados[index];
    }

    public static void update(int index, Empleado empleado){
        empleados[index] = empleado;
    }

    public static void delete(int index){
        if (empleados[index] == null)
            return;

        empleados[index] = null;
        EmpleadosDB.registrosUsados--;
        for (int i = index+1; i < registros; i++){
            if (empleados[index+1] != null) {
                empleados[i - 1] = empleados[i];
            }
            else return;
        }
    }

    public static int getRegistros(){
        return registros;
    }

    public static void show(){
        for (Empleado empleado: empleados) {
            if (empleado == null){
                break;
            }
            System.out.println(empleado + "\n");
        }
    }

    public static void sort(boolean ascending)
    {
        int n = registrosUsados;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1   ; j++){
                if (ascending) {
                    if(empleados[j].compareTo(empleados[j + 1]) != 0){
                        // swap arr[j+1] and arr[j]
                        Empleado temp = empleados[j];
                        empleados[j] = empleados[j+1];
                        empleados[j+1] = temp;
                    }
                } else{
                    if(empleados[j].compareTo(empleados[j + 1]) == 0){
                        // swap arr[j+1] and arr[j]
                        Empleado temp = empleados[j];
                        empleados[j] = empleados[j+1];
                        empleados[j+1] = temp;
                    }
                }
            }
    }
}
