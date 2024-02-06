
Merge Sort Implementation : 


---------------------------------------------axm9415------------------------------------------------------------------>

import java.util.*;

public class MergeSort {
  public static void main(String[] args) {
    int[] array = {5, 2, 4, 7, 1, 3, 2, 6};
    System.out.println("Original array: " + Arrays.toString(array));

    mergeSort(array, 0, array.length - 1);

    System.out.println("Sorted array: " + Arrays.toString(array));
  }

  // Merge Sort function
  public static void mergeSort(int[] array, int left, int right) {
    if (left < right) {
      // Find the middle point
      int middle = left + (right - left) / 2;

      // Recursively sort the first and second halves
      mergeSort(array, left, middle);
      mergeSort(array, middle + 1, right);

      // Merge the sorted halves
      merge(array, left, middle, right);
    }
  }

  // Merge function
  public static void merge(int[] array, int left, int middle, int right) {
    // Find sizes of two subarrays to be merged
    int n1 = middle - left + 1;
    int n2 = right - middle;

    // Create temporary arrays
    int[] leftArray = new int[n1];
    int[] rightArray = new int[n2];

    // Copy data to temporary arrays
    for (int i = 0; i < n1; ++i) {
      leftArray[i] = array[left + i];
    }
    for (int j = 0; j < n2; ++j) {
      rightArray[j] = array[middle + 1 + j];
    }

    // Merge the temporary arrays

    // Initial indices of first and second subarrays
    int i = 0, j = 0;

    // Initial index of merged subarray array
    int k = left;
    while (i < n1 && j < n2) {
      if (leftArray[i] <= rightArray[j]) {
        array[k] = leftArray[i];
        i++;
      } else {
        array[k] = rightArray[j];
        j++;
      }
      k++;
    }

    // Copy remaining elements of leftArray[], if there are any
    while (i < n1) {
      array[k] = leftArray[i];
      i++;
      k++;
    }

    // Copy remaining elements of rightArray[], if there are any
    while (j < n2) {
      array[k] = rightArray[j];
      j++;
      k++;
    }
  }
}


Output : 

Original array: [5, 2, 4, 7, 1, 3, 2, 6]
Sorted array: [1, 2, 2, 3, 4, 5, 6, 7]


