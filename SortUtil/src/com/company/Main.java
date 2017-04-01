package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List listA=new ArrayList();
        try {
            listA = InputUtil.input();
            System.out.println(listA);
            /*System.out.println("计数排序：");
            listA = SortUtil.countingSort(listA);
            System.out.println(listA);*/
            /*System.out.println("快速排序：");
            listA=SortUtil.quickSort(listA,0,listA.size()-1);
            System.out.println(listA);*/
           /* System.out.println("冒泡排序：");
            listA=SortUtil.bubbleSort(listA);
            System.out.println(listA);*/
            /*System.out.println("The InsertSort result is:");
            listA=SortUtil.insertSort(listA);
            System.out.println(listA);*/
/*            System.out.println("The ShellSort result is:");
            listA=SortUtil.shellSort(listA);
            System.out.println(listA);*/
            /*System.out.println("归并排序：");
            listA=SortUtil.mergeSort(listA,0,listA.size()-1);
            System.out.println(listA);*/
            System.out.println("堆排序：");
            listA=SortUtil.heapSort(listA);
            System.out.println(listA);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}






