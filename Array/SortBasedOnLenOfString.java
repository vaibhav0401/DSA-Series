package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBasedOnLenOfString
{
   public static String[] sortBasedOnLength(String[] arr)
   {
      List<String> list = Arrays.asList(arr);
//      list.sort(Comparator.comparingInt(String::length));
//      list.sort((a,b)->{return b.length()-a.length();});
      return list.toArray(new String[0]);
   }
}
