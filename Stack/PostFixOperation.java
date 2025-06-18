package Stack;

import java.util.Stack;

import static java.lang.Character.isDigit;

public class PostFixOperation
{
   public static void main(String[] args)
   {
      String expression = "23*54*+9-";
      int result = postFix(expression);
      System.out.println("The result of the postfix expression is: " + result);
   }

   public static int postFix(String experssion)
   {
      Stack<Integer> stack = new Stack<>();
      int result =-1;
      for(char ch  : experssion.toCharArray())
      {
         if(isDigit(ch))
            stack.push(ch - '0');
         else
         {
            if(stack.size() < 2)
                throw new IllegalArgumentException("Invalid postfix expression: " + experssion);
           int n1 = stack.pop();
           int n2 = stack.pop();
           result = performOperation(n2, n1, ch);
           stack.push(result);
         }
      }
      return result;
   }

   public static int performOperation(int n1, int n2, char operator) {
      switch (operator) {
         case '+':
            return n1 + n2;
         case '-':
            return n1 - n2;
         case '*':
            return n1 * n2;
         case '/':
            return n1 / n2;
         default:
            throw new IllegalArgumentException("Invalid operator: " + operator);
      }
   }
}
