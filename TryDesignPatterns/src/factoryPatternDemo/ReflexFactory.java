package factoryPatternDemo;

/**
 * @author 张大爷
 * @time 2017年11月14日 上午9:29:01
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
