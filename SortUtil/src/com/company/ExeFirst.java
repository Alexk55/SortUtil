package com.company;
import java.util.*;
import java.util.LinkedList;

/**
 * Created by lidongyu on 2017/2/16.
 */
public class ExeFirst {
    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        String num=imput.next();
        try {
            int result = movCount(num);
            if (result == -1)
                System.out.println("imput Error");
            System.out.println(result);
        }
        catch (Exception ex)
        {
            System.out.println("imput illegal" );
        }
    }
    public static int movCount(String num)
    {
        if(num==null)
            return -1;
        int resultB=0,resultG=0,posB=0,posG=0,i;
        for(i=0;i<num.length();i++)
        {
            if(num.charAt(i)=='B'&&i==posB)
                ++posB;
            else if(num.charAt(i)=='B'&&i!=posB)
            {
                resultB+=i-posB;
                posB++;
            }
        }
        for(i=0;i<num.length();i++)
        {
            if(num.charAt(i)=='G'&&i==posG)
                ++posG;
            else if(num.charAt(i)=='G'&&i!=posG)
            {
                resultG+=i-posG;
                posG++;
            }
        }
        return resultB<resultG?resultB:resultG;
    }
}
