<?php
function insertionSort(array $arr)
{
    $length = count($arr);
    for ($j = 1; $j < $length; $j++) {
        $key = $arr[$j];
        $i = $j-1;
        while (($i > -1) && ( $arr[$i] > $key )) {
            $arr[$i+1] = $arr[$i];
            $i--;
        }
        $arr[$i+1] = $key;
    }
    return $arr;
}

print_r(insertionSort([3, 0, 2, 5, 6, 4, 1]));
