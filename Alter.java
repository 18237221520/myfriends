
public class Alter {
	public static void alter(StringBuffer sb) {
		sb.setCharAt(0,'*');
		System.out.println("�޸�ָ��λ���ַ����:\n"+sb);
		sb.replace(5, 7, "!!");
		System.out.println("�滻ָ��λ���ַ����������:\n"+sb);
	}
}
