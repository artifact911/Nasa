package dmdev.java2.reflectionapi.model;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionApiExample {

    public static void main(String[] args)
            throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
//        User user = new User(25L, "Ivan");
//        Class<? extends User> userClass = user.getClass();
//        Class<User> userClass1 = User.class;
//        System.out.println(userClass == userClass1);

//        testConstructor();

        User user = new User(25L, "Ivan");
//        testFields(user);

        testMethods(user);
    }

    private static void testConstructor()
            throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<User> constructor = User.class.getConstructor(Long.class, String.class);
        User petr = constructor.newInstance(5L, "Petr");
        System.out.println(petr);
    }

    private static void testFields(Object object) throws IllegalAccessException {
        Field[] declaredFields = object.getClass().getSuperclass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            // разрешить доступ к private полям
            declaredField.setAccessible(true);
            Object value = declaredField.get(object);
            System.out.println(value);
            System.out.println(declaredField.getModifiers());
            System.out.println(Modifier.isPrivate(declaredField.getModifiers()));
        }
    }

    private static void testMethods(User user) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = user.getClass().getDeclaredMethod("getName");
        System.out.println(method.invoke(user));

        Method method2 = user.getClass().getDeclaredMethod("setName", String.class);
        method2.invoke(user, "Sveta");
        System.out.println(user);
    }

    private class Test1 {

    }

    private static class Test3 {

    }

    private enum Test2 {
        ONE, TWO
    }
}
