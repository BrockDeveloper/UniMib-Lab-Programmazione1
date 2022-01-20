public class Esercizio4 
{
    public static int f(int n)
    {
        if(n == 0)
            return 0;
        
        return n + (n-1) + f(n-1);
    }

    public static void main(String[] args) 
    {
        System.out.println(f(9));
    }
}