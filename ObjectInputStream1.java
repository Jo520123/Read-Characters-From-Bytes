import component.U;

import java.io.*;

public class ObjectInputStream1 {


    public static void main(String[] args)
    {


        try(FileInputStream fis = new FileInputStream("files/uu.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);)
        {

            Object oo1 = ois.readObject();
            Object oo2 = ois.readObject();

            System.out.println("kk = " + oo1);
            System.out.println("jj = " + oo2);


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
