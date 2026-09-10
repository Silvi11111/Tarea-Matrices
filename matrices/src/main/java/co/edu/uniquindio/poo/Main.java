package co.edu.uniquindio.poo;


public class Main {
    public static void main(String[] args) {
        int [][] numeros={{2,5,6},
                          {3,2,4},
                          {1,9,8}};

        //1. Imprimir matriz
        imprimirMatriz(numeros);
        //2. Sumar todos los números de una matriz
        System.out.println("La suma de todos los números de la matriz da: "+sumarMatriz(numeros));
        //3. Sumar los números de la diagonal de una matriz
        System.out.println("La suma de la diagonal de la matriz es: "+sumarDiagonalMatriz(numeros));
        //4. Dibujar una X en una matriz
        System.out.println("Formando X en matriz: ");
        dibujoXenMatriz(numeros);
        //5. Cuadro superior en una matriz
        System.out.println("Cuadrado superior en matriz: ");
        cuadradoSuperiorMatriz(numeros);
        //6. Dibujar en una matriz una espiral de números
        System.out.println("Una espiral de numeros en una matriz: ");
        matrizEspiral(numeros);
    }
    public static void imprimirMatriz(int [][] matriz){
        for (int i=0;i<matriz.length;i++){

            for (int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int sumarMatriz(int [][]matriz){
        int suma=0;
        for (int i=0;i<matriz.length;i++){

            for (int j=0;j<matriz[i].length;j++){
                suma+=matriz[i][j];
            }

        }
        return suma;
    }
    public static int sumarDiagonalMatriz(int[][] matriz){
        int suma=0;
        for (int i=0;i<matriz.length;i++){
                suma+=matriz[i][i];
        }
        return suma;
    }
    public static void dibujoXenMatriz(int[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
            //i==j es para sacar la diagonal principal
            //i+j==matriz.length-1 para la otra diagonal, porque en un cuadro de 3x3 en posiciones,los numeros que serian marcados para la diagonal sumados dan 2 al igual de lo que mide la longitud de la matriz
            if (i == j || i + j == matriz.length - 1) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void cuadradoSuperiorMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //if (j >= i) hace que se conserve todo lo que esta desde la diagonal hacia arriba
                if (j >= i) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void matrizEspiral(int[][] matriz) {
        int inicioFila = 0;
        int finFila = matriz.length - 1;

        int inicioColumna = 0;
        int finColumna = matriz[0].length - 1;

        int numero = 1;
        while (inicioFila <= finFila && inicioColumna <= finColumna) {

            // De izquierda a derecha
            for (int j = inicioColumna; j <= finColumna; j++) {
                matriz[inicioFila][j] = numero++;
            }
            inicioFila++;
            // De arriba hacia abajo
            for (int i = inicioFila; i <= finFila; i++) {
                matriz[i][finColumna] = numero++;
            }
            finColumna--;
            // De derecha a izquierda
            if (inicioFila <= finFila) {
                for (int j = finColumna; j >= inicioColumna; j--) {
                    matriz[finFila][j] = numero++;
                }
                finFila--;
            }
            // De abajo hacia arriba
            if (inicioColumna <= finColumna) {
                for (int i = finFila; i >= inicioFila; i--) {
                    matriz[i][inicioColumna] = numero++;
                }
                inicioColumna++;
            }
        }
    }

}