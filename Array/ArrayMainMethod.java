package Array;

import java.util.ArrayList;
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
      int arr10[] = {2,1,1,2,0,0,2,0,0,1,0,2,1,0};
      //Invalid Case
      int arr12[] = {1};
      int arr13[] = {1,4,3,5,3,6,2,3};

      int arr14[] = {1, 5, 10, 20, 40, 80};
      int arr15[] = {6, 7, 20, 80, 100};
      int arr16[] = {3, 4, 15, 20, 30, 70, 80, 120};
      int arr17[] = {1,3,5,3,6,7,8,9,10,2,3,0,-1};
      int arr18[] = {4,9,20,3,10,5,10,5};
      int arr19[] = {1,3,8,9,15};
      int arr20[] = {7,11,19,21,22,25};
      int arr21[] = {3,3,4,2,4,4,2,4,4};
      String[] arr22 = {"apple", "banana", "cherry", "date", "elderberry"};
      int[] arr23 = {4,1,2};
        int[] arr24 = {1, 3,4,2};

      int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
      List<Integer> list1= new ArrayList<>(List.of(4,5,6,5,4,3));
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
      printArray("\nLeft Rotated Array by 2 positions", leftRotatedArray);

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

      int indexValue = BinarySearch.binarySearch(arr8, 5);
      print("Index of the element 5 in the array is", indexValue);

      int[] dnfSort = SortArrayDNF.sortArray(arr10);
      printArray("Array sorted using Dutch National Flag Algorithm is", dnfSort);

      List<Integer> commons = CommonAmong3Array.getCommon(arr14, arr15, arr16);
      printValue.printList("\nCommon elements among three arrays are", commons);

      int[][] rotatedMatrix = RotateMatrix90.rotate(matrix);
      printMatrix("Matrix after 90 degree rotation", rotatedMatrix);

      int LongestLengthSubseq = LongestLengthSubsequence.longestLengthSubsequence(arr17);
      print("Longest Length Subsequence in the array is", LongestLengthSubseq);

      int largestElement = LargestElementK.findLargestElement(arr16, 3);
      print("Kth Largest Element in the array is", largestElement);

      int smallestElement = SmallestElementK.getSmallestElement(arr16, 3);
      print("kth Smallest Element in the array is", smallestElement);

      int[] reArrangedArray = RearrangeinAlternatePositiveAndNegItems.getRearrangesArray(arr2);
      printArray("Rearranged Array in alternate positive and negative items", reArrangedArray);

      List<List<Integer>> subArray= SubArraySumEqualToK.getSubArray(arr18, 33);
      print("\nSubarray with sum equal to 33 is found at index", subArray);

      int median = MedianOf2SortedArray.getMedian(arr19,arr20);
      print("\nMedian of two sorted arrays is", median);

      List<Integer> freqBasedSortedArray = SortBasedOnFrequency.getSortedArray(list1);
      printList("\nArray sorted based on frequency of elements", freqBasedSortedArray);

      List<List<Integer>> allPairsEqualToDifference = AllPairEqualToDifference.getAllPairsEqualToDifference(arr13, 3);
      print("\nAll pairs in the array with difference equal to 3", allPairsEqualToDifference);

      List<List<Integer>> subArraySumEqualTo0= SubArraySumEqualTo0.getSubArray(arr2, 0);
      print("\nSubarray with sum equal to 0 is found is -", subArraySumEqualTo0);

      int majorityElement = MajorityElementMooresAlgo.getMajoritElement(arr21);
      print("\nMajority Element in the array is", majorityElement);

      String[] sortedArray = SortBasedOnLenOfString.sortBasedOnLength(arr22);
      printArray("\nLongest String in the array is", sortedArray);

      int[] nextGratestElement = NextGratestElement.nextGreaterElement(arr23, arr24);
        printArray("\nNext Greatest Element in the array is", nextGratestElement);
   }
}