package Tugas;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayDeque;

public class Trade {
  public static void main(String[] args) {
    // Menggunakan ArrayList untuk menyimpan daftar produk yang dijual
    ArrayList<String> products = new ArrayList<>();
    products.add("Minyak goreng");
    products.add("Beras");
    products.add("Telur");
    products.add("Gula");
    products.add("Sari Roti");
    
  // Menggunakan ArrayDeque untuk menyimpan antrian pembeli
    ArrayDeque<String> queue = new ArrayDeque<>();
    queue.add("Andi");
    queue.add("Budi");
    queue.add("Cindy");
    queue.add("Doni");
    queue.add("Eka");

  // Menjual produk-produk yang ada di daftar kepada pembeli yang ada di antrian
  while (!queue.isEmpty()) {
    String customer = queue.poll();
    System.out.println("Melayani pembeli: " + customer);
  
  // Menampilkan daftar produk yang tersedia
    System.out.println("Daftar produk: ");
    for (int i = 0; i < products.size(); i++) {
      System.out.println((i + 1) + ". " + products.get(i));
     }
  
    try (// Meminta input pembeli tentang produk yang ingin dibeli
    Scanner scanner = new Scanner(System.in)) {
      System.out.print("Masukkan nomor produk yang ingin dibeli: ");
      int productIndex = scanner.nextInt(); // gunakan Scanner untuk membaca input dari pembeli
 
  // Menjual produk kepada pembeli
      String product = products.get(productIndex - 1);
      System.out.println("Menjual " + product + " kepada " + customer);
      }
    }
  }
}
