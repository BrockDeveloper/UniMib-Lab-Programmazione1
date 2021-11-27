package Esercizio1;

import java.util.Random;

public class Metodi
{
    public static int estraiNumeroCasuale()
    {
        Random r = new Random();
        return r.nextInt(100) + 1;
    }

    /**
     * Confronta la grandezza di due numeri
     * @param numeroInserito numero dell'utente
     * @param numeroDaIndovinare numero da indovinare
     * @return 0 se sono uguali, 1 se l'inserito è maggiore, 0 se l'inserito è minore
     */
    public static int confrontaNumeri(int numeroInserito, int numeroDaIndovinare)
    {
        if(numeroInserito == numeroDaIndovinare)
            return 0;
        else
        if(numeroInserito>numeroDaIndovinare)
            return 1;
        else
            return -1;
    }

    public static int aggiornaInformazioniPartite(int playIndex, int[] Randoms, boolean[] Victory, int[] Attempts, int randomNum, boolean stay, int numAttempts)
    {
        Randoms[playIndex%Programma.MAX_SAVE] = randomNum;
        Victory[playIndex%Programma.MAX_SAVE] = !stay;
        Attempts[playIndex%Programma.MAX_SAVE] = numAttempts;
        return playIndex+1;
    }
}
