import java.util.Arrays;
import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int array = sc.nextInt();

        if (array <= 1) {
            System.out.println(array + " is an invalid array size");
        } else if (array % 2 != 0) {
            System.out.println(array + " is an odd number. Please enter an even number.");
        } else {
            int[] a = new int[array];
            System.out.println("Enter the numbers");

            for (int i = 0; i < array; i++) {
                a[i] = sc.nextInt();
            }

            int size = a.length;
            Arrays.sort(a);

            int[] max = new int[size / 2];
            int[] min = new int[size / 2];

            for (int i = 0; i < size / 2; i++) {
                max[i] = a[size - i - 1];
                min[i] = a[i];
            }

            int[] ans = new int[size / 2];
            for (int i = 0; i < size / 2; i++) {
                ans[i] = max[i] + min[i];
            }

            int maxNum = ans[0];
            for (int i = 1; i < size / 2; i++) {
                if (ans[i] > maxNum) {
                    maxNum = ans[i];
                }
            }

            System.out.println("The maximum number is " + maxNum);
        }
    }
}
