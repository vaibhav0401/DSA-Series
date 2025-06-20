package LinkedList.Singly.SlowFastPointer;
// Slow and Fast pointer
public class HappyNumber
{
   private static int getNext(int n)
   {
      int totalSum=0;
      while(n>0)
      {
         int digit = n%10;
         totalSum+=digit*digit;
         n=n/10;
      }
        return totalSum;
   }

   public static void main(String[] args)
   {
      int n=18;
      int slow =n;
      int fast = getNext(n);

      while(fast!=1 && fast!=slow)
      {
         slow = getNext(slow);
         fast = getNext(getNext(fast));
      }

      System.out.println(fast==1 ? "Happy Number" : "Not a Happy Number");
   }
}
