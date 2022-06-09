package dmdev.java2.reflectionapi.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



// где использовать будем эту аннотацию
@Target({ElementType.TYPE,
        ElementType.FIELD
})
// в какой момент мы можем получить доступ к аннотации
// CLASS - по умолчанию
// SOURCE - только в исходном коде, после компиляции - не будет у нас доступа
// RUNTIME - самая ходовая - имеем доступ во время выполнения
@Retention(RetentionPolicy.RUNTIME)
public @interface MinAge {

    int age() default 18;
}
