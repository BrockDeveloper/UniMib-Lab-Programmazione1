package Esercizio2;

import java.util.Random;

public class Metodi
{
    public static String estraiStringaCasuale()
    {
        String[] words = {"aestela","dunque","massaggio","draconiano","pasticcio"};

        return words[new Random().nextInt(words.length)];
    }

    public static void stampaLettereIndovinate(char[] word, boolean[] visible)
    {
        for(int i=0; i<visible.length; i++)
        {
            System.out.print((visible[i]) ? word[i] : "-");
        }
        System.out.println();
    }

    public static boolean scopriLettera(char[] word, boolean[] visible, char c)
    {
        for(int i=0; i<visible.length; i++)
        {
            if(word[i] == c)
            {
                if(visible[i] == true)
                    return true;

                visible[i] = true;
            }
        }

        return false;
    }

    public static boolean isAllVisible(boolean[] visible)
    {
        for(int i=0; i< visible.length; i++)
            if(visible[i] == false)
                return false;

        return true;
    }

    public static boolean isInWord(char[] word, char c)
    {
        boolean inWord = false;

        for (int i=0; i<word.length; i++)
            if(word[i] == c)
                inWord = true;

        return inWord;
    }
}