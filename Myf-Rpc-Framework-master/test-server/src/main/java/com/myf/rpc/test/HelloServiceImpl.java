package com.myf.rpc.test;

import com.myf.rpc.annotation.Service;
import com.myf.rpc.api.HelloObject;
import com.myf.rpc.api.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author [Yunfei Ma] fsama@mail.ustc.edu.cn
 * @date [2022-02-03 14:46]
 * @description 服务端api接口实现
 */
@Service
public class HelloServiceImpl implements HelloService {

    /**
     * 使用HelloServiceImpl初始化日志对象，方便在日志输出的时候，可以打印出日志信息所属的类。
     */
    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String hello(String name) {
        //使用{}可以直接将getMessage()内容输出
        logger.info("接收到消息：{}", name);
        return "Hello, " + name;
    }
}
