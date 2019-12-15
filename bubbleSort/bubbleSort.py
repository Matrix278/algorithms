def bubbleSort(arrayOfNumbers):
    for i in range(len(arrayOfNumbers) - 1):
        for j in range(len(arrayOfNumbers) - 1 - i):
            if arrayOfNumbers[j] > arrayOfNumbers[j + 1]:
                arrayOfNumbers[j], arrayOfNumbers[j + 1] = arrayOfNumbers[j + 1], arrayOfNumbers[j]
    return arrayOfNumbers

print(bubbleSort([5,3,2,4,1]))
