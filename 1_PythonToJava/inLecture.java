java.util.Scanner;

public class inLecture{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter rolls: ");
    int numRolls = in.nextInt();
    int frequencies[] = new int[6];
    int roll;

    for(int i=0; i<frequencies.length; i++){
      frequencies[i]= 0);
    }


    for(int i=0; i<numRolls; i++){
      roll = 1+ (int)(Math.random() *6) ;
      frequencies[roll-1]++;
    }

    for(int i=0; i<frequencies.length; i++){
      frequencies[i]= 0);
    }

  }
}
