
public class Find {
	public static int i=0;
	public static void find(StringBuffer sb) {
		String s=new String(sb);
		String[] a=s.split(";");
		System.out.println("查询学号为174705012的同学的相关信息:");
		for(int i=0;i<a.length;i++) {
			if(a[i].contains("174705012")==true) {
				System.out.println(a[i]);
				break;
			}
		}
		if(i==a.length)
			System.out.println("该学号无效");
		System.out.println("查询学号为177606034的同学的相关信息:");	
		for(int i=0;i<a.length;i++) {
			if(a[i].contains("177606034")==true) {
				System.out.println(a[i]);
			}
		}
		if(i==a.length)
			System.out.println("该学号无效");
	}
}
