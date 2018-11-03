package study.thread;

/**
 * Created by linziy on 2018/1/5.
 */
public class ThreadExtends extends Thread {

    public final static void main(String[] args) {
        Thread.currentThread().getName();
        for (int i = 0; i < 100; i++) {
            if (i == 20) {
                //启动两条线程
                new ThreadExtends().start();
                new ThreadExtends().start();
            }
        }
    }

    //在run 里面写线程执行的内容
    public void run() {
        printNum();
    }


    private void printNum() {

        for (int i = 0; i < 100; i++) {
            System.out.println(super.getName() + " " + i);
        }
    }
}
