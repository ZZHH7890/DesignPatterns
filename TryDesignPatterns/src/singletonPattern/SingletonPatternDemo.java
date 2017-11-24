package singletonPattern;

/**
 * @author 张大爷
 * @time 2017年11月22日 下午3:41:30
 * @mail 767580776@qq.com
 * @automation
 */
public class SingletonPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton.getInstance();
		SingletonSynchronized.getInstance();
		SingletonHungryType.getInstance();
	}

}
