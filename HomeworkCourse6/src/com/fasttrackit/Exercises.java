package com.fasttrackit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the dimension of the array");
        int dimension = scanner.nextInt();
        while (dimension < 1) {
            System.out.println("The value of the dimension is not greater than 0.");
            System.out.println("Introduce the dimension (an integer value greater than 0) of the array: ");
            dimension = scanner.nextInt();
        }
        int [] array = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            System.out.println("Enter the value of the element with number: "+ i);
            array[i]= scanner.nextInt();

        }
        System.out.println(Arrays.toString(array));
        sumMethod(array);
        numberOfOdd(array);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        greaterThanNumber(array, number);
        System.out.println("Enter the donation target: ");
        int target = scanner.nextInt();
        randomDonation(target);
        System.out.println("Enter the maximum number of donations: ");
        int maxNumber= scanner.nextInt();
        while (maxNumber<1){
            System.out.println("Enter the maximum number of donations: ");
            maxNumber= scanner.nextInt();
        }
        randomLimitedDonation(target, maxNumber);
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter the phrase: ");
        String string = scann.nextLine();
        System.out.println("phrase is: " + string);
        printSentence(string);



    }
    public static int sumMethod(int [] array){
        int sum =0;
        for (int j : array) {
            sum += j;
        }
        System.out.println("The sum of elements is: " + sum);
        return sum;

    }

    public static int numberOfOdd( int [] array){
        int numberOfElements = 0;
        for (int j : array) {
            if (j % 2 != 0) {
                numberOfElements += 1;
            }
        }
        System.out.println("The number of odd elements is: " + numberOfElements);
        return numberOfElements;

    }

    public static ArrayList<Integer> greaterThanNumber(int[] array, int number){
        ArrayList<Integer> greaterNumbers = new ArrayList<Integer>();
        for( int i : array){
            if (i > number){
                greaterNumbers.add(i);
            }
        }
        System.out.println(greaterNumbers);
        return greaterNumbers;
    }

    public static void randomDonation(int target){
        Random random = new Random();
        int donation = random.nextInt();
        while(donation < 1){
            donation = random.nextInt();
        }
        System.out.println("Value of donation is: "+ donation);
        int  sum = donation;

        while(sum < target){
             donation = random.nextInt();
            while(donation < 1){
                donation = random.nextInt();
            }
            System.out.println("Value of donation is: "+ donation);
             sum+=donation;
        }
        System.out.println("Thank you for your donations! We hit the target!");
    }

    public static void randomLimitedDonation(int target, int maxNumber){
        Random random = new Random();
        int donation = random.nextInt();
        while (donation < 1) {
            donation = random.nextInt();
        }
        System.out.println("Value of donation is: " + donation);
        int sum = donation;
        int contor = 1;
        while (sum < target && contor < maxNumber) {
            donation = random.nextInt();
            while (donation < 1) {
                donation = random.nextInt();
            }
            System.out.println("Value of donation is: " + donation);
            sum += donation;
            contor++;
        }
        if (sum>target){
            System.out.println("Thank you for your donations! We hit the target!");
        }
        if (contor == maxNumber){
            System.out.println("The campaign is over. Thank you!");

        }
    }

    public static void printSentence(String string){
        String [] stringArray=string.split("\\.");
        for(String i : stringArray){
            System.out.println(i + ".");
        }
    }


}
