package com.myf.rpc.provider;

/**
 * @author [Yunfei Ma] fsama@mail.ustc.edu.cn
 * @date [2022-03-13 14:35]
 * @description 保存和提供服务实例对象
 */
public interface ServiceProvider {

    <T> void addServiceProvider(T service, String serviceName);

    Object getServiceProvider(String serviceName);

}
