package ThreadPooltest1;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        //每个参数的意义：1.corePoolSize:核心线程数，相当于默认启动的线程数
        //2.maximumPoolSize:最大线程数，即最多可以存在的线程数
        //3.keepAliveTime:线程存在时间：即超过这个时间，除了核心线程以外的线程就会自动关闭
        //4.时间单位，可以设置成秒
        //5.workQueue:等待队列
        //6.线程工厂，不用自己创建，直接用Executors.defaultThreadFavtory()
        //7.拒绝策略：可以使用默认的：new ThreadPoolExecutor.AbortPolicy()
        ExecutorService executorService = new ThreadPoolExecutor(3, 5, 1L, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        for(int i = 0;i<5;i++){
            executorService.execute(()->{
                System.out.println(Thread.currentThread().getName() + "===>办理业务");
            });

        }
        TT tt = new TT();
        executorService.submit(tt);
        executorService.submit(tt);
        executorService.submit(tt);
        executorService.shutdown();

    }

}
class TT implements Runnable{


    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            System.out.println(i);
        }

    }
}
