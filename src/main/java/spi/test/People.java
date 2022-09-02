package spi.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;

public abstract class People {

    public abstract String name();

    public abstract void print();

    public static Map<String, People> mapList() {
        ServiceLoader<People> load = ServiceLoader.load(People.class);
        Iterator<People> iterator = load.iterator();
        Map<String, People> mapList = new HashMap<>();
        iterator.forEachRemaining(item -> {
            mapList.put(item.name(), item);
        });
        return mapList;
    }

}
