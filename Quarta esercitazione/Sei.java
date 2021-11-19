import java.util.Scanner;

public class Sei 
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);

        String genoma = cin.nextLine();
        String proteina = cin.nextLine();

        cin.close();

        //dato che devo trovare occorrenze di proteina in genoma,
        //sono certo che devo fermarmi al carattere tale che non
        //esca dala lunghezza della stringa genoma
        for(int i=0; i<=genoma.length()-proteina.length(); i++)
        {
            //verifico che la proteina compaia in questa posizione
            boolean is_substring = true;
            for(int j=0; j<proteina.length() && is_substring; j++)
            {
                //genoma parte dalla posizione del carattere in esame
                if(genoma.charAt(i+j)!=proteina.charAt(j))
                    is_substring = false;
            }

            if(is_substring)
                System.out.println("compare in posizione " + (i+1));
        }
    }
}
