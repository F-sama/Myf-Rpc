package com.myf.test;

import com.myf.rpc.api.ByeService;
import com.myf.rpc.api.HelloObject;
import com.myf.rpc.api.HelloService;
import com.myf.rpc.serializer.CommonSerializer;
import com.myf.rpc.transport.RpcClient;
import com.myf.rpc.transport.RpcClientProxy;
import com.myf.rpc.transport.netty.client.NettyClient;

/**
 * @author [Yunfei Ma] fsama@mail.ustc.edu.cn
 * @date [2022-02-22 17:17]
 * @description 测试用Netty客户端
 */
public class NettyTestClient {
    public static void main(String[] args) {
        RpcClient client = new NettyClient(CommonSerializer.PROTOBUF_SERIALIZER);
        RpcClientProxy rpcClientProxy = new RpcClientProxy(client);
        HelloService helloService = rpcClientProxy.getProxy(HelloService.class);
        System.out.println(helloService.hello("Yunfei Ma"));
        ByeService byeService = rpcClientProxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Yunfei Ma"));
    }
}
