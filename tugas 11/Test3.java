package tugas11;

import java.io.*;

public class Test3 {
    
    public void methodA(){
        System.out.println("Method A");
    }

    public void methodB() throws IOException{
        System.out.println(20/0);
        System.out.println("Method B");
    }
}

class Utama {
    public static void main(String[] args) throws IOException{
        Test3 o = new Test3();
        o.methodA();
    
        try {
            o.methodB();

        } catch (Exception e) {
            System.out.println("Error di method B");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("selalu dicetak");
        }
    }
}