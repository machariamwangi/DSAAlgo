package com.elijah.organized.QuizThree;

public class ReverseArray {

    public char[]  reverseArray(char[] chars){

        //create a temp holder  O(1)
        char[] reversedArray = new char[chars.length]; // this is another duplicate memory from original one    //space is O(n) //additinal memory is used
         //original memory + new memory n(original) + n(new)
        for (int i = 0; i<chars.length; i++) {  // for n no of array we will run the loop n times
            char lastElement = chars[chars.length-1-i];   //O(1)
            reversedArray[i] = lastElement;
        }
        return reversedArray;  // O(1)     // so we run have c1 + n * c2 + c3  = c4 + n * c2  remove coeffience we have O(n)
    }

    // more performance(efficient ) in terms of storage

    public char[] reverseArrayPerformance(char[] chars){
        int left = 0;   //o(1)
        int right = chars.length-1;   //O(1)
         while (left < right){   //  this makes number of iterations to be half  i.e n /2  so O(n/2) => O(n)
             char temp = chars[left];  //O(1)
             chars[left] = chars[right];
             chars[right] = temp;
             left++;
             right--;
         }
      // since we create constant variables and no array is recreated and they dont change with input size  they all have O(1)
         return chars;  //o(1)
    }
   ///  how can i make this dynamic

    public <T> T[] reverseAnArray(T[] array){
        // create  a temp array
        T[] reversedArray =array.clone();
        for (int i = 0; i < array.length; i++) {
            T lastElement = array[array.length-1-i];
            reversedArray[i] = lastElement;
        }
        return reversedArray;
    }


    public <T> T[] reverseAnArrayPerformance(T[] array){
        int left = 0;
        int right = array.length-1;
        while (left < right){
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        return array;
    }
}
