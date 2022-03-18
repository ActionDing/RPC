package com.ding.dingrpc.transport;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * 处理网络请求的handler
 *
 * @author dingkj
 */
public interface RequestHandler {
    void onRequest(InputStream receive, OutputStream toResp);
}
