package com.myf.rpc.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author [Yunfei Ma] fsama@mail.ustc.edu.cn
 * @date [2022-02-18 18:25]
 * @description
 */
@Getter
@AllArgsConstructor
public enum PackageType {

    REQUEST_PACK(0),
    RESPONSE_PACK(1);

    private final int code;
}
