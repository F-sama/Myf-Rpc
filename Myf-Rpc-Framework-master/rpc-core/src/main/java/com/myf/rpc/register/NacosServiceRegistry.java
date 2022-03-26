package com.myf.rpc.register;

import com.alibaba.nacos.api.exception.NacosException;
import com.myf.rpc.enumeration.RpcError;
import com.myf.rpc.exception.RpcException;
import com.myf.rpc.util.NacosUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;

/**
 * @author [Yunfei Ma] fsama@mail.ustc.edu.cn
 * @date [2022-03-13 15:05]
 * @description Nacos服务注册中心
 */
public class NacosServiceRegistry implements ServiceRegistry{

    private static final Logger logger = LoggerFactory.getLogger(NacosServiceRegistry.class);

    /**
     * @description 将服务的名称和地址注册进服务注册中心
     * @param serviceName, inetSocketAddress
     * @return [void]
     * @date [2022-03-13 15:40]
     */
    @Override
    public void register(String serviceName, InetSocketAddress inetSocketAddress) {
        try {
            //向Nacos注册服务
            NacosUtil.registerService(serviceName, inetSocketAddress);
        }catch (NacosException e) {
            logger.error("注册服务时有错误发生" + e);
            throw new RpcException(RpcError.REGISTER_SERVICE_FAILED);
        }
    }

}