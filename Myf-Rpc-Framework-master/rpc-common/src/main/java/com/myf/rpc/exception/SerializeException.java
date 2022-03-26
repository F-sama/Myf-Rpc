package com.myf.rpc.exception;

/**
 * @author [Yunfei Ma] fsama@mail.ustc.edu.cn
 * @date [2022-03-09 17:18]
 * @description 序列化异常
 */
public class SerializeException extends RuntimeException{
    public SerializeException(String msg){
        super(msg);
    }
}
