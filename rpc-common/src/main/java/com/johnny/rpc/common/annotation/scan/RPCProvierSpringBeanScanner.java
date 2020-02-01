package com.johnny.rpc.common.annotation.scan;

import com.johnny.rpc.common.annotation.enums.AnnotationTypeEnum;
import org.springframework.stereotype.Component;

/**
 * @author Johnny
 * @date 2019/10/26 21:59
 */

@Component
public class RPCProvierSpringBeanScanner extends AbstractRPCSpringBeanScanner {

    @Override
    public void doScan() {

    }

    @Override
    public AnnotationTypeEnum getAnnotationType() {
        return null;
    }
}
