package Stack;

import java.util.Stack;

import static Stack.PostFixOperation.performOperation;

public class preFixOperation
{
   public static void main(String[] args)
   {
      String expression = "-+*23*549";
      int result = preFix(expression);
      System.out.println("The result of the postfix expression is: " + result);
   }

   public static int preFix(String experssion)
   {
        Stack<Integer> stack = new Stack<>();
        int result = -1;
      for(int i=experssion.length()-1; i>=0;i--)
      {
         char ch = experssion.charAt(i);
         if(Character.isDigit(ch))
            stack.push(ch - '0');
         else
         {
            if(stack.size() < 2)
                throw new IllegalArgumentException("Invalid prefix expression: " + experssion);
            int n1 = stack.pop();
            int n2 = stack.pop();
            result = performOperation(n1, n2, ch);
            stack.push(result);
         }

      }
      return result;
   }
}
