import java.util.Scanner;

public class Tre 
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();

        cin.close();

        //per scomporre in fattori primi, considero tutti i numeri primi
        //fintantoche' il numero raggiunge valore zero
        for(int i=2; n!=1; i++)
        {
            //verifico che il numero sia primo, ovvero se non è divisibile
            //per nessun numero minore della sua metà
            boolean isPrime = true;
            for( int j=2; j<i/2; j++)
            {
                if(i%j==0)
                    isPrime=false;
            }

            //divide e conta fino a quando è divisibile per il fattore primo
            if(isPrime)
            {
                int count = 0;
                while(n%i==0 && n!=1)
                {
                    count++;
                    n/=i;
                }

                if(count!=0)
                    System.out.println("Fattore " + i + " per " + count + " volte.");
            }
        }
    }
}
