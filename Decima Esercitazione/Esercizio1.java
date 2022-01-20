public class Esercizio1
{
    public static int mrf(int n)
    {
        if(n == 0)
        {
            return 3;
        }
        else
        {
            return 1 - 2*mrf(n-1);
        }
    }

    public static void main(String[] args)
    {
        System.out.println(mrf(4));
    }
}