package proxy.jdk;

import proxy.ProxyInterface;
import proxy.TargetB;

public class Client {
	
	public static void main(String[] args) {
		
		ProxyInterface proxy = (ProxyInterface) new ProxyFactory(new TargetB()).getProxyInstance();
		proxy.print("jdkProxy");
		proxy.noParams();
		
	}
}
