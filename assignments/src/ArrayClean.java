/** Write a Java program to remove duplicate elements from an array.
 * - Generate n random integer  (choose your range) numbers into an one-dimensional array.
 * - Count and Replace all duplicates with 0
 * - Measure the time of couting and replacing by multiple runs. What is your time on 1000 000 elements?
 * - What are the factors that increase time of processing?
 */

package assignments.src;

public class ArrayClean {

    public static void main(String[] args) {
        int[] arr = genArray(10);
        arrayClean(arr, arr.length);
    }

    public static int[] genArray(int n) {
        System.out.println("Generating array with " + n + " int. \n");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 9 + 1);
        }
        return arr;
    }

    public static int[] arrayClean(int[] arr, int n) {

        if (n == 0 || n == 1) {
            System.out.println("No duplicates.");
            return arr;
        } else {

            // print array before clean
            System.out.println("Array before cleaning:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\n");
        
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j] && arr[j] != 0) {
                        arr[j] = 0;
                        count++;
                    }
                }
            }

            // print array after clean
            System.out.println("Array after cleaning:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("\n\nNo. of duplicates: " + count);

            return arr;

        }
    }
}