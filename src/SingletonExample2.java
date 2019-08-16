/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SingletonExample2
 * Author:   think
 * Date:     2019/8/15 10:37
 * Description: 饿汉模式
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈饿汉模式〉
 *
 * @author think
 * @create 2019/8/15
 * @since 1.0.0
 */
public class SingletonExample2 {
    private static SingletonExample2 instance = new SingletonExample2();

    public static SingletonExample2 getInstance(){
        return instance;
    }

}
