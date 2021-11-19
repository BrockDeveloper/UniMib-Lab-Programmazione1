package Due;

import java.util.Scanner;

public class Programma 
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        boolean is_finished = false;
        char choice = ' ';
        while(!is_finished)
        {
            System.out.println("a) somma di due numeri interi");
            System.out.println("b) divisione intera e resto tra due numeri interi");
            System.out.println("c) media tra due numeri double");
            System.out.println("d) valore assoluto di un numero intero");
            System.out.println("e) lunghezza della stringa che rappresenta un numero intero");
            System.out.println("t) termina il programma");
            choice = cin.nextLine().charAt(0);

            int a,b;
            double da,db;
            switch(choice)
            {
                case 'a':
                    a = cin.nextInt();
                    cin.nextLine();
                    b = cin.nextInt();
                    cin.nextLine();
                    System.out.println(Metodi.sommaDueInteri(a, b));
                    break;
                case 'b':
                    a = cin.nextInt();
                    cin.nextLine();
                    b = cin.nextInt();
                    cin.nextLine();
                    if(b!=0)
                    {
                        System.out.println(Metodi.divisioneIntera(a, b));
                        System.out.println(Metodi.restoDivisioneIntera(a, b));
                    }
                    break;
                case 'c':
                    da = cin.nextDouble();
                    cin.nextLine();
                    db = cin.nextDouble();
                    cin.nextLine();
                    System.out.println(Metodi.mediaTraDueDouble(da, db));
                    break;
                case 'd':
                    a = cin.nextInt();
                    cin.nextLine();
                    System.out.println(Metodi.valoreAssolutoIntero(a));
                    break;
                case 'e':
                    a = cin.nextInt();
                    cin.nextLine();
                    System.out.println(Metodi.lunghezzaStringaIntero(a));
                    break;
                case 't':
                    is_finished = true;
                    break;
                default:
                    System.out.println("Scegli un'operazione valida!");
            }
        }

        cin.close();
    }    
}