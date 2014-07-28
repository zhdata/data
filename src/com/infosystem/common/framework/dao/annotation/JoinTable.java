package com.infosystem.common.framework.dao.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface JoinTable {
   String value();
   String alias();
   String joinColumn();
   String referenceColumn();
   String[] fetchColumns();
   String[] aliasColumns();
}
