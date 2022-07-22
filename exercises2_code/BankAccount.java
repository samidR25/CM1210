import java.util.Scanner;
public class BankAccount {

  Scanner in;

  // Constructor
  public BankAccount() {
    in = new Scanner(System.in);
  }

    private String holderName(String prompt){
      System.out.println("name: ");
      token = in.next();
      return token;
    }

    private Int balance;


    private Int number(String prompt){
      System.out.println("number: ");
      num = in.nextInt();
      return num;
    }


}
