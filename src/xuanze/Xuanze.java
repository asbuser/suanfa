package xuanze;

import java.util.Arrays;

public class Xuanze {

    public static void Select(Comparable[] a){
        for(int i = 0;i<=a.length-2;i++){
            int minIndex=i;//假定的最小值
            for(int j = i+1;j<=a.length-1;j++){
                if(greater(a[minIndex],a[j])){
                    minIndex = j;//判断，如果不是最小值则进行交换
                }
            }
            exch(a,i,minIndex);
        }
        System.out.println(Arrays.toString(a));
    }
    //比较大小
    public static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }
    //交换数据
    public static  void exch(Comparable[] a,int i,int j ){
        Comparable temp;
        temp = a[i];
        a[i]=a[j];
        a[j] = temp;

    }
}
