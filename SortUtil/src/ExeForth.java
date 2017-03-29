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
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("C:/Users/lidongyu.DIDICHUXING/Desktop/alex.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(file, "UTF-8"));
        String line = bufferedReader.readLine();
        String[] arrStr = null;
        if (line != null) {
            arrStr = line.split(",");
        }
        int[] arrInt = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
        }
        arrInt = mergeSort(arrInt, 0, arrInt.length - 1);
        System.out.println(Arrays.toString(arrInt));
    }

    public static int[] mergeSort(int[] arr, int low, int high) {
        int mid = (low + high) / 2;
        if (low<high) {
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
        return arr;
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        if (k < temp.length) {
            while (i <= mid && j <= high) {
                if (arr[i] < arr[j])
                    temp[k++] = arr[i++];
                else
                    temp[k++] = arr[j++];
            }
            while (i <= mid)
                temp[k++] = arr[i++];
            while (j <= high)
                temp[k++] = arr[j++];
        }
        for (k = 0, i = low; k < temp.length; k++, i++)
            arr[i] = temp[k];
    }
}
