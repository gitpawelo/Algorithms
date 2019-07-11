package Sort;


public class BubbleSort {

    public static void bubbleSort(int[] numArray) {

        int n = numArray.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (numArray[j - 1] > numArray[j]) {
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                }

            }
        }
        for (int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }

    }

    public static void main(String[] args) {

        int[] numArray = {5, 8, 14, 1, 5678, 32};
        bubbleSort(numArray);
    }
}
