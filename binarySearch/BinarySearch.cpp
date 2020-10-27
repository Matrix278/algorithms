#include <bits/stdc++.h> 
using namespace std; 
  
  //function which returns position of number entered
int binarySearch(int arr[], int l, int r, int x) 
{ 
    if (r >= l) { 
        int mid = l + (r - l) / 2; 
         //if mid element is equal to number entered
        if (arr[mid] == x) 
            return mid; 
            
         //if enetred number lies in left half of array
        if (arr[mid] > x) 
            return binarySearch(arr, l, mid - 1, x); 
            
        //if enetered number present in right half of array
        return binarySearch(arr, mid + 1, r, x); 
    } 
    //if number entered not present in array
    return -1; 
} 

int main(void) 
{ 
    int arr[] = {12,45,56,70,99}; 
    int x = 45; 
    int n = sizeof(arr) / sizeof(arr[0]); 
    int result = binarySearch(arr, 0, n - 1, x); 
    (result == -1) ? cout << "Element is not present in array": cout << "Element is present at index " << result; 
                   
    return 0; 
} 
