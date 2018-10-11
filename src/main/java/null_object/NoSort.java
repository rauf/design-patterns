package null_object;

import java.util.Arrays;

// null object
// Returning a empty list instead of null is also a valid example of Null Object Pattern
public class NoSort implements SortStrategy {

  @Override
  public void sort(int[] numbers) {
    System.out.println("Don't sort these numbers " + Arrays.toString(numbers));
  }
}
