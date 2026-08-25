import java.util.Scanner;

class CountOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element: ");
        int element = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                count++;
            }
        }

        System.out.println("Occurrence of " + element + " = " + count);
    }
}