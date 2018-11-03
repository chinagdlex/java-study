package study.design.mode;

/**
 * 参考:http://blog.csdn.net/jason0539/article/details/23297037/
 * Created by linziy on 2018/1/5.
 *
 * 单例模式有以下特点：
 *　　1、单例类只能有一个实例。
 *　　2、单例类必须自己创建自己的唯一实例。
 *　　3、单例类必须给所有其他对象提供这一实例。
 *
 */
//懒汉式单例类,在第一次调用的时候实例化自己
public class Singleton {
    //1.将构造函数私有化
    private Singleton(){}
    //2.声明对象句柄
    private static Singleton single=null;
    //3.返回单例的对象句柄
    public static Singleton getInstance(){
        if (single == null){
            //synchronized 同步锁,线程安全要+上
            synchronized (Singleton.class){
                if (single == null){
                    single = new Singleton();
                }
            }
        }
        return single;
    }
}

