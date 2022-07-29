package kuaisu;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Comparable[] a = {9,6,3,2,5,8,7,4,1,10,16};
        Kuaisu.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
