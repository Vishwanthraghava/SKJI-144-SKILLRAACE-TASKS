import java.util.Scanner;

public class TASK_1A {
    public static int minimumNotes(int N) {
        // List of denominations in descending order
        int[] denominations = {100, 50, 10, 5, 2, 1};
        int count = 0;  // To keep track of the number of notes
        for (int denom : denominations) {
            if (N == 0) {
                break;
            }
            count += N / denom;  // Find out how many notes of this denomination are needed
            N %= denom;  // Reduce N by the amount we have covered with this denomination
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the change to be given (Rs. N): ");
        int N = scanner.nextInt();
        scanner.close();

        int result = minimumNotes(N);
        System.out.println("The smallest number of notes that will combine to give Rs. " + N + " is: " + result);
    }
}

