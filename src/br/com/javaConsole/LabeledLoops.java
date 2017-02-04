package br.com.javaConsole;

public class LabeledLoops {
    public static void main(String[] args) {
        int total;
        boolean erro = false;
        inicio: if (!erro) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        for (int l = 0; l < 10; l++) {
                            for (int m = 0; m < 10; m++) {
                                total = (i * 10000 + j * 1000 + k * 100 + l * 10 + m);
                                System.out.println("agora estamos tratando do : " + total);
                                if (total == 66) {
                                    erro = true;
                                    break inicio;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}