import java.util.Scanner;
  
class BelajarJava {
  public static void main(String args[]){
      
    Scanner input = new Scanner(System.in);
      
    String nama, alamat, hobi;
  
    System.out.print("Nama: ");
    nama = input.nextLine();
     
    System.out.print("Alamat: ");
    alamat = input.nextLine();
     
    System.out.print("Hobi: ");
    hobi = input.nextLine();
      
    System.out.println();
    System.out.println("## Hasil ##");
      
    System.out.println("Nama = "+nama);
    System.out.println("alamat = "+alamat);
    System.out.println("Hobi = "+hobi);
  }
}
