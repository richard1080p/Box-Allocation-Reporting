/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxallocation;

/**
 *
 * @author richiemartinez
 */
import java.util.Scanner;
public class BoxAllocation 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    //Welcome Message    
    System.out.println("Welcome to Box Allocator!");
       
    //User input    
    Scanner input = new Scanner(System.in);
    int test = 0;
    
    System.out.println("Enter the # of bottles expected to be packed:");
    test = input.nextInt();
    System.out.println();
    

    //Small & Large Box variables
    int smallBox = 8;
    int largeBox = 20;
    
    //Calculations
    int largeBoxes = (test / largeBox );
    int smallBoxes = (test /smallBox);
    
    //Remaining bottles calculations
    int remainingBottlesLarge = (test % largeBox);
    int remainingBottlesSmall = (test % smallBox);
    


    //Box prices output
    double largeBoxPrice = (largeBoxes * 6.99);
    double smallBoxPrice = (smallBoxes * 4.99);
    System.out.println(smallBoxes +" Small boxes will cost $"+ smallBoxPrice);
    System.out.println(remainingBottlesSmall + " Bottles remaining if you only use small boxes.");
    System.out.println();
    System.out.println(largeBoxes +" Large boxes will cost $" + largeBoxPrice);
    System.out.println(remainingBottlesLarge + " Bottles remaining if you only use large boxes.");
    
    
    
    }  
}
