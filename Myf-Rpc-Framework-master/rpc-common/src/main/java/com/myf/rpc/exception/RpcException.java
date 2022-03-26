package com.myf.rpc.exception;

import com.myf.rpc.enumeration.RpcError;

/**
 * @author [Yunfei Ma] fsama@mail.ustc.edu.cn
 * @date [2022-02-07 18:51]
 * @description Rpc调用异常
 */
public class RpcException extends RuntimeException{

    public RpcException(RpcError error, String detail){
        super(error.getMessage() + ":" + detail);
    }

    public RpcException(String message, Throwable cause){
        super(message, cause);
    }

    public RpcException(RpcError error){
        super(error.getMessage());
    }
}
