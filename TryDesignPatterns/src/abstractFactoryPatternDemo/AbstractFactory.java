package abstractFactoryPatternDemo;

/**
 * @author 张大爷
 * @time 2017年11月20日 下午4:43:33
 * @mail 767580776@qq.com
 * @automation
 */
public abstract class AbstractFactory {
	abstract Fruit getFruit(String fruitType);

	abstract Color getColor(String colorType);
}
