import java.util.Scanner;

public class homeWorkChallenges {
    public static void main(String[] args) {

//        14
        /**Create a nested for loop (loop inside another loop) to create
         a pyramid shape:*/
//        #
//        ##
//        ###
//        ####
//        #####


//            // Loop for rows
//        int number = 5;
//        for (int i = 1; i <= number; i++) {
//            // Print spaces before stars
//            for (int j = 5; j <= number - i; j++) {
//                System.out.print(" ");
//            }
//            // Print "#"
//            for (int k = 0; k <= 1 * i - 1; k++) {
//                System.out.print("#");
//            }
//            // Move to the next line
//            System.out.println();
//        }

//        int i, j;
//        int n = 5;
//        // outer loop to handle number of rows
//        //  n in this case
//        for(i=0; i<n; i++) {
//            //  inner loop to handle number of columns
//            //  values changing acc. to outer loop
//            for(j=0; j<=i; j++) {
//                // printing "#"
//                System.out.print("#");
//            }
//            // ending line after each row
//            System.out.println();}
//        15
        /**Create a nested for loop to create X shape (width is 7,
         length is 7):*/
//       x     x
//        x   x
//         x x
//          x
//         x x
//        x   x
//       x     x



//                int length = 7;
//                int width = 7;
//
//                for (int i = 0; i < width; i++) {
//                    for (int j = 0; j < length; j++) {
//                        if (i == j || i + j == length - 1) {
//                            System.out.print("x");
//                        } else {
//                            System.out.print(" ");
//                        }
//                    }
//                    System.out.println();
//                }

//       16
        /**Write a program with the following:
          Method that gets an integer from the user (using Scanner
         class).
          Method that receive the integer from the first method, and
         computes the sum of the digits the integer (e.g. 25 = 7, 2+5=7)*/


//        computeSum();

//        17
        /** Create a class Dog with the following:
        1. Int age.
        2. String name.
        3. Boolean happy.*/

        Dog dog = new Dog();


//        18
        /**Write a switch case which will check an int variable value and prints:
          “A” if the int value is 1-3
          “B” if the int value us 4-6
          “C” if the int value us 7-10
         ** Hint: use multilabel switch case.*/

        int value = 6;

        switch (value) {
            case 1:
            case 2:
            case 3:
                System.out.println("A");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("B");
                break;
            case 7:
            case 8:
            case 9:
            case 10:
//            case 7,8,9,10:
                System.out.println("C");
                break;
            default:
                System.out.println("Invalid value");
                break;
        }



    }
//    16
    /** Method that gets an integer from the user (using Scanner
     class).*/

//        static int getInt() {
//        System.out.println("Please enter a number");
//        Scanner number = new Scanner(System.in);
//        return number.nextInt();
//}
    /**Method that receive the integer from the first method, and
     computes the sum of the digits the integer (e.g. 25 = 7, 2+5=7)*/
//    static void computeSum(){
//        int num = getInt();
//        int sum = 0;
//        while (num > 0) {
//            sum = sum + num % 10;
//            num = num / 10;
//        }
//        System.out.println(sum);
//    }

}

