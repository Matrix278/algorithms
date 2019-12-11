# Algorithms

## Bubble sort
Bubble sort compares each pair of elements in a list and swaps them if they are out of order until the list is sorted.

### Visual
![Bubble sorting](bubbleSort/bubbleSort.gif)

### Code:
```javascript
function bubbleSort(arr) {
    var done = false;
  
    while(!done){
      done = true;
        for (var i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                var temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                done = false;
            }
        }
    }
    return arr;
}

bubbleSort([2, 6, 1, 9, 3, 8, 5, 4, 7]);
```

## Selection sort
A sort algorithm that repeatedly searches remaining items to find the least one and moves it to its final location. The run time is Θ(n²), where n is the number of elements. The number of swaps is O(n).

### Visual
![Selection sorting](selectionSort/selectionSort.gif)

### Code:
```javascript

```
