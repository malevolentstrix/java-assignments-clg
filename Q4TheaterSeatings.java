import java.util.Scanner;
import java.lang.Math;
public class Q4TheaterSeatings 
{
public static void main(String[] args)
    {
        int[][] seating;
        int i,j,exit = 1;
        seating = new int[10][10];
        for(j = 0 ; j < 3 ; j++)
            for(i = 0 ; i < 10 ; i++)
            {
                seating[j][i] = 10;
            }
        for(j = 3 ; j < 6 ; j++)
            for(i = 0 ; i < 10 ; i++)
            {
                seating[j][i] = 20;
            }
        for(j = 6 ; j < 9 ; j++)
            for(i = 0 ; i < 10 ; i++)
            {
                seating[j][i] = 30;
            }
            for(i = 0 ; i < 10 ; i++)
            {
                seating[9][i] = 50;
            }
           Scanner scan = new Scanner(System.in);
    while(exit != 0)
    {
        System.out.println("How do you want to pick up the seat\n1)By Price\n2)By position\nEnter 1 or 2 to proceed");
        int choice = scan.nextInt();
        if(choice == 1)
           {
            System.out.println("CURRENT SEAT AVAILABILITY");
            for(j = 0 ; j < 10 ; j++)
               {
                for(i = 0 ; i < 10 ; i++)
                {
                    System.out.print(seating[j][i] + " ");
                }
                System.out.print("\n");
               }
               System.out.println("Enter the price of the seat you want : ");
               int price = scan.nextInt();
               i=0;j=0;
               switch(price)
                {
                    case 10: while(seating[i][j] != 10){i++; if( i == 10 ){ j++ ; i = 0 ;}}
                                seating[i][j] = 0;
                                System.out.println("Seat with Row "+ (i+1) +" and "+ (j+1) +" column is booked for you. Enjoy the show!");
                                break;
                    case 20: while(seating[i][j] != 20){i++; if( i == 10 ){ j++ ; i = 0 ;}}
                                seating[i][j] = 0;
                                System.out.println("Seat with Row "+ (i+1) +" and "+ (j+1) +" column is booked for you. Enjoy the show!");
                                break;
                    case 30: while(seating[i][j] != 30){i++; if( i == 10 ){ j++ ; i = 0 ;}}
                                seating[i][j] = 0;
                                System.out.println("Seat with Row "+ (i+1) +" and "+ (j+1) +" column is booked for you. Enjoy the show!");
                                break;
                    case 50: while(seating[i][j] != 50){i++; if( i == 10 ){ j++ ; i = 0 ;}}
                                seating[i][j] = 0;
                                System.out.println("Seat with Row "+ (i+1) +" and "+ (j+1) +" column is booked for you. Enjoy the show!");
                                break;
                    default: System.out.println("Seats for entered price not available ");           
                                break; 
                } 
           }
        if(choice == 2)
            {
                System.out.println("CURRENT SEAT AVAILABILITY");
            for(j = 0 ; j < 10 ; j++)
               {
                for(i = 0 ; i < 10 ; i++)
                {
                    System.out.print(seating[j][i] + " ");
                }
                System.out.print("\n");
               }
                System.out.println("Enter the seat position from the above Table \nEnter the required column from left");
                int sx = scan.nextInt();
                System.out.println("Enter the required row from top : ");
                int sy = scan.nextInt();
                    if(seating[sy-1][sx-1] == 0)
                        {
                            System.out.println("Sorry this seat has been already taken");
                        }
                    else
                        {
                            seating[sy-1][sx-1] = 0  ;
                            System.out.println("Your seat is booked. Enjoy the Show!");
                        }
                }
        System.out.println("CURRENT SEAT AVAILABILITY");
        for(j = 0 ; j < 10 ; j++)
           {
            for(i = 0 ; i < 10 ; i++)
            {
                System.out.print(seating[j][i] + " ");
            }System.out.print("\n");
        }  
        System.out.println("Press any number and click enter to book another ticket. Type 0 to exit");
        exit = scan.nextInt();
    }
    }
}