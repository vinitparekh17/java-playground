public class SortAlgo {
    public static void main(String[] args) {
        int[] list1 = {10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 15, 16, 17, 23, 24, 18, 19, 20, 21, 7, 8, 9, 14, 22};
        System.out.println("Array before sorting:");
        printList(list1);

        int[] list2 = {10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 15, 16, 17, 23, 24, 18, 19, 20, 21, 7, 8, 9, 14, 22};
        bubbleSort(list2);
        System.out.println("\n\nBubble Sort:");
        printList(list2);

        int[] list3 = {10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 15, 16, 17, 23, 24, 18, 19, 20, 21, 7, 8, 9, 14, 22};
        selectionSort(list3);
        System.out.println("\n\nSelection Sort:");
        printList(list3);

        int[] list4 = {10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 15, 16, 17, 23, 24, 18, 19, 20, 21, 7, 8, 9, 14, 22};
        insertionSort(list4);
        System.out.println("\n\nInsertion Sort:");
        printList(list4);

        int[] list5 = {10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 15, 16, 17, 23, 24, 18, 19, 20, 21, 7, 8, 9, 14, 22};
        quickSort(list5, 0, list5.length - 1);
        System.out.println("\n\nQuick Sort:");
        printList(list5);

        int[] list6 = {10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 15, 16, 17, 23, 24, 18, 19, 20, 21, 7, 8, 9, 14, 22};
        mergeSort(list6, 0, list6.length - 1);
        System.out.println("\n\nMerge Sort:");
        printList(list6);
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
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int temp;
        int minIndex;

        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < temp) {
                    minIndex = j;
                    temp = arr[j];
                }
            }
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if(arr.length == 2) {
            if(arr[0] > arr[1]) {
                swap(arr, 0, 1);
            }
        } else{
            if(left < right) {
                int middle = left + (right - left) / 2;
                mergeSort(arr, left, middle);
                mergeSort(arr, middle + 1, right);

                int leftLength = middle - left + 1;
                int rightLength = right - middle;

                int[] leftArray = new int[leftLength];
                int[] rightArray = new int[rightLength];

                System.arraycopy(arr, left, leftArray, 0, leftLength);
                System.arraycopy(arr, middle + 1, rightArray, 0, rightLength);

                int i = 0, j = 0;
                int k = left;

                while (i < leftLength && j < rightLength) {
                    if (leftArray[i] <= rightArray[j]) {
                        arr[k] = leftArray[i];
                        i++;
                    } else {
                        arr[k] = rightArray[j];
                        j++;
                    }
                    k++;
                }

                while (i < leftLength) {
                    arr[k] = leftArray[i];
                    i++;
                    k++;
                }

                while (j < rightLength) {
                    arr[k] = rightArray[j];
                    j++;
                    k++;
                }
            }
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, (i + 1), right);
        return i + 1;
    }

    private static void swap(int[] arr, int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
}