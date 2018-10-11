package null_object;

import java.util.Arrays;

public class BubbleSort implements SortStrategy {

  @Override
  public void sort(int[] numbers) {
    int[] nums = Arrays.copyOf(numbers, numbers.length);
    Arrays.sort(nums);
    System.out.println("Bubble sort these numbers " + Arrays.toString(nums));
  }
}
