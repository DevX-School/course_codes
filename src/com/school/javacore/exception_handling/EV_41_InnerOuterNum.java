package com.school.javacore.exception_handling;

import java.util.Arrays;
import java.util.Scanner;

public class EV_41_InnerOuterNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sizeofOuter = "";
        do {
            System.out.println("What's your length of the outer array?");
            sizeofOuter = scanner.nextLine();
        } while (!sizeofOuter.matches("[0-9]+"));


        //  Integer sizeofOuter = scanner.nextInt();
        int[] outer = new int[sizeofOuter.length()];
        for (int i = 0; i < sizeofOuter.length(); i++) {
            System.out.println("Please enter the elements of Array  ");
            Integer element = scanner.nextInt();
            outer[i] = element;
        }
        System.out.println("Please enter the length of inner array");
        int sizeInner = scanner.nextInt();
        int [] inner = new int[sizeInner];
        for(int i = 0; i < sizeInner;i++){
            int element = scanner.nextInt();
            inner[i] = element;
        }
        System.out.println(Arrays.toString(outer) + " and" + Arrays.toString(inner) + " is " + linearIn(outer, inner));
    }

    public static int readLenght() throws Exception{
        Scanner scanner = new Scanner(System.in);
        String sizeInString = scanner.nextLine();

        if (!sizeInString.matches("[0-9]+")) {
            throw new Exception("Invalid Number Exception");

        }
        return Integer.parseInt(sizeInString);
    }
    public static boolean linearIn(int[] outer, int[] inner) {
        int p = 0;//pointer for inner array
        if (inner.length == 0) return true;//no inner array
        for (int i = 0; i < outer.length; i++) {//iterating outer array
            if (inner[p] == outer[i]) {//found a inner array element in outer
                p++;//increment pointer of inner array
            }
            if (p == inner.length) {//if everyone in inner array is found
                return true;
            }
        }
        return false;
    }
}