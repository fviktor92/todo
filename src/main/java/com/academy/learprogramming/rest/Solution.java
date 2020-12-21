/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.academy.learprogramming.rest;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays.*;
import java.util.stream.Collectors;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        List<Integer> numbers = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> minNums = new ArrayList<>();
        List<Integer> minNumIndices = new ArrayList<>();
        List<Integer> maxNums = new ArrayList<>();
        List<Integer> maxNumIndices = new ArrayList<>();
        
        for(int j = 0; j < numbers.size() - 1; j++)
        {
            int min = numbers.get(0);
            int minIndex = 0;
            int max = numbers.get(0);
            int maxIndex = 0;
            for(int i = 1; i < numbers.size(); i++)
            {                
                if(!minNumIndices.contains(i) && numbers.get(i) < min)
                {
                    min = numbers.get(i);
                    minIndex = i;
                }
                
                if(!maxNumIndices.contains(i) && numbers.get(i) > max)
                {
                    max = numbers.get(i);
                    maxIndex = i;
                }
            }
            
            minNums.add(min);
            maxNums.add(max);
            minNumIndices.add(minIndex);
            maxNumIndices.add(maxIndex);
        }
        
        System.out.print(addNumbers(minNums) + " " + addNumbers(maxNums));
    }
    
    static int addNumbers(List<Integer> numbers)
    {
        int s = 0;
        for(int number : numbers)
        {
            s+=number;
        }
        return s;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        

        miniMaxSum(arr);
        
        scanner.close();
    }
}
