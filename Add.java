
public class Add{
	public static void add(StringBuffer sb) {
		sb.append("174705012 张三 男 土木工程 专科;\n");
		System.out.println("append添加结果:\n"+sb);
		sb.insert(31,"177606034 王德嵘 男 金融学 本科?;\n");
		System.out.println("insert添加结果:\n"+sb);
	}
}
