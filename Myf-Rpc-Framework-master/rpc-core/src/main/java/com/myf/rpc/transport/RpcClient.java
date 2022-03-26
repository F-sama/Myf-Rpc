package com.myf.rpc.transport;

import com.myf.rpc.entity.RpcRequest;
import com.myf.rpc.serializer.CommonSerializer;

/**
 * @author [Yunfei Ma] fsama@mail.ustc.edu.cn
 * @date [2022-02-18 17:50]
 * @description 客户端类通用接口
 */
public interface RpcClient {

    int DEFAULT_SERIALIZER = CommonSerializer.KRYO_SERIALIZER;

    Object sendRequest(RpcRequest rpcRequest);

}

