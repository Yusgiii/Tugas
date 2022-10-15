
package tugaspbo;

public class HandPhone {
    String jenis_hp;
    int tahun_pembuatan;
    
    public void setDataHP(String jenis_hp, int tahun_pembuatan) {
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }
    public String getJenisHP(){
        return jenis_hp;
    }
    public int getTahunPembuatan(){
        return tahun_pembuatan;
    }
    public static void main(String[] args) {
        HandPhone hp = new HandPhone();
        hp.setDataHP("iphone", 2022);
        System.out.println("jenis HP : " + hp.getJenisHP());
        System.out.println("tahun pembuatan : " + hp.getTahunPembuatan());
                
    }
}
