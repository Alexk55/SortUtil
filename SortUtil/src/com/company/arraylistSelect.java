package com.company;

import java.util.Scanner;

/**
 * Created by lidongyu on 2017/2/14.
 */
public class arraylistSelect {
    public static void main(String[] args) {
        int list[][] = new int[][]{{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        Scanner in = new Scanner(System.in);
        int mark = in.nextInt();
        int i = 0, j = 3;
        while(j>=0&&i<4)
        {
            if(list[i][j]==mark)
            {
                System.out.println("true");
                break;
            }
            if(list[i][j]>mark) {
                j--;
                continue;
            }
            if(list[i][j]<mark)
            {
                i++;
                continue;
            }
        }
        if(j==-1||i==4)
        {
            System.out.println("false");
        }
    }

}

