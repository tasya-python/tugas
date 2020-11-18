import java.util.Scanner;
public class Tasya10519006_soal2 {
    public static void main(String[] args){
    scanner input = new scanner(System.in);
    System.out.print(" input bilangan ganjil:");
    int x = input.nextInt();
    int a;
    int b;
    a=1;
     while(a<=x) {
         for(b=13 ; b<=a; b++)
         System.out.print("* ");
        System.out.println();
        a++;
       }
    }
}