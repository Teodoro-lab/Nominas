import Methods.EmpleadosDB;
import com.github.javafaker.Faker;

public class main {

    public static void main(String[] args) {

        Faker faker = new Faker();
        String firstName=faker.name().firstName();
        String lastName=faker.name().lastName();

        // Todo se puede calcular utilizando este método pasando el tipo de empleado

        System.out.println("Nomina total: " );
        System.out.println("Numero de laboradas (Empleados): " );
        System.out.println("Total empleados: " );

        System.out.println("\nNomina total  (jornaleros): " );
        System.out.println("Horas laboradas (jornaleros): " );
        System.out.println("Total Jornaleros: " );

        System.out.println("\nNomina total (Administratores): " );
        System.out.println("Horas laboradas (Administradores): " );
        System.out.println("Total Administradores" );

    }
}