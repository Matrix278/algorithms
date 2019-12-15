# Algorithms

## Bubble sort(Сортировка пузырьком)
Bubble sort compares each pair of elements in a list and swaps them if they are out of order until the list is sorted. Like insertion sort, bubble sort is a comparison algorithm and runs in O(n²) time, making it an inefficient algorithm for larger lists.

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

## Selection sort(Сортировка выбором)
A sort algorithm that repeatedly searches remaining items to find the least one and moves it to its final location. The run time is O(n²), where n is the number of elements. The number of swaps is O(n).

### Visual
![Selection sorting](selectionSort/selectionSort.gif)

### Code:
```javascript
function selectionSort(arr){
    for (let i = 0; i < arr.length; i++) {
        let min = i;
        for (let j = i + 1; j < arr.length; j++) {
            if (arr[min] > arr[j]) {
                min = j;
            }
        }
        if (min !== i) {
            let tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }
    return arr;
}

selectionSort([1, 5, 6, 2, 3, 8, 4, 7, 9,]);
```

## Insertion sort(Сортировка вставками)
Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands. This sort is based on the idea that one element from the input elements is consumed in each iteration to find its correct position i.e, the position to which it belongs in a sorted array. Since is the first element has no other element to be compared with, it remains at its position. It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or merge sort.

### Visual
![Insertion sorting](insertionSort/insertionSort.gif)

### Code:
```javascript
function insertionSort(arr){
  for (var i = 1; i < arr.length; i++){
    if (arr[i] < arr[0]){
      //move current element to the first position
      arr.unshift(arr.splice(i,1)[0]);
    }else if (arr[i] > arr[i-1]){
      //leave current element where it is
      continue;
    }else{
      //find where element should go
      for (var j = 1; j < i; j++){
        if (arr[i] > arr[j-1] && arr[i] < arr[j]){
          //move element
          arr.splice(j,0,arr.splice(i,1)[0]);
        }
      }
    }
  }
  return arr;
}

insertionSort([3, 0, 2, 5, 6, 4, 1]);
```

## Binary search(Бинарный поиск)

## Merge sort(Сортировка слиянием)

## Quicksort(Быстрая сортировка)

## Counting sort(Сортировка подсчётом)

## Heapsort(Пирамидальная сортировка)
