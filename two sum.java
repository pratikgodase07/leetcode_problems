import java.util.HashMap;

public class Solution {
  public static int[] twoSum(int[] numbers, int target) {    
    int size = numbers.length;
    HashMap<Integer, Integer> holder = new HashMap<Integer, Integer>();
    int[] result = new int[2];
    if (size < 2) {
      return null;
    }
    for (int i = 0; i < size; i++) {
      if (holder.containsKey(target - numbers[i])) {
        result[0] = i;
        result[1] = holder.get(target - numbers[i]);
      }
      else {
        holder.put(numbers[i], i);    // [value, index]
      }
    }
    return result;
  }
}
