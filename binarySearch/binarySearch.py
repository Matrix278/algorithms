def binarySearch(alist, item):
    first = 0
    last = len(alist)-1
    midpoint = 0

    while first <= last:
        midpoint = (first + last)//2
        
        if alist[midpoint] < item:
            first = midpoint + 1
        elif alist[midpoint] > item:
            last = midpoint - 1
        else:
            return midpoint
    return -1


test = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
result = binarySearch(test, 11)


if result != -1:
    print("Element is present at ", str(result))
else:
    print('Element is not present')
