package Esercizio1;

import java.util.Scanner;

public class Programma
{
    public static int ATTEMPTS = 10;
    public static int MAX_SAVE = 5;

    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);

        int randomNum;
        int max=100;
        int min=0;
        int userNum;


        int playIndex = 0;
        int[] Randoms = new int[MAX_SAVE];
        boolean[] Victory = new boolean[MAX_SAVE];
        int[] Attempts = new int[MAX_SAVE];


        boolean play = true;
        while(play)
        {
            randomNum = Metodi.estraiNumeroCasuale();
            max=100;
            min=0;
            boolean stay = true;
            int i=0;
            for(; i<ATTEMPTS && stay; i++)
            {
                System.out.println("Indovina: ");
                userNum = cin.nextInt();
                cin.nextLine();

                if(userNum>=max || userNum<=min)
                {
                    System.out.println("Hai inserito " + userNum + " ma ti avevo detto che il numero");
                    System.out.println("da indovinare è piu " + ( (userNum>=max) ? ("piccolo di " + max) : ("grande di " + min) ));
                }
                else
                {
                    switch(Metodi.confrontaNumeri(userNum, randomNum))
                    {
                        case 1:
                            System.out.println("Il numero " + userNum + " è più grande di quello da indovinare");
                            max = userNum;
                            break;
                        case -1:
                            System.out.println("il numero " + userNum + " è più piccolo di quello da indovinare");
                            min = userNum;
                            break;
                        case 0:
                            System.out.println("Hai indovinato il numero");
                            stay = false;
                            break;
                    }
                }
            }

            if(stay)
                System.out.println("\nNon hai indovinato il numero: " + randomNum);
            else
                System.out.println("\nHai indovinato il numero: " + randomNum + " in " + i + " tentativi.");

            playIndex = Metodi.aggiornaInformazioniPartite(playIndex, Randoms, Victory, Attempts, randomNum, stay, i);

            System.out.println("\nStatistiche delle ultime 5 partite: ");
            for(int j=0;j<MAX_SAVE;j++)
            {
                System.out.println((j+1) + ". NUMERO: " + Randoms[j]
                                         + " VITTORIA " + ((Victory[j]) ? "SI" : "NO")
                                         + " TENTATIVI " + Attempts[j]);
            }

            System.out.println("\nGiocare ancora?<y/n>: ");
            char choice = cin.nextLine().charAt(0);
            if(choice == 'n')
                play = false;
        }

        cin.close();
    }
}
