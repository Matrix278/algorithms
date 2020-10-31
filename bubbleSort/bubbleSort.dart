main() {
  List<int> arr = [3, 60, 35, 2, 45, 320, 5];
  _bubbleSort(arr);
  print(arr);
}

///Swaps the value on the indexA with the value on the indexB of the given array
void _swap(List<int> arr, int indexA, int indexB) {
  final int tmp = arr[indexA];
  arr[indexA] = arr[indexB];
  arr[indexB] = tmp;
}

///Sorts the given array using the Bubble Sort algorithm
void _bubbleSort(List<int> arr) {
  bool swapped;
  do {
    swapped = false;
    for (var indexA = 0; indexA < arr.length - 1;) {
      final int indexB = indexA + 1;
      if (arr[indexA] > arr[indexB]) {
        _swap(arr, indexA, indexB);
        swapped = true;
      }
      indexA = indexB;
    }
  } while (swapped);
}
