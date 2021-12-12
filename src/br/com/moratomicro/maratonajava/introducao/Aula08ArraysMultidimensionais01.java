package br.com.moratomicro.maratonajava.introducao;

public class
Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1,2,3,4,5 => Meses
        // 31,28,31,30 => dias dos Meses
        // Queremos linkar os dias nos meses
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 30;
        dias[1][1] = 31;
        dias[1][2] = 30;

        dias[2][0] = 30;
        dias[2][1] = 30;
        dias[2][2] = 31;

        for (int[] dia : dias) {
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dia[j]);
            }
        }
        System.out.println("______________________________________________");

        for(int[] arrBase: dias){
            for(int num: arrBase){
                System.out.println(num);
            }
        }
    }
}
