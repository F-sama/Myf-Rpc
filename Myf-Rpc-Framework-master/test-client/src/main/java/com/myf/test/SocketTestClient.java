package com.myf.test;

import com.myf.rpc.api.ByeService;
import com.myf.rpc.api.HelloObject;
import com.myf.rpc.api.HelloService;
import com.myf.rpc.loadbalancer.RoundRobinLoadBalancer;
import com.myf.rpc.serializer.CommonSerializer;
import com.myf.rpc.transport.RpcClientProxy;
import com.myf.rpc.transport.socket.client.SocketClient;

/**
 * @author [Yunfei Ma] fsama@mail.ustc.edu.cn
 * @date [2022-02-05 14:50]
 * @description 测试用客户端
 */
public class SocketTestClient {
    public static void main(String[] args) {
        SocketClient client = new SocketClient(CommonSerializer.KRYO_SERIALIZER, new RoundRobinLoadBalancer());
        //接口与代理对象之间的中介对象
        RpcClientProxy proxy = new RpcClientProxy(client);
        //创建代理对象
        HelloService helloService = proxy.getProxy(HelloService.class);
        //接口方法的参数对象
        HelloObject object = new HelloObject(12, "This is test message");
        //由动态代理可知，代理对象调用hello()实际会执行invoke()
        String res = helloService.hello("Yunfei Ma");
        System.out.println(res);
        ByeService byeService = proxy.getProxy(ByeService.class);
        System.out.println(byeService.bye("Netty"));
    }
}
