import java.util.Scanner;
public class PruebaInsertarAlumno {
    public static void main(String[] args){
        Alumno alumno = new Alumno();
        ProcesosBD procesoInsertar = new ProcesosBD();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese los datos del alumno a registrar en la base de datos");
        System.out.println("Número de cuenta: ");
		alumno.setCuenta (entrada.nextInt());
		entrada.nextLine();
		System.out.println("Apellido paterno: ");
		alumno.setPaterno(entrada.nextLine());
		System.out.println("Apellido materno: ");
		alumno.setMaterno(entrada.nextLine());
		System.out.println("Nombre(s): ");
		alumno.setNombre(entrada.nextLine());
		System.out.println("Direccion: ");
		alumno.setDireccion(entrada.nextLine());
		System.out.println("Numero telefónico: ");
		alumno.setTelefono(entrada.nextLine());
		System.out.println("Licenciatura: ");
		alumno.setLicenciatura(entrada.nextLine());
		System.out.println("Semestre: ");
		alumno.setSemestre(entrada.nextInt());
		try{
			procesoInsertar.setAlumno(alumno);
			procesoInsertar.insertarRegistro();
			System.out.println ("Datos guardados con exito");
		}
		catch(Exception e){
			System.out.println ("No se pudo guardar los datos");
			e.printStackTrace();
		}
		finally {
			entrada.close();
		}
    }
}
