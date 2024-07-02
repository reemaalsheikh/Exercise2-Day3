import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it

        Scanner input = new Scanner(System.in);
 /*

1.Write a program that checks the role of the user
If the role is admin print "welcome admin"
If the role is superuser print "welcome superuser" If the role is user print "welcome user" (tip:
use if else)
*/

      /*  System.out.println("Please enter your role:");
        String role = input.nextLine();

        if (role.equals("admin")) {
            System.out.println("Welcome Admin!");
        } else if (role.equals("superuser")) {
            System.out.println("Welcome Superuser!");
        }else
            System.out.println("Welcome User!"); */





/*2.Take three numbers from the user and print the greatest number.
Test Data
Input the 1st number: 25 Input the 2nd number: 78 Input the 3rd number: 87
Expected Output : The greatest: 87 */

     /*   System.out.println("Please enter a three numbers:  ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(" The greatest number is: " +num1 );
        }else if (num2 > num1 && num2 > num3) {
            System.out.println(" The greatest number is: " +num2 );
        }else
            System.out.println("The greatest number is: " +num3 );   */







/* 3.Write a Java program that generates an integer between 1 and 7 and displays the name of the weekday.
Test Data
number: 4
Expected Output:
Wednesday   */

        /*  Random rand = new Random();
          int day = rand.nextInt(7);
          System.out.println("Number: "+day);
                switch (day) {
                    case 1:
                        System.out.println("Sunday");
                        break;
                    case 2:
                        System.out.println("Monday");
                        break;
                    case 3:
                        System.out.println("Tuesday");
                        break;
                    case 4:
                        System.out.println("Wednesday");
                        break;
                    case 5:
                        System.out.println("Thursday");
                        break;
                    case 6:
                        System.out.println("Friday");
                        break;
                    case 7:
                        System.out.println("Saturday");
                        break;
                    default:
                        System.out.println("A week is 7 days");
                }*/







/* 4. Write a program that takes a numeric score as input and prints the corresponding letter grade using the following grading scale:
A: 90-100 B: 80-89 C: 70-79 D: 60-69 F: 0-59
Enter your numeric score: 85 Numeric Score: 85
Letter Grade: B
*/
    /*  System.out.println("Enter your numeric score: ");
        int grade = input.nextInt();

        if (grade >= 90 && grade <= 100) {
            System.out.println("Your grade is A");
        }else if (grade >= 80 && grade <= 89) {
            System.out.println("Your grade is B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("Your grade is C");
        } else if (grade >=60  && grade <= 69) {
            System.out.println("Your grade is D");
        } else
            System.out.println("Your grade is F"); */





        

/* 5. Write a Java program that takes a person's age as input
and categorizes them into one of three age categories:
 "Child," "Teenager," or "Adult" using an if statement.
use an if statement to categorize the age based on the following criteria:
• If the age is less than 13, categorize them as a "Child."
• If the age is between 13 and 19 (inclusive), categorize them as a
"Teenager."
• If the age is 20 or older, categorize them as an "Adult."
Sample Output: Enter your age: 25 You are an Adult.*/

    /*    System.out.println("Please enter your age: ");
        int age = input.nextInt();
        if (age < 13) {
            System.out.println("You are a child");
        }
        else if (age >= 13 && age <= 19) {
            System.out.println("You are a Teenager");
        }else
            System.out.println("You are an Adult.");   */




    }
    }
