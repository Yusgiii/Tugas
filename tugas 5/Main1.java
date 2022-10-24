package tugaspbo;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {     
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan nama guru : ");
        String nama = sc.nextLine();
        System.out.print("masukan alamat guru : ");
        String alamat = sc.nextLine();
        Student ds = new Student(nama, alamat);
        for(int i = 0; i < 3; i++){
            System.out.print("masukan pelajaran yang diampu : ");
            String pelajaran = sc.nextLine();
            ds.addCourse(pelajaran);
        }
        System.out.println(ds);
    }
}