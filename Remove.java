
public class Remove {
	public static void remove(StringBuffer sb) {
		sb.delete(55,85);
		System.out.println("ɾ��ָ��λ�ý��:\n"+sb);
		sb.deleteCharAt(53);
		System.out.println("ɾ��ָ��λ�ý��:\n"+sb);	
	}
}
