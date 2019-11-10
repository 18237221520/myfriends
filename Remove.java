
public class Remove {
	public static void remove(StringBuffer sb) {
		sb.delete(55,85);
		System.out.println("删除指定位置结果:\n"+sb);
		sb.deleteCharAt(53);
		System.out.println("删除指定位置结果:\n"+sb);	
	}
}
