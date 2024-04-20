/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ParenthesisCheck;

/**
 *
 * @author uthandilenkosi
 */

public class Check {

   public static boolean isValid(String s){
       StringBuilder str = new StringBuilder();
            for (char c : s.toCharArray()){
                if(c == '(' || c == '[' || c == '{'){
                    str.append(c);
                }
                else if(c == ')' || c == ']' || c== '}'){
                    if (str.length() == 0){
                        return false; 
                    }
                
                    char lastChar = str.charAt(str.length() - 1);
                
                     if((c == ')' && lastChar != '(') || (c == ']' && lastChar != '[') || (c == '}' && lastChar != '{')) {
                        return false;
                    } else {
                    }
                    str.deleteCharAt(str.length() - 1);
                }
            }
            return str.length() == 0;
   }
public static void main(String[] args){
    String[] testCases = {"{}{)}" , " ' ' ", "{[}]" , "()" , "({[]})}"};
     
        for (String testCase : testCases){
            System.out.println(testCase + (isValid(testCase) ? "valid":"invalid"));
        }
}
}

