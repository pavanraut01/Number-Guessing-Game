package OasisJavaInternship;
3
//public class NumberGuessingGame {
//}
// Number Guessing Game

import java.util.Random;
import java.util.*;

public class NumberGuessingGame
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t-----Welcome to number guessing game------");
        System.out.println("\t\t--Rules for playing--");
        System.out.println("--There are 3 levels in the game in each level\n you have to guess the number in the required chances!--");
        System.out.println("Good Luck!");
        do{
            System.out.println("Select level:");
            System.out.println("1.Easy\n2.Mid\n3.Hard\n4.Exit");
            System.out.print("Enter your choice:");
            int ch=sc.nextInt();
            if(ch==4)
            {
                System.out.println("Thank you for playing");
                break;
            }
            switch(ch)
            {
                case 1:
                {
                    System.out.println("You get 3 chances and you have to predict the correct answer .");
                    int i=0,b=0;
                    for( i=1;i<=3;i++)
                    {
                        System.out.print("Guess any number bewtween 1 and 10:");
                        int a=sc.nextInt();
                        Random r=new Random();
                        b=r.nextInt(10);
                        if(a==b)
                        {
                            System.out.println("Congrats your guess is correct!!!");
                            System.out.println();
                            break;
                        }
                        else  if(a>b)
                        {
                            System.out.println("Your guess is higher ! Guess Low ");
                        }
                        else
                        {
                            System.out.println("Guess high");
                        }

                    }
                    if(i==4)
                    {
                        System.out.println("Number is:"+b);
                    }
                    break;
                }
                case 2:
                {
                    int i=0,b=0;
                    System.out.println("You get 5 chances and you have to predict the correct answer .");
                    for( i=1;i<=5;i++)
                    {
                        System.out.print("Guess any number bewtween 1 and 50:");
                        int a=sc.nextInt();
                        Random r=new Random();
                        b=r.nextInt(50);
                        if(a==b)
                        {
                            System.out.println("Congrats your guess is correct");
                            System.out.println();
                            break;
                        }
                        else  if(a>b)
                        {
                            System.out.println("Your guess is higher ! Guess Low ");
                        }
                        else
                        {
                            System.out.println("Guess high!!");
                        }

                    }
                    if(i==4)
                    {
                        System.out.println("Number is:"+b);
                    }


                    break;

                }
                case 3:

                {
                    int i=0;
                    int b=0;
                    System.out.println("You get 3 chances and you have to predict the correct answer .");
                    for( i=1;i<=3;i++)
                    {
                        System.out.print("Guess any number bewtween 1 and 100:");
                        int a=sc.nextInt();
                        Random r=new Random();
                        b=r.nextInt(100);
                        if(a==b)
                        {
                            System.out.println("Congrats your guess is correct");
                            System.out.println();
                            break;
                        }
                        else  if(a>b)
                        {
                            System.out.println("Your guess is higher ! Guess Low ");
                        }
                        else
                        {
                            System.out.println("Guess high!");
                        }

                    }
                    if(i==4)
                    {
                        System.out.println("Number is:"+b);
                    }


                    break;
                }

            }
        }while(true);


    }

}