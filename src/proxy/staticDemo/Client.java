package proxy.staticDemo;

import proxy.TargetA;
import proxy.TargetB;

/**
 * ��̬����ģʽ
 * 1.Ŀ�ꡢ�������Ҫʵ�ֽӿ�
 * @author wsz
 * @date 2018��4��4��
 */
public class Client {

	public static void main(String[] args) {
		ProxyFactory target = new ProxyFactory();
		target.setTarget(new TargetA());
		target.print("aaa");
		
		target.setTarget(new TargetB());
		target.print("bbbb");
	}
	
}
