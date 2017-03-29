package com.company;

import java.util.*;

/**
 * Created by lidongyu on 2016/12/29.
 */
public class SortUtil {
    /*
    * 计数排序*/
    public static List countingSort(List listA) {
        int i, k, max, min, elementA, elementB;
        List listB = new ArrayList();
        List listC = new ArrayList();
        max = (int) listA.get(0);
        min = max;
        for (i = 0; i < listA.size(); i++) {
            elementA = (int) listA.get(i);
            if (elementA > max)
                max = elementA;
            if (elementA < min)
                min = elementA;
        }
        k = max - min + 1;
        listB.addAll(listA);
        for (i = 0; i < k; i++)
            listC.add(0);
        for (i = 0; i < listA.size(); i++) {
            elementA = (int) listA.get(i);
            elementB = (int) listC.get(elementA - min);
            listC.set(elementA - min, elementB + 1);
        }
        for (i = 1; i < k; i++) {
            elementA = (int) listC.get(i);
            elementB = (int) listC.get(i - 1);
            listC.set(i, elementA + elementB);
        }
        for (i = 0; i < listA.size(); i++) {
            elementA = (int) listA.get(i);
            elementB = (int) listC.get(elementA - min);
            listB.set(elementB - 1, elementA);
            listC.set(elementA - min, elementB - 1);
        }
        return listB;
    }

    /*
    * 快速排序*/
    public static List quickSort(List listA, int low, int high) {
        if (low < high) {
            int pivot = partation(listA, low, high);
            quickSort(listA, low, pivot - 1);
            quickSort(listA, pivot + 1, high);
        }
        return listA;
    }

    /*
    * 快速排序分治函数*/
    private static int partation(List listA, int low, int high) {
        int pivotkey = (int) listA.get(low);
        int element;
        while (low < high) {
            while (low < high && (int) listA.get(high) > pivotkey)
                high--;
            element = (int) listA.get(high);
            listA.set(low, element);
            while (low < high && (int) listA.get(low) < pivotkey)
                low++;
            element = (int) listA.get(low);
            listA.set(high, element);
        }
        listA.set(high, pivotkey);
        return high;
    }

    /*
    * 冒泡排序*/
    public static List bubbleSort(List listA) {
        int i, j, elementA, elementB;
        boolean flag = true;
        for (i = 0; i < listA.size() - 1 && flag; i++) {
            flag = false;
            for (j = listA.size() - 1; j > i; j--) {
                elementA = (int) listA.get(j);
                elementB = (int) listA.get(j - 1);
                if (elementA < elementB) {
                    Collections.swap(listA, j, j - 1);
                    flag = true;
                }
            }
        }
        return listA;
    }

    /*
    * 直接插入排序*/
    public static List insertSort(List listA) {
        int i, j;
        for (i = 1; i < listA.size(); i++) {
            for (j = i - 1; j >= 0; j--) {
                if ((int) listA.get(j + 1) < (int) listA.get(j)) {
                    Collections.swap(listA, j, j + 1);
                }
            }
        }
        return listA;
    }

    /*
    * 希尔排序*/
    public static List shellSort(List listA) {
        /*int i,increment = listA.size();
        do
        {
            increment=increment/3+1;
                if((int)listA.get(i)<(int)listA.get(i-increment))
                    Collections.swap(listA,i,i-increment);//交换数组元素
            }
            for(i=increment;i<listA.size();i++)
            {
        }
        while(increment>1);*/
        int i, j, increment;
        for (increment = listA.size() / 2; increment > 0; increment /= 2) {
            for (i = increment; i < listA.size(); i++) {
                for (j = i - increment; j >= 0; j -= increment) {
                    if ((int) listA.get(j) > (int) listA.get(j + increment))
                        Collections.swap(listA, j, j + increment);
                }
            }
        }
        return listA;
    }

    /*
    * 归并排序*/

    public static List mergeSort(List list,int low,int high)
    {
        if(list==null)
            return null;
        int mid=(low+high)/2;
        if(low<high)
        {
            mergeSort(list,low,mid);
            mergeSort(list,mid+1,high);
            merge(list,low,mid,high);
        }
        return list;
    }
    public static void merge(List list,int low,int mid,int high)
    {
        List temp=new ArrayList();
        int i=low;
        int j=mid+1;
        int k=0;
        if(k<(high-low+1))
        {
            while(i<=mid&&j<=high)
            {
                if((int)list.get(i)<(int)list.get(j))
                    temp.add(list.get(i++));
                else
                    temp.add(list.get(j++));
                k++;
            }
            while(i<=mid)
                temp.add(list.get(i++));
            while(j<=mid)
                temp.add(list.get(j++));
        }
        i=low;
        for(k=0;k<temp.size();k++)
            list.set(i++,temp.get(k));
    }
}
