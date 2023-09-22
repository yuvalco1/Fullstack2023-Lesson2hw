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

        // Exercise 3 - get a pot diameter and height and show its cubic
        System.out.println("please enter pot diameter in cm:");
        float diam = scanner.nextFloat();
        System.out.println("please enter pot height in cm:");
        float potheight = scanner.nextFloat();

        float cubic  = (float) (Math.PI * diam /2 * potheight);

        System.out.println("Pot cubic is " + cubic + "cm^3");

        // Exercise 4 - get a movie length in minutes - show in hours and minutes
        System.out.println("please enter movie length in minutes:");
        int minutes = scanner.nextInt();
        int hours = minutes/60;
        int modmin = minutes%60;
        System.out.println("Movie length is: " + hours + " Hours and " + modmin+ " minutes");

        // Exercise 5 - get a number, guranteed to be at list 4 digits, find most right digit and print it
        System.out.println("please enter a number with at least 4 digits (>= 1000):");
        int num4digits = scanner.nextInt();
        int rightdigit = num4digits % 10;
        System.out.println("the most right digit is: "+rightdigit);

        // Exercise 6 - get a number, guranteed to be at list 4 digits, find 2nd right digit and print it
        System.out.println("please enter a number with at least 4 digits (>= 1000):");
        int num4digits2 = scanner.nextInt();
        int secondrightdigit = (num4digits2 % 100)/10;
        System.out.println("the 2nd right digit is: "+secondrightdigit);

        // Exercise 7 - get a  3 digits number, find the left digit and print it
        System.out.println("please enter a number with 3 digits (>= 100 and <=999):");
        int num3digits = scanner.nextInt();
        int leftdigit = num3digits/100;
        System.out.println("the left digit is: "+leftdigit);

        // Exercise 8 - Input number between 10 and 99 , print sum of it's two digits.
        System.out.println("Please enter a number between 10 and 99: ");
        int innumber2 = scanner.nextInt();
        int leftdigit2 = innumber2/10;
        int rightdigit2 = innumber2%10;
        int sumdigtis = rightdigit2+leftdigit2;
        System.out.println("sum of the number digtis is: "+sumdigtis);

        // Exercise 9 - Input number between 10 and 99 , Change the order of its digits and print a new number.
        System.out.println("Please enter a number between 10 and 99: ");
        int innumber = scanner.nextInt();
        int leftdigit3 = innumber/10;
        int rightdigit3 = innumber%10;
        int newnumber = rightdigit3*10+leftdigit3;
        System.out.println("New number is: "+newnumber);

    }
}