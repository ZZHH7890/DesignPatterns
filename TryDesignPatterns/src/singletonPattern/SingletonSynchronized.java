package singletonPattern;

/**
 * @author �Ŵ�ү
 * @time 2017��11��23�� ����3:55:57
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
			System.out.println("���ǵ���ģʽ�е�����ʽ�����̰߳�ȫ");
		}
		return singletonSynchronized;
	}
}
