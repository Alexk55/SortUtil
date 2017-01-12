package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lidongyu on 2016/12/29.
 */
public class InputUtil{
    public static List input() throws ClassNotFoundException,IOException
    {
        List listA=new ArrayList();
        System.out.println("文件中读取数组为：");
        FileInputStream file= new FileInputStream("C:/Users/lidongyu.DIDICHUXING/Desktop/alex.txt");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(file,"UTF-8"));
        String line="";
        if(line!=null)
        {
          line=bufferedReader.readLine();
        }
        String str[] = line.split(",");
        for(int i=0;i<str.length;i++)
            listA.add(Integer.parseInt(str[i]));
        return listA;
    }
}
