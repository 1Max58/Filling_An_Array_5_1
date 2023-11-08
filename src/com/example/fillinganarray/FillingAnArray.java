package com.example.fillinganarray;

public class FillingAnArray {
    public static void main(String[] args) {
        System.out.println("This program creates a 10-element array and puts the numbers from 9 to 0 in it.");
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 9 - i;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
