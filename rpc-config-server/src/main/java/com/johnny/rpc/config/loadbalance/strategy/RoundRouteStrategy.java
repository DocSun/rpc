package com.johnny.rpc.config.loadbalance.strategy;


import com.johnny.rpc.config.beans.Server;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 轮询的负载均衡策略
 */
@Component
public class RoundRouteStrategy extends AbstractRouteStrategy{

    private AtomicInteger serverIndex;

    @Override
    public Server doRoute(List<Server> servers) {
        return null;
    }

    private int getServerIndex() {
        serverIndex.addAndGet(1);
        return serverIndex.get();
    }




}
