import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Alexk on 17/4/6.
 */
public class ExeEight {
    public static void main(String[] args) throws IOException,ClassCastException{
        FileInputStream file=new FileInputStream("/Users/Alexk/Desktop/programingTest/test1.txt");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(file,"UTF-8"));
        String numStr=bufferedReader.readLine();
        /*Scanner in = new Scanner(System.in);
        String numStr=in.nextLine();*/
        try {
            int numArr = Integer.parseInt(numStr);
            String[] chessboard = new String[numArr];
            int i, j;
            for (i = 0; i < numArr; i++) {
                chessboard[i] = bufferedReader.readLine();
            }
            int maxCount=0,count;
            for (j = 0,i=0; j < chessboard[i].length(); j++) {
                count=elementCount(chessboard,j);
                if(count>maxCount)
                    maxCount=count;
            }
            System.out.println(maxCount);
        } catch (Exception ex)
        {
            System.out.println("imput error");
        }
    }
    public static int elementCount(String[] chessboard, int j) {
        int countW = 0, countB = 0,i=0,maxCountB=0,maxCountW=0;
        while (i < chessboard.length) {
            if (chessboard[i].charAt(j) == 'W')
            {
                countW++;
                maxCountW=countW;
                if(countB>maxCountB)
                    maxCountB=countB;
                countB=0;
            }
            if (chessboard[i].charAt(j) == 'B')
            {
                countB++;
                maxCountB=countB;
                if(countW>maxCountW)
                    maxCountW=countW;
                countW=0;
            }
            i++;
        }
        return maxCountB < maxCountW ? maxCountW : maxCountB;
    }
}
