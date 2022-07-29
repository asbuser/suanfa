package xier;

import java.util.Arrays;

public class Xier {

    public static void xier(Comparable[] a){
        int h =1;
        while (h<a.length/2){
            h=2*h+1;
        }
        while (h>=1){
            for (int i = h;i<a.length;i+=h ){
                for(int j = i;j>=h;j-=h){

                    if (greater(a[j],a[j-h])){
                        exch(a,j,j-h);
                    }
                }
            }
            h=h/2;
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
