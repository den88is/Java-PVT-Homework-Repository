public class Task_3_11 {
    public static void main(String[] args) {
        int initialNumber = -9;   //первое значение целого числа
        int n = 4;               //количество первых целых чисел
        int n1 = 0;         //счетчик количества
        int amount = 0;         //сумма
        for (int i = initialNumber; n1 < n; i++)
            if (i % 3 == 0) {
                n1 += 1;
                amount += i;
            }
        System.out.println("the sum of the first " + 4 + " of numbers which share on 3 since " + initialNumber + ": " + amount);
    }
}

	