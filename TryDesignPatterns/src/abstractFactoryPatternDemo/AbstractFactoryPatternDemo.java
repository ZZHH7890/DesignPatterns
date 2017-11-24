package abstractFactoryPatternDemo;
/**
*@author 张大爷
*@time 2017年11月20日 下午5:10:06
*@mail 767580776@qq.com
*@automation
*/
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //我想要通过颜色来选择
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		//我拿的颜色是黄色的
		Color color = colorFactory.getColor("yellow");
		System.out.println("我拿的颜色是什么呢");
		color.fill();
		
		//我想要水果
		AbstractFactory fruitFactory = FactoryProducer.getFactory("Fruit");
		//我拿的是橘子
		Fruit fruit = fruitFactory.getFruit("orange");
		System.out.println("我拿的水果是什么呢");
		fruit.eat();
	}

}
