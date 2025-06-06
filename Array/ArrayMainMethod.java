package Array;

import java.util.List;
import java.util.Map;

import static Array.ArraySum.sum;
import static Array.CountEvenOdd.countEvenOdd;
import static Array.MaxElement.getMaxElement;
import static Array.MinElement.getMinElement;
import static Array.ReverseArray.reverseArray;
import static Array.printValue.*;

public class ArrayMainMethod
{
   public static void main(String[] args)
   {
      System.out.println("Hello from ArrayExample!");
      //Valid Case
      int arr[] = { 11,9, 7, 5, 3, 1 };
      int arr1[] = { 2, 4, 6, 8, 10, 12 };
      int arr2[] = {-2,-3,4,-1,-2,1,5,-3};
      int arr4[] = { 11,9, 7, 5, 3, 1 };
      int arr5[] = {0,1,0,2,3,0,0,0,0,4,5,6,7,0,0};
      int arr6[] = {5,5,7,7,7,8,9,9,10,10};
      int arr7[] = {5,5,7,7,7,8,9,10,10};
      int arr8[] = {1,2,3,4,5,7,8,9,10};
      int arr9[] = {1,2,3,4,5,6,7,8,9,10};
      //Invalid Case
      int arr12[] = {1};
      int arr13[] = {1,4,3,5,3,6,2,3};
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

      boolean isSorted = CheckSorting.isSorted(arr13);
      print("\nIs the array sorted? ", isSorted);

      int maxSum =  LargestContSubArraySum.largestContiguousSubArraySum(arr2);
      print("Maximum Contiguous Subarray Sum is", maxSum);

      int[] rightRotatedArray = RightRotation.rightRotate(arr4, 2);
      printArray("Right Rotated Array by 2 positions", rightRotatedArray);

      int[] leftRotatedArray = LeftRotation.leftRotate(arr4, 2);
      printArray("\nLeft Rotated Array by 2 positions", rightRotatedArray);

      Map<Integer, Integer> frequencyMap = ElementFrequency.getElementFrequency(arr2);
      printMap("\nElement Frequency Map - ", frequencyMap);

      int[] arrayAfterMovingZeros = MoveZeroToEnd.moveZeroesToEnd(arr5);
      printArray("Array after moving zeros to end", arrayAfterMovingZeros);

      int[] intersectedArray = ArrayIntersection.getArraysIntersection(arr5, arr1);
      printArray("\nIntersected Array", intersectedArray);

      int[] unionedArray = ArrayUnion.getArraysUnion(arr5, arr1);
      printArray("\nUnion of two arrays", unionedArray);

      int[] uniqueArray =  UniqueElement.getUniqueElements(arr6);
      printArray("\nUnique Elements in the array", uniqueArray);

      int elementAppearedOnce = ElementOnlyOnce.getElementOnlyOnce(arr7);
      print("\nElement that appeared only once in the array is", elementAppearedOnce);

      int missingElement = MissingNumber.findMissingNumber(arr8);
      print("Missing Element in the array is", missingElement);

      //Using cyclic Rule
      int duplicateElement = ElementAppearMoreThanOne.getElementAppearMoreThanOne(arr13);
      print("Duplicate Element in the array is", duplicateElement);

      int[] rearrangedArray = RearrangeArray.rearrange(arr9);
      printArray("Rearranged Array", rearrangedArray);

      List<List<Integer>> allPairs = AllPairEqualToSum.getAllPairs(arr9,11);
      print("\nAll pairs in the array with sum equal to 11", allPairs);

      int maxProduct = MaxProductOf2.getMaxProduct(arr2);
      print("Maximum Product of two elements in the array is", maxProduct);

      int getIndexValue = BinarySearch.binarySearch(arr8, 5);
      print("Index of the element 5 in the array is", getIndexValue);
   }
}