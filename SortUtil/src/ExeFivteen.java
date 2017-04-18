import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Alexk on 17/4/18.今日头条第二题
 */
public class ExeFivteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Long> s = new HashSet<Long>();
        while(in.hasNext())
        {
            long imput=in.nextLong();
            if(imput!=0)
            {
                s.add(imput);
            }
            else
                break;
        }
        System.out.println(s.size());
    }
}
