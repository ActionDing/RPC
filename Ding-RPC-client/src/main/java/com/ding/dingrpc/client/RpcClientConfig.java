package com.ding.dingrpc.client;

import com.ding.dingrpc.codec.Decoder;
import com.ding.dingrpc.codec.Encoder;
import com.ding.dingrpc.codec.JSONDecoder;
import com.ding.dingrpc.codec.JSONEncoder;
import com.ding.dingrpc.proto.Peer;
import com.ding.dingrpc.transport.HTTPTransportClient;
import com.ding.dingrpc.transport.TransportClient;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

/**
 * @author dingkj
 */
@Data
public class RpcClientConfig {
    private Class<? extends TransportClient> transportClass = HTTPTransportClient.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private Class<? extends TransportSelector> selectorClass = RandomTransportSelector.class;
    private int connectCount = 1;
    private List<Peer> servers = Arrays.asList(
            new Peer("127.0.0.1", 3000)
    );
}
