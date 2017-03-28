import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;
import java.util.*;
/**
 * Created by lidongyu on 2017/3/28.
 */
public class ExeForth {
    public static void main(String[] args)throws IOException
    {
        FileInputStream file = new FileInputStream("C:/Users/lidongyu.DIDICHUXING/Desktop/alex.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(file,"UTF-8"));
        String line=bufferedReader.readLine();
        String[] arrStr=null;
        if(line!=null)
        {
            arrStr = line.split(",");
        }
        int[] arrInt=new int[arrStr.length];
        for(int i=0;i<arrStr.length;i++)
        {
            arrInt[i]=Integer.parseInt(arrStr[i]);
        }
        arrInt=mergeSort(arrInt,0,arrInt.length-1);
        System.out.println(Arrays.toString(arrInt));
    }
    public static int[] mergeSort(int[] arr,int low,int high)
    {
        int mid=(low+high)/2;
        if(high-low>1)
        {
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            arr=merge(arr,low,mid,high);
        }
        return arr;
    }
    public static int[] merge(int[] arr,int low,int mid,int high)
    {
        int i=low,j=mid,k;
        int[] arrA=new int[arr.length];
        for(k=low;k<high;k++)
        {
            if(i==mid||j==high) {
                if (i == mid) {
                    arrA[k] = arr[j];
                    j++;
                    continue;
                }
                else
                {
                    arrA[k] = arr[i];
                    i++;
                    continue;
                }
            }
            if(arr[i]<arr[j])
            {
                arrA[k]=arr[i];
                i++;
            }
            else
            {
                arrA[k]=arr[j];
                j++;
            }
        }
        return arrA;
    }
}
