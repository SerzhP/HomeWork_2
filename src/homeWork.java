import java.util.Scanner;

public class homeWork {

    public static void main(String[] args) {


    //1
        /**
          Create two int variables name X
         and Y.
          Print “BIG” if X is bigger than Y 3.
         Print “small” if X is smaller than Y.*/

//        int x =10;
//        int y = 20;
//
//        if(x>y){
//            System.out.println("BIG");
//        }
//        if (x<y){
//            System.out.println("small");
//        }
    //2
        /**
          Run a for loop 5 times.
          Print iteration number every time.*/

//        forLoop();
//
//        static void forLoop() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//        }
//        }
    //3
        /**
          Create a switch case with the four cases.
          Create an int variable and initialize it with a number 1-4.
          Print the season name accordingly:

         - 1 = summer
         - 2 = winter
         - 3 = fall
         - 4 = spring

          Do the same using if-else statements*/
//        int season = 1;
//        switch (season){
//            case 1:
//                System.out.println("summer");
//                break;
//            case 2:
//                System.out.println("winter");
//                break;
//            case  3:
//                System.out.println("fall");
//                break;
//            case 4 :
//                System.out.println("spring");
//                break;
//            default:
//                System.out.println("default");
//                break;

//        int season = 1;
//        if (season ==1){
//        System.out.println("summer");
//    }
//        else if (season ==2){
//        System.out.println("winter");
//    }
//        else if (season == 3 ){
//        System.out.println("fall");
//    }
//        else if (season == 4){
//        System.out.println("spring");
//    }
//        else {
//        System.out.println("default");
//    }


    //4
        /**
          How many times will the following loop run?
          What will be printed last?
        int count= 1;
        while (count<11){
            System.out.println("Count is " + count);
            count++;
        }*/

//        10
//        Count is: 10
    //5
        /**
         * Write a program with the following:
         * 1. int with your age.
         * 2. char with the first letter in your last name.
         * 3. double with the shekels dollar currency.
         * 4. boolean about if you flew abroad.
         * 5. String with your apartment number.
         */

//        int age = 20;
//        char c = 'P';
//        double currency = 3.70;
//        boolean flewAbroad = true;
//        String apartmentNumber = "9";

        /**Print all variables.*/

//        System.out.println(age);
//        System.out.println(c);
//        System.out.println(currency);
//        System.out.println(flewAbroad);
//        System.out.println(apartmentNumber);

        /**Convert the double variable to int, and print the result.*/


//        int intCurrency = (int) currency;
//        System.out.println(intCurrency);

        /**Convert your apartment number to an int and print result.*/


//        int intApartmentNumber = Integer.parseInt(apartmentNumber);
//        System.out.println(intApartmentNumber);
//
//        System.out.println(Integer.parseInt(apartmentNumber));

    //6

        /**Create a program which uses Scanner class with the following:
          ask user for his phone number
          print the words “phone number” and the phone number
         the user entered.*/

//        System.out.println("Please enter a number");
//        Scanner userNumber = new Scanner(System.in);
//        int number = userNumber.nextInt();
//        System.out.println("Number is: " + number);
//
//        System.out.println("Phone nubmer: " + userNumber.next());

    //7
        /**Write a program with the following in main class:
          Method named printHello() that prints the word “hello”.*/

//        printHello();


        /**  Method named calculate() which adds 5+3.2 and prints the
         result.*/

//        calculate();

    //8
        /** Write a program with the following:
          Method that receive your name as a String and prints it.*/

//        printName("Serzh");

        /**  Method that receive an integer, divide it by 2, and prints the
         result.*/

//        divide2(8);
    //9

        /**Write a program with the following:
          Method that receive two numbers, add them, and return the
         sum.*/

//        addNumbers(8,2);
//        int result = addNumbers(7,7);
//        System.out.println(result);

        /**  Method that receive two Strings, add space between them,
         and return one spaced string.*/
//        spacedString("hello","world");
//        String space = spacedString("hello","world");
//        System.out.println(space);
    //10
        /**What will be printed?*/
//        System.out.println(5%2 == 1? 20:30);
//        20

    //11
        /**What’s wrong with the below code?*/
//        while (1>0){
//            System.out.println("1");
//        }

//        This is an infinite loop and will never stop.

    //12
        /**What will be the output of the below program?*/
//        String a1 = "hello";
//        String a2 = "Hello";
//        System.out.println(a1.equals(a2));
//
//        false

    //13
        /**Which condition option should I use (1 / 2):*/
        int x = 6;
        int y = 2;
//        option 1
        if (x > y){
            if (x > 5) {
                System.out.println("Good");
            }
        }
//        option 2
        if (x > y && x > 5) {
                System.out.println("Good");
        }

        // It all really depends on if we want to add logic I case one of the conditions is met.
        // If so, The first option is the correct one, otherwise the second option.
    }
    //7
    /**Write a program with the following in main class:
      Method named printHello() that prints the word “hello”.*/
    static void printHello(){
        System.out.println("hello");
    }
    /**  Method named calculate() which adds 5+3.2 and prints the
     result.*/
    static void calculate(){
        System.out.println(5+3.2);
    }
    //8
    /** Write a program with the following:
      Method that receive your name as a String and prints it.*/

    static void printName(String name){
        System.out.println(name);
    }
    /**  Method that receive an integer, divide it by 2, and prints the
     result.*/

    static void divide2 (int number){
        System.out.println(number/2);
    }

    //9
    /** Method that receive two numbers, add them, and return the
    sum.*/
    static int addNumbers(int x, int y){
        return x + y;
        };
    /** Method that receive two Strings, add space between them,
         and return one spaced string.*/
    static String spacedString(String a,String b){
        return a + "  " + b;
    }



         }


