package proxy.staticDemo;

import proxy.ProxyInterface;

public class ProxyFactory implements ProxyInterface{

	private ProxyInterface target;
	
	public void setTarget(ProxyInterface t) {
		this.target = t;
	}
	
	@Override
	public void print(String name) {
		if(target != null)
			target.print(name);
		else
			System.out.println("ÎÞÄ¿±ê");
	}

	@Override
	public void noParams() {
		target.noParams();
	}
	
}
