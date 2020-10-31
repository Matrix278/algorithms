#include <stdio.h> 
#include <stdlib.h> 

void merge(int array[], int l, int m, int r) 
{ 
    int i, j, k; 
    int num1 = m - l + 1; 
    int num2 = r - m; 
 
    /* create temp arrays */
    int Left[num1], Right[num2]; 
 
    /* Copy data to temp arrays L[] and R[] */
    for (i = 0; i < num1; i++) 
        Left[i] = array[l + i]; 
    for (j = 0; j < num2; j++) 
        Right[j] = array[m + 1 + j]; 

    i = 0; 
    j = 0; 
    k = l; 
    while (i < num1 && j < num2) { 
        if (Left[i] <= Right[j]) { 
            array[k] = Left[i]; 
            i++; 
        } 
        else { 
            array[k] = Right[j]; 
            j++; 
        } 
        k++; 
    } 
 
    while (i < num1) { 
        array[k] = Left[i]; 
        i++; 
        k++; 
    } 
 
    while (j < num2) { 
        array[k] = Right[j]; 
        j++; 
        k++; 
    } 
} 
 
void mergeSort(int array[], int l, int r) 
{ 
    if (l < r) { 
        int m = l + (r - l) / 2; 
 
        mergeSort(array, l, m); 
        mergeSort(array, m + 1, r); 
 
        merge(array, l, m, r); 
    } 
} 
 
/* UTILITY FUNCTIONS */
/* Function to print an array */
void printArray(int A[], int size) 
{ 
    int i; 
    for (i = 0; i < size; i++) 
        printf("%d ", A[i]); 
    printf("\n"); 
} 
 
int main() 
{ 
    int arr[] = { 6, 5, 3, 1, 8, 7, 2, 4}; 
    int arr_size = sizeof(arr) / sizeof(arr[0]); 
 
    printf("Given array is \n"); 
    printArray(arr, arr_size); 
 
    mergeSort(arr, 0, arr_size - 1); 
 
    printf("\nSorted array is \n"); 
    printArray(arr, arr_size); 
    return 0; 
} 