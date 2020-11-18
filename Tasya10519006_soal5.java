import java.util.Scanner;
public class Tasya10519006_soal{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("masukkan panjang batu bata kecil (p1):");
        int p1 = scan.nextInt();
        System.out.print("masukkan panjang batu bata besar (p2):");
        int p2 = scan.nextInt();
        scan.close();
        double hasil=p1*p2;
        System.out.println("hasil jumlah "+p1+" * "+p2+" = "+hasil);
     }
    }