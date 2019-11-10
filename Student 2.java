
public class Student2 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("184805001 鲍怡心 女 数据科学与大数据技术 本科;\n184805002 陈愉 女 数据科学与大数据技术 本科;\n184805003 陈紫薇 女 数据科学与大数据技术 本科;\n184805004 窦浩铭 男 数据科学与大数据技术 本科;\n184805005 狄雪 女 数据科学与大数据技术 本科;\n184805006 方媛 女 数据科学与大数据技术 本科;\n184805007 高棋 男 数据科学与大数据技术 本科;\n184805008 高旭坤 男 数据科学与大数据技术 本科;\n184805009 郭佳雪 女 数据科学与大数据技术 本科;\n184805010 郭珍珍 女 数据科学与大数据技术 本科;\n");
		System.out.println("-------------安阳师范学院部分学生信息-----------");	
		System.out.println("1.添加学生信息-----------");
		Add.add(sb);
		System.out.println("2.删除学生信息-----------");
		Remove.remove(sb);
		System.out.println("3.修改学生信息-----------");
		Alter.alter(sb);
		System.out.println("4.查询学生信息-----------");
		Find.find(sb);
	}
}

