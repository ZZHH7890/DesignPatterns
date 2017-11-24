package factoryPatternDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/**
 * @author 张大爷
 * @time 2017年11月14日 上午10:21:25
 * @mail 767580776@qq.com
 * @automation
 */
public class FileFactory {
	public static Properties getPro() {
		Properties properties = new Properties();
		File file = new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\DesignPatterns\\TryDesignPatterns\\src\\factoryPatternDemo\\fruitFactory.properties");
		try {
			if (file.exists()) {
				properties.load(new FileInputStream(file));
			} else {
				properties.setProperty("apple", "factoryPatternDemo.Apple");
				properties.setProperty("orange", "factoryPatternDemo.Orange");
				properties.store(new FileOutputStream(file), "FRUIT");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return properties;
	}
}
