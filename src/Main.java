import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rn = new Random();

        System.out.println("\ntask1\n");
        int year = rn.nextInt(2222) + 1;
        isYearLeap(year);

        System.out.println("\ntask2\n");
        int clientOS = rn.nextInt(2);
        int clientDeviceYear = rn.nextInt(15) + 2010;
        System.out.println("__LOG__clientOS - " + clientOS);
        System.out.println("__LOG__clientDeviceYear - " + clientDeviceYear + "\n");
        popUpWindowWithUpdates(clientOS, clientDeviceYear);

        System.out.println("\ntask3\n");

        int deliveryDistance = rn.nextInt(120);
        int deliveryTime = calculateDeliveryTime(deliveryDistance);
        System.out.println(deliveryTime);

    }

    private static void isYearLeap(int year) {
        if (year >= 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    private static void popUpWindowWithUpdates(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android  по ссылке");
        } else if ((clientDeviceYear >= 2015 && clientOS == 1)) {
            System.out.println("Установите версию приложения для Android  по ссылке");
        }
    }

    private static int calculateDeliveryTime(int deliveryDistance) {
        int counter = 1;

        if (deliveryDistance < 20) {
            System.out.println("__LOG__Потребуется дней: " + counter + ", вы живете в " + deliveryDistance + " км");
            return counter;
        } else if (20 < deliveryDistance && deliveryDistance < 60) {
            counter++;
            System.out.println("__LOG__Потребуется дней: " + counter + ", вы живете в " + deliveryDistance + " км");
            return counter;
        } else if (60 < deliveryDistance && deliveryDistance < 100) {
            counter++;
            counter++;
            System.out.println("__LOG__Потребуется дней: " + counter + ", вы живете в " + deliveryDistance + " км");
            return counter;
        } else {
            System.out.println("__LOG__к вам доставки нет, вы живете в " + deliveryDistance + " км");
            return 0;
        }
    }
}