import java.util.Scanner;

public class Lesson12Practice {
    public static void main(String[] args) {

        //PRACTICAL ASSIGNMENT - LOOPS IN JAVA. PART 1

        System.out.println("output content of any one-dimensional array using FOR :");

        int[] simpleArray = {5, 18, 6, 99, 65, 23, 17};
        for (int i = 0; i < simpleArray.length; i++) {
            System.out.println("The array includes # " + simpleArray[i]);
        }
        System.out.println();

        //output content of 2d array using two FORs
        System.out.println("output content of 2d array using two FORs:");

        int[][] simple2DArray = {{1, 5, 8, 3}, {6,0,1,6}, {4,7,9,1}};
        System.out.println("The elements are: ");
        for (int i = 0; i < simple2DArray.length; i++) {
            for (int j = 0; j < simple2DArray[i].length; j++) {
                System.out.println(simple2DArray[i][j] + "\t");
            }
            System.out.println("");
        }







        //PRACTICAL ASSIGNMENT - LOOPS IN JAVA. PART 2

        //Enter numbers until sum of all numbers is larger than 100
        Scanner scanner = new Scanner(System.in);

        int sumOfNumbers = 0; //in the beginning the sum is 0
        do {
            System.out.println("Please enter an integer: ");
            int userInput = scanner.nextInt();
            sumOfNumbers += userInput; // sum of numbers = sum of numbers + user input number
        } while (sumOfNumbers < 100);

        System.out.println("Game over! The sum of your integers is: " + sumOfNumbers);







        //NUMBER GUESSING GAME
        //Define a new array of 3 integers - initialize the values
        //Ask user to enter any integer
        //If the integer is in the array, print that user guessed right
        //If the integer is not in the array - print that user guessed wrong
        //Finish the game, when all 3 numbers are guessed

        int[] newArray = {3, 7, 23};
        int userInt0, userInt1, userInt2;

        System.out.println("WELCOME TO THE GUESSING GAME!");
        System.out.println("Your task is to guess the 3 integers in our array, ranging from 1 to 25!");
        System.out.println();

        do {
            System.out.println("Please guess the first integer: ");
            userInt0 = scanner.nextInt();
            if (userInt0 != newArray[0]) {
                System.out.println("Your guess is wrong!");
            }
        } while (userInt0 != newArray[0]);
        System.out.println("Awesome! You've guessed the first integer!");
        System.out.println();


        do {
            System.out.println("Please guess the second integer: ");
            userInt1 = scanner.nextInt();
            if (userInt1 != newArray[1]) {
                System.out.println("Your guess is wrong!");
            }
        } while (userInt1 != newArray[1]);
        System.out.println("Awesome! You've guessed the second integer!");
        System.out.println();


        do {
            System.out.println("Please guess the third integer: ");
            userInt2 = scanner.nextInt();
            if (userInt2 != newArray[2]) {
                System.out.println("Your guess is wrong!");
            }
        } while (userInt2 != newArray[2]);
        System.out.println("Awesome! You've guessed the third integer!");
        System.out.println("CONGRATULATIONS! You win!");


    }
}
