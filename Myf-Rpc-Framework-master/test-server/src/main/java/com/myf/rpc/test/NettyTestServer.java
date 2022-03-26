package com.myf.rpc.test;

import com.myf.rpc.transport.RpcServer;
import com.myf.rpc.annotation.ServiceScan;
import com.myf.rpc.serializer.CommonSerializer;
import com.myf.rpc.transport.netty.server.NettyServer;

/**
 * @author [Yunfei Ma] fsama@mail.ustc.edu.cn
 * @date [2022-02-22 17:13]
 * @description 测试用Netty服务端
 */
@ServiceScan
public class NettyTestServer {
    public static void main(String[] args) {
        RpcServer server = new NettyServer("127.0.0.1", 9999, CommonSerializer.KRYO_SERIALIZER);
        server.start();
    }
}
