package abstractFactoryPatternDemo;

/**
 * @author �Ŵ�ү
 * @time 2017��11��20�� ����4:57:35
 * @mail 767580776@qq.com
 * @automation
 */
public class FruitFactory extends AbstractFactory {

	@Override
	public Fruit getFruit(String fruitType) {
		// TODO Auto-generated method stub
		Fruit fruit = null;
		if ("apple".equalsIgnoreCase(fruitType)) {
			fruit = new Apple();
		} 
		if ("orange".equalsIgnoreCase(fruitType)) {
			fruit =new Orange();
		}
		return fruit;
	}

	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
