package singletonPattern;

/**
 * @author 张大爷
 * @time 2017年11月23日 下午5:18:40
 * @mail 767580776@qq.com
 * @automation
 */
public class SingletonHungryType {
	private static SingletonHungryType singletonHungryType = new SingletonHungryType();

	private SingletonHungryType() {
		// TODO Auto-generated constructor stub
	}

	public static SingletonHungryType getInstance() {
		System.out.println("这是单例模式中饿汉式，多线程安全");
		return singletonHungryType;
	}

}
