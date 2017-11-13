package factoryPatternDemo;

/**
 * @author �Ŵ�ү
 * @time 2017��11��13�� ����5:52:30
 * @mail 767580776@qq.com
 * @automation
 */
public class Factory {
	public static Fruit getInstance(String fruitType) {
		Fruit fruit = null;
		if ("apple".equalsIgnoreCase(fruitType)) {
			fruit = new Apple();
		}
		if ("orange".equalsIgnoreCase(fruitType)) {
			fruit = new Orange();
		}
		return fruit;
	}
}
