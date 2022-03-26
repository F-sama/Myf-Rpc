package com.myf.rpc.register;

import java.net.InetSocketAddress;

/**
 * @author [Yunfei Ma] fsama@mail.ustc.edu.cn
 * @date [2022-02-07 16:55]
 * @description 服务注册接口
 */
public interface ServiceRegistry {

    /**
     * @description 将一个服务注册到注册表
     * @param serviceName, inetSocketAddress 服务名称，提供服务的地址
     * @return [void]
     * @date [2022-03-13 14:44]
     */
    void register(String serviceName, InetSocketAddress inetSocketAddress);

}
