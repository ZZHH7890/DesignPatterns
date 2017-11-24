package abstractFactoryPatternDemo;
/**
*@author �Ŵ�ү
*@time 2017��11��20�� ����5:10:06
*@mail 767580776@qq.com
*@automation
*/
public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //����Ҫͨ����ɫ��ѡ��
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		//���õ���ɫ�ǻ�ɫ��
		Color color = colorFactory.getColor("yellow");
		System.out.println("���õ���ɫ��ʲô��");
		color.fill();
		
		//����Ҫˮ��
		AbstractFactory fruitFactory = FactoryProducer.getFactory("Fruit");
		//���õ�������
		Fruit fruit = fruitFactory.getFruit("orange");
		System.out.println("���õ�ˮ����ʲô��");
		fruit.eat();
	}

}
