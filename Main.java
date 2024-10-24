import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

    /*
    * 1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
         two numbers , takes two numbers as input
    * */

        System.out.print("Please enter first number: ");
        int first_number = input.nextInt();
        System.out.print("Please enter second number: ");
        int second_number = input.nextInt();

        System.out.println("----------- mathematical operation -----------");
        System.out.println(
                            first_number + " + " + second_number + " = " + (first_number+second_number)
                           +"\n"+ first_number + " - " + second_number + " = " + (first_number-second_number)
                           +"\n"+ first_number + " * " + second_number + " = " + (first_number*second_number)
                           +"\n"+ first_number + " / " + second_number + " = " + ((float) first_number/ (float) second_number)
                           +"\n"+ first_number + " % " + second_number + " = " + (first_number % second_number)
        );

        /*
        * 2. Write a Java program that takes a number as input and prints its multiplication table up to
                10.
        * */

//        System.out.print("Please enter number: ");
//        int number = input.nextInt();
//
//        for (int i = 1; i <=10 ; i++) {
//            System.out.println(number+" x "+i+" = "+ number*i);
//        }

        /*
        *3. Write a Java program to print the area and perimeter of a circle.
         * */

//        System.out.print("Please enter radius: ");
//        float radius = input.nextFloat();
//
//        double pi = 3.14159265359;
//
//        System.out.println("Perimeter = " + radius*pi*2);
//        System.out.println("Area = " + radius*radius*pi);


        /*
        * 4. Java program to find out the average of a set of integers
        * */


//            int counter = 0;
//            int sum = 0 ;
//            int number;
//            do {
//                System.out.print("please enter num or 0 to exit: ");
//                number=input.nextInt();
//                sum+=number;
//                if(number == 0 )
//                    continue;
//                counter+=1;
//
//
//            }while (number!=0);
//
//            System.out.println("The average is = "+ (float)sum/(float)counter);

        /*
        *5. Write a Java program that accepts three integers as input, adds the first two integers
            together, and then determines whether the sum is equal to the third integer.
        * */

//            System.out.print("Please enter first number: ");
//            int first_number = input.nextInt();
//            System.out.print("Please enter second number: ");
//            int second_number = input.nextInt();
//            System.out.print("Please enter third number: ");
//            int third_number = input.nextInt();
//
//            System.out.print("The result is: ");
//            System.out.println((first_number + second_number) == third_number);

        /*
        *
        * 6. Write a Java program to reverse a word
        * */

//        System.out.print("Please enter a word: ");
//        String orginal_word = input.nextLine();
//        String reverse_word = "";
//
//        for (int i = orginal_word.length()-1; i >= 0  ; i--) {
//
//            reverse_word = reverse_word + orginal_word.charAt(i);
//
//        }
//        System.out.println(reverse_word);

        /*
        * 7 - Java program to check whether the given number is even or odd
        * */

//        int number=1;
//
//        while ((number!=0)){
//
//            System.out.print("please enter number or 0 to exit: ");
//            number=input.nextInt();
//
//            if(number==0)
//                continue;
//
//            System.out.print("The number is: ");
//            System.out.println(number%2==0 ? "even" : "odd");
//
//        }


        /*
        *
        * 8 - Java program to convert the temperature in Centigrade to Fahrenheit
        * */

//        System.out.print("Please enter temperature in Centigrade: ");
//        float temperature = input.nextFloat();
//        float fahrenheit = temperature*1.8f+32;
//        System.out.println("Temperature in Fahrenheit is: "+ fahrenheit);

        /*
        * 9.Write a Java program that takes a string and a number from the user,then prints the
            character in the given index.
        *
        * */

//        System.out.print("Please enter a word: ");
//        String string = input.nextLine();
//
//        System.out.print("Please enter a index of any char: ");
//        int index = input.nextInt();
//
//        System.out.println(string.charAt(index));
//

        /*
        *10. Write a Java program to print the area and perimeter of a rectangle.
         *
        * */


//        System.out.print("Please enter width: ");
//        float width = input.nextFloat();
//
//        System.out.print("Please enter height: ");
//        float height = input.nextFloat();
//
//
//        System.out.println("Area = " + width*height);
//
//        System.out.println("Perimeter = " + 2*(width+height));


        /*
        *
        * 11. Write a Java program to compare two numbers.
         * */

//        System.out.print("Please enter first number: ");
//        int first_number = input.nextInt();
//        System.out.print("Please enter second number: ");
//        int second_number = input.nextInt();
//
//        if(first_number == second_number ) System.out.println(first_number+" == "+second_number);
//        if(first_number > second_number ) System.out.println(first_number+" > "+second_number);
//        if(first_number >= second_number ) System.out.println(first_number+" >= "+second_number);
//        if(first_number < second_number ) System.out.println(first_number+" < "+second_number);
//        if(first_number <= second_number ) System.out.println(first_number+" <= "+second_number);
//        if(first_number != second_number ) System.out.println(first_number+" != "+second_number);

        /*
        *
        * 12. Write a Java program to convert seconds to hours, minutes and seconds.
         *
        * */


//            System.out.print("Please enter time in seconds: ");
//            int seconds = input.nextInt();
//            int hours = seconds / 3600;
//            int minutes = (seconds % 3600) / 60;
//            seconds = seconds % 60;
//
//            System.out.println(hours+":"+minutes+":"+seconds);


        /*
        *
        * 13. Write a Java program that accepts four integers from the user and prints equal if all
            four are equal, and not equal otherwise.
        * */
//
//            System.out.print("Please enter first number: ");
//            int first_number = input.nextInt();
//            System.out.print("Please enter second number: ");
//            int second_number = input.nextInt();
//            System.out.print("Please enter third number: ");
//            int third_number = input.nextInt();
//            System.out.print("Please enter fourth number: ");
//            int fourth_number= input.nextInt();
//
//            boolean result = first_number == second_number &&
//                             second_number==third_number   &&
//                              third_number==fourth_number;
//
//            System.out.println(result ? "Numbers are equal":"Numbers are not equal! ");

        /*
        *
        * 14. Write a Java program that reads an integer and check whether it is negative, zero, or
            positive.
        * */

//        System.out.print("Please enter first number: ");
//        int number = input.nextInt();
//
//        if(number >0)
//            System.out.println("Number is positive");
//        else if(number<0)
//            System.out.println("Number is negative");
//        else
//            System.out.println("Number is zero");

        /*
        *
        *15.Write a program to enter the numbers till the user wants and at the end it
            should display the count of positive, negative and zeros entered (End loop use -1 ,
            Don’t count -1).
        * */

//        int zero=0;
//        int positives=0;
//        int negatives=0;
//        int number=0;
//
//        while (number!=-1){
//            System.out.print("please enter num or -1 to exit: ");
//            number=input.nextInt();
//            if(number==-1)
//                break;
//            else if(number >0)
//                positives+=1;
//            else if(number<0)
//               negatives+=1;
//            else
//                zero+=1;
//        }
//
//        System.out.println(positives+" positives");
//        System.out.println(zero+" zero");
//        System.out.println(negatives+" negatives");


        /*
        *
        * 16 - Write a program that prompts the user to input an integer and then outputs the
                number with the digits reversed.
        *
        * */

//        boolean exit = false;
//        String orginal_integer="";
//        String reverse_integer = "";
//        while (!exit){
//
//            System.out.print("Please enter an integer: ");
//            orginal_integer =  input.nextLine();
//            if(orginal_integer.matches("\\d+"))
//                exit=true;
//        }
//
//
//        for (int i = orginal_integer.length()-1; i >= 0  ; i--) {
//
//            reverse_integer = reverse_integer + orginal_integer.charAt(i);
//
//        }
//        System.out.println(reverse_integer);


        /*
        *
        * 17 - Write a program to enter the numbers till the user wants and at the end the
                program should display the largest and smallest numbers entered.
        *
        * */





//        int largest=-99999999;
//        int smallest =9999999;
//        int number=0;
//
//        while (number!=-1){
//            System.out.print("please enter num or -1 to exit: ");
//            number=input.nextInt();
//
//            if(number==-1)
//                break;
//            else if(largest<number)
//                largest = number;
//            else if (smallest > number)
//                smallest = number;
//
//        }
//
//        System.out.println("The large number: "+ largest);
//        System.out.println("the small number: "+ smallest);


        /*
        * 18 - Determine and print the number of times the character ‘a’ appears in the input
                entered by the user.
        *
        * */

//        System.out.print("Please enter a word: ");
//        String word = input.nextLine();
//
//        int counter = 0 ;
//        for (int i = 0; i <= word.length()-1 ; i++) {
//
//            if(word.charAt(i) == 'a')
//                counter+=1;
//
//        }
//        System.out.println(counter);















    }
}