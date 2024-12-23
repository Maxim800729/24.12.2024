//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 public class Main {
    public static int[] concat(int[] one, int[] two) {
        // Step 1: Create a new array to hold elements of both arrays
        int[] result = new int[one.length + two.length];

        // Step 2: Copy elements of the first array into the result array
        for (int i = 0; i < one.length; i++) {
            result[i] = one[i];
        }

        // Step 3: Copy elements of the second array into the result array
        for (int i = 0; i < two.length; i++) {
            result[one.length + i] = two[i];
        }

        // Step 4: Sort the array manually (bubble sort in this case)
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - 1 - i; j++) {
                if (result[j] > result[j + 1]) {
                    // Swap elements
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }

        // Return the sorted array
        return result;
    }

    public static void main(String[] args) {
        // Input arrays
        int[] arr1 = {-2, -1, 0, 4, 7, 10, 12};
        int[] arr2 = {-10, 1, 1, 1, 0, 2, 3, 6, 7, 10, 100, 1000};

        // Concatenate and sort the arrays
        int[] arr3 = concat(arr1, arr2);

        // Print the sorted array
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}