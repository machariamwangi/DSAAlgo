package com.elijah.organized.quizTwo;

public class EvenNumber {
    public int getEvenNumbersCount(int [] arr){
        int totalEvenNumbers = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                totalEvenNumbers += 1;
            }
        }

        return totalEvenNumbers;
    }
}
