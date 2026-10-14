// You are given an array of integers nums and
// an integer target, return indices of the two
// numbers such that they add up to target

import java.util.HashMap;

public class TwoSum {
  public static void main(String[] args) {
    int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
    int target = 100;

    int result[] = solution(nums, target);
    for(var i : result) System.out.print(i + " ");
  }

  private static int[] solution(int [] input, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < input.length; i++) {
      int current = input[i];
      int x = target - current;

      if(map.containsKey(x)) {
        int res[] = {i, map.get(x)};
        return res;
      }

      map.put(current, i);
    }
    return null;
  }
}
