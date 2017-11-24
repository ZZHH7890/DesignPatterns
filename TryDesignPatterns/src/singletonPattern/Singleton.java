package singletonPattern;

/**
 * @author 张大爷
 * @time 2017年11月22日 下午3:37:13
 * @mail 767580776@qq.com
 * @automation
 */
public class Singleton {
	private static Singleton singleton;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
			System.out.println("这是单例模式中懒汉式，多线程不安全");
		}
		return singleton;
	}
}
