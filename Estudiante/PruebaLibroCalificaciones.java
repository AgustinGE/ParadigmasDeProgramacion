import java.util.Scanner;

public class PruebaLibroCalificaciones {

    public static void main (String [] args)
    {
        Scanner entrada = new Scanner(System.in);

        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();

        LibroCalificaciones miLibroCalificacionesIniciado = new LibroCalificaciones(
            "Programacion II" , "Ana Luisa" , 4);
        

        System.out.printf( "El nombre inicial del curso: %s\n El profesor es: %s\n y las horas a la semana son: %s\n",
            miLibroCalificacionesIniciado.getNombreDelCurso(),
            miLibroCalificacionesIniciado.getNombreDelProfesor(),
            miLibroCalificacionesIniciado.getHorasDelCurso());
        
    
        System.out.println( "Ecribe el nombre del curso:");
        String nombreCursoIngresado = entrada.nextLine();

        System.out.println("Escribe el nombre del Profesor Asignado: ");
        String nombreProfesorIngresado = entrada.nextLine();

        System.out.println("Escriba las horas por semana del curso:" );
        int horasSemana = entrada.nextInt();

        System.out.println();
        miLibroCalificaciones.establecerParametrosDelCurso( nombreCursoIngresado, nombreProfesorIngresado, horasSemana);

        miLibroCalificaciones.mostrarMensaje();
        entrada.nextLine();
    }
}
