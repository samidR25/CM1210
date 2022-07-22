import java.util.Scanner;

public class randArrays{
  public static void main(String[] args) {

    int [] nums = new int [5];
    nums [0] = 3;
    nums [1] = 5;
    nums [2] = 7;
    nums [3] = 9;
    nums [4] = 10;

    int sums = 0;
    int length = nums.length;
    for(int i=0; i<length; i++){
      sums += nums[i];
    }
    System.out.print(sums);





/*
      int [] nums = {3 ,5 ,7 ,9 ,10};
      int sum = 0;
      for(int num : nums){
        sum = num+sum;
      }

      System.out.print(sum);
*/

  }
}
