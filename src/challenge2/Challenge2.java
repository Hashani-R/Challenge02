package challenge2;
import java.util.*; 
public class Challenge2 {

    public static void main(String[] args) {
         
         String s;
         Scanner sc = new Scanner(System.in); 
         System.out.println("Enter parenthesis to check:"); 
         s = sc.nextLine(); 
         
         //call parenthesis to check that inputs are valid
        if (parenthesis(s))
            System.out.println("Entered parenthesis "+ s +" are valid.");   
        else   
            System.out.println("Entered parenthesis "+ s +" are not valid.");  
    }
    
    public static boolean parenthesis (String s) {  
        Stack<Character> stack = new Stack<Character>();
        for ( char c: s.toCharArray()){
            if(c =='(')
                stack.push(')');
            else if(c =='{')
                stack.push('}');
            else if(c =='[')
                stack.push(']');
            else if(stack.isEmpty() || stack.pop()!= c)
                return false;
        }
        return stack.isEmpty();
    }
}
