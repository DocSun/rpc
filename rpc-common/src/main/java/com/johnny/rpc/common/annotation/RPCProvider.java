package com.johnny.rpc.common.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface RPCProvider {

    Class<?> seviceInterface();

    String serviceVersion() default "";

    String serviceGroup() default "";
    
}
