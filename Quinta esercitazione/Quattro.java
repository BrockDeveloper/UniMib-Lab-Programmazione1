import java.util.Scanner;

public class Quattro 
{
    public static Scanner cin = new Scanner(System.in);

    //menu di scelta
    public static char menu()
    {
        System.out.println("a) Fahrenheit -> Celsius");
        System.out.println("b) Celsius -> Fahrenheit");
        System.out.println("c) Uscita");
        return cin.nextLine().charAt(0);
    }

    //conversione fahrenheit to celsius
    public static double convertiFinC(double n)
    {
        return (n-32)/1.8;
    }

    //conversione celsius to fahrenheit
    public static double convertiCinF(double n)
    {
        return 1.8*n+32;
    }

    public static void main(String[] args) 
    {
        boolean is_finished = false;
        double n;
        while(!is_finished)
        {
            switch(menu())
            {
                case 'a':
                    n = cin.nextDouble();
                    cin.nextLine();
                    System.out.println(convertiFinC(n));
                    break;
                case 'b':
                    n = cin.nextDouble();
                    cin.nextLine();
                    System.out.println(convertiCinF(n));
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
