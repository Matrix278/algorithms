function quickSort(arr) {
	if (arr.length <= 1) {
		return arr;
	} else {

		var left = [];
		var right = [];
		var newArray = [];
		var pivot = arr.pop();
		var length = arr.length;

		for (var i = 0; i < length; i++) {
			if (arr[i] <= pivot) {
				left.push(arr[i]);
			} else {
				right.push(arr[i]);
			}
		}
		return newArray.concat(quickSort(left), pivot, quickSort(right));
	}
}

quickSort([3, 0, 2, 5, -1, 4, 1 ]);
