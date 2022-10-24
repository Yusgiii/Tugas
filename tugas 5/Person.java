package tugaspbo;

public class Person {
    private String nama;
    private String alamat;

    public Person(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }
    public String getNama(){
        return this.nama;
    }
    public String getAlamat(){
        return this.alamat;
    }
    public void setNama(String alamat){
        this.alamat = alamat;
    }
    public String toString(){
        return
        "Nama: " + getNama() +
        "\nAlamat: " + getAlamat();
    }
}
