import java.util.Scanner;

/**
 * Created by Alexk on 17/4/5.
 */
public class ExeSeven {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String imput = in.nextLine();
        try{
            int i,x=Integer.parseInt(imput.substring(0,1));
            for(i=1;i<imput.length();i++)
            {
                char operator = imput.charAt(i++);
                int y=Character.getNumericValue(imput.charAt(i));
                x=calculate(x,operator,y);
            }
            System.out.println(x);
        }
        catch (Exception ex)
        {
            System.out.println("error imput");
        }

    }
    public static int calculate(int x,char operator,int y)
    {
        if(operator=='+')
            return x+y;
        else if(operator=='-')
            return x-y;
        else if(operator=='*')
            return x*y;
        else
            return x;
    }
}
