import java.util.Arrays;
import java.util.Stack;

public class SortAlgorithms { //Class name is SortAlgorithms
    public static final boolean ENABLE_PRINT = false; //Enable console output or not. Here we do not want to print the console output.

    public static void main(String[] args) { //Main method we need to call the sorting methods from the main method.
        int[] array = new int[]{5, 3, 9, 1, 6, 4, 10, 2, 8, 7, 15, 3, 2}; //Array of integers to be sorted.
        System.out.println("Before: " + Arrays.toString(array)); //Print the array before sorting.
        SortAlgorithms.insertionSort(array); //Call the insertionSort method to sort the array.
        System.out.println("After:  " + Arrays.toString(array)); //Print the array after sorting.
    }
//The following methods are the sorting algorithms. They are static methods, so we can call them directly from the main method.
    private static void System_out_println(String str){ //This is a helper method to print the console output.
        if(ENABLE_PRINT){ //Check if the console output is enabled or not.
            System.out.println(str); //Print the console output.
        }
    }

 // Insertion Sort Algorithm. I use the same array to demonstrate the sorting process.
    public static void insertionSort(int[] arr){ //Insertion Sort method. It takes an array of integers as input.
        for( int i=0; i<arr.length-1; i++ ) { //Iterate through the array from the second element to the last element.
            for( int j=i+1; j>0; j-- ) { //Iterate through the array from the current element to the first element.
                if( arr[j-1] <= arr[j] ) break; //If the previous element is less than or equal to the current element, then break the loop.
                int temp = arr[j]; //Swap operation
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                System_out_println("Sorting:  " + Arrays.toString(arr)); //Print the array after each swap operation.

            }
        }
    }


    // Bubble Sort Algorithm. I use the same array to demonstrate the sorting process.
    public static void bubbleSort(int[] arr){ //Bubble Sort method. It takes an array of integers as input.
        for( int i=0; i<arr.length-1; i++ ) { //Iterate through the array from the first element to the second last element.
            for( int j=0; j<arr.length-1-i; j++ ) { //Iterate through the array from the first element to the second last element.
                if( arr[j] > arr[j+1] ) { //If the current element is greater than the next element, then swap the elements.
                    int temp = arr[j]; //Swap operation
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System_out_println("Sorting:  " + Arrays.toString(arr)); //Print the array after each swap operation.
                }
            }
        }
    }

    // Selection Sort Algorithm. I use the same array to demonstrate the sorting process.
    public static void selectionSort(int[] arr){ //Selection Sort method. It takes an array of integers as input.
        for( int i=0; i<arr.length-1; i++ ) { //Iterate through the array from the first element to the second last element.
            int minIndex = i; //Set the minimum index to the current index.
            for( int j=i+1; j<arr.length; j++ ) { //Iterate through the array from the next element to the last element.
                if( arr[j] < arr[minIndex] ) minIndex = j; //If the current element is less than the minimum element, then set the minimum index to the current index.
            }
            if( minIndex != i ) { //If the minimum index is not equal to the current index, then swap the elements.
                int temp = arr[i]; //Swap operation
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                System_out_println("Sorting:  " + Arrays.toString(arr)); //Print the array after each swap operation.
            }
        }
    }

    // Merge Sort Algorithm. I use the same array to demonstrate the sorting process.
    public static void mergeSort(int[] arr){ //Merge Sort method. It takes an array of integers as input.
        mergeSort(arr, 0, arr.length-1); //Call the mergeSort method with the start index and end index of the array.
    }
    private static void mergeSort(int[] arr, int start, int end){ //Merge Sort method with start index and end index of the array.
        if( start < end ) { //If the start index is less than the end index, then continue the sorting process.
            int mid = (start + end) / 2; //Calculate the middle index of the array.
            mergeSort(arr, start, mid); //Call the mergeSort method with the start index and middle index of the array.
            mergeSort(arr, mid+1, end); //Call the mergeSort method with the middle index and end index of the array.
            merge(arr, start, mid, end); //Call the merge method to merge the sub-arrays.
        }
    }

    private static void merge(int[] arr, int start, int mid, int end){ //Merge method to merge the sub-arrays.
        int[] temp = new int[arr.length]; //Create a temporary array to store the merged sub-arrays.
        int i = start; //Set the start index of the first sub-array.
        int j = mid + 1; //Set the start index of the second sub-array.
        int k = start; //Set the start index of the temporary array.
        while( i <= mid && j <= end ) { //Iterate through the sub-arrays until one of them is empty.
            if( arr[i] <= arr[j] ) { //If the element of the first sub-array is less than or equal to the element of the second sub-array, then copy the element to the temporary array.
                temp[k] = arr[i];
                i++;
            } else { //If the element of the second sub-array is less than the element of the first sub-array, then copy the element to the temporary array.
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while( i <= mid ) { //Copy the remaining elements of the first sub-array to the temporary array.
            temp[k] = arr[i];
            i++;
            k++;
        }
        while( j <= end ) { //Copy the remaining elements of the second sub-array to the temporary array.
            temp[k] = arr[j];
            j++;
            k++;
        }
        for( i=start; i<=end; i++ ) { //Copy the elements of the temporary array back to the original array.
            arr[i] = temp[i];
        }
        System_out_println("Sorting:  " + Arrays.toString(arr)); //Print the array after each merge operation.
    }

    // Quick Sort Algorithm. I use the same array to demonstrate the sorting process.
    public static void quickSort(int[] arr){ //Quick Sort method. It takes an array of integers as input.
        quickSort(arr, 0, arr.length-1); //Call the quickSort method with the start index and end index of the array.
    }
    private static void quickSort(int[] arr, int start, int end){ //Quick Sort method with start index and end index of the array.
        if( start < end ) { //If the start index is less than the end index, then continue the sorting process.
            int pivot = partition(arr, start, end); //Call the partition method to get the pivot index.
            quickSort(arr, start, pivot-1); //Call the quickSort method with the start index and pivot index-1 of the array.
            quickSort(arr, pivot+1, end); //Call the quickSort method with the pivot index+1 and end index of the array.
        }
    }
    private static int partition(int[] arr, int start, int end){ //Partition method to get the pivot index.
        int pivot = arr[end]; //Set the pivot element to the last element of the array.
        int i = start - 1; //Set the index of the smaller element to the start index-1.
        for( int j=start; j<end; j++ ) { //Iterate through the array from the start index to the end index.
            if( arr[j] < pivot ) { //If the current element is less than the pivot element, then swap the elements.
                i++; //Increment the index of the smaller element.
                int temp = arr[i]; //Swap operation
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1]; //Swap operation
        arr[i+1] = arr[end];
        arr[end] = temp;
        System_out_println("Sorting:  " + Arrays.toString(arr)); //Print the array after each partition operation.
        return i+1; //Return the pivot index.
    }

    // Heap Sort Algorithm. I use the same array to demonstrate the sorting process.
    public static void heapSort(int[] arr){ //Heap Sort method. It takes an array of integers as input.
        int n = arr.length; //Get the length of the array.
        for( int i=n/2-1; i>=0; i-- ) { //Build the heap from the array.
            heapify(arr, n, i); //Call the heapify method to heapify the array.
        }
        for( int i=n-1; i>0; i-- ) { //Extract elements from the heap one by one.
            int temp = arr[0]; //Swap operation
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0); //Call the heapify method to heapify the array.
            System_out_println("Sorting:  " + Arrays.toString(arr)); //Print the array after each swap operation.
        }
    }
    private static void heapify(int[] arr, int n, int i){ //Heapify method to heapify the array.
        int largest = i; //Set the largest element to the current element.
        int left = 2*i + 1; //Get the left child index of the current element.
        int right = 2*i + 2; //Get the right child index of the current element.
        if( left < n && arr[left] > arr[largest] ) largest = left; //If the left child is greater than the largest element, then set the largest element to the left child.
        if( right < n && arr[right] > arr[largest] ) largest = right; //If the right child is greater than the largest element, then set the largest element to the right child.
        if( largest != i ) { //If the largest element is not equal to the current element, then swap the elements.
            int temp = arr[i]; //Swap operation
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest); //Call the heapify method to heapify the array.
        }
    }

    // Counting Sort Algorithm. I use the same array to demonstrate the sorting process.
    public static void countingSort(int[] arr){ //Counting Sort method. It takes an array of integers as input.
        int n = arr.length; //Get the length of the array.
        int max = arr[0]; //Set the maximum element to the first element of the array.
        for( int i=1; i<n; i++ ) { //Find the maximum element in the array.
            if( arr[i] > max ) max = arr[i]; //If the current element is greater than the maximum element, then set the maximum element to the current element.
        }
        int[] count = new int[max+1]; //Create a count array to store the count of each element.
        for( int i=0; i<n; i++ ) { //Count the occurrences of each element in the array.
            count[arr[i]]++;
        }
        for( int i=1; i<=max; i++ ) { //Calculate the cumulative count of each element in the count array.
            count[i] += count[i-1];
        }
        int[] output = new int[n]; //Create an output array to store the sorted elements.
        for( int i=n-1; i>=0; i-- ) { //Build the output array by placing the elements in their correct positions.
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        for( int i=0; i<n; i++ ) { //Copy the elements from the output array to the original array.
            arr[i] = output[i];
        }
        System_out_println("Sorting:  " + Arrays.toString(arr)); //Print the array after each counting operation.
    }

    // Radix Sort Algorithm. I use the same array to demonstrate the sorting process.
    public static void radixSort(int[] arr){ //Radix Sort method. It takes an array of integers as input.
        int n = arr.length; //Get the length of the array.
        int max = arr[0]; //Set the maximum element to the first element of the array.
        for( int i=1; i<n; i++ ) { //Find the maximum element in the array.
            if( arr[i] > max ) max = arr[i]; //If the current element is greater than the maximum element, then set the maximum element to the current element.
        }
        for( int exp=1; max/exp>0; exp*=10 ) { //Iterate through the digits of the maximum element.
            countingSortRadix(arr, n, exp); //Call the countingSortRadix method to sort the array based on the current digit.
            System_out_println("Sorting:  " + Arrays.toString(arr)); //Print the array after each counting operation.
        }
    }
    private static void countingSortRadix(int[] arr, int n, int exp){ //Counting Sort method for Radix Sort.
        int[] output = new int[n]; //Create an output array to store the sorted elements.
        int[] count = new int[10]; //Create a count array to store the count of each digit.
        for( int i=0; i<n; i++ ) { //Count the occurrences of each digit in the array.
            count[(arr[i]/exp)%10]++;
        }
        for( int i=1; i<10; i++ ) { //Calculate the cumulative count of each digit in the count array.
            count[i] += count[i-1];
        }
        for( int i=n-1; i>=0; i-- ) { //Build the output array by placing the elements in their correct positions.
            output[count[(arr[i]/exp)%10]-1] = arr[i];
            count[(arr[i]/exp)%10]--;
        }
        for( int i=0; i<n; i++ ) { //Copy the elements from the output array to the original array.
            arr[i] = output[i];
        }
    }

    // Bucket Sort Algorithm. I use the same array to demonstrate the sorting process.
    public static void bucketSort(int[] arr){ //Bucket Sort method. It takes an array of integers as input.
        int n = arr.length; //Get the length of the array.
        int max = arr[0]; //Set the maximum element to the first element of the array.
        for( int i=1; i<n; i++ ) { //Find the maximum element in the array.
            if( arr[i] > max ) max = arr[i]; //If the current element is greater than the maximum element, then set the maximum element to the current element.
        }
        int numBuckets = (int)Math.ceil(Math.sqrt(n)); //Calculate the number of buckets based on the square root of the length of the array.
        int[] buckets = new int[numBuckets]; //Create an array of buckets to store the elements.
        for( int i=0; i<n; i++ ) { //Distribute the elements into the buckets.
            int index = (int)Math.floor((arr[i]*numBuckets)/(max+1)); //Calculate the index of the bucket for the current element.
            buckets[index] = arr[i]; //Place the current element into the bucket.
        }
        for( int i=0; i<numBuckets; i++ ) { //Sort each bucket using the insertion sort algorithm.
            insertionSort(buckets);
            System_out_println("Sorting:  " + Arrays.toString(buckets)); //Print the array after each bucket sort operation.
        }
        int k = 0; //Set the index of the original array.
        for( int i=0; i<numBuckets; i++ ) { //Merge the elements from the buckets into the original array.
            for( int j=0; j<buckets.length; j++ ) { //Iterate through the elements of each bucket.
                arr[k++] = buckets[j]; //Copy the element from the bucket to the original array.
            }
        }
    }

    // Drive
    public static void drive() {
        int[] array = new int[]{5, 3, 9, 1, 6, 4, 10, 2, 8, 7, 15, 3, 2}; //Array of integers to be sorted.
        System.out.println("Before: " + Arrays.toString(array)); //Print the array before sorting.
        SortAlgorithms.insertionSort(array); //Call the insertionSort method to sort the array.
        System.out.println("After:  " + Arrays.toString(array)); //Print the array after sorting.
    }
}
