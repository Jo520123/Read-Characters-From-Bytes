import java.io.*;

public class ReadCharFromByte {

    public static void main(String[] args)

    {

        String s = "Hi J!";

        ByteArrayOutputStream bf = null;

        try(ByteArrayOutputStream baos = new ByteArrayOutputStream();
            OutputStreamWriter w = new OutputStreamWriter((baos));)
        {

            w.write(s);

            bf = baos;



        } catch (IOException e) {
            e.printStackTrace();
        }


        byte[] b = bf.toByteArray();

        try(ByteArrayInputStream bis = new ByteArrayInputStream(b);
            InputStreamReader r = new InputStreamReader(bis);
            BufferedReader br = new BufferedReader(r);)
        {


            String ss = br.readLine();
            System.out.println("s = " + ss);



        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}
