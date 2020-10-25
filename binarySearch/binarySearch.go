package main

import "log"

// binarySearch accepts a sorted array `a` and a number `find` and returns
// the index of `find` if it exists else -1
func binarySearch(a []int, find int) int {
	first, last := 0, len(a)-1
	for first <= last {
		mid := (first + last) / 2
		if a[mid] == find {
			return mid
		} else if a[mid] < find {
			first = mid + 1
		} else {
			last = mid - 1
		}
	}

	return -1
}

// go run binarySearch.go
func main() {
	a := []int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}
	find := 17
	log.Printf("%d is at index %d", find, binarySearch(a, find))
}
