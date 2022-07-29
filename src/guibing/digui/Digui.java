package guibing.digui;

public class Digui {
    public static void main(String[] args) {
       long a = factorial(3);
        System.out.println(a);

    }
    //递归
    public static long factorial(int n){

        if (n==1){
            return 1;
        }

        return n*factorial(n-1);
    }
}
