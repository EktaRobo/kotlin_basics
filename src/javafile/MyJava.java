package javafile;

import kotlinfile.MyKotlin;

public class MyJava {
    public static void main(String[] args) {
        System.out.println("The Max Value among 3 and 5 is " + MyKotlin.maxVal(3, 5));
        System.out.println("The volume is " + MyKotlin.findVolume(3, 5)); //Default function

    }

    public static int add(int a, int b) {
        return a + b;
    }
}
