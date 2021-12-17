package br.com.moratomicro.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[]{1, 2};
        arrayInt[1] = new int[]{3, 4, 5};
        arrayInt[2] = new int[]{6, 7, 8, 9, 10, 11};

        int[][] arrayInt2 = {{0, 1}, {2, 3, 4}, {5,6, 7, 8, 9, 10}};

        for (int[] arrayBase: arrayInt){
            System.out.println("\n------arrayInt------");
            for (int num: arrayBase){
                System.out.print(num + " ");
            }
        }

        for (int[] arrayBase: arrayInt2){
            System.out.println("\n------arrayInt2------");
            for (int num: arrayBase){
                System.out.print(num + " ");
            }
        }
    }
}
