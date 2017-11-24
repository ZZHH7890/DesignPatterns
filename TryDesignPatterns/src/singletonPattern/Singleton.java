package singletonPattern;

/**
 * @author �Ŵ�ү
 * @time 2017��11��22�� ����3:37:13
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
			System.out.println("���ǵ���ģʽ������ʽ�����̲߳���ȫ");
		}
		return singleton;
	}
}
