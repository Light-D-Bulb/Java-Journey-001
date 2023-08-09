import java.util.Scanner;
public class HourGlassSum {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        // Get the size of the array
        int n = scanner.nextInt();
        // Create an array to store the numbers
        int[][] array = new int[n][n];
        // Read the numbers from the console and store them in the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        // Find the minimum sum of the hour glasses in the array
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int sum = array[i][j] + array[i][j + 1] + array[i][j + 2]
                        + array[i + 1][j + 1]
                        + array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];
                minSum = Math.min(minSum, sum);
            }
        }
        // Print the minimum sum
        System.out.println("Mitesh Mandal");
        System.out.println("21BCE10428");
        System.out.println(minSum);
    }
}
