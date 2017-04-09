import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Alexk on 17/4/6.
 */
public class ExeNine {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String imput =in.nextLine();
        String[] numStrO = imput.split(" ");
        imput =in.nextLine();
        String[] numStrTwo = imput.split(" ");
        imput =in.nextLine();
        String[] numStrThird= imput.split(" ");
        List list = new ArrayList();
        int i,score=0;
        for(i=0;i<numStrThird.length;i++)
            list.add(numStrThird[i]);
        for(i=0;i<numStrTwo.length;i++)
        {
            if(list.indexOf(numStrTwo[i])!=-1)
            {
                score+=Math.pow(numStrTwo[i].length(),2);
            }
        }
        System.out.println(score);
     }

}
