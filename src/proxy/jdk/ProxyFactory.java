package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * ��̬����
 * @author wsz
 * @date 2018��4��4��
 */
public class ProxyFactory {

	private Object target;
	
	public ProxyFactory(Object target) {
		this.target = target;
	}
	
	public Object getProxyInstance() {
		if(target == null)
			return null;
		System.out.println(String.valueOf(target.getClass().getInterfaces()));
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//				System.out.println("proxy:"+proxy);
				System.out.println("target:"+target);//�������
				System.out.println("method:"+method);//����ķ���
				System.out.println("args:"+ (args == null ? "null" : String.valueOf(args)));//�������Ĳ���
				Object invoke = method.invoke(target, args);
				return invoke;
			}
		});
	}
}
