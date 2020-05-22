package binarytrees;

public class Heap {


    public static void main(String args[]) {
        //Heap heap = new Heap();
        int[ ] arr = { 1, 2, 3, 4, 7, 8, 9, 10, 14, 16 };
        heapify(arr);
        System.out.println("After heapify");

        for (int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] + " ");
        }


        int[ ] arr2 = { 1, 2, 3, 4, 7, 8, 9, 10, 14, 16 };
        BuildMaxHeap(arr2);
        System.out.println("After heapify - 2");

        for (int i = 0; i < arr2.length; i ++) {
            System.out.print(arr2[i] + " ");
        }
    }

    public static void heapify(int[] inArr) {
        for (int i = (int)Math.floor( inArr.length - 1 ); i >=0; i--) {
            heapify(inArr, i);
        }
    }

    public static void heapify(int[] arr, int i) {
        int leftPos = i * 2 +1;
        int rightPos = i * 2 + 2;
        int largest = i;

        if ((leftPos < arr.length) && (arr[leftPos] > arr[largest])) {
            largest = leftPos;
        }

        if ((rightPos < arr.length) && (arr[rightPos] > arr[largest])) {
            largest = rightPos;
        }

        if (largest != i)
        {
            System.out.println("Swapping positions " + largest + " " + i + " values - " + arr[largest] +  " " + arr[i]);
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(arr, largest);
        }
    }


    public static void BuildMaxHeap( int[ ] arr )
    {
        for( int i = (int)Math.floor( arr.length - 1 ); i >= 0; i-- )
            MaxHeapify( arr, i );
    }
    public static void MaxHeapify( int[ ] arr, int i )
    {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if( left < arr.length && arr[ left ] > arr[ largest ] )
            largest = left;
        if( right < arr.length && arr[ right ] > arr[ largest ] )
            largest = right;
        if( largest != i )
        {
            System.out.println("Swapping -2  positions " + largest + " " + i + " values - " + arr[largest] +  " " + arr[i]);
            int temp = arr[ i ];
            arr[ i ] = arr[ largest ];
            arr[ largest ] = temp;
            MaxHeapify( arr, largest );
        }
    }
}
