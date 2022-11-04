package org.example;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class SimpleMethod implements IMethodFacade {
    Method method;

    public SimpleMethod(Method method) {
        this.method = method;
    }

    public int paramCountEquals(int i) {
        return method.getParameterCount();
    }

    public void getUnderlyingMethod() {

    }

    @Override
    public boolean isPublic() {
        return method.getModifiers() == Modifier.PUBLIC;
    }

    @Override
    public boolean paramsCountEquals(int i) {
        return method.getParameterCount() == i;
    }

    @Override
    public boolean startsWith(String set) {
        return false;
    }

    @Override
    public boolean isVoid() {
        return method.getReturnType().equals(Void.TYPE);
    }

    @Override
    public boolean isSetter() {
        if (
                method.getReturnType().equals(Void.TYPE) &&
                        method.getParameterCount() == 1 &&
                        method.getModifiers() == Modifier.PUBLIC &&
                        method.getName().startsWith("set")
        ) {
            return true;
        }
        return false;

    }

    @Override
    public boolean isGetter() {
        if(method.getName().startsWith("get") &&
        method.getParameterCount() == 0     ||
        method.getReturnType().equals(Void.TYPE)

        )
        {
            return true;
        }
        return false;
    }



    @Override
    public Object getFieldName() {
        return true;//todo
    }

    @Override
    public Method GetUnderlyingMethod() {
        return null;
    }
}