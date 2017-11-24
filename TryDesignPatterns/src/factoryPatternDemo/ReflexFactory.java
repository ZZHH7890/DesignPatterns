package factoryPatternDemo;

/**
 * @author �Ŵ�ү
 * @time 2017��11��14�� ����9:29:01
 * @mail 767580776@qq.com
 * @automation
 */
public class ReflexFactory {
	public static Fruit getInstance(String fruitType) {
		Fruit fruit = null;
		try {
			fruit = (Fruit) Class.forName(fruitType).newInstance();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return fruit;
	}
}
