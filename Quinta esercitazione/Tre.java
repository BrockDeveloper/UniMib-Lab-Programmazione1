import java.util.Scanner;

public class Tre 
{
    //cerca un carattere in una stringa
    public static boolean cercaCarattere(String s, char c)
    {
        for(int i=0; i<s.length(); i++)
            if(s.charAt(i) == c)
                return true;
        
        return false;
    }

    //rimuove tutte le occorrenze di un carattere in una stringa
    public static String rimuoviCarattere(String s, char c)
    {
        String tmp = "" + c;
        return s.replace(tmp,"");
    }

    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);

        String s = cin.nextLine();
        char c = cin.nextLine().charAt(0);

        cin.close();

        if(cercaCarattere(s, c))
            System.out.println(rimuoviCarattere(s, c));
    }
}
