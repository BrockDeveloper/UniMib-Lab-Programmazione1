package Esercizio5;

import java.util.Scanner;

public class Programma
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        String key = "";

        boolean stay = true;
        while(stay)
        {
            System.out.println("1. Imposta/cambia parola chiave");
            System.out.println("2. Cifra una parola");
            System.out.println("3. Decifra una parola");
            System.out.println("0. Termina il programma");
            char choice = cin.nextLine().charAt(0);

            switch(choice)
            {
                case '0':
                    stay = false;
                    break;
                case '1':
                    System.out.println("Inserire la nuova parola chiave: ");
                    key = cin.nextLine();
                    break;
                case '2':
                    System.out.println("Parola da cifrare: ");
                    System.out.println(Metodi.cifraMessaggio(cin.nextLine(),key));
                    break;
                case '3':
                    System.out.println("Parola da decifrare: ");
                    System.out.println(Metodi.decifraMessaggio(cin.nextLine(),key));
                    break;
                default:
                    System.out.println("Inserire un'opzione valida!");
            }
        }
    }
}
