package com.company;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.sql.Array;
import java.util.LinkedHashSet;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        //Create an array to hold the numbers 1-10.
        /*int[] arrayList = new int[10];*/


        //Loop through that array and sum the numbers 1-10, then print that total to the screen.
	    /*int sum = 0;
	    for (int i =1; i<=10; i++){
	    	sum =  sum+ i;
        }
		System.out.println("Total sum: " + sum);*/

        //Create an array to hold 10 number inputs from the user and print that total to the screen.
		/*int score[] = new int[10];
		double  sum= 0;
		System.out.println("Enter 10 number: ");
		for ( int i=0; i<10;i++)
			score[i]= array.nextInt();
	    for (int i=0; i<10;i++)
	    	sum = sum + score[i];
	    System.out.println("totalSum: " +sum);
		//Get 10 number inputs from the user, store them in an array and get the average of those 10 numbers.
		double average = sum/10;
		System.out.println("Average 10 number: " + average);*/

        //Create an array to store 3 names, loop through that array to print out the names.
		/*String[] name = {"heo", "bo", "ga"};
		for (int i =0; i<name.length;i++)
			System.out.println(name[i]);*/

        //Create an array with the following values: [2,5,9,0,2,1,8,5,4] Loop through the array and print out the index each time the value equals 5.
		/*int[] value =  {2, 5, 9, 0, 2, 1, 8, 5, 4};
		for (int i = 0; i < value.length; i++) {
			value[i] = 5;
			System.out.println("index " + i);
		}*/


		/*int[] value =  {2, 5, 9, 0, 2, 1, 8, 5, 4};
		int i =0;
		for (i=0; i<value.length;i++) {
			if (value[i]==5) {
				System.out.println(i);
			}
		}*/


        //Declare an array with the numbers 1-10. Print the numbers 1-10 backwards from the array.

		/*int[] number = new int[10];
		for (int i =10; i>0;i--){
			System.out.println(i);
		}*/


		/*String[] letter = {"w", "t", "y", "h", "k"};
		for (int i = 0; i < letter.length; i++) {
			if (letter[i] == "t") {
				String change = letter.replace("t", "hello");
				System.print.outln(change);
			}
		}*/


        //Loop through the array and replace the the letter 't' with the word "hello" once it's found.
        /*String[] letter = new String[]{"w","t","y","h","k"};
        int i = 0;
        for ( i= 0; i<letter.length; i++){
            if (letter[i] == "t"){
            	letter[i] =letter[i].replace("t","hello");
                System.out.println(Arrays.toString(letter));
            }
        }*/

        //Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
        //Write a program that will print out all matching pairs from arrays 1 and 2.
        //Expected output:
        //(7,7) and (6,6)
		/*int[] array1 = {1, 7, 6, 5, 9};
		int[] array2 = {2, 7, 6, 3, 4};
		int num1, num2, i, j = 0;
		for (i = 0; i < array1.length; i++) {
			num1 = array1[i];
			for (j = 0; j < array2.length; j++) {
				num2 = array2[j];
				if (num1 == num2) {
					System.out.println("("+num1+","+num2+")");
				}
			}
		}*/

        //Write a program to print a string in reverse:
        //Eg: Welcome
		/*String name = "Welcome";
		char[] str1 = name.toCharArray();
		for (int i= str1.length-1 ; i>=0;i--){
			System.out.print(str1[i]);
		}*/

        //Write a program that will find the length of an input string without using the library function.
		/*String name = "voicon";
		int count = name.length();
		System.out.println("length of name: " + count);*/

        //Prompt the user to input 10 values and store them into an array.
        // If there are any duplicate values in that array, remove them and print out the remaining values.
        ArrayList<Integer> scores = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
//init Scanner and get user input
        Scanner sc = new Scanner( System.in );
     System.out.println("Enter 10 number: ");
//stored user input into the array.
        for(int i=0;i<10;i++)
        {
            scores.add(sc.nextInt());
        }
        Collections.sort(scores);
        int count = 0;

        for(int x = 0; x < scores.size(); x++ ) {
            int searchIndex = Collections.binarySearch(scores, scores.get(x));
                if(searchIndex>=0){
                    count++;
                }
                if (count == 0) {
                    result.add(scores.get(x));
                }

        }

        System.out.println(result);







        //Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]
        //Write a program that will print out all pairs from arrays 1 and 2 that gives a sum of 13:
        //Expected output:
        // (7,6)
        //(6,7)
        //(9,4)
	/*	int[] array1 = {1,7,6,5,9};
		int[] array2 = {2,7,6,3,4};
		int i, j =0;
		for (i=0; i<array1.length;i++){
			for (j= 0; j<array2.length;j++) {
				if (array1[i] + array2[j] == 13 ) {
					System.out.println("(" + array1[i] + "," + array2[j] + ")");
				}
			}
		}*/

        //Prompt the user to input 10 values and store them into an array. Output the total number of odd and even values in the array.

        /*int score[] = new int[10];
        int  even= 0;
        int odd =0;
        System.out.println("Enter 10 number: ");
        for ( int i=0; i<10;i++)
            score[i]= array.nextInt();
        for (int i=0; i<10;i++){
            if (score[i]%2==0){
                even = even + score[i];
            }else{
                odd = odd + score[i];
            }
        }
        System.out.println("total even: " +even);
        System.out.println("total odd: " + odd);*/
    }
}