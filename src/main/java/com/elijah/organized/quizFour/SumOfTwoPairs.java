package com.elijah.organized.quizFour;

public class SumOfTwoPairs {

    public Object SumOfTwoPairsNumber(int[] numbers, int target)
    {
        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = i + 1; j< numbers.length; j++)
            {
                if (numbers[i] + numbers[j] == target)
                {
                    // Return the pair as an int array
                    return new int[]{numbers[i], numbers[j]};
                }
            }
        }
        return "no solution";
    }
}
