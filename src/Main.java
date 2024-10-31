public class Main {
    public static void main(String[] args) {

        System.out.println("\ntask1\n");

        int[] expenses = new int[5];

        expenses[0] = 10;
        expenses[1] = 20;
        expenses[2] = 30;
        expenses[3] = 40;
        expenses[4] = 50;

        int counterOfExpenses = 0;

        for (int i = 0; i < expenses.length; i++) {
            counterOfExpenses += expenses[i];
        }

        System.out.println("сумма трат за месяц - " + counterOfExpenses);

        System.out.println("\ntask2\n");

        int minimalExpenses = expenses[0];
        int maximalExpenses = expenses[0];

        for (int expence : expenses) {
            if (expence < minimalExpenses) {
                minimalExpenses = expence;
            }
            if (expence > maximalExpenses) {
                maximalExpenses = expence;
            }
        }

        System.out.println("минимальная трата - " + minimalExpenses);
        System.out.println("максимальная трата - " + maximalExpenses);

        System.out.println("\ntask3\n");

        float totalExpenses = 0;
        float averageExpenses;

        for (int expence : expenses) {
            totalExpenses += expence;
        }

        averageExpenses = totalExpenses / expenses.length;
        System.out.println(averageExpenses);

        System.out.println("\ntask4\n");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int length = reverseFullName.length;


        for (int i = length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}