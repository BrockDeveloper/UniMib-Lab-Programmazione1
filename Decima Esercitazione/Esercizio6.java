public class Esercizio6 
{
    public static int f(int n, int m)
    {
        if(m == 0)
            return 1;
        
        return n * f(n, m-1);
    }

    public static void main(String[] args)
    {
        System.out.println(f(3,4));
    }
}