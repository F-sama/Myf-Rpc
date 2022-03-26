package com.myf.rpc.test;

import com.myf.rpc.annotation.ServiceScan;
import com.myf.rpc.serializer.CommonSerializer;
import com.myf.rpc.transport.RpcServer;
import com.myf.rpc.transport.socket.server.SocketServer;

/**
 * @author [Yunfei Ma] fsama@mail.ustc.edu.cn
 * @date [2022-02-05 14:45]
 * @description 测试用服务端
 */
@ServiceScan
public class SocketTestServer {
    public static void main(String[] args) {
        RpcServer server = new SocketServer("127.0.0.1", 9998, CommonSerializer.HESSIAN_SERIALIZER);
        server.start();
    }
}
