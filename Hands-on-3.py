def merge_sort(arr):
    if len(arr) > 1:
        mid = len(arr) // 2  # Find the middle of the array
        left_half = arr[:mid]  # Divide the array into two halves
        right_half = arr[mid:]

        merge_sort(left_half)  # Recursive call on the left half
        merge_sort(right_half)  # Recursive call on the right half

        # Merge the two halves
        merge(arr, left_half, right_half)


def merge(arr, left, right):
    i = j = k = 0

    # Copy data to temporary arrays left[] and right[]
    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            arr[k] = left[i]
            i += 1
        else:
            arr[k] = right[j]
            j += 1
        k += 1

    # Check for any remaining elements in left[] and right[]
    while i < len(left):
        arr[k] = left[i]
        i += 1
        k += 1

    while j < len(right):
        arr[k] = right[j]
        j += 1
        k += 1


# Example usage
if __name__ == "__main__":
    input_array = [5,2,4,7,1,3,2,6]
    print("Original array:", input_array)

    merge_sort(input_array)

    print("Sorted array:", input_array)

Output : 

Original array: [5, 2, 4, 7, 1, 3, 2, 6]
Sorted array: [1, 2, 2, 3, 4, 5, 6, 7]
