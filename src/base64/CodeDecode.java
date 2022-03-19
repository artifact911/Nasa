package base64;

import java.io.*;
import java.util.Arrays;

public class CodeDecode {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        String hi = "Hello World!";
//        byte[] bytes = hi.getBytes(StandardCharsets.UTF_8);
//        String encoded = Base64.getEncoder().encodeToString(bytes);
//        byte[] decoded = Base64.getDecoder().decode(encoded);
//        String dec = new String(decoded, StandardCharsets.UTF_8);
//        System.out.println(dec);

        Pojo pojo = new Pojo("Name", new String[]{"1", "2", "3"});


        byte[] codedByteArray = getCodedByteArray(pojo);
        System.out.println(Arrays.toString(codedByteArray));
        Pojo decodedPojo = getDecodedPojo(codedByteArray);
        System.out.println(decodedPojo);



    }

    public static byte[] getCodedByteArray(Pojo pojo) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);

        try
        {
            oos.writeObject(pojo);
            return baos.toByteArray();
        }
        catch (Exception e)
        {
            throw e;
        }
        finally
        {
            oos.close();
            baos.close();
        }
    }

    public static Pojo getDecodedPojo(byte[] array) throws IOException, ClassNotFoundException {
        ByteArrayInputStream baos = new ByteArrayInputStream(array);
        ObjectInputStream oos = new ObjectInputStream(baos);
        try
        {
            return (Pojo) oos.readObject();
        }
        catch (Exception e)
        {
            throw e;
        }
        finally
        {
            oos.close();
            baos.close();
        }
    }
}
