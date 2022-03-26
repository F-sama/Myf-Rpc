package com.myf.rpc.hook;

import com.myf.rpc.factory.ThreadPoolFactory;
import com.myf.rpc.util.NacosUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author [Yunfei Ma] fsama@mail.ustc.edu.cn
 * @date [2022-03-14 13:45]
 * @description
 */
public class ShutdownHook {

    private static final Logger logger = LoggerFactory.getLogger(ShutdownHook.class);

    /**
     *单例模式创建钩子，保证全局只有这一个钩子
     */
    private static final ShutdownHook shutdownHook = new ShutdownHook();

    public static ShutdownHook getShutdownHook(){
        return shutdownHook;
    }

    //注销服务的钩子
    public void addClearAllHook() {
        logger.info("服务端关闭前将自动注销所有服务");
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            NacosUtil.clearRegistry();
            //关闭所有线程池
            ThreadPoolFactory.shutDownAll();
        }));
    }
}
