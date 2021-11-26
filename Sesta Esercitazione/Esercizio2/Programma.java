package Esercizio2;

import java.util.Scanner;

public class Programma
{
    public static int ATTEMPTS = 20;

    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        String plainWord = Metodi.estraiStringaCasuale();
        char[] word = plainWord.toCharArray();

        boolean[] visible = new boolean[word.length];
        for(int i=0; i < visible.length; i++)
            visible[i] = false;

        int i=0;
        for (; i<ATTEMPTS && !Metodi.isAllVisible(visible); i++)
        {
            Metodi.stampaLettereIndovinate(word, visible);

            char c = cin.nextLine().charAt(0);

            if(Metodi.isInWord(word, c))
            {
                if(Metodi.scopriLettera(word, visible, c))
                    System.out.println("La lettera è già tra quelle indovinate");
            }
            else
                System.out.println("Lettera non presente nella parola");
        }

        if(i==ATTEMPTS)
            System.out.println("20 tentativi esauriti, la parola era " + plainWord);
        else
            System.out.println("Hai indovinato la parola " + plainWord + " in " + i + " tentativi");
    }
}