package com.ding.dingrpc.example;

import com.ding.dingrpc.server.RpcServer;

/**
 * @author dingkj
 */
public class Server {
    public static void main(String[] args) {
        RpcServer server = new RpcServer();
        server.register(CalcService.class, new CalcServiceImpl());
        server.start();

    }
}
