import java.util.Scanner;

public class DataDiri {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      // Memasukkan data diri
      System.out.print("Nama: ");
      String nama = input.nextLine();
      
      System.out.print("Umur: ");
      int umur = input.nextInt();
      
      System.out.print("Alamat: ");
      input.nextLine(); // Membersihkan buffer
      String alamat = input.nextLine();
      
      System.out.print("Nomor telepon: ");
      String telepon = input.nextLine();
      
      // Menampilkan data diri
      System.out.println("Nama: " + nama);
      System.out.println("Umur: " + umur);
      System.out.println("Alamat: " + alamat);
      System.out.println("Nomor telepon: " + telepon);
   }
}
