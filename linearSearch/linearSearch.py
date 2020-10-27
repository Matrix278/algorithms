def linearSearch(arr, item):
  for i in range(0, len(arr)):
    if (arr[i] == item):
      return i
  return -1

print("Element found at index "+str(linearSearch([1, 2, 3, 5, 7, 11, 13, 17, 23, 31], 13)))
