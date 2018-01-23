package client;

import server.WSTestImpl;
import server.WSTestImplService;

public class ClientTest {

	/*
	 * 这里非常注意：使用jdk的wsimport.exe工具生成客户端代码时，需要
	 * 留意文件路径的问题，生成的package时什么，就得放在什么路径下面。否则路径找不到，无法正常调用！
	 */
	public static void main(String[] args) {
		try {
			WSTestImplService factory = new WSTestImplService();
			WSTestImpl wsTestImplPort = factory.getWSTestImplPort();
			System.out.println(wsTestImplPort);
			String string = wsTestImplPort.sayHello("Tom ");
			System.out.println(string);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
