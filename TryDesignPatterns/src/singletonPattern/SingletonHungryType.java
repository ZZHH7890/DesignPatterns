package singletonPattern;

/**
 * @author �Ŵ�ү
 * @time 2017��11��23�� ����5:18:40
 * @mail 767580776@qq.com
 * @automation
 */
public class SingletonHungryType {
	private static SingletonHungryType singletonHungryType = new SingletonHungryType();

	private SingletonHungryType() {
		// TODO Auto-generated constructor stub
	}

	public static SingletonHungryType getInstance() {
		System.out.println("���ǵ���ģʽ�ж���ʽ�����̰߳�ȫ");
		return singletonHungryType;
	}

}
