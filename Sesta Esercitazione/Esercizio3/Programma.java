package Esercizio3;

public class Programma
{
    public static void main(String[] args)
    {
        if(!Metodi.controllaValidaEspressione(args))
        {
            System.out.println("Espressione non valida!");
            System.exit(0);
        }

        System.out.println(Metodi.ValutEspression(args));
    }
}