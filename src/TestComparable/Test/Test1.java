package TestComparable.Test;

import TestComparable.Student;

public class Test1 {


    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("张三");
        stu.setAge(18);
        Student stu1 = new Student();
        stu1.setName("李四");
        stu1.setAge(30);
        Student stu2 = new Student();
        stu1.setName("李w");
        stu1.setAge(31);
        Student stu3 = new Student();
        stu1.setName("李6");
        stu1.setAge(130);
        Comparable max = getMax(stu,stu1);
        System.out.println(max);
    }

    public static Comparable getMax(Comparable c1,Comparable c2){
        int result = c1.compareTo(c2);//判断c1和c2谁大

        if(result<=0){
            return c2;
        }else {
            return c2;
        }




    }
}
