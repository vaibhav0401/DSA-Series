package Array;

import static Array.ArraySum.sum;
import static Array.CountEvenOdd.countEvenOdd;
import static Array.MaxElement.getMaxElement;
import static Array.MinElement.getMinElement;
import static Array.ReverseArray.reverseArray;
import static Array.printValue.print;
import static Array.printValue.printArray;

public class ArrayExample
{
   public static void main(String[] args)
   {
      System.out.println("Hello from ArrayExample!");
      //Valid Case
      int arr[] = { 11,9, 7, 5, 3, 1 };
      int arr1[] = { 2, 4, 6, 8, 10, 12 };

      //Invalid Case
      int arr2[] = {1};
      int arr3[] = {1,4,3,5,6,2};
      int maxElement = getMaxElement(arr);
      System.out.println("Maxium Element in the array is : " + maxElement);
      print("Maximum Element in the array is", maxElement);

      int minelement = getMinElement(arr);
      print("Minimum Element in the array is", minelement);

      int[] reversedArray = reverseArray(arr);
      printArray("Reversed Array", reversedArray);

      int sum = sum(arr);
      print("\nSum of all elements in the array is", sum);

      int[] evenOddCount = countEvenOdd(arr);
      print("Count of Even elements in the array", evenOddCount[0]);
      print("Count of Odd elements in the array", evenOddCount[1]);

      int[] alternateElements = AlternateElements.alternateElements(arr);
      printArray("Alternate Elements in the array", alternateElements);

      int secondMax = SecondMaxElement.getSecondMaxElement(arr);
      print("\nSecond Maximum Element in the array is ",secondMax);

      int secondMin = SecondMinElement.getSecondMinElement(arr);
      print("Second Minimum Element in the array is ", secondMin);

      int[] mergedArray = Merge2SortedArray.mergeSortedArray(arr, arr1);
      printArray("Merged Sorted Array", mergedArray);

      boolean isSorted = CheckSorting.isSorted(arr3);
      print("\nIs the array sorted? ", isSorted);
   }
}