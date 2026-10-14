// Given two sorted arrays nums1 and nums2 of
// size m and n respectively, return the
// median of the two sorted arrays.
// The overall run time complexity should
// be O(log (m+n)).

public class MedianOfArrays {
  public static void main(String[] args) {
    int[] nums1 = { 1, 2 };
    int[] nums2 = { 3, 4 };

    double median = solution(nums1, nums2);
    System.out.println(median);
  }

  private static double solution(int[] arr1, int[] arr2) {
    int size1 = arr1.length;
    int size2 = arr2.length;

    int left = 0;
    int right = arr1.length;
    while (left <= right) {
      int p1 = (left + right) / 2;
      int p2 = (size1 + size2 + 1) / 2 - p1;

      int maxL1 = (p1 == 0) ? Integer.MIN_VALUE : arr1[p1 - 1];
      int minR1 = (p1 == size1) ? Integer.MAX_VALUE : arr1[p1];
      int maxL2 = (p2 == 0) ? Integer.MIN_VALUE : arr2[p2 - 1];
      int minR2 = (p2 == size2) ? Integer.MAX_VALUE : arr2[p2];

      if (maxL1 <= minR2 && maxL2 <= minR1) {
        if ((size1 + size2) % 2 == 0)
          return Math.max(maxL1, maxL2);
        return (Math.max(maxL1, maxL2) + Math.min(minR1, minR2)) / 2;
      } else if (maxL1 > minR2)
        right = p1 - 1;
      else
        left = p1 + 1;
    }
    return 0.0;
  }
}
