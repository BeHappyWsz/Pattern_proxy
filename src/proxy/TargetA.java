package proxy;

public class TargetA implements ProxyInterface{

	@Override
	public void print(String name) {
		System.out.println("targetA:"+name);
	}

	@Override
	public void noParams() {
		System.out.println("targetA:noParams");
	}

}
