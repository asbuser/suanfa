package kuaisu;

public class Kuaisu {
    public static void sort(Comparable[] a){
        int lo = 0;
        int hi = a.length-1;
        sort(a, lo, hi);

    }
    public static void sort(Comparable[] a,int lo,int hi){
        //安全性校验
        if (lo >= hi){
            return;
        }
        //需要对数组中lo索引到hi索引处的元素进行分组（左子组和右子组）
        int partition = partition(a, lo, hi);//返回的是分作分界值所在的索引
//让左子组有序
        sort(a,lo,partition-1);
        //让右子组有序
        sort(a,partition+1,hi);
    }
    //对数组a中从索引lo到索引hi之间的元素进行分组，并返回对应的索引
    public static int partition(Comparable[] a,int lo,int hi){
        //确定分界值
        Comparable key = a[lo];
        //定义两个指针，指向最小索引处和最大索引处的下一个位置
        int left = lo;
        int right = hi+1;
        //切分
        while (true){
            //先从右往左扫描，找到一个比分界值小的元素，停止
            while(less(key,a[--right])){
                if (right==lo){
                    break;
                }
            }
            //从左往右扫描，找到一个比分界值大的元素停止
            while (less(a[++left],key)){
                if(left==hi){
                    break;
                }
            }
            //判断left是否>=rigth，如果是，则结束循环
            if (left>=right){
                break;
            }else{
                exch(a, left, right);
            }
        }
        exch(a, lo, right);
        return right;
    }

    //比较大小
    public static boolean less(Comparable v,Comparable w){
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
