public class SearchAlgo {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
        int target = 21;

        var result1 = LinearSearch(list, target);
        System.out.println(result1 == -1 ? "Target does not exist" : result1);

        var result2 = BinarySearch(list, target, 0, list.length - 1);
        System.out.println(result2 == -1 ? "Target does not exist" : result2);

    }

    public static int LinearSearch(int[] list, int target) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(int[] list, int target, int start, int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (list[mid] == target) {
                return mid;
            } else if (list[mid] < target) {
                return BinarySearch(list, target, mid + 1, end);
            } else if (list[mid] > target) {
                return BinarySearch(list, target, start, mid - 1);
            }
        }
        return -1;
    }
}