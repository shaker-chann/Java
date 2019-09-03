package sophisticatedApplications;

public interface IDefaultStatic {
	//抽象方法
	double calculate(int a);
	
	//默认方法
	default double sqrt(int a) {
		return Math.sqrt(a);
	}
	
	//静态方法
	static String msg() {
		return "静态方法";
	}

}
