package Stack;

import java.util.Stack;

public class ReverseString
{
   public static void main(String[] args)
   {
      String str = "Hello, World!";
      String reversed = reverseString(str);
      System.out.println("Original String: " + str);
      System.out.println("Reversed String: " + reversed);
   }

   public static String reverseString(String str)
   {
      Stack<Character> stack = new Stack<>();
        // Push each character of the string onto the stack
      for(char ch : str.toCharArray())
         stack.push(ch);

      StringBuilder sb = new StringBuilder();

      while(!stack.empty())
         sb.append(stack.pop());

      return sb.toString();
   }

}
