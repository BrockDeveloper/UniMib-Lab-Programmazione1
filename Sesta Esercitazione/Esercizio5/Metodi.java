package Esercizio5;

import java.util.Scanner;

public class Metodi
{
    public static int DIM = 26;

    public static char[][] creaMatrice()
    {
        char[][] Matrix = new char[DIM][DIM];

        for(int i=0; i<DIM; i++)
            for(int j=0; j<DIM; j++)
            {
                Matrix[i][j] = (char)(((j+i)%26)+97);
            }

        return Matrix;
    }

    public static char cifraLettera(char plain, char key)
    {
        char[][] VigenereMatrix = creaMatrice();

        return VigenereMatrix[key%97][plain%97];
    }

    public static char decifraLettera(char crypted, char key)
    {
        char[][] VigenereMatrix = creaMatrice();

        return VigenereMatrix[ (key>crypted) ? (Math.abs('z'-key)+Math.abs(crypted-'a')+1) : Math.abs((crypted)-(key))][0];
    }

    public static String cifraMessaggio(String plainWord, String key)
    {
        String cryptWord = "";

        for(int i=0;i<plainWord.length();i++)
            cryptWord += cifraLettera(plainWord.charAt(i), key.charAt(i%key.length()));

        return cryptWord;
    }

    public static String decifraMessaggio(String cryptWord, String key)
    {
        String plainWord = "";
        for(int i=0;i<cryptWord.length();i++)
            plainWord += decifraLettera(cryptWord.charAt(i), key.charAt(i%key.length()));

        return plainWord;
    }

    public static String cambiaParolaChiave()
    {
        Scanner cin = new Scanner(System.in);

        System.out.println("Nuova parola chiave: ");
        return cin.nextLine();
    }
}
