package org.example;

import java.lang.reflect.Method;

public interface IMethodFacade{

    boolean isPublic = true;
    boolean isVoid = true;
    boolean isSetter = true;
    boolean isGetter = true;

    boolean isPublic();

    boolean paramsCountEquals(int i);

    boolean startsWith(String set);

    boolean isVoid();

    boolean isSetter();

    boolean isGetter();

    Object getFieldName();

    Method GetUnderlyingMethod();
}
