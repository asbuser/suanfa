package charu;

import java.util.Arrays;

public class Charu {

    public static void charuu(Comparable[] a){
        for (int i=1;i<a.length;i++){

            for (int j = i;j>0;j--){
                if (greater(a[j],a[j-1])){
                    exch(a,j-1,j);
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    //比较大小
    public static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    //交换数据
    public static  void exch(Comparable[] a,int i,int j ){
        Comparable temp;
        temp = a[i];
        a[i]=a[j];
        a[j] = temp;
    }
}
