import java.util.Scanner;

public class Helper {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int[] valores = new int[L];

        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 0; i < L; i++) {
            int C = sc.nextInt();
            if ((C % 2) == 0) {
                valores[i] = C;
                contadorPar++;
            } else {
                valores[i] = C;
                contadorImpar++;
            }
        }

        int[] valoresPar = new int[contadorPar];
        int[] valoresImpar = new int[contadorImpar];

        int auxPar = 0;
        int auxImpar = 0;

        for (int i = 0; i < L; i++) {
            if ((valores[i] % 2) == 0) {
                valoresPar[auxPar] = valores[i];
                auxPar++;
            } else {
                valoresImpar[auxImpar] = valores[i];
                auxImpar++;
            }
        }

        if (contadorPar > 0) {
            if (contadorPar == 1) {
                System.out.println(valoresPar[0]);
            } else {
                for (int i = 0; i < contadorPar - 1; i++) {
                    for (int j = 0; j < contadorPar - 1 - i; j++) {
                        if (valoresPar[j] > valoresPar[j + 1]) {
                            int aux = valoresPar[j];
                            valoresPar[j] = valoresPar[j + 1];
                            valoresPar[j + 1] = aux;
                        }
                    }
                }

                for (int i = 0; i < contadorPar; i++) {
                    System.out.println(valoresPar[i]);
                }
            }
        }

        if (contadorImpar > 0) {
            if (contadorImpar == 1) {
                System.out.println(valoresImpar[0]);
            } else {
                for (int i = 0; i < contadorImpar - 1; i++) {
                    for (int j = 0; j < contadorImpar - 1 - i; j++) {
                        if (valoresImpar[j] < valoresImpar[j + 1]) {
                            int aux = valoresImpar[j];
                            valoresImpar[j] = valoresImpar[j + 1];
                            valoresImpar[j + 1] = aux;
                        }
                    }
                }

                for (int i = 0; i < contadorImpar; i++) {
                    System.out.println(valoresImpar[i]);
                }
            }
        }
    }
}