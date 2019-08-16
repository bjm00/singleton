/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SingletonExample1
 * Author:   think
 * Date:     2019/8/15 10:27
 * Description: 使用枚举实现单例模式
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈使用枚举实现单例模式〉
 *
 * @author think
 * @create 2019/8/15
 * @since 1.0.0
 */
public class SingletonExample1 {
    private SingletonExample1(){}

    private static SingletonExample1 getInstance(){
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton{
        INSTANCE;

        private SingletonExample1 singleton;
        Singleton(){
            singleton = new SingletonExample1();
        }

        public SingletonExample1 getInstance(){
            return singleton;
        }
    }

}
