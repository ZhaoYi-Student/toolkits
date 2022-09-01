package utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GsonUtilTest {


    public void testToJson() {
    }

    public void testFromList() {
    }

    @Test
    public void testFromMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", 2);
        String json = GsonUtil.toJson(map);
        Map<String, Integer> fromMap = GsonUtil.fromMap(json, String.class, Integer.class);
        System.out.println(fromMap);
    }

    public void testFromObject() {
    }
}
