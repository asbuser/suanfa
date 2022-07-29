package guibing;

import java.util.concurrent.ConcurrentMap;

public class guibing {

    //归并排序的辅助数组
    private static Comparable[] assis;

    public static void sort(Comparable[] a){
        //1.初始化辅助数组assis
        assis = new Comparable[a.length];
        //2.定义一个lo变量，和hi变量，分别记录数组中最小的索引和最大索引值；
        int lo = 0;
        int hi = a.length-1;
        //3.调用sort重载方法，完成数组a中从索引lo到hi的元素的排序
        sort(a,lo,hi);
    }
    public static void sort(Comparable[] a,int lo,int hi){
        //做一个安全性的校验
        if(hi<=lo){
            return;
        }
        //对lo到hi之间的数据进行分组（分为两个组）
        int mid = lo+(hi-lo)/2;
        //分别对每一数据进行排序
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        //分别把两个组的数据进行归并
        merge(a,lo,mid,hi);



    }
    public static void merge(Comparable[] a,int lo,int mid,int hi){
        //定义三个指针
        int i = lo;
        int p1 = lo;
        int p2 = mid+1;
        //遍历，移动p1和p2指针，比较索引处的值，找出最小的那个放到辅助数组中
        while (p1<=mid && p2<=hi){
            //比较对应索引处的值
            if(greater(a[p1],a[p2])){
                assis[i++] = a[p1++];
            }else{
                assis[i++] = a[p2++];
            }
        }
        //遍历如果p1的指针没有走完，那么顺序西东p1指针把对对应的元素放入辅助数组
        while (p1<=mid){
            assis[i++] = a[p1++];
        }
        //遍历如果p2的指针没有走完，那么顺序西东p2指针把对对应的元素放入辅助数组
        while (p2<=hi){
            assis[i++] = a[p2++];
        }
        //把辅助数据中的元素copy到原数组中
        for (int index = lo;index<=hi;index++){
            a[index] = assis[index];
        }

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
