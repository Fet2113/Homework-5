public class Main {
    public static void main(String[] args) {
// Задание 1
        System.out.println("Задание 1");

        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }

        // Задание 2
        System.out.println("Задание 2");

        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }

        // Задание 3
        System.out.println("Задание 3");

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        // Задание 4
        System.out.println("Задание 4");

        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }

        // Задание 5
        System.out.println("Задание 5");

        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        // Задание 6
        System.out.println("Задание 6");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задание 7
        System.out.println("Задание 7");
        int num = 1;
        System.out.print(num + " ");
       for (int i = 2; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задание 8
        System.out.println("Задание 8");

        int inBox = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++) {
            total = total + inBox;

            {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }}

            // Задание 9
            System.out.println("Задание 9");

            double inBox1 = 29000;
            double total1 = 0;
            for (int i = 0; i <= 12; i++) {
                total1 = total1 + total1 / 100 / 12;
                total1 = total1 + inBox1;

                {
                    System.out.println("Месяц " + i + " сумма накоплений равна " + total1 + " рублей");
                }
            }
        // Задание 10
        System.out.println("Задание 10");
            int x = 1;
            for (int i = 1; i <= 10; i++) {
                x = i * 2;
            System.out.println("2 * " + i + " = " + x);
        }
        }
    }
