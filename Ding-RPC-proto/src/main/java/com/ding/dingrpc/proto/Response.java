package com.ding.dingrpc.proto;

import lombok.Data;

/**
 * 表示 RPC 的返回
 *
 */
@Data
public class Response {
    private int code = 0; // 服务返回编码，0成功，非0失败
    private String message = "OK"; // 具体的错误信息
    private Object data; // 返回的数据
}
