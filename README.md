# Tarea POO: Nóminas

![Screenshot](img\class_diagram.jpg)

## Ventajas y Desventajas de la implementación

### Ventajas

- La clase Main tiene una pequeña interfaz para calcular la nómina de los empleados:
  - La interfaz implementa dos funciones estáticas que permiten acceder a todos los métodos que tenemos para calcular tanto la nómina como las horas trabajadas dependiendo del tipo de empleado.
  - El tener las funciones estáticas 'calcularHorasTotales' y 'calcularNominaTotal' nos proporcionan una pequeña interfaz a través de la cuál podríamos agregar más fácilmente métodos para distintos tipos de empleados.
- Por la forma en la cual se implementaron las clases se pudo utilizar parte del código de la super clase.
- Se utilizaron variables de clase para poder llevar el conteo de instancias creadas para cada tipo de empleado.

### Desventajas

- A la clase base 'Empleado' posee un constructor que inicializa la variable 'numHorasTrabajadas', pero en sus métodos para cálcular el salario se utiliza un argumento para las horas trabajadas, por lo que hay duplicidad de información.

  - La duplicidad puede causar confuciones.

- La clase jornalero tiene un constructor que agrega el número de horas extras, diferenciándose estas de las horas comunes trabajadas.

  - La diferenciación da cabida a la posibilidad de que un jornalero tenga 0 horas trabajadas y más de 0 horas extras trabajadas. _(Esto último pudiendo validarse o no dependiendo del tipo de negocio)_

  - La diferenciación de las horas provoca que algoritmos como el cálculo de sus horas totales trabajadas tengan que accederse mediante otro método, a diferencia de la implementación que consideraba las horas extras como ya contabilizadas dentro de las 'horasTotalesTrabajadas', donde podría calcularse ariméticamente.
