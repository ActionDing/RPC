package com.ding.dingrpc.server;

import com.ding.dingrpc.codec.Decoder;
import com.ding.dingrpc.codec.Encoder;
import com.ding.dingrpc.codec.JSONDecoder;
import com.ding.dingrpc.codec.JSONEncoder;
import com.ding.dingrpc.transport.HTTPTransportServer;
import com.ding.dingrpc.transport.TransportServer;

/**
 * server 配置
 *
 * @author dingkj
 */
public class RpcServerConfig {
    private Class<? extends TransportServer> transportClass = HTTPTransportServer.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private int port = 3000;
}
