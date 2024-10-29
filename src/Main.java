import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("\ntask1\n");

        int[] intArr = new int[3];
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;

        float [] floatArr = {1.57f, 7.654f, 9.986f};

        int[] randomArr = new int[]{1, 2, 3};

        System.out.println("\ntask2\n");

        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(floatArr));
        System.out.println(Arrays.toString(randomArr));

        System.out.println("\ntask3\n");

        for (int i = intArr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(intArr[i] + "\n");
            } else {
                System.out.print(intArr[i] + ", ");
            }
        }

        for (int i = floatArr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(floatArr[i] + "\n");
            } else {
                System.out.print(floatArr[i] + ", ");
            }
        }

        for (int i = randomArr.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(randomArr[i] + "\n");
            }else {
                System.out.print(randomArr[i] + ", ");
            }
        }

        System.out.println("\ntask4\n");

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 != 0) {
                intArr[i] += 1;
            }
        }

        System.out.println(Arrays.toString(intArr));
    }
}