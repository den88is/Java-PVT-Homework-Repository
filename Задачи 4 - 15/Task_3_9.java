import java.util.Random;

public class Task_3_9 {
    public static void main(String[] args) {
        int number = 10;    //количество чисел в последовательности
        int range = 40;     //диапазон значений чисел
        int max = 0;        //значение максимального числа
        System.out.println("\nSequence of random numbers: ");
        Random rand = new Random();  //в этой строке ошибка символа R в слове Random!
        for (int i = 0; i < number; i++) {
            int c = rand.nextInt(range);
            System.out.print(c + " ");
            if (c > max) max = c;
        }
        System.out.println("\nThe maximum number in sequence is: " + max);
    }
}