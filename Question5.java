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
     
    Scanner in = new Scanner(System.in);
    int int1 = in.nextInt();
    int[] listInt = new int[int1];
    int[] Countlist = new int[int1];
    for (int i=0;i<int1;i++)
      {
        int intX = in.nextInt();
        listInt[i] = intX;  
      }
    for (int i=0;i<int1;i++)
      {
        int c = 1;
        for (int j=i+1;j<int1;j++)
          {
            if (listInt[i] == listInt[j] )
            {
              c++;
            }
            Countlist[i] = c;
          }
      }
    for (int i=1;i<int1;i++)
      {
        int c = 0;
        if (Countlist[c] < Countlist[i])
        {
          c++;
          if (i == int1 - 1)
          {
            System.out.println(listInt[c]);
          }
        }
        else
        {
          if (i == int1 - 1)
          {
            System.out.println(listInt[c]);
          }
        }
      }
    
  }
}
