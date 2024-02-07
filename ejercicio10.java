import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int dimension = obtenerDimension();
        int[][] matriz = generarMatrizSimetrica(dimension);
        imprimirMatriz(matriz);
    }

    public static int obtenerDimension() {
        // Aquí puedes implementar la lógica para obtener la dimensión de la matriz desde el usuario
        // Puedes usar la clase Scanner para leer la entrada del usuario
        // Por simplicidad, asumiremos que la dimensión es un número entero positivo
        return 0;
    }

    public static int[][] generarMatrizSimetrica(int dimension) {
        int[][] matriz = new int[dimension][dimension];
        Random random = new Random();

        for (int i = 0; i < dimension; i++) {
            for (int j = i; j < dimension; j++) {
                int numeroAleatorio = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
                matriz[i][j] = numeroAleatorio;
                matriz[j][i] = numeroAleatorio;
            }
        }

        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
