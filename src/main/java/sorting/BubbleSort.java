package sorting;

public class BubbleSort {

    public void sort(int[] inArr) {
        int length = inArr.length;
        boolean swapped = false;
        do {
            swapped = false;
            for (int i = 0; i <length -1 ; i++) {
                if (inArr[i] > inArr[i+1]) {
                    int temp = inArr[i+1];
                    inArr[i+1] = inArr[i];
                    inArr[i] = temp;
                    swapped = true;
                }
            }
        } while(swapped);
        return;
    }

    public static void main (String args[]) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr1 = {10, 2, 8, 11, 6};
        bubbleSort.sort(arr1);
        printArr(arr1);

        int[] arr2 = { 2, 5, 8, 10, 12};
        bubbleSort.sort(arr2);
        printArr(arr2);

        int[] arr3 = { 15, 13, 10, 8, 6};
        bubbleSort.sort(arr3);
        printArr(arr3);

    }

    private static void printArr(int[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] + " ,");
        }
    }

}
