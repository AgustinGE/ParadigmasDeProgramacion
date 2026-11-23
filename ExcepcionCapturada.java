public class ExcepcionCapturada 
{
    public static void main(String[] args) 
    {
        int a, b;
        try
        {//Controla el codigo peligroso
            a = 0;
            b = 10/a;
            System.out.println("Esto ya no se imprime");
        }
        catch(ArithmeticException objetoExcep)
        {
            System.out.println("DivisionPorCero" + objetoExcep);
        }
        System.out.println("Continua el programa....");
    }    
}
