# Tarea POO: Nóminas -> Implementing comparable sort

El código se encuentra dentro de la carpeta App:

App
│   Main.java
│   Nominas.java  -> This class make use of the strategies
│
├───empleados 
│       Administrador.java
│       Empleado.java
│       Jornalero.java
│
├───resources
│       EmpleadosDB.java  -> This class implements the CRUD
│
└───strategies  -> This folder contains the interfaces and the folders with its implementations
    │   HorasLaboradasStrategy.java  -> interface
    │   NominaStrategy.java  -> interface
    │
    ├───horasLaboradas  -> algorithms for calculating "horasEmpleadas" according to the type of employee
    │       HorasLaboradasAdministradores.java
    │       HorasLaboradasEmpleados.java
    │       HorasLaboradasJornaleros.java
    │
    └───nominas  -> algorithms for calculating "nominas" according to the type of employee
            NominaAdministradores.java
            NominaEmpleados.java
            NominaJornaleros.java
