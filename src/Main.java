import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Hello world!");
        int a = 5;
        int b = 10;
        System.out.println("initially a is:" + a + " and b is:" + b);
        System.out.println("Now switching values between a & b");
//        switch values with 3rd argument
//        int c=b;
//        b=a;
//        a=c;

        // Switch values without 3rd argument
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Now a is:" + a + " and b is:" + b);
        System.out.println();
//  adding file to github

        // Homework
        Scanner scanner = new Scanner(System.in);

        // Exercise 1 - get 3 numbers , show there sum and average
        System.out.println("please enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("please enter 2nd number:");
        int num2 = scanner.nextInt();
        System.out.println("please enter 3rd number:");
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;
        float avg = sum / 3;

        System.out.println("sum of 3 number is: " + sum + " and average is: " + avg);


        // Exercise 2 - get a room width and height - Show its area and perimeter
        System.out.println("please enter room width in meters:");
        float width = scanner.nextFloat();
        System.out.println("please enter room height in meters:");
        float height = scanner.nextFloat();

        float perimeter  = width *2 + height *2 ;
        float area = width * height;

        System.out.println("room area is: " + area + "Meter^2 and perimeter is: " + perimeter+ "meter");

        // Exercise 3 - get a movie length in minutes - show in hours and minutes
        System.out.println("please enter movie length in minutes:");
        int minutes = scanner.nextInt();
        int hours = minutes/60;
        int modmin = minutes%60;
        System.out.println("Movie length is: " + hours + " Hours and " + modmin+ " minutes");

    }
}