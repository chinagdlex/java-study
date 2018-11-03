package study.thread;

/**
 * Created by linziy on 2018/1/5.
 * 线程池
 */
public class ThreadPool {

    private static int worker_num = 10;



    public ThreadPool(int worker_num){
        ThreadPool.worker_num = worker_num;


    }


}
