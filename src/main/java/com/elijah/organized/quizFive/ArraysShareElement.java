package com.elijah.organized.quizFive;

public class ArraysShareElement {

    // dynamic method
    public <T> Boolean arraysShareElement(T[] numsArray1, T[] numsArray2)
    {
        for(int i =0; i < numsArray1.length; i++) {
            for(int j =0 ; j< numsArray2.length; j++) {
                if(numsArray1[i] == numsArray2[j]){
                    return true;
                }
            }
        }

        //if nothing matches
        return false;
    }

}
