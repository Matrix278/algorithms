<?php
ini_set('display_errors', 1);
ini_set('display_startup_errors', 1);
error_reporting(E_ALL);
function binarySearch(array $arr, $key)
{
    $first = 0;
    $last = count($arr) -1;

    while ($first <= $last) {
        $mid = round(($first + $last) / 2);
        if ($arr[$mid] < $key) {
            $first = $mid + 1;
        } else if ($arr[$mid] == $key) {
            //found
            $position = $mid;
            break;
        } else {
            $last = $mid - 1;
        }
    }
    return $position;
}
$index  = binarySearch([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20], 13);
echo $index;
