import java.util.Scanner;

public class Due 
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);
        
        String a = cin.nextLine();
        String b = cin.nextLine();

        cin.close();

        //assumo che a sia SEMPRE la stringa più corta
        if(a.length() > b.length())
        {
            String supp = a;
            a = b;
            b = supp;
        }

        boolean stay = true;
        for(int prefixLength = 0; stay && prefixLength < a.length() ; prefixLength++)
        {
            if(a.charAt(prefixLength) != b.charAt(prefixLength))
            {
                System.out.println("Il massimo prefisso comune tra le stringhe ha lunghezza " + prefixLength);
                stay = false;
            }
        }
    }    
}
