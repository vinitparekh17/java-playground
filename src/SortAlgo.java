public class SortAlgo {
    public static void main(String[] args) {
        int[] list = {10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 15, 16, 17, 23, 24, 18, 19, 20, 21, 7, 8, 9, 14, 22};

        printList(list);
        //bubbleSort(list);
        selectionSort(list);
        System.out.println();
        printList(list);


    }

    private static void printList(int[] list) {
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = min;
        }
    }

    public static void insertionSort(int[] arr) {
        // changes
    }
}