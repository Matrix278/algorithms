<?php
function selectionSort(array $arr)
{
    $length = count($arr);
    for ($i = 0; $i < $length; $i++) {
        $min = $i;
        for ($j = $i + 1; $j < $length; $j++) {
            if ($arr[$min] > $arr[$j]) {
                $min = $j;
            }
        }
        if ($min !== $i) {
            $tmp = $arr[$i];
            $arr[$i] = $arr[$min];
            $arr[$min] = $tmp;
        }
    }
    return $arr;
}

print_r(selectionSort([1, 5, 6, 2, 3, 8, 4, 7, 9,]));
