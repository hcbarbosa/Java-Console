package br.com.javaConsole;

public class ExerciciosLoop {
    public static void main(String[] args) {

        System.out.println("1.Imprima todos os números de 150 a 300.");
        int i = 150;
        while (i <= 300) {
            System.out.println(i);
            i++;
        }

        System.out.println("2.Imprima a soma de 1 até 1000.");
        for (i = 1; i <= 1000; i++) {
            System.out.println(i + (i - 1));
        }

        System.out.println("3.Imprima todos os múltiplos de 3, entre 1 e 100.");
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("4.Imprima os fatoriais de 1 a 10.");
        int fatorial = 1;
        for (i = 1; i <= 10; i++) {
            fatorial = fatorial * i;
            System.out.println(fatorial);
        }

        System.out.println("5.Teste aumentando o valor, e o tipo de variavel.");
        double fatorial1 = 1;
        for (i = 1; i <= 40; i++) {
            fatorial1 = fatorial1 * i;
            System.out.println(fatorial1);
        }
    }
}