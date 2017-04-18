import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Alexk on 17/4/16.今日头条2017笔试第一题Hash查找
 */
public class ExeForteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Long> s = new HashSet<Long>();
        int i;
        long m = in.nextLong();
        for ( i = 0; i < m; i++) {
            long temp=in.nextLong();
            s.add(temp);
        }
        long n = in.nextLong();
        ArrayList<Long> ls= new ArrayList<Long>();
        for ( i = 0; i <n ; i++) {
            long temp=in.nextLong();
            if(s.contains(temp))
            {
                ls.add(temp);
            }
        }
        for (i = 0; i < ls.size()-1; i++) {
            System.out.print(ls.get(i)+" ");
        }
        System.out.println(ls.get(i));
    }
}
