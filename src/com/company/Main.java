package com.company;

import java.util.Arrays;

public class Main {

    public static int[] Sorting(int[] array) {


        Arrays.sort(array);

        int size = array.length;
        int[] result = new int[size];
        int i = 0;
        int j = size - 1;
        int k = size - 1;

        boolean head = true;
        while (i <= j) {
            if (head) {
                result[i++] = array[k--];
            } else {
                result[j--] = array[k--];
            }
            head = !head;
        }
        return result;


    }

    public static void main(String[] args) {
	// write your code here

        int[] a1 = {4, 13, 8, 9, 7, 1, 6};
        System.out.printf("Input1 = %s%n", Arrays.toString(a1));
        System.out.printf("Output1 = %s%n", Arrays.toString(Sorting(a1)));
        System.out.println();
        int[] a2 = {16, 23, 7, 11, 3, 14};
        System.out.printf("Input2 = %s%n", Arrays.toString(a2));
        System.out.printf("Output2 = %s%n", Arrays.toString(Sorting(a2)));

        System.out.println();

        int[] a3 = {3,6,7,8,5};
        System.out.printf("Input3 = %s%n", Arrays.toString(a3));
        System.out.printf("Output3 = %s%n", Arrays.toString(Sorting(a3)));
    }
}
