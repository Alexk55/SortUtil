package com.company;

import java.util.LinkedList;

/**
 * Created by lidongyu on 2017/2/16.
 */
public class ExeFirst {
    public static void main(String[] args)
    {
        String str ="Happy New Year!";
        StringBuffer strcopy =new StringBuffer("");
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                strcopy.append(str.charAt(i));
            }
            else
            {
                strcopy.append("%20");
            }
        }
        System.out.println(strcopy);
    }
}
