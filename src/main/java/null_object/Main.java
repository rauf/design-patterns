package null_object;

public class Main {

  public static void main(String[] args) {
    int[] nums = {3, 2, 1, 4, 0};
    SortStrategy bubbleSort = new BubbleSort();
    SortStrategy mergeSort = new MergeSort();
    SortStrategy noSort = new NoSort();

    bubbleSort.sort(nums);
    mergeSort.sort(nums);
    noSort.sort(nums);
  }
}
