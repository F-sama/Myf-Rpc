package com.myf.rpc.entity;

import com.myf.rpc.enumeration.ResponseCode;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author [Yunfei Ma] fsama@mail.ustc.edu.cn
 * @date [2022-02-03 17:20]
 * @description 服务端处理完后，向客户端返回的对象
 */
@Data
@NoArgsConstructor
public class RpcResponse<T> implements Serializable {

    /**
     * 响应对应的请求号
     */
    private String requestId;
    /**
     *响应状态码
     */
    private Integer statusCode;
    /**
     *响应状态码对应的信息
     */
    private String message;
    /**
     *成功时的响应数据
     */
    private T data;

    /**
     * @description 成功时服务端返回的对象
     * @param requestId
     * @return [com.myf.rpc.entity.RpcResponse<T>]
     * @date [2022-02-03 17:31]
     */
    public static <T> RpcResponse<T> success(T data, String requestId){
        RpcResponse<T> response = new RpcResponse<>();
        response.setRequestId(requestId);
        response.setStatusCode(ResponseCode.SUCCESS.getCode());
        response.setData(data);
        return response;
    }

    /**
     * @description 失败时服务端返回的对象
     * @param requestId
     * @return [com.myf.rpc.entity.RpcResponse<T>]
     * @date [2022-02-03 17:42]
     */
    public static <T> RpcResponse<T> fail(ResponseCode code, String requestId){
        RpcResponse<T> response = new RpcResponse<>();
        response.setRequestId(requestId);
        response.setStatusCode(code.getCode());
        response.setMessage(code.getMessage());
        return response;
    }
}
