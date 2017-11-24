package factoryPatternDemo;

import java.util.Properties;

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
		Fruit orange1 = ReflexFactory.getInstance("factoryPatternDemo.Orange");
		Fruit apple1 = ReflexFactory.getInstance("factoryPatternDemo.Apple");
		orange1.eat();
		apple1.eat();
		Fruit orange2 = ReflexFactory.getInstance(FileFactory.getPro().getProperty("orange"));
		Fruit apple2 = ReflexFactory.getInstance(FileFactory.getPro().getProperty("apple"));
		orange2.eat();
		apple2.eat();
	}

}
