package com.yoghurt.auth;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface BAuthPassport {
    boolean needAuth() default true;
}
