import java.util.Random;

public class Task_3_12 {
    public static void main(String[] args) {
        int n = 10; //число оценок
        int maxNum = 0;//позиция максимальной оценки
        int[] marks = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            marks[i] = rand.nextInt(10) + 1;
        }
        System.out.println("List of estimates: ");
        for (int i = 0; i < n; i++) {
            System.out.print(marks[i] + " ");
            if (marks[i] > marks[maxNum]) maxNum = i;
        }
        System.out.print("\nNumber of the maximum assessment: ");
        for (int i = maxNum; i < n; i++)
            if (marks[i] == marks[maxNum])
                System.out.print(" " + (i + 1));
    }
}
		
			