package study.thread;

/**
 * Created by linziy on 2018/1/5.
 * Runnable 是接口,可以传递线程参数
 */
public class RunnableExtends implements Runnable {


    public final static void main(String[] args) {
        Thread.currentThread().getName();
        for (int i = 0; i < 100; i++) {
            if (i == 20) {
                //启动两条线程
              RunnableExtends runnableExtends = new RunnableExtends();
              // 通过 new Thread(target,name)方法创建新线程
              new Thread(runnableExtends,"new Thread 1").start();
              new Thread(runnableExtends,"new Thread 2").start();
            }
        }
    }


    //在run 里面写线程执行的内容
    public void run() {
        printNum();
    }

    private void printNum() {

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
