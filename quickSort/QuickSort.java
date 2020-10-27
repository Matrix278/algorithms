import java.util.Arrays;
import java.util.Stack;

public class QuickSort {
    public static void main(String[] args) {
        int nums[] = {4, 3, 5, 2, 1, 3, 2, 3};

        quickSort(nums);

        System.out.println(Arrays.toString(nums));
    }

    private static void quickSort(int[] num) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(num.length - 1);

        while (!stack.isEmpty()) {
            int high = stack.pop();
            int low = stack.pop();

            int pivot = partition(num, low, high);

            if (pivot - 1 > low) {
                stack.push(low);
                stack.push(pivot - 1);
            }

            if (pivot + 1 < high) {
                stack.push(pivot + 1);
                stack.push(high);
            }
        }
    }

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (nums[j] <= pivot) {
                i++;

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;

        return i + 1;
    }
}