package util;

/**
 * created by yangpeng on 2020/8/17
 */
public class StringUtil {

	/**
	 * @desc remove all blanks and \t, \n, \r
	 */
	public static String trimStr(String str) {
		str = str.replaceAll("[\\t\\n\\r]", "").replaceAll("\\s+", " ");
		str = str.replace(" ", "");
		return str;
	}
}
