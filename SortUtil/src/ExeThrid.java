import java.util.Scanner;

/**
 * Created by lidongyu on 2017/3/27.
 */
public class ExeThrid {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String imputFir=in.nextLine();
        String imputSec=in.nextLine();
        String imputThr=in.nextLine();
        String imputFor=in.nextLine();

        String imputFiv=in.nextLine();
        String taxiPointStr=imputFir;
        String[] XtaxiPointCoordinateStr=imputSec.split(" ");
        String[] YtaxiPointCoordinateStr=imputThr.split(" ");
        String[] companyPointStr=imputFor.split(" ");
        String[] walkAndTaxiSpeedStr=imputFiv.split(" ");
        try{
            int taxiPointInt = Integer.parseInt(taxiPointStr);
            if(XtaxiPointCoordinateStr.length==taxiPointInt&&YtaxiPointCoordinateStr.length==taxiPointInt)
            {
                int[] xTPInt=arrParseInt(XtaxiPointCoordinateStr);
                int[] yTPInt=arrParseInt(YtaxiPointCoordinateStr);
                int[] cPInt=arrParseInt(companyPointStr);
                int[] speedInt=arrParseInt(walkAndTaxiSpeedStr);
                int walkTime=time(0,0,cPInt,speedInt,true);
                int minTime=walkTime;
                for(int i=0;i<xTPInt.length;i++)
                {
                    int taxiTime=time(xTPInt[i],yTPInt[i],cPInt,speedInt,false);
                    if(taxiTime<minTime)
                        minTime=taxiTime;
                }
                System.out.println(minTime);
            }
            else
            {
                System.out.println("imput error for (x,y) count");
            }

        }catch (Exception ex)
        {
            System.out.println("imput illegal");
        }
    }
    public static int[] arrParseInt(String[] str)//转换成int型数组方便计算
    {
        int []arrInt = new int[str.length];
        for(int i=0;i<str.length;i++)
            arrInt[i]=Integer.parseInt(str[i]);
        return arrInt;
    }
    public static int time(int xTaxi,int yTaxi,int[] cPInt,int[] speedInt,boolean mark)
    {
        int xCp=cPInt[0];
        int yCp=cPInt[1];
        int walkSpeed=speedInt[0];
        int taxiSpeed=speedInt[1];
        if(mark)
        {
            return Math.abs(xCp)*walkSpeed+Math.abs(yCp)*walkSpeed;
        }
        else
        {
            return ((Math.abs(xTaxi)+Math.abs(yTaxi))*walkSpeed)+((Math.abs(xCp-xTaxi)+Math.abs(yCp-yTaxi))*taxiSpeed);
        }
    }
}
