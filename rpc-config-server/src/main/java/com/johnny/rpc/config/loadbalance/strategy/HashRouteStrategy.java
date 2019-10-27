package com.johnny.rpc.config.loadbalance.strategy;

import com.johnny.rpc.config.beans.Server;

import java.util.List;

/**
 * @author Johnny
 * @date 2019/10/27 22:50
 *
 * 哈希路由的负载均衡策略
 */
public class HashRouteStrategy extends AbstractRouteStrategy {
    @Override
    public Server doRoute(List<Server> servers) {
        return null;
    }
}
