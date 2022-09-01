package utils;

import org.slf4j.Logger;

/**
 * 断言工具类
 *
 * @author chen chen
 */
public class AssertUtil {

    public static void isNull(Object target, String msg) {
        if (null == target) {
            throw new NullPointerException(msg);
        }
    }

    public static void isBlank(String target, String msg) {
        if (StringUtil.isBlank(target)) {
            throw new NullPointerException(msg);
        }
    }

}
