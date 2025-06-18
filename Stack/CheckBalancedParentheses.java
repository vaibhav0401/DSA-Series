package Stack;

import java.util.Stack;

public class CheckBalancedParentheses
{
   public static void main(String[] args)
   {
        String expression = "{[))]}";
        boolean isBalanced = checkBalancedParentheses(expression);
        if (isBalanced) {
             System.out.println("The expression is balanced.");
        } else {
             System.out.println("The expression is not balanced.");
        }
   }
   public static boolean checkBalancedParentheses(String exp)
   {
      Stack<Character> stack = new Stack<>();
      for(char ch : exp.toCharArray())
      {
         if (ch == '(' || ch == '{' || ch == '[')
            stack.push(ch);
         else if (ch == ')' || ch == '}' || ch == ']')
         {
            if (stack.empty())
               return false;
            if (!isOpeningBracket(stack.pop(), ch))
               return false;

         }
      }

     return stack.empty();
   }

   private static boolean isOpeningBracket(char open, char close) {
      if(open == '(' && close == ')') return true;
      else if (open == '{' && close == '}') return true;
      else return (open == '[' && close == ']');
   }

}
