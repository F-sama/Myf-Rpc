package com.myf.rpc.loadbalancer;

import com.alibaba.nacos.api.naming.pojo.Instance;

import java.util.List;

/**
 * @author [Yunfei Ma] fsama@mail.ustc.edu.cn
 * @date [2022-03-15 15:53]
 * @description 负载均衡接口
 */
public interface LoadBalancer {

    /**
     * @description 从一系列Instance中选择一个
     * @param [instances]
     * @return [com.alibaba.nacos.api.naming.pojo.Instance]
     * @date [2022-03-15 16:00]
     */
    Instance select(List<Instance> instances);
    
}
