package utils;

public class StringUtil {

    public static boolean isNotBlank(String target) {
        return !isBlank(target);
    }

    public static boolean isBlank(String target) {
        if (null == target) {
            return true;
        }
        if (target.length() == 0) {
            return true;
        }
        boolean blankFlag = true;
        char[] chars = target.toCharArray();
        for (char aChar : chars) {
            if (!Character.isWhitespace(aChar)) {
                blankFlag = false;
                break;
            }
        }
        return blankFlag;
    }

}
