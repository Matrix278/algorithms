def partition(arr, left, right):
  i = (left-1)
  pivot = arr[right]

  for j in range(left, right):
    if arr[j] <= pivot:
      i = i+1
      arr[i], arr[j] = arr[j], arr[i]

  arr[i+1], arr[right] = arr[right], arr[i+1]
  return (i+1)

def quickSort(arr, left, right):
  if len(arr) == 1:
    return arr
  if left < right:
    pi = partition(arr, left , right)
    quickSort(arr, left, pi-1)
    quickSort(arr, pi+1, right)

def printMessage(arr, title):
  print(title)
  for i in range(arrLength):
    print("%d" % arr[i]),

# Example array
arr = [10, 7, 8, 9, 1, 2, 4, 5, 3, 6]
arrLength = len(arr)

printMessage(arr, "Before sorted:")
print("\n")

quickSort(arr, 0, arrLength-1)
printMessage(arr, "After sorted:")