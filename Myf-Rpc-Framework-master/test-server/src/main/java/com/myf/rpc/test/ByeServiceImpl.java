package com.myf.rpc.test;

import com.myf.rpc.annotation.Service;
import com.myf.rpc.api.ByeService;

/**
 * @author [Yunfei Ma] fsama@mail.ustc.edu.cn
 * @date [2022-03-10 13:12]
 * @description 服务实现类
 */
@Service
public class ByeServiceImpl implements ByeService {

    @Override
    public String bye(String name) {
        return "Bye, " + name;
    }

}
