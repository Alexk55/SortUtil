import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Alexk on 17/4/8.
 */
public class ExeEleven {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String imput = in.nextLine();
        try
        {
            int n=Integer.parseInt(imput);
            String str;
            int i,j;
            char strElement=0;
            List list = new ArrayList();
            for(i=0;i<n;i++)
            {
                str=in.nextLine();
                int mark=str.indexOf('_');
                if(mark==-1)
                {
                    for(j=0;j<str.length();j++)
                    {
                        strElement=str.charAt(j);
                        if(strElement<'a')
                        {
                           str=replaceOne(str,j,strElement);
                        }
                    }
                    list.add(str);
                }
                else
                {
                    for(j=0;j<str.length();j++)
                    {
                        strElement=str.charAt(j);
                        if(strElement=='_')
                        {
                            strElement=str.charAt(j+1);
                            str=replaceTwo(str,j,strElement);
                        }
                    }
                    list.add(str);
                }
            }
            for(i=0;i<n;i++)
            {
                System.out.println(list.get(i));
            }
        }
        catch(Exception ex)
        {
            System.out.println("imput error");
        }
    }
    public static String replaceOne(String str,int index,char strElement)
    {
        strElement+=32;
        return str.substring(0,index)+"_"+String.valueOf(strElement)+str.substring(index+1);
    }
    public static String replaceTwo(String str,int index,char strElement)
    {
        strElement-=32;
        return str.substring(0,index)+String.valueOf(strElement)+str.substring(index+2);
    }
}
