package singletonPattern;

/**
 * @author �Ŵ�ү
 * @time 2017��11��22�� ����3:41:30
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
