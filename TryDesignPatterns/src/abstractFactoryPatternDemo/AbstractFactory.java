package abstractFactoryPatternDemo;

/**
 * @author �Ŵ�ү
 * @time 2017��11��20�� ����4:43:33
 * @mail 767580776@qq.com
 * @automation
 */
public abstract class AbstractFactory {
	abstract Fruit getFruit(String fruitType);

	abstract Color getColor(String colorType);
}
