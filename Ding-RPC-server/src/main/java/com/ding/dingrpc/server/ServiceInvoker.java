package com.ding.dingrpc.server;

import com.ding.dingrpc.common.utils.ReflectionUtils;
import com.ding.dingrpc.proto.Request;

import java.lang.reflect.Method;

/**
 * 调用具体服务
 *
 * @author dingkj
 */
public class ServiceInvoker {
    public Object invoke(ServiceInstance service,
                         Request request) {
        return ReflectionUtils.invoke(service.getTarget(),
                service.getMethod(),
                request.getParameters());
    }
}
