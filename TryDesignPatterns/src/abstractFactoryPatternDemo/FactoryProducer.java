package abstractFactoryPatternDemo;

/**
 * @author �Ŵ�ү
 * @time 2017��11��20�� ����5:06:07
 * @mail 767580776@qq.com
 * @automation
 */
public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		AbstractFactory factory = null;
		if ("fruit".equalsIgnoreCase(choice)) {
			factory = new FruitFactory();
		}
		if ("color".equalsIgnoreCase(choice)) {
			factory = new ColorFactory();
		}
		return factory;
	}
}
