import java.util.Scanner;

/**
 * Created by Alexk on 17/4/8.
 */
public class ExeTen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String imput = in.nextLine();
        try {
            String[] arrStr = imput.split(" ");
            long nWork=0,qHour=0;
            if (arrStr.length == 2) {
                nWork = Long.parseLong(arrStr[0]);//输入字符串长度问题
                qHour = Long.parseLong(arrStr[1]);
            }
            double division = Math.log(nWork)/Math.log(2);
            long k = (long) Math.floor(division);
            if(Math.pow(2,k)<nWork)
            {
                k++;
            }
            long time = 0, minTime = nWork;
            for (int i = 0; i <= k; i++) {
                long robotNum = (long) Math.pow(2, i);
                if (nWork % robotNum == 0)
                    time = (i * qHour) + (nWork / robotNum);
                else
                    time = (i * qHour) + (nWork / robotNum) + 1;
                if (minTime > time)
                    minTime = time;
            }
            System.out.print(minTime);
        } catch (Exception ex) {
            System.out.println("imput error");
        }

    }
}
