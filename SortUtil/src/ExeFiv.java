import java.util.*;

/**
 * Created by lidongyu on 2017/4/1.
 */
public class ExeFiv {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String n=in.nextLine();
        String str=in.nextLine();
        String[] arrStr=str.split(" ");
        try
        {
            List list=new ArrayList();
            for(int i=0;i<arrStr.length;i++)
            {
                int indexArr=list.indexOf(arrStr[i]);
                if(indexArr!=-1)
                {
                    list.remove(indexArr);
                    list.add(arrStr[i]);
                }
                else
                {
                    list.add(arrStr[i]);
                }
            }
            for(int i =0;i<list.size();i++) {
                if(i==list.size()-1)
                    System.out.print(list.get(i));
                else {
                    System.out.print(list.get(i) + " ");
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println("imput error");
        }

    }
}
