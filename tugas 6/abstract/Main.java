

public class Main {
    public static void main(String[] args) {
        BangunDatar segitiga = new Segitiga(6,10);
        BangunDatar lingkaran = new Lingkaran(40);
        
        System.out.println("Luuas dari bangun datar segitiga: " + segitiga.getLuas());
        System.out.println("Luas dari bangun datar lingkaran: " + lingkaran.getLuas());
    }
}