package org.example;

import java.util.LinkedList;
import java.util.List;

public class Math {

    public List<Integer> primeNumbersGenerator(int n){
        List<Integer> numbers = new LinkedList<>();

        if(n >= 2){
            numbers.add(2);
        }

        for(int i = 3; i <= n; i += 2){
            if(isPrime(i))
                numbers.add(i);
        }

        return numbers;
    }

    private boolean isPrime(int i) {
        if (i < 2)
            return false;

        for(int j = 2; j * j < i; j++){
            if(i % j == 0)
                return false;
        }

        return  true;
    }
}
