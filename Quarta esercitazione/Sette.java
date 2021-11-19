import java.util.Scanner;

public class Sette 
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);

        String n = cin.nextLine();
        String m = cin.nextLine();

        cin.close();

        //moltiplico ogni cifra del secondo numero per ogni cifra
        //del primo, stampando di volta in volta i parziali
        int result = 0;
        for(int i=m.length()-1; i>=0; i--)
        {
            int partial = 0;
            for(int j=n.length()-1; j>=0; j--)
                partial += ((int)(n.charAt(j)-'0')*(int)(m.charAt(i)-'0'))*Math.pow(10,n.length()-1-j);

            //ad ogni passaggio shifto di 1 posto le cifre
            for(int j=0;j<m.length()-1-i;j++)
                partial*=10;

            //stampa il parziale
            System.out.println(partial);

            //aggiorna il risultato totale
            result = result + partial;
        }

        //stampa il risultato finale
        System.out.println(result);
    }
}
