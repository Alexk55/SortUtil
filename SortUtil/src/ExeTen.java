import java.util.Scanner;

/**
 * Created by Alexk on 17/4/8.
 */
public class ExeTen {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String imput = in.nextLine();
        try {
            String[] arrStr = imput.split(" ");
            long nWork=0,qHour=1;
            if(arrStr.length==2)
            {
                nWork=Integer.parseInt(arrStr[0]);
                qHour=Integer.parseInt(arrStr[1]);
            }
            double division = Math.log((double)(nWork/qHour))/Math.log(2);
            long k=(long)Math.floor(division);
            long time=0,minTime=nWork;
            for(int i=1;i<=k;i++)
            {
                long robotCount=(long)Math.pow(2,i);
                if(nWork%robotCount==0)
                    time = (i * qHour) + (nWork / robotCount);
                else
                    time = (i*qHour)+(nWork/robotCount)+1;
                if(minTime>time)
                    minTime=time;
            }
            System.out.println(minTime);
        }
        catch (Exception ex)
        {
            System.out.println("imput error");
        }

    }
}
