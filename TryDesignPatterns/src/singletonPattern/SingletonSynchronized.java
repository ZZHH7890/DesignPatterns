package singletonPattern;

/**
 * @author 张大爷
 * @time 2017年11月23日 下午3:55:57
 * @mail 767580776@qq.com
 * @automation
 */
public class SingletonSynchronized {
	private static SingletonSynchronized singletonSynchronized;

	private SingletonSynchronized() {
	}
	public static SingletonSynchronized getInstance() {
		if (singletonSynchronized == null) {
			singletonSynchronized = new SingletonSynchronized();
			System.out.println("这是单例模式中的懒汉式，多线程安全");
		}
		return singletonSynchronized;
	}
}
