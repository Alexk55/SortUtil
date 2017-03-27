import java.util.*;

/**
 * Created by lidongyu on 2017/3/27.
 */
public class ExeSecond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String imputOne = in.nextLine();
        String imputSecond = in.nextLine();
        int i, n, k;
        String[] nk = imputOne.split(" ");
        String[] arrStrN = imputSecond.split(" ");
        int[] arrIntN = new int[arrStrN.length];
        try {
            n = Integer.parseInt(nk[0]);
            k = Integer.parseInt(nk[1]);
            if (arrStrN.length == n) {
                for (i = 0; i < arrStrN.length; i++) {
                    arrIntN[i] = Integer.parseInt(arrStrN[i]);
                }

                while (k > 0) {
                    arrIntN = num(arrIntN);
                    k--;
                }
                for (i = 0; i < n; i++)
                    System.out.print(arrIntN[i] + " ");
            } else {
                System.out.println("imput error");
            }
        } catch (Exception ex) {
            System.out.println("imput illegal");
        }
    }

    public static int[] num(int[] num) {
        int i, count,firstElement;
        if (num == null)
            return null;
        firstElement=num[0];
        for (i = 0; i < num.length; i++) {
            if (i != num.length - 1) {
                count = num[i] + num[i + 1];
                num[i] = (count < 100) ? count : count % 100;
            } else {
                count = num[i] + firstElement;
                num[i] = (count < 100) ? count : count % 100;
            }
        }
        return num;
    }
}
