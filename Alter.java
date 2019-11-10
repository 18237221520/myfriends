
public class Alter {
	public static void alter(StringBuffer sb) {
		sb.setCharAt(0,'*');
		System.out.println("修改指定位置字符结果:\n"+sb);
		sb.replace(5, 7, "!!");
		System.out.println("替换指定位置字符（串）结果:\n"+sb);
	}
}
