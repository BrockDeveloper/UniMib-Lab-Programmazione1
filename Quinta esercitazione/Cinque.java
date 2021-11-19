import java.util.Scanner;

public class Cinque 
{
    public static Scanner cin = new Scanner(System.in);

    //menu di scelta
    public static char menu()
    {
        System.out.println("a) Decimale -> Binario");
        System.out.println("b) Binario -> Decimale");
        System.out.println("c) Uscita");
        return cin.nextLine().charAt(0);
    }

    //conversione da decimale a binario
    public static String convertiDecInBin(int n)
    {
        String bin = "";
        while(n>0)
        {
            bin = n%2 + bin;
            n = n/2;
        }

        return bin;
    }

    //conversione da binario a decimale
    public static int convertiBinInDec(String s)
    {
        int dec = 0;
        for(int i=s.length()-1, ipow = 0;i>=0;i--, ipow++)
        {
            if(i==0)
            {
                if(s.charAt(i)=='0')
                    dec = dec*-1;
            }
            else
                dec = dec + (int)((s.charAt(i)=='1' ? 1 : 0)*Math.pow(2,ipow));
        }

        return dec;
    }

    public static void main(String[] args) 
    {
        boolean is_finished = false;
        int n;
        String s;
        while(!is_finished)
        {
            switch(menu())
            {
                case 'a':
                    n = cin.nextInt();
                    cin.nextLine();
                    if(n>=0)
                        System.out.println(convertiDecInBin(n));
                    break;
                case 'b':
                    s = cin.nextLine();
                    System.out.println(convertiBinInDec(s));
                    break;
                case 'c':
                    is_finished = true;
                    break;
                default:
                    System.out.println("inserire un'operazione valida!");
            }
        }
    }
}
