package tugaspbo;

public class SimulasiMotorSonic {
    boolean on;
    int porseneling;
    int kecepatan;

    SimulasiMotorSonic(){
        on = false;
        porseneling = 0;
        kecepatan = 0;
    }

    public void dinyalakan(){
        if(on == true){
            System.out.println("motor sudah menyala");
        }
        else{
            System.out.println("motor berhasil menyala");
            on = true;
        }
    }

    public void dimatikan(){
        if(on == false){
            System.out.println("motor sudah mati");
        }
        else{
            System.out.println("motor berhasil dimatikan");
            on = false;
        }
    }

    public void tambah_porseneling(){
        if(porseneling <= 6){
            porseneling++;
            System.out.println("gigi: " + porseneling);
        }
    }

    public void kurangi_porseneling(){
        if(porseneling >= 0){
            porseneling--;
            System.out.println("gigi: " + porseneling);
        }

        if(porseneling == 6 && kecepatan > 160){
            kecepatan = 160;
            System.out.println("kecepatan anda sekarang: " + kecepatan);
        }
        else if(porseneling == 5 && kecepatan > 110){
            kecepatan = 110;
            System.out.println("kecepatan anda sekarang: " + kecepatan);
        }

        else if(porseneling == 4 && kecepatan > 85){
            kecepatan = 85;
            System.out.println("kecepatan anda sekarang: " + kecepatan);
        }

        else if(porseneling == 3 && kecepatan > 60){
            kecepatan = 60;
            System.out.println("kecepatan anda sekarang: " + kecepatan);
        }
        else if(porseneling == 2 && kecepatan > 35){
            kecepatan = 35;
            System.out.println("kecepatan anda sekarang: " + kecepatan);
        }

        else if(porseneling == 1 && kecepatan > 20){
            kecepatan = 20;
            System.out.println("kecepatan anda sekarang: " + kecepatan);
        }



    }

    public void tambah_kecepatan(int jumlah_kecepatan){
        if(on == true){

            if(porseneling == 0){
                System.out.println("tidak bisa berjalan");
                System.out.println("porsenelling anda normal");
            }
            else if(porseneling == 1){
                if(kecepatan + jumlah_kecepatan > 20){
                    System.out.println("kecepatan akan melebihi maksimal kecepatan di gigi 1");
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }

                System.out.println("kecepatan anda sekarang: " + kecepatan);
            }
            else if(porseneling == 2){
                if(kecepatan + jumlah_kecepatan > 35){
                    System.out.println("kecepatan akan melebihi maksimal kecepatan di gigi 2");
                }

                else{
                    kecepatan += jumlah_kecepatan;
                }
                System.out.println("kecepatan anda sekarang: " + kecepatan);
            }

            else if(porseneling == 3){
                if(kecepatan + jumlah_kecepatan > 60){
                    System.out.println("kecepatan akan melebihi maksimal kecepatan di gigi 3");
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }
                System.out.println("kecepatan anda sekarang: " + kecepatan);

            }

            else if(porseneling == 4){
                if(kecepatan + jumlah_kecepatan > 85){
                    System.out.println("kecepatan akan melebihi maksimal kecepatan di gigi 4");
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }
                System.out.println("kecepatan anda sekarang: " + kecepatan);

            }

            else if(porseneling == 5){
                if(kecepatan + jumlah_kecepatan > 110){
                    System.out.println("kecepatan akan melebihi maksimal kecepatan di gigi 5");
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }

                System.out.println("kecepatan anda sekarang: " + kecepatan);

            }

            else if(porseneling == 6){
                if(kecepatan + jumlah_kecepatan > 160){
                    System.out.println("kecepatan akan melebihi maksimal kecepatan ");
                }
                else{
                    kecepatan += jumlah_kecepatan;
                }
                System.out.println("kecepatan anda sekarang: " + kecepatan);

            }
        }
        
        else{
            System.out.println("belum nyala");
        }
    }

    public void kurangi_kecepatan(int jumlah_kecepatan){
        if(on == true){
            kecepatan -= jumlah_kecepatan;
            System.out.println("kecepatan dikurangi");
            System.out.println("kecepatan anda sekarang: " + kecepatan);
        }
    }

    public void infoMotor(){
        if(kecepatan >= 0 && kecepatan <= 60){
            System.out.println("kecepatan rendah");
        }
        else if(kecepatan >= 61 && kecepatan < 85){
            System.out.println("kecepatan sedang");
        }
        else if(kecepatan >= 85){
            System.out.println("kecepatan tinggi");
        }
        
    }

    public static void main(String[] args) {
        SimulasiMotorSonic vespacuy = new SimulasiMotorSonic();

        vespacuy.dinyalakan();
        vespacuy.tambah_porseneling();
        vespacuy.tambah_kecepatan(5);
        vespacuy.tambah_porseneling();
        vespacuy.tambah_kecepatan(10);
        vespacuy.kurangi_kecepatan(5);
        vespacuy.tambah_kecepatan(5);
        vespacuy.kurangi_porseneling();
        vespacuy.tambah_kecepatan(10);
        vespacuy.tambah_kecepatan(10);
        vespacuy.tambah_porseneling();
        vespacuy.kurangi_kecepatan(5);
        vespacuy.tambah_porseneling();
        vespacuy.tambah_porseneling();
        vespacuy.tambah_kecepatan(3);
        

        vespacuy.infoMotor();
    }

}