import java.util.Scanner;

public class Quattro 
{
    public static void main(String[] args) 
    {
        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();
        cin.nextLine();
        int m = cin.nextInt();

        cin.close();

        //assumo che n sia SEMPRE il numero minore
        if(n > m)
        {
            int supp = n;
            n = m;
            m = supp;
        }

        while(n!=0)
        {
            n--;
            m++;
        }

        System.out.println(m);
    }
}
