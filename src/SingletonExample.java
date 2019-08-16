/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SingletonExample
 * Author:   think
 * Date:     2019/8/13 15:44
 * Description: 实现完全版单例模式
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈实现完全版单例模式〉
 *
 * @author think
 * @create 2019/8/13
 * @since 1.0.0
 */
public class SingletonExample {
    //避免jvm重排序
    private volatile static SingletonExample instance = null;
    public static SingletonExample getInstance(){
        if (instance == null){
            synchronized (SingletonExample.class){
                if (instance == null){
                    instance = new SingletonExample();
                }
            }
        }
        return instance;
    }
}
