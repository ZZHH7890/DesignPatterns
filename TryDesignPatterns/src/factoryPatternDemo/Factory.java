package factoryPatternDemo;

/**
 * @author 张大爷
 * @time 2017年11月13日 下午5:52:30
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
