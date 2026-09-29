import java.util.Scanner;
class ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
OUTPUT:
Enter array size: 5
Enter elements:
45 56 76 43 65
Sorted array: 43 45 56 65 7
