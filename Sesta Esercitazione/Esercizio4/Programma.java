package Esercizio4;

import java.util.Scanner;

public class Programma
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        System.out.println("Numero di righe: ");
        int rows = cin.nextInt();
        cin.nextLine();

        System.out.println("Numero di colonne: ");
        int columns= cin.nextInt();
        cin.nextLine();

        int[][] matrix = Metodi.generaMatriceCasuale(rows, columns);

        System.out.println("Matrice prima della trasposizione: ");
        Metodi.stampaMatrice(matrix);

        System.out.println("Matrice prima della trasposizione: ");
        Metodi.stampaMatrice(Metodi.trasponiMatrice(matrix));
    }
}