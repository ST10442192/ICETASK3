/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OddSumSquares;

/**
 *
 * @author uthandilenkosi
 */
 public class OddSumSquares {
    
        public static int sumOddSquares(int limit){
            //Takes an interger limit as input and returns an interger representing the sum of squares of odd numbers up to a given limit.
            
           int sum = 0;
           //Start with a sum of zero
           
           for (int x = 1; x <=limit; x +=2){
               //Starting with equating x to one and incrementing it by 2 in each iteration ensures that we only get odd numbers. 
               sum += x * x; 
               //Multiplying the odd number by itself to square it and add it the sum.
           }
           return sum;
        }
        
        
       public static void main(String[] args){
           int limit = 10; 
           
           System.out.println("Sum of squares of odd numbers up to limit of " + limit + ": " + sumOddSquares(limit));
           //The previous method is called. 
       }
}
    

