def selection_sort(arr):
    for i in range(len(arr)):
       minim= i
       for j in range(i+1, len(arr)):
          if arr[minim] > arr[j]:
             minim = j
       arr[i], arr[minim] = arr[minim], arr[i]
    for j in range(len(arr)):
        print(arr[j])
    
    
selection_sort([5,7,9,0,4])
selection_sort(['i','n','s','e','r','t','i','o','n'])
