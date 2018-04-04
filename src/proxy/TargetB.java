package proxy;

public class TargetB implements ProxyInterface{

	@Override
	public void print(String name) {
		System.out.println("targetB:"+name);
	}

	@Override
	public void noParams() {
		System.out.println("targetB:noParams");
	}

}
