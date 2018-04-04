package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * 动态代理
 * @author wsz
 * @date 2018年4月4日
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
				System.out.println("target:"+target);//代理的类
				System.out.println("method:"+method);//代理的方法
				System.out.println("args:"+ (args == null ? "null" : String.valueOf(args)));//代理方法的参数
				Object invoke = method.invoke(target, args);
				return invoke;
			}
		});
	}
}
