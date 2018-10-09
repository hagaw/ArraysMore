package com.company;

public class Main {

    public static void main(String[] args) {
//	// Arrays can only have one data type (e.g. int, string, double, float)
//        //Arrays need to have the number of elements set
//        //
//        //Declare arrays
//        //
//        //1. Method 1 (Use if don't know values)
//        //Type: String; //Name: colors; //Number of values: 3
//        //String []colors = new String [3];
//
//        //2. Method 2 (Use if you know values)
//        String []colors2 = {"blue", "orange", "yellow"};
//
//        //3. Method 3
//        String [] colors3= new String [] {"blue", "orange", "yellow"};
//
//        //4. Method 4
//        String [] colors4 = new String[3];
//        colors4[0]= "blue";
//        colors4[1]= "orange";
//        colors4[2]= "yellow";
//
//        //arrayName[index]
//        //indices start at 0 for arrays
//        //last index is the length of arrays
//
//        //Get the length of array (how many items?0
//        int arraySize = colors4.length;
//
//        //printing the array
//        for (int index = 0; index <colors4.length; index++){
//            System.out.println(colors4[index]); //get me the value in the colors array with index of 0, 1 or 2 depending on iteration
//        }

        //7. Declare numbers 1-10 and print numbers 1-10 backward from the array

//        int[] arrayNumbers = new int[10];
//        for (int i=10; i>= 1; i--){
//            System.out.println(i);
//        }

        //8. Given following array: ['w','t','y','h','k']. Loop through replace letter 't' with "hello"
//        String[] arrayLetters = new String[] {"w", "t", "y", "h", "k"};
//
//        String a = "";
//        for (int index = 0; index < 5; index++) {
//            if (arrayLetters[index].equalsIgnoreCase("t")) {
//                System.out.println("Hello");
//            } else {
//                System.out.println(arrayLetters[index]);
//            }
//
//        }

        //9. Given array 1: [1,7,6,5,9] and array 2: [2,7,6,3,4]. Write a program that will print out all matching pairs from arrays 1 and 2.
        //Expected output:
        //(7,7) and (6,6)

//        int[] arrayOne = {1,7,6,5,9};
//        int[] arrayTwo = {2,7, 6, 3,4};
//
//        for (int i =0; i <5; i++) {
//            if(arrayOne[i]==arrayTwo[i]){
//                System.out.println("Expected output :" +"(" + arrayOne[i] + "," + arrayTwo[i]+")"+"");
//            }
//        }
        //since similar in size for each array; use the same number 5


        //No if statement--> just prints each element in format(a1, a2) till last element
//        int [] array1 = {1, 2, 3, 4, 5, 6, 7, 8};
//        int [] array2 = {1,9,10};
//
//        for (int i=0; i<array1.length; i++){
//            for (int j=0; j<array2.length; j++){
//                System.out.println("Expected output :" + "(" + array1[i] + "," + array2[j] +")" + "");
//            }
//        }



        //Comparing different sizes of arrays
//        int[] arrayOne = {1, 7, 6, 5, 9, 8, 3};
//        int[] arrayTwo = {2, 7, 6, 3, 4};
//
//        for (int i = 0; i < arrayOne.length; i++) {
//            for (int j = 0; j < arrayTwo.length; j++) {
//                if (arrayOne[i] == arrayTwo[j]) {
//                    System.out.println("Expected output :" + "(" + arrayOne[i] + "," + arrayTwo[j] + ")" + "");
//                }
//            }
//        }
    }
}
