
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by lidongyu on 2017/3/28.
 */
public class ExeForth {
    public static void main(String[] args) throws IOException {
        try {
            Scanner in = new Scanner(System.in);
            String n = in.nextLine();
            String m = in.nextLine();
            String[] arrStr = m.split(" ");
            int[] arrInt=new int[arrStr.length];
            int i,p,q;
            for(i=0;i<arrStr.length;i++)
            {
                arrInt[i]=Integer.parseInt(arrStr[i]);
            }
        }
        catch (Exception ex)
        {
            System.out.println("Imput error");
        }

    }
}
