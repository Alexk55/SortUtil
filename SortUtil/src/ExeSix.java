import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Alexk on 17/4/5.
 */
public class ExeSix {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        try{
            String[] arrStr=input.split(" ");
            int w=Integer.parseInt(arrStr[0]);
            int x=Integer.parseInt(arrStr[1]);
            int y=Integer.parseInt(arrStr[2]);
            int z=Integer.parseInt(arrStr[3]);
            int p=0,q=0;
            List list = new ArrayList();
            for (p=w;p<=x;p++)
            {
                for(q=y;q<=z;q++)
                {
                    if(list.indexOf(p/q)==-1)
                    {
                        list.add(p/q);
                    }
                }
            }
            System.out.println(list.size());
        }
        catch (Exception ex)
        {
            System.out.println("imput error");
        }
    }
}

