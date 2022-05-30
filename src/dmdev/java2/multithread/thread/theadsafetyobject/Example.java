package dmdev.java2.multithread.thread.theadsafetyobject;

import java.util.ArrayList;
import java.util.List;

/**
 * как сделать потокобезопасным объект?
 *  1. Не создавать в нем полей (утилитные крассы)
 *  2. Сделать класс immutable (на попытки изменить объект, будет возвращаться другой новый объект одного и того же типа)
 *  3. Сделать поля readOnly (не предаставляем методов для изменения)
 *  4. Синхронизировать каждый метод либо блок метода
 */

public class Example {
    private List<Integer> list;

    public Example(List<Integer> list) {
        // скопирповали лист, который пришел себе. А метод copyOf() возвращает НЕИЗМЕНЯЕМЫЙ лист
//        this.list = List.copyOf(list);
        // падала ошибка перепишем иначе
        this.list = list;
    }

    // а можем сделать synchronized метод
    public List<Integer> getList() {
//        return list;
        // теперь для чтения мы возвращаем новый лист скопировав в него содержимое старого
        return new ArrayList<>(list);
    }
}

