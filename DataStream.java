import java.io.*;

public class DataStream {

    public static void main(String[] args)

    {

        //int[] xx = {6, 7, 8, 9, 10};
        int[] xx = {1, 2, 3, 4, 5};

        byte[] b = {};


        try(ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream dataos = new DataOutputStream(baos);)
        {

            for (int x : xx) {
                dataos.write(x);
            }

            dataos.flush();

            b = baos.toByteArray();


        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("Length of b  = " + b.length);

        try(ByteArrayInputStream bis = new ByteArrayInputStream(b);
        DataInputStream dis = new DataInputStream(bis);)

        {

            //for (int i = 0; i < 5 ; i++) {

                int r = dis.readInt();
                System.out.println("read = " + r);

            //}


        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
