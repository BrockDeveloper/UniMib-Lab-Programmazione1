import java.util.Scanner;

public class Uno
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();
        boolean stay = true;

        for(int i=1; stay ; i++)
        {
            int twoPow = 2;
            for(int j=1;j<=i;j++)
                twoPow*=twoPow;

            if(twoPow > n)
            {
                System.out.println(twoPow);
                stay = false;
            }
        }

        cin.close();
    }
}