import java.util.Scanner;

public class Cinque 
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        cin.close();

        //in quanto CONGETTURA, so che sicuramente tutti i numeri arriveranno ad
        //assumere valore 1, anche se non posso dimostrarlo
        for(int i=1;i<=n;i++)
        {
            int supp = i;
            while(supp!=1)
            {
                if(supp%2==0)
                    supp/=2;
                else
                    supp=3*supp+1;
            }

            System.out.println("La congettura vale per n = " + i);
        }
    }
}