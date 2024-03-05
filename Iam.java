package week8;

import java.util.Scanner;

public class Iam {

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String sentence;
        String qualaties;
        System.out.println("Please enter sentences, . to end.");
        sentence = keyboard.nextLine();
        qualaties = "The qualities are: ";


        while (!sentence.equals(".")){

            if (sentence.startsWith("I am ")){
                sentence  = sentence.substring(5) + ",";
                qualaties  = qualaties + sentence;

            }//end of if statement

            sentence = keyboard.nextLine();







        }//end of the while loop


        System.out.println(qualaties);




    }// end of main method






}// end of Iam class
