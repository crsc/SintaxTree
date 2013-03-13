package calculators;

import java.lang.reflect.Method;

public abstract class Calculator {
    
    public static String getSignature(Method method) {
        String signature = method.getName();
        for (Class<?> parameter : method.getParameterTypes()) {
            signature += parameter.getSimpleName();
        }
        return signature;
    }
    
}
