package utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import constant.AssertMsgConstant;
import org.slf4j.Logger;

import java.util.List;
import java.util.Map;

/**
 * json 工具类
 *
 * @author chen chen
 */
public class GsonUtil {

    private static final Gson GSON;

    private static final Logger log;

    static {
        GSON = new Gson();
        log = new LoggerUtil(GsonUtil.class);
    }

    /**
     * 对象转json字符串
     *
     * @param target 目标
     * @param <T>    泛型
     * @return String
     */
    public static <T> String toJson(T target) {
        String json = GSON.toJson(target);
        log.info("to json is : {}", json);
        return json;
    }

    /**
     * Json 字符串转 List
     *
     * @param json  json 字符串
     * @param clazz 类型
     * @param <T>   泛型
     * @return List
     */
    public static <T> List<T> fromList(String json, Class<T> clazz) {
        AssertUtil.isNull(clazz, " clazz " + AssertMsgConstant.NULL_POINTER_MSG);
        log.info("from list class type is : {}", clazz.getTypeName());
        return GSON.fromJson(json, new TypeToken<List<T>>() {
        }.getType());
    }

    /**
     * Json 字符串转 Map
     *
     * @param json       json 字符串
     * @param keyClazz   map key 的类型
     * @param valueClazz map value 的类型
     * @param <K>        泛型
     * @param <V>        泛型
     * @return map
     */
    public static <K, V> Map<K, V> fromMap(String json, Class<K> keyClazz, Class<V> valueClazz) {
        AssertUtil.isNull(keyClazz, " keyClazz " + AssertMsgConstant.NULL_POINTER_MSG);
        AssertUtil.isNull(valueClazz, " valueClazz " + AssertMsgConstant.NULL_POINTER_MSG);
        log.info("from map , key class type is : {} and value class type is : {}"
                , keyClazz.getTypeName(), valueClazz.getTypeName());
        return GSON.fromJson(json, new TypeToken<Map<K, V>>() {
        }.getType());
    }

    /**
     * Json 字符串转 Object
     *
     * @param json  Json 字符串
     * @param clazz 对象类型
     * @param <T>   泛型
     * @return T
     */
    public static <T> T fromObject(String json, Class<T> clazz) {
        AssertUtil.isNull(clazz, " clazz " + AssertMsgConstant.NULL_POINTER_MSG);
        log.info("from object class type is : {}", clazz.getTypeName());
        return GSON.fromJson(json, new TypeToken<T>() {
        }.getType());
    }

}
