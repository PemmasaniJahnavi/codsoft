import java.util.Scanner;
import java.util.Random;

public class numbergame{

    public static void main(String[] args) 
    {
        generateRandom();   
    }
    
    public static void generateRandom() 
    {
        Random rand= new Random();
        int randomNum = rand.nextInt(101);
        guess(randomNum);

    }

    public static void guess(int randomNum) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("Number Game");
        System.out.println("Guess a number between 0-100: ");
        int guess = in.nextInt();
        System.out.println("");

        while(guess<0||guess>100)
        {
            System.out.println("Guess a nunber between 0-100: ");
            guess = in.nextInt();
            System.out.println("");


        }


    int tries = 0;
    while(guess !=randomNum)
    {
        tries++;
        if(guess>randomNum)
        {
            System.out.println("Too high.");
            System.out.println("Guess again");
            guess = in.nextInt();
            System.out.println("");

        }
        else if(guess<randomNum)
        {
            System.out.println("Too low");
            System.out.println("Guess again");
            guess = in.nextInt();
            System.out.println("");

        }
        
    }

    System.out.println("Correct Answer. You Won!");
    System.out.println("Wrong Tries :"+tries);
    System.out.println("");
    System.out.println("Press 1 to Play again.");
    System.out.println("Press 0 to Exit.");
    int choice = in.nextInt();
    if(choice == 1)
    generateRandom();
    else
    return;
    }


}