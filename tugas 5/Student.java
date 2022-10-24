package tugaspbo;
import java.util.ArrayList;

public class Student extends Person{
    private int jumlahpelajaran;
    private ArrayList<String> pelList;

    public Student(String nama, String alamat){
        super(nama, alamat);
        jumlahpelajaran = 0;
        pelList = new ArrayList<>();
    }
    public boolean addCourse(String course){
        if(pelList.contains(course)){
            System.out.println("pelajaran telah ada");
            return false;
        }
        jumlahpelajaran++;
        pelList.add(course);
        return true;
    }
    public boolean removeCourse(String course){
        if(!pelList.contains(course)){
            System.out.println("pelajaran yang akan dihapus tidak ada");
            return false;
        }
        jumlahpelajaran--;
        pelList.remove(course);
        return true;  
    }
    public int getjumlahpelajaran() {
        return jumlahpelajaran;
    }
    public String toString(){
        return 
        super.toString() + 
        "\n jumlah palajaran yang diampu : " + getjumlahpelajaran();
    }


}
