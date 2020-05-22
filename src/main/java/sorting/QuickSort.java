package sorting;

public class QuickSort {

    public void sort(int[] inArr, int start, int end) {
        System.out.println("start, end " + start + " " + end);
        if (start > end)
        {
            return;
        }
        int pivotPos = (end - start) / 2;

        System.out.println("pivotPos is " + pivotPos);
        int pivot = inArr[pivotPos];

        for (int i = 0; i <pivotPos; i++) {
          if (inArr[i] > pivot) {
              int val = inArr[i];
              System.out.println("Left val " + val);
              moveLeft(inArr, i, pivotPos);
              System.out.println("After left move");
              printArr(inArr);
              inArr[pivotPos] = val;
              pivotPos = pivotPos--;
              System.out.println("After all left move");
              printArr(inArr);

          }
        }

        for (int i = pivotPos + 1; i <end; i++) {
            if (inArr[i] < pivot) {
                int val = inArr[i];
                moveRight(inArr, pivotPos, i);
                inArr[pivotPos] = val;
                pivotPos++;
            }
        }


        sort(inArr, start, pivotPos -1);
        sort(inArr, pivotPos + 1, end);
    }

    private void moveLeft(int[] inArr, int p, int pivotPos) {
        for (int i = p; i <= pivotPos; i++) {
            inArr[i] = inArr[i+1];
        }
    }

    private void moveRight(int[] inArr, int pivot, int pos) {
        System.out.println("Moveright " + pivot + " " + pos);
        for (int i = pos; i <pivot; i--){
            inArr[i] = inArr[i-1];
        }
    }

    public static void main (String args[]) {
        //int[] arr = {4, 2, 3, 7, 30, 15, 12, 9};
        int[] arr = {4, 2, 3};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr, 0, arr.length -1);
        quickSort.printArr(arr);
    }

    private void printArr(int[] arr) {
        for (int i =0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }



}
