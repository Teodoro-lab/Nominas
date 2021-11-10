# Tarea POO: Nóminas -> Implementing comparable sort

El código se encuentra dentro de la carpeta App:

App <br />
│   Main.java <br /> 
│   Nominas.java  -> This class make use of the strategies <br />
│ <br />
├───empleados  <br />
│       Administrador.java <br />
│       Empleado.java <br />
│       Jornalero.java <br />
│
├───resources <br />
│       EmpleadosDB.java  -> This class implements the CRUD <br />
│ <br />
└───strategies  -> This folder contains the interfaces and the folders with its implementations <br />
    │   HorasLaboradasStrategy.java  -> interface <br />
    │   NominaStrategy.java  -> interface <br />
    │ <br />
    ├───horasLaboradas  -> algorithms for calculating "horasEmpleadas" according to the type of employee <br />
    │       HorasLaboradasAdministradores.java <br />
    │       HorasLaboradasEmpleados.java <br />
    │       HorasLaboradasJornaleros.java <br />
    │ <br />
    └───nominas  -> algorithms for calculating "nominas" according to the type of employee <br />
            NominaAdministradores.java <br />
            NominaEmpleados.java <br />
            NominaJornaleros.java <br />
