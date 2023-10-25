package SDC;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Assignment {
  /*
   Hi. This assignment is for the Intro to Java Class CS 115. This program asks the student to enter up to 10 quiz scores. After
   that, the program outputs all the grades and then calculates the average score and the letter grade. 

   Entering 999 terminates the program early. Avg score + letter grade will be printed.
   */


  



  public static void main(String[] args) {

  // Instructions for User:
  System.out.println("""
    Hi and welcome!
    This program allows you, the student to enter up to 10 quiz scores:
    At the end, the program will calculate your total grade and then prints out your average and the corresponding letter grade.
    To terminate the program early, enter 999.
    """);


   // Initializing variables
   ArrayList<Integer> gradesArr = new ArrayList<>(10);
   int totalGrade = 0;   
   char letterGrade = 'A';
   
   while(gradesArr.size() < 10) {
    
    Scanner i = new Scanner(System.in);
    int input;
    System.out.println("Please enter a grade between 0-100, enter 999 to Exit: ");
    
    try{
     input = i.nextInt();
    } 

    catch (InputMismatchException e){
      System.out.println("Invalid input!");
      continue;
    }

    if(input == 999) {
      System.out.println("Exiting program");
      break;
    } 
    else if(input < 0 || input > 100) {
      System.out.println("Invalid number!!!");
    }
    else {
     gradesArr.add(input);
     System.out.println("Recored grade #" + gradesArr.size() + "... (maximum: 10)");
    }
   }

   System.out.println("Printing grades collected: ");
   for (int grade: gradesArr) {
     System.out.println(grade);
     totalGrade = totalGrade + grade;
   }

   double avgGrade = totalGrade / gradesArr.size();
   System.out.println("Average grade is " + avgGrade);

   if (avgGrade >= 90){
    letterGrade = 'A';
   } else if(avgGrade >= 80) {
    letterGrade = 'B';
   } else if(avgGrade >= 70){
    letterGrade = 'C';
   } else if(avgGrade >=60) {
    letterGrade = 'D';
   } else {
    letterGrade = 'F';
   }

   System.out.println("Your average grade " + avgGrade + " is equal to " + letterGrade + "!");
  }

}
