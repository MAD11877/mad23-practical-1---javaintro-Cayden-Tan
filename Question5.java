import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner scanner = new Scanner(System.in);
    
    int n = scanner.nextInt();

    int[] nums = new int[n];
    for (int i = 0; i < n; i++) {
      nums[i] = scanner.nextInt();
    }

    int mode = findMode(nums);
    System.out.println(mode);
    
  }
  public static int findMode(int[] nums) {
    Map<Integer, Integer> counts = new HashMap<>();
    int maxCount = 0;
    int mode = 0;

    for (int num : nums) {
      int count = counts.getOrDefault(num, 0) + 1;
      counts.put(num, count);
      if (count > maxCount) {
        maxCount = count;
        mode = num;
      }
    }

    return mode;
  }
}
