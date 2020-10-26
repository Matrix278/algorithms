import java.util.Arrays;

public class SelectionSort{

    //main function or driver code
    public static void main(String args[]) {
        //input as given in the example from readme
        int[] data = { 1, 5, 6, 2, 3, 8, 4, 7, 9 };
        SelectionSort ss = new SelectionSort();
        ss.sortAscending(data);
        System.out.println("Sorted Array in Ascending Order: ");
        //Verify this ouputs - [1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(Arrays.toString(data));    
      }


    //Code to sort the array in ascending order
    public void sortAscending(final int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        int minElementIndex = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[minElementIndex] > arr[j]) {
                minElementIndex = j;
            }
        }
 
        if (minElementIndex != i) {
            int tempForSwapping = arr[i];
            arr[i] = arr[minElementIndex];
            arr[minElementIndex] = tempForSwapping;
        }
    }
}
}