package Tugas;


public class Mahasiswa<A, B, C> {
    private A nim;
    private B name;
    private C clas;
      
    public A getNim() {
        return nim;
    }
      
    public void setNim(A nim) {
        this.nim = nim;
    }
      
    public B getName() {
        return name;
    }
      
    public void setName(B name) {
        this.name = name;
    }
      
    public C getClas() {
        return clas;
    }
      
    public void setClas(C clas) {
        this.clas = clas;
    }
    public static void main(String[] args) {

        Mahasiswa<String, String, Integer> m = new Mahasiswa<>();
        m.setNim("1102020");
        m.setName("Ferdi");
        m.setClas(21);

        System.out.println(m.getNim());
        System.out.println(m.getName());
        System.out.println(m.getClas());
    }
}
      
    
    
    



