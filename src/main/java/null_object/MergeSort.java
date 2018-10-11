package null_object;

import java.util.Arrays;

public class MergeSort implements SortStrategy {

  @Override
  public void sort(int[] numbers) {
    int[] nums = Arrays.copyOf(numbers, numbers.length);
    Arrays.sort(nums);
    System.out.println("Merge sort these numbers " + Arrays.toString(nums));
  }
}
