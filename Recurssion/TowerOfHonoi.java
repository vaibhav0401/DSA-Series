package Recurssion;

/* Steps
   1 Move n-1 disk from source A to helper B using destination C
   2 Move nth disk from source A to destination C
   3 Move n-1 disk from helper B to destination C using source A
 */
public class TowerOfHonoi
{
   public static void main(String[] args)
   {
      int n=4;
      TOI(n,'A','B','C');
   }
   public static void TOI(int n, char source,char helper, char destination)
   {
      if(n==1)  // Point 2
        {
             System.out.println("Move disk 1 from " + source + " to " + destination);
             return;
        }
      TOI(n-1,source,destination,helper); //point 1
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

      TOI(n-1,helper,source,destination); //Point 3
   }
}
