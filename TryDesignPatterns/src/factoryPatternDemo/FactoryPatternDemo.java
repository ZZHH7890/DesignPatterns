package factoryPatternDemo;

/**
 * @author �Ŵ�ү
 * @time 2017��11��13�� ����6:04:02
 * @mail 767580776@qq.com
 * @automation
 */
public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit orange = Factory.getInstance("orange");
		Fruit apple = Factory.getInstance("apple");
		orange.eat();
		apple.eat();
	}

}
