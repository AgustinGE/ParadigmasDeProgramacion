public class PruebaEmpleadoPorComision {

    public static void main(String[] args) {
        EmpleadoPorComision objEmpleado = new EmpleadoPorComision(
            "Jose" , "Domingues", "123-456", 0.5, 5000
        );
        
        System.out.println("Informacion del empleado obtenida por los metodos establecidos");
        System.out.printf("%n%s %s%n", "El nombre del empleado es: ",
        objEmpleado.getNombre());
        System.out.printf("%n%s %s%n", "El apellido del empleado es: ",
        objEmpleado.getApellidoPaterno());
        System.out.printf("%n%s %s%n", "El numero de segurso social es: ",
        objEmpleado.getNss());
        System.out.printf("%s %.2f%n", "La ventas brutas fueron de: ",
        objEmpleado.getMontoVentas());
        System.out.printf("%s %.2f%n", "La tarifa de comision es de: ",
        objEmpleado.getComision());

        //Esta es una actuactualizacion de los valores de ventas brutas y comision

        objEmpleado.setMontoVentas(8000);
        objEmpleado.setComision(0.6);

        System.out.printf("%n%s: %n%n%s%n",
            "INFORMACION OBTENIDA DEL EMPLEADO, OBTENIDA MEDIANTE toString()",
            objEmpleado
        );
    }
    
}