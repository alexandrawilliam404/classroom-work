package com.project;
import java.util.*;
public class RandomClass {
    public static void main(String[] args) {
        int num = new Random().nextInt(50) + 1;
        System.out.println("The random number is: " + num);
    }
}