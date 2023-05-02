import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        10.Write a program thats check if the word is a palindrome or not.
//        hint: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        boolean isPalindrome = true;
        // Check if the word is a palindrome
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }          if (isPalindrome) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }     }
}

//        9.Use a for loop to print headings for four weeks (Weeks 1 - 4).
//        Then use another for loop to print the days (Days 1 -7) for each week.
//        for (int week = 1; week <= 4; week++) {
//            System.out.println("Week " + week);
//            for (int day = 1; day <= 7; day++) {
//                System.out.println("Day " + day);
//            }
//        }
//    }}

//        8.Write a program to enter the numbers till the user wants and at the end it should display the count of positive,
//        negative and zeros entered.
//        Scanner input = new Scanner(System.in);
//        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
//        char choice;
//
//        do {
//            System.out.print("Enter a number: ");
//            int number = input.nextInt();
//
//            if (number > 0) {
//                positiveCount++;
//            } else if (number < 0) {
//                negativeCount++;
//            } else {
//                zeroCount++;
//            }
//
//            System.out.print("Do you want to continue(y/n)? ");
//            choice = input.next().charAt(0);
//        } while (choice == 'y' || choice == 'Y');
//
//        System.out.println("Positive numbers: " + positiveCount);
//        System.out.println("Negative numbers: " + negativeCount);
//        System.out.println("Zeroes: " + zeroCount);
//    }
//}
//        7.Write a program that prompts the user to input a positive integer.
//        It should then output a message indicating whether the number is a prime number.
//        System.out.print("Enter a positive integer: ");
//        int number = scanner.nextInt();
//        scanner.close();
//        boolean isPrime = true;
//        if (number == 1) {
//            isPrime = false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(number); i++) {
//                if (number % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }          if (isPrime) {
//            System.out.println(number + " is a prime number.");
//        } else {
//            System.out.println(number + " is not a prime number.");
//        }
//    }
//}
//        6.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
//        System.out.print("Enter a set of integers separated by spaces: ");
//        String input = scanner.nextLine();
//        scanner.close();
//        String[] numbers = input.split(" ");
//        int sumOfEven = 0;
//        int sumOfOdd = 0;
//        for (String number : numbers) {
//            int num = Integer.parseInt(number);
//            if (num % 2 == 0) {
//                sumOfEven += num;
//            } else {
//                sumOfOdd += num;
//            }
//        }
//        System.out.println("Sum of even integers: " + sumOfEven);
//        System.out.println("Sum of odd integers: " + sumOfOdd);
//    }}
//        5.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.
//        (Do not use Java built-in method)
//        System.out.print("Enter the base number: ");
//        int base = scanner.nextInt();
//        System.out.print("Enter the exponent number: ");
//        int exponent = scanner.nextInt();
//        scanner.close();
//        int result = 1;
//        for (int i = 1; i <= exponent; i++) {
//            result *= base;
//        }
//        System.out.println(base + " .[]" +
//                "" + exponent + " = " + result);
//    }
//}
        //4.Write a program to find the factorial value of any number entered through the keyboard.
//        System.out.println("Enter a positive integer:");
//        int number = scanner.nextInt();
//        int num = 1;
//        for (int i = 1; i <= number; i++) {
//            num *= i;
//        }
//        System.out.println(number + "!=" + num);
//    }
//        }
      //  3.Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
//        System.out.print("Input a positive integer: ");
//        int number = scanner.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(number + " * " + i + " = " + (number * i));
//        }

//        2.Write a Java program to reverse a string.
//
//        Test Data: Input a string: The quick brown fox Expected Output: Reverse string: xof nworb kciuq ehT
//        System.out.print("Input a string:  ");
//        String inputString = scanner.nextLine();
//        scanner.close();
//        String reverseString = "";
//        for (int i = inputString.length() - 1; i >= 0; i--)
//        {
//            reverseString += inputString.charAt(i);
//        }
//        System.out.println("Reverse string: " + reverseString);
//    }
//}
        //1.If the number is a multiple of 3, you need to print "Fizz" instead of that number.
        //
        //If the number is a multiple of 5, you need to print "Buzz" instead of that number.
        //
        //If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead of that number.

//     for (int i=1; i<=100 ; i++){
//         if (i%3==0 && i%5==0);{
//             System.out.println("FizzBuzz");
//         }
//         if (i % 3 == 0) {
//             System.out.println("Fizz");
//         } else if (i % 5 == 0) {
//             System.out.println("Buzz");
//         }
//     }


// if (i%3==0 && i%5==0);{
//         System.out.println("FizzBuzz");