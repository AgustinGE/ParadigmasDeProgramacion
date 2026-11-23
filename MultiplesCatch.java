public class MultiplesCatch 
{
 public static void main(String[] args) 
    {
    int a;
    int b[];
    int c = args.length; //Numero de argumentos: LInea de comandos
    
    try
    {
        a = 10 / c; //Error si no da argumentos = 0
        System.out.println("Valor de a = " + a);
        b = new int[1];

        for(int i=0; i<a; i++){//si c=1 se produce un error
            b[i] = i;
            System.out.println("\t" + i);
        }
    }
    catch(ArithmeticException e){
        System.out.println("Primera EXcepcion. Division entre cero: " + e);
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Segunda excepcion. Indice fuera de los limites =>" + e);
    }
  }   
}
