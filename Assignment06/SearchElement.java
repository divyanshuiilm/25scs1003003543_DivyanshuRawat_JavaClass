import java.util.Scanner;

class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("Element found");
                return;
            }
        }

        System.out.println("Element not found");
    }
}