/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CommonDivisor;

/**
 *
 * @author uthandilenkosi
 */
import java.util.Scanner;

//Code Attribution
//This method was taken from
//https://stackoverflow.com/questions/13673600/how-to-write-a-simple-java-program-that-finds-the-greatest-common-divisor-betwee
//Ram Kiran Pachigolla
//https://stackoverflow.com/users/1265724/ram-kiran-pachigolla

public class GreatestCommonDivisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the first integer");
        int a  = input.nextInt();
        
        System.out.println("Enter the second integer");
        int b = input.nextInt();
        
        System.out.println("The gcd of " + a + " and" + b + " is" + getGCD(a,b));
        
    }
    
    public static int getGCD(int a, int b){
        
        int gcd = 1;
        
        if(a > b){
             
            for(int x = b; x >= 1; x--){
                if (a%x == 0 && b%x == 0){
                    return x;
                }
            }
        }
        else { 
           for(int c = a; c >= 1; c--){
               
               if(a%c == 0 && b%c == 0){

               
               return c;
           } 
        }
        }
        return gcd;

}
}