public class PruebaEmpleadoBaseMasComision {
    public static void main(String[] args)
    {
        EmpleadoBaseMasComision empleado = 
            new EmpleadoBaseMasComision (
                "Bob", "Lewis", "333-33-333", 5000, .04, 300
            );
        System.out.printf(
            "Informacion del empleado obtenida por metodos establecer: %n");
        System.out.printf("%s %s%n", "El primer nombre es", 
            empleado.getNombre());
        System.out.printf("%s %s%n", "El apellido es", 
            empleado.getApellidoPaterno());
        System.out.printf("%s %s%n", "El numero de seguro social es", 
            empleado.getNss());
        System.out.printf("%s %.2f%n", "Las ventas brutas son",
            empleado.getMontoVentas());
        System.out.printf("%s %.2f%n", "La tarrifa de comison es",
            empleado.getComision());
        System.out.printf("%s %.2f%n", "El salario base es",
            empleado.getSalarioBase());
        
        empleado.establecerSalarioBase(1000);
        System.out.printf("%n%s:%n%n%s%n",
            "Informacion actualizada del empleado, obtenida por toString",
            empleado.toString());
    } 
}