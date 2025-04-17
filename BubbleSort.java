import java.util.Arrays;

public class BubbleSort
{

	public static void main(String[] args)
  {
    int[] myNums = {12, 15, 0, 44, 13, 1, 2};
		int passes = myNums.length-1;
		int comparisons = myNums.length-1;
		int tempNum =0;

		//Loop once for each pass, where passes is one less than the number of items.
		for(int i = 0; i < passes;i++){
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
			for(int c = 0; c< comparisons; c++)
			{
				if(myNums[c] >= myNums[c+1])
				{
					tempNum = myNums[c+1];
					myNums[c+1] = myNums[c];
					myNums[c] = tempNum;
				}
			}
			comparisons--;
		}
System.out.println(Arrays.toString(myNums));
  }
}
