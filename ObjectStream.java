import component.U;

import java.io.*;


public class ObjectStream {

    public static void main(String[] args)
    {

        U u1 = new U("Jack", 33);
        U u2 = new U("Susan", 26);

        try(FileOutputStream fos = new FileOutputStream("files/uu.bin");
        ObjectOutputStream oos= new ObjectOutputStream(fos);)
        {

            oos.writeObject(u1);
            oos.writeObject(u2);



        } catch (IOException e) {
            e.printStackTrace();
        }


        try(FileInputStream fis = new FileInputStream("files/uu.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);)
        {

            U kk = (U)ois.readObject();
            U jj = (U)ois.readObject();

            System.out.println("kk = " + kk);
            System.out.println("jj = " + jj);


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
