public class Main {
    public static void main(String[] args) {

        System.out.println("\nЗадача 1\n");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nЗадача 2\n");

        for (int i = 10; i != 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\nЗадача 3\n");

        for (int i = 0; i < 17; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nЗадача 4\n");

        for (int i = 10; i > -11; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\nЗадача 5\n");

        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i +  "год является високосным");
        }

        System.out.println("\nЗадача 6\n");

        for (int i = 1; i < 15; i++) {
            System.out.print((i * 7) + " ");
        }

        System.out.println("\nЗадача 7\n");

        for (int i = 1; i <= 512; i*=2) {
            System.out.print(i + " ");
        }

        System.out.println("\nЗадача 8\n");

        for (int i = 1; i <= 12; i++) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + (i * 29_000) + " рублей");
        }

        System.out.println("\nЗадача 9\n");

        int totalSum = 0;

        for (int i = 1; i <= 12; i++) {
            totalSum += 29_000;
            totalSum += (totalSum / 100);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSum + " рублей");
        }

        System.out.println("\nЗадача 10\n");

        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (i * 2));
        }
    }
}