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
        final List l=new ArrayList();
        l.add(1);
        int num=(int)l.set(0,2);
        System.out.println(num);
    }
}
