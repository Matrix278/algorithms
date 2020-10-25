function countingSort(arr, max) {
    const count = new Array(max + 1);
    for (let i = 0; i < max + 1; ++i) count[i] = 0;

    for (let i = 0; i < arr.length; ++i) count[arr[i]] += 1;

    let total = 0;
    for (let i = 0; i < count.length; ++i) {
       const prevTotal = total;
       total += count[i];
       count[i] = prevTotal;
    }

    const output = arr.slice();
    for (let i = 0; i < arr.length; ++i) {
        output[count[arr[i]]] = arr[i];
        count[arr[i]] += 1;
    }

    return output;
}

countingSort([1, 2, 3, 2, 7, 9, 1, 0], 9);