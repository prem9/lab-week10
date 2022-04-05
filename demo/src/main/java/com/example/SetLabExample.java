package com.example;

import java.util.*;
import java.util.Random;

public class SetLabExample {

  public static void main(final String[] args) {
    // create list of random numbers
    final Integer n = 15;
    Integer nums[] = createRandom(n);

    // print the numbers
    System.out.println("Random integers is:");
    for (int i = 0; i < nums.length; i++) {
      Integer val = nums[i];
      System.out.printf("[%d] %d\n", i + 1, val);
    }
    //
    // create a set to determine how many duplicates are in the array
    //
    HashSet<Integer> numSet = new HashSet<Integer>();
    for(int number: nums)
    {
      numSet.add(number);
    }
    
    
    // students should write code to
    // create a set of integers
    // students should write code to
    // add integers to the set
    
    // students should write code to
    // print the set
    System.out.println("Set of integers is:");
    for (Integer num: numSet)
    {
      System.out.println(num);
    }
    // students should write code to
    // print the # of unique elements
    System.out.printf("There are %d unique integers in the array of %d numbers.", numSet.size(), nums.length);
  }

  // create list of random numbers
  public static Integer[] createRandom(Integer n) {
    Random rand = new Random();
    final Integer maximum = 10;

    Integer[] nums = new Integer[n];
    for (int i = 0; i < n; i++) {
      Integer val = rand.nextInt(maximum);
      nums[i] = val;
    }
    return nums;
  }
}
