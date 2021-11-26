package Esercizio4;

import java.util.Random;

public class Metodi
{
    private static final int BOUND = 99;

    public static int[][] generaMatriceCasuale(int rows, int columns)
    {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];

        for(int i=0; i<rows; i++)
            for(int j=0; j<columns; j++)
                matrix[i][j] = random.nextInt(BOUND);

        return matrix;
    }

    public static void stampaMatrice(int[][] matrix)
    {
        for(int i=0; i< matrix.length; i++)
        {
            for(int j=0; j<matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");

            System.out.println();
        }
    }

    public static int[][] trasponiMatrice(int[][] matrix)
    {
        int[][] traspMatrix = new int[matrix[0].length][matrix.length];

        for(int i=0; i< matrix.length; i++)
            for(int j=0; j<matrix[i].length; j++)
                traspMatrix[j][i] = matrix[i][j];

        return traspMatrix;
    }
}
