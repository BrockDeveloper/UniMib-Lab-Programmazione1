public class Esercizio5 
{
    public static int f(int n)
    {
        if(n == 0)
            return 1;
        
        return 2 * f(n-1);
    }

    public static void main(String[] args)
    {
        System.out.println(f(4));
    }
}