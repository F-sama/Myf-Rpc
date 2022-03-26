package com.myf.rpc.transport;

import com.myf.rpc.serializer.CommonSerializer;

/**
 * @author [Yunfei Ma] fsama@mail.ustc.edu.cn
 * @date [2022-02-18 17:53]
 * @description 服务端类通过接口
 */
public interface RpcServer {

    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    void start();

    /**
     * @description 向Nacos注册服务
     * @param service, serviceClass
     * @return [void]
     * @date [2022-03-13 15:56]
     */
    <T> void publishService(T service, String serviceName);
}
