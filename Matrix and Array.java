package arraydanlist;
import java.util.Scanner;

public class Arraydanlist {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Jumlah Baris : ");
        int baris = input.nextInt();
        
        System.out.print("Jumlah Kolom : ");
        int kolom = input.nextInt();
        
        int a[][] = new int[baris][kolom];
        int b[][] = new int[baris][kolom];
        
        System.out.println("MATRIKS 1");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan Nilai untuk Baris "+i+" Kolom "+j+" : ");
                a[i][j] = input.nextInt();
            }
        }
        
        System.out.println("MATRIKS 2");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan Nilai untuk Baris "+i+" Kolom "+j+" : ");
                b[i][j] = input.nextInt();
            }
        }
        
        System.out.println("HASIL");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print((a[i][j]*b[i][j])+" ");
            }
            System.out.println("");
        }
    }
}
