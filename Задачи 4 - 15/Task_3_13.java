import java.util.Random;

public class Task_3_13 {
    public static void main(String[] args) {
        int category = 5;
        int n = category - 1;
        int b = 0;        //временная пер-я
        int number = 101;    //максимальное значение случ-й пер-й
        int[][] M = new int[category][category];
        Random rand = new Random();
//заполнение массива 
        for (int i = 0; i < category; i++)
            for (int j = 0; j < category; j++) {
                M[i][j] = rand.nextInt(number);
            }
//вывод массива
        System.out.println("Type of a matrix to a turn: ");
        for (int i = 0; i < category; i++) {
            for (int j = 0; j < category; j++)
                System.out.print(M[i][j] + "\t");
            System.out.println();
        }
//поворот массива вокруг главной оси
        for (int i = 0; i < category; i++)
            for (int j = i; j < category; j++) {
                b = M[i][j];
                M[i][j] = M[j][i];
                M[j][i] = b;
            }
//меняем местами крайние столбцы
        for (int i = 0; i < category; i++)
            for (int j = 0; j < category / 2; j++) {
                b = M[i][j];
                M[i][j] = M[i][n - j];
                M[i][n - j] = b;
            }
//вывод массива
        System.out.println("Type of a matrix after a turn: ");
        for (int i = 0; i < category; i++) {
            for (int j = 0; j < category; j++)
                System.out.print(M[i][j] + "\t");
            System.out.println();
        }
    }
}		