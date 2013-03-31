
package calculators;

import calculators.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Set;
import org.reflections.Reflections;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import anotations.*;
import java.util.Iterator;
import java.lang.reflect.Method;
import java.util.HashMap;

public class CalculatorsMethods {
    public static final HashMap<String, Method> methodsMap = new HashMap<>();
    
    static {
        Reflections ref = new Reflections(new ConfigurationBuilder().setUrls(ClasspathHelper.forJavaClassPath()));
        addMethods(ref.getSubTypesOf(Calculator.class));
    }
    
    private static void addMethods(Set<Class<? extends Calculator>> classes) {
        for (Class<?> theClass : classes) {
            addMethods(theClass);
        }
    }
    private static void addMethods(Class<?> theClass) {
        for (Method method : theClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(OperatorSymbol.class))
            methodsMap.put(getSignature(method), method);
        }
    }
    
    private static String getSignature(Method method){
        String res="";
        res+= method.getName();
        Class<?>[] obj;
        obj = method.getParameterTypes();
        for(int i=0;i<obj.length;i++){
            res+=obj[i].getSimpleName();
        }
        return res;
    }
}
