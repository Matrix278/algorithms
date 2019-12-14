<?php

function bubbleSort($arrayOfNumbers){

    for($i = 0; $i < sizeof($arrayOfNumbers) - 1; $i++){

        for($j = 0; $j < sizeof($arrayOfNumbers) - 1 - $i; $j++){

            $k = $j+1;

            if($arrayOfNumbers[$k] < $arrayOfNumbers[$j]){

                $temporary = $arrayOfNumbers[$k];
                
                $arrayOfNumbers[$k] = $arrayOfNumbers[$j];

                $arrayOfNumbers[$j] = $temporary;

            }

        }

    }

    return $arrayOfNumbers;

}

bubbleSort(array(5,3,2,4,1));

?>