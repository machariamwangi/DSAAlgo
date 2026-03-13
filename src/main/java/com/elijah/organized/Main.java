package com.elijah.organized;

import com.elijah.organized.QuizThree.ReverseArray;
import com.elijah.organized.quizFive.ArraysShareElement;
import com.elijah.organized.quizFour.SumOfTwoPairs;
import com.elijah.organized.quizOne.LargeNumber;
import com.elijah.organized.quizTwo.EvenNumber;

public class Main {
    public static void main(String[] args) {

        // Question One
        int[] nums = {1,2,1,6,3,8, 4};
        LargeNumber largeNumber = new LargeNumber();
        var result = largeNumber.largestNumber(nums);
        System.out.println(result);

        //Time compexity  O(n)
        //space complexity is O(1) since we  have  only two variables  int i  and results  the allocation of memeory wont change


        //this
        var result2 = largeNumber.getLargeInterger(nums);
        System.out.println(result2);
        //Time complexity  // O(n log n)
        //space complexity // o(log n)


        //Question Two
        int[]  numsArray  = {1,2,3,4,5,6,7,8,9};
         EvenNumber evenNumber = new EvenNumber();
         var evenNumberCount =  evenNumber.getEvenNumbersCount(numsArray);
          System.out.println("evenNumberCount");
          System.out.println(evenNumberCount);

      //Question Three
        System.out.println("reverseArray");
     char[] chars = new  char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'};
        ReverseArray  reverseArray = new ReverseArray();
        var res = reverseArray.reverseArray(chars);
     for(char ch : res){
         //System.out.println(ch);
     }
       // performace one
    var res2 = reverseArray.reverseArrayPerformance(chars);
     System.out.println(res2);


     //Question 4
        System.out.println("========SumOfTwoPairsNumber=============");
        int[] numbers  =  new int[] {1,2,3,4,5,6,7};
        SumOfTwoPairs sumOfTwoPairs = new SumOfTwoPairs();
         int target = 19; //7;
        var respon =  sumOfTwoPairs.SumOfTwoPairsNumber(numbers, target);
        if (respon instanceof int[]) {
            int[] pair = (int[]) respon;
            System.out.println("Found pair: (" + pair[0] + ", " + pair[1] + ")");
        } else {
            System.out.println(respon); // prints "no solution"
        }


        //Question 5
        System.out.println("isMatching Elements>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Integer[] array1 = new  Integer[] {1,2,3,4,5,6,7,8,9};
        //Integer[] array2 = new  Integer[] {8,7,6,6,7,8,9};
        Integer[] array2 = new  Integer[] {11,12,13,14,15,16,17};
        ArraysShareElement arraysShareElement = new ArraysShareElement();
         Boolean isMatching = arraysShareElement.arraysShareElement(array1, array2);
         System.out.println(isMatching);

    }
}