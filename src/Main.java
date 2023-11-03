//Scrivere una funzione che provi a dividere un numero
// per 0 e catturi l'eccezione leggendone il messaggio.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserie primo numero");
        int x = scanner.nextInt();

        System.out.println("inserie secondo numero");
        int y = scanner.nextInt();


        divisione(x, y);
    }
        private static void divisione(int x, int y) {

            try {



                int result =x / y;


                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("non puoi dividere per zero");
            }
        }
        }

