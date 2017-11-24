package abstractFactoryPatternDemo;

/**
 * @author 张大爷
 * @time 2017年11月20日 下午5:03:48
 * @mail 767580776@qq.com
 * @automation
 */
public class ColorFactory extends AbstractFactory {

	@Override
	Fruit getFruit(String fruitType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Color getColor(String colorType) {
		// TODO Auto-generated method stub
		Color color = null;
		if ("red".equalsIgnoreCase(colorType)) {
			color = new Red();
		}
		if ("yellow".equalsIgnoreCase(colorType)) {
			color = new Yellow();
		}
		return color;
	}

}
