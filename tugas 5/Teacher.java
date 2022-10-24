package tugaspbo;

import java.util.ArrayList;

public class Teacher extends Person {
    private int jumlahpelajaran;
    private ArrayList<String> pelajaran;
    private ArrayList<Integer> nilailList;

    public Teacher (String name, String address){
        super(name, address);
        pelajaran = new ArrayList<>();
        nilailList = new ArrayList<>();     
    }
    public void addmatakuliahGrade(String pelajaran, int grade){
        this.pelajaran.add(pelajaran);
        this.nilailList.add(grade);
        jumlahpelajaran++;   
    }
    public void printnilailList(){
        for(int i = 0; i < jumlahpelajaran; i++){
            System.out.println("pelajaran: " + pelajaran.get(i) + " " + "grade: " + nilailList.get(i));
        }
    }
    public double getAverageGrade(){
        int jumlah = 0;
        for (int i = 0; i < jumlahpelajaran; i++) {
            jumlah += nilailList.get(i);
        }
        return jumlah / jumlahpelajaran;
    }
    public String toString(){
        return
        super.toString() + 
        "Jumlah pelajaran diambil : " + this.jumlahpelajaran + 
        "\nRata-rata nilai : " + getAverageGrade();
    }
}