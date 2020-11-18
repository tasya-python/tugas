import java.util.Scanner;
public class tasya10519006_soal2 {
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    int [] bilangan = new int[5];
    System.out.println("------------------------------------");
    System.out.println("------ INPUT BILANGAN  TERURUT--------");
    System.out.println("------------------------------");
    int x;
    for(x=0; x<=4; x++){
      System.out.printf(" input bilangan  ke-%d : ", x+1);
      bilangan [x] = input.nextInt();
    }
  }
}
