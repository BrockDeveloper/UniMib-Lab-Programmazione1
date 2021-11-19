package Due;

public class Metodi 
{
    public static int sommaDueInteri(int a, int b)
    {
        return a+b;
    }    

    public static int divisioneIntera(int a, int b)
    {
        return a/b;
    }

    public static int restoDivisioneIntera(int a, int b)
    {
        return a%b;
    }

    public static double mediaTraDueDouble(double a, double b)
    {
        return (a+b)/2;
    }

    public static int valoreAssolutoIntero(int a)
    {
        return Math.abs(a);
    }

    public static int lunghezzaStringaIntero(int a)
    {
        int count = 1;
        for(; a!=1; count++)
            a = a/10;

        return count;
    }
}
