package proxy.staticDemo;

import proxy.TargetA;
import proxy.TargetB;

/**
 * 静态代理模式
 * 1.目标、代理类均要实现接口
 * @author wsz
 * @date 2018年4月4日
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
