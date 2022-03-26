package com.myf.rpc.loadbalancer;

import com.alibaba.nacos.api.naming.pojo.Instance;

import java.util.List;
import java.util.Random;

/**
 * @author [Yunfei Ma] fsama@mail.ustc.edu.cn
 * @date [2022-03-15 15:59]
 * @description 随机选择一个
 */
public class RandomLoadBalancer implements LoadBalancer{

    @Override
    public Instance select(List<Instance> instances) {
        return instances.get(new Random().nextInt(instances.size()));
    }
}
