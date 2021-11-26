package Esercizio3;

public class Metodi
{
    private static int valutaOperando(String plainNumber)
    {
        return (int)(plainNumber.charAt(0) - '0');
    }

    public static int ValutEspression(String[] expression)
    {
        int value = valutaOperando(expression[0]);

        for(int i=1;i<expression.length;i++)
        {
            switch(expression[i])
            {
                case "+":
                    value += valutaOperando(expression[i+1]);
                    break;
                case "-":
                    value -= valutaOperando(expression[i+1]);
                    break;
            }
        }

        return value;
    }

    public static boolean controllaValidaEspressione(String[] expression)
    {
        for(int i=0; i< expression.length; i++)
        {
            if(i%2==0)
            {
                if(expression[i].equals("+") || expression[i].equals("-"))
                    return false;

                if(Integer.parseInt(expression[i])<0 || Integer.parseInt(expression[i])>9)
                    return false;
            }
            else
                if(!(expression[i].equals("+") || expression[i].equals("-")))
                    return false;
        }

        return true;
    }
}