package Stack;

import java.util.Stack;

public class inFixoperation
{
   public static void main(String[] args)
   {
      String expression = "2*3+5*4-9";
      int result = inFix(expression);
      System.out.println("The result of the postfix expression is: " + result);
   }

   public static int inFix(String experssion)
   {
      Stack<Integer> operands = new Stack<>();
      Stack<Character> operators = new Stack<>();

      for(char ch :  experssion.toCharArray())
      {
         if (Character.isDigit(ch))
         {
            operands.push(ch - '0');
            continue;
         }
         while (!operators.isEmpty() && checkPrecendence(ch) <= checkPrecendence(operators.peek()))
         {
            if (operands.size() < 2)
               throw new IllegalArgumentException("Invalid infix expression: " + experssion);
            int n1 = operands.pop();
            int n2 = operands.pop();
            char operator = operators.pop();
            int result = performOperation(n2, n1, operator);
            operands.push(result);
         }
         operators.push(ch);

      }
      while (!operators.isEmpty())
      {
         if (operands.size() < 2)
            throw new IllegalArgumentException("Invalid infix expression: " + experssion);
         int n1 = operands.pop();
         int n2 = operands.pop();
         char operator = operators.pop();
         int result = performOperation(n2, n1, operator);
         operands.push(result);
      }

      return operands.pop();
   }

   private static int checkPrecendence(char ch)
   {
      return (ch =='+' || ch =='-') ? 1 : 2;
   }

   private static int performOperation(int a, int b,char op) {
      return switch (op) {
         case '+' -> a + b;
         case '-' -> a - b;
         case '*' -> a * b;
         case '/' -> a / b;
         default -> throw new IllegalArgumentException("Invalid operator: " + op);
      };
   }
}
