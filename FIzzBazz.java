import java.util.Scanner;

public class FizzBazz{
   public static void main(String[] args) {
      System.out.println("数字を入力して下さい。");
      Scanner scan = new Scanner(System.in);
      int number =scan.nextInt();
      for(int i = 1; i <= number ; i++){
        if (i % 3 ==0 && i % 5 ==0){
          System.out.println("FizzBuzz");
        } else if(i % 3 == 0){
          System.out.println("Fizz");
        }
         else if(i % 5 == 0){
          System.out.println("Buzz");
        }
        else {
          System.out.println(i);
        }
      }
    }
}
