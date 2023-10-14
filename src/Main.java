import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Main.runProgram("SelectionSort");
    }
    public static void runProgram (String className) {
        try {
            String methodName = "main";
            Class<?> myClass = Class.forName(className);
            Class<?>[] parameterTypes = {String[].class};
            Method method = myClass.getMethod(methodName, parameterTypes);
            Object instance = myClass.newInstance();
            String[] argument = {};
            Object[] arguments = {argument};
            method.invoke(instance, arguments);
        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException |
                 InvocationTargetException e ) {
            e.printStackTrace();
        }
    }
}