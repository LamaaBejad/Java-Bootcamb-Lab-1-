import java.util.Scanner;

import static java.lang.System.*;

// 1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//two numbers , takes two numbers as input
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        out.println("Enter num1 :");
        int num1 = input.nextInt();
        out.println("Enter num2 :");
        int num2 = input.nextInt();

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));


        // 2. Write a Java program that takes a number as input and prints its multiplication table up to
        //10.
        out.println("Enter Number : ");
        int number = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            out.println(number + " * " + i + " = " + (number * i));
        }

//3. Write a Java program to print the area and perimeter of a circle
        out.println("Enter number Radius");
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Area is = " + area);
        System.out.println("Perimeter is = " + perimeter);
//4. Java program to find out the average of a set of integers
        out.println("How many numbers?");
        int n = input.nextInt();
        int total = 0;
        for (int i = 1; i <= n; i++) {
            out.println("Enter number " + i + ":");
            total += input.nextInt();
        }
        double average = (double) total / n;
        out.println("Average is = " + average);


        //5. Write a Java program that accepts three integers as input, adds the first two integers
        //together, and then determines whether the sum is equal to the third integer.
        out.println("Input the first number");
        int first = input.nextInt();
        out.println("Input the second number");
        int second = input.nextInt();
        out.println("Input the third number");
        int third = input.nextInt();

        if (first + second == third) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        //6. Write a Java program to reverse a word
        System.out.println("input a word");
        input.nextLine(); // skip the leftover Enter from the last nextInt()
        String word = input.nextLine();
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        System.out.println("Reversed word: " + reversed);


        //7 - Java program to check whether the given number is even or odd
        //Enter a number:
        System.out.println("Enter a number");
        int count = input.nextInt();
        if (count % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }

//8 - Java program to convert the temperature in Centigrade to Fahrenheit
        System.out.println("Enter temperature in Centigrade: ");
        double Centigrade = input.nextDouble();
        double Fahrenheit = (Centigrade * 1.8) + 32;

        System.out.println("Temperature in Fahrenheit is :  " + Fahrenheit);


        //9.Write a Java program that takes a string and a number from the user,then prints the
        //character in the given index.
        System.out.println("input a string");
        input.nextLine(); // skip the leftover Enter from the last nextDouble()
        String text = input.nextLine();
        System.out.println("input number");
        int index = input.nextInt();
        if (index >= 0 && index < text.length()) {
            System.out.println("Character at index " + index + " is: " + text.charAt(index));
        } else {
            System.out.println("Invalid index");
        }

        //10. Write a Java program to print the area and perimeter of a rectangle.
        System.out.println("Enter Width ");
        double width = input.nextDouble();
        System.out.println("Enter Height ");
        double Height = input.nextDouble();

        double rectArea = width * Height;
        double rectPerimeter = 2 * (width + Height);

        System.out.println(" Area is = " + rectArea);
        System.out.println(" Perimeter is = " + rectPerimeter);


        //11. Write a Java program to compare two numbers.
        System.out.println("Input first integer");
        int count2 = input.nextInt();
        System.out.println("Input second integer");
        int count3 = input.nextInt();
        if (count2 != count3) {
            System.out.println(count2 + " != " + count3);
        }
        if (count2 < count3) {
            System.out.println(count2 + " < " + count3);
        }
        if (count2 <= count3) {
            System.out.println(count2 + " <= " + count3);
        }

// 12. Write a Java program to convert seconds to hours, minutes and seconds.
        System.out.println("Input seconds");
        int totalSeconds = input.nextInt();
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);

// 13. Write a Java program that accepts four integers from the user and prints equal if all
//four are equal, and not equal otherwise.
        System.out.println("Input first number:");
        int number1 = input.nextInt();
        System.out.println("Input second number:");
        int number2 = input.nextInt();
        System.out.println("Input third number:");
        int number3 = input.nextInt();
        System.out.println("Input fourth number:");
        int number4 = input.nextInt();

        if (number1 == number2 && number1 == number3 && number1 == number4) {
            System.out.println("Numbers are equal.");
        } else {
            System.out.println("Numbers are not equal!");
        }
// 14. Write a Java program that reads an integer and check whether it is negative, zero, or
//positive.
        System.out.println("Enter number");
        int number5 = input.nextInt();

        // Integer.signum gives -1 for negative, 0 for zero, 1 for positive
        switch (Integer.signum(number5)) {
            case -1:
                System.out.println("Number is negative");
                break;
            case 0:
                System.out.println("Number is zero");
                break;
            case 1:
                System.out.println("Number is positive");
                break;
        }

        // 15.Write a program to enter the numbers till the user wants and at the end it
        //should display the count of positive, negative and zeros entered (End loop use -1 ,
        //Don’t count -1)
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        System.out.println("Enter numbers (-1 to stop):");
        int value = input.nextInt();
        while (value != -1) {
            if (value > 0) {
                positiveCount++;
            } else if (value < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
            value = input.nextInt();
        }

        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);

        //16 - Write a program that prompts the user to input an integer and then outputs the
        //number with the digits reversed.

        System.out.println("Enter an integer:");
        int num = input.nextInt();
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed number: " + reversedNum);
// 17 - Write a program to enter the numbers till the user wants and at the end the
//program should display the largest and smallest numbers entered.

        System.out.println("Enter numbers - 0 to stop");
        int inputs = input.nextInt();

        if (inputs == 0) {
            System.out.println("No numbers entered");
        } else {
            int largest = inputs;
            int smallest = inputs;
            while (inputs != 0) {
                if (inputs > largest) {
                    largest = inputs;
                }
                if (inputs < smallest) {
                    smallest = inputs;
                }
                inputs = input.nextInt();
            }
            System.out.println("Largest number: " + largest);
            System.out.println("Smallest number: " + smallest);
        }
// 18 - Determine and print the number of times the character ‘a’ appears in the input
//entered by the user.
        System.out.println("Enter a text:");
        input.nextLine(); // skip the leftover Enter from the last nextInt()
        String sentence = input.nextLine();
        int aCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a') {
                aCount++;
            }
        }
        System.out.println("The character 'a' appears " + aCount + " times");

    }
}