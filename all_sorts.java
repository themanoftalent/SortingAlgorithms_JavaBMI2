import java.util.Arrays;
import java.util.Stack;

public class SortAlgorithms {
    public static final boolean ENABLE_PRINT = false;

    public static void main(String[] args) {
//        int[] array = new int[]{3,5,3,0,8,6,1,5,8,6,2,4,9,4,7,0,1,8,9,7,3,1,2,5,9,7,4,0,2,6};
        int[] array = new int[]{5, 3, 9, 1, 6, 4, 10, 2, 8, 7, 15, 3, 2};
//        int[] array = new int[]{1, 1, 0};

        System.out.println("Before: " + Arrays.toString(array));
        SortAlgorithms.insertionSort(array);
//        SortAlgorithms.shellSort(array);
//        SortAlgorithms.selectionSort(array);
//        SortAlgorithms.heapSort(array);
//        SortAlgorithms.bubbleSort(array);
//        SortAlgorithms.quickSort(array, 0, array.length-1);
//        SortAlgorithms.quickSortByStack(array);
//        array = SortAlgorithms.mergingSort(array);
//        SortAlgorithms.radixSort(array);
        System.out.println("After:  " + Arrays.toString(array));
    }


    /**
     * Controls console output
     */
    private static void System_out_println(String str){
        if(ENABLE_PRINT){
            System.out.println(str);
        }
    }

 
    public static void insertionSort(int[] arr){
        for( int i=0; i<arr.length-1; i++ ) {
            for( int j=i+1; j>0; j-- ) {
                if( arr[j-1] <= arr[j] )
                    break;
                int temp = arr[j];      //Swap operation
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                System_out_println("Sorting:  " + Arrays.toString(arr));
            }
        }
    }

  
    public static void shellSort(int[] arr){
        int gap = arr.length / 2;
        for (; gap > 0; gap /= 2) {
            System_out_println("Gap=" + gap);
            for (int j = 0; (j+gap) < arr.length; j++){
                for(int k = 0; (k+gap)< arr.length; k += gap){
                    System_out_println("Compare： arr[" + (k+gap)+ "]=" + arr[k+gap] + ", arr[" + k + "]=" + arr[k]);
                    if(arr[k] > arr[k+gap]) {
                        int temp = arr[k+gap];      //Swap operation
                        arr[k+gap] = arr[k];
                        arr[k] = temp;
                        System_out_println("    Sorting:  " + Arrays.toString(arr));
                    }
                }
            }
        }
    }

 
    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            int min = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[min];      //Swap operation
                arr[min] = arr[i];
                arr[i] = temp;
                System_out_println("Sorting:  " + Arrays.toString(arr));
            }
        }
    }

    /**
  
    public static void heapSort(int[] arr){
        for(int i = arr.length; i > 0; i--){
            max_heapify(arr, i);

            int temp = arr[0];      //Swap operation
            arr[0] = arr[i-1];
            arr[i-1] = temp;
        }
    }

    private static void max_heapify(int[] arr, int limit){
        if(arr.length <= 0 || arr.length < limit) return;
        int parentIdx = limit / 2;

        for(; parentIdx >= 0; parentIdx--){
            if(parentIdx * 2 >= limit){
                continue;
            }
            int left = parentIdx * 2;
            int right = (left + 1) >= limit ? left : (left + 1);

            int maxChildId = arr[left] >= arr[right] ? left : right;
            if(arr[maxChildId] > arr[parentIdx]){
                int temp = arr[parentIdx];
                arr[parentIdx] = arr[maxChildId];
                arr[maxChildId] = temp;
            }
        }
        System_out_println("Max_Heapify: " + Arrays.toString(arr));
    }

  
}
