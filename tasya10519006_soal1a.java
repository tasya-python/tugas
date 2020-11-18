import java.util.Scanner;
public class tasya10519006_soal1a {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int [] bilangan = new int[10];
        System.out.println("------------------------------");
        System.out.println("------ INPUT BILANGAN --------");
        System.out.println("------------------------------");
        int x;
        for(x=0; x<=9; x++){
          System.out.printf(" input bilangan  ke-%d : ", x+1);
          bilangan [x] = input.nextInt();
        }
        System.out.println("------------------------------");
        System.out.println("------- INPUT DATA -----------");
        System.out.println("------------------------------");
        for(x=0; x<=9; x++){
            System.out.printf(" data  [%d] : ", x+0);
            bilangan [x] = input.nextInt();
        }
    }
}

