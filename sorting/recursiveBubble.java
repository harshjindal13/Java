
public class recursiveBubble {

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void bubbleSort(int arr[], int n) {
        if (n == 1) {
            return;
        }
        int didSwap = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

                didSwap = 1;
            }
        }
        if (didSwap == 0) {
            return;
        }

        System.out.println("run\n");
        bubbleSort(arr, n - 1);

    }

    public static void main(String[] args) {

        int arr[] = {2, 1, 4, 6};
        int n = arr.length;

        bubbleSort(arr, n);
        printArr(arr);

    }
}
