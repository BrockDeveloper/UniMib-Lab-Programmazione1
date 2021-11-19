import java.util.Scanner;

public class Uno
{
    //aggiorna la stringa aggiungendo il nuovo valore alla fine della stessa
    public static String aggiornaStringa(String sequence, int n)
    {
        return sequence + n;
    }

    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        
        //input della sequenza di numeri
        String sequence = "";
        int n = -1;
        while(n!=0)
        {
            n = cin.nextInt();
            
            if(n!=0)
                if(n<0)
                    System.out.println("Inserisci un numero positivo!");
                else
                    sequence = aggiornaStringa(sequence,n);

        }

        //stampa gli elementi in posizione pari
        //index parte da 1 come da consegna dell'esercizio
        for(int i=0;i<sequence.length();i++)
            if((i+1)%2==0)
                System.out.print(sequence.charAt(i));

        cin.close();
    }
}