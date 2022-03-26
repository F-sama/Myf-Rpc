package com.myf.rpc.register;

import java.net.InetSocketAddress;

/**
 * @author [Yunfei Ma] fsama@mail.ustc.edu.cn
 * @date [2022-03-14 9:56]
 * @description 服务发现接口
 */
public interface ServiceDiscovery {
    /**
     * @description 根据服务名称查找服务端地址
     * @param serviceName
     * @return [java.net.InetSocketAddress]
     * @date [2022-03-14 10:09]
     */
    InetSocketAddress lookupService(String serviceName);
}
