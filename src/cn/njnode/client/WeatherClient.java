package cn.njnode.client;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

public class WeatherClient {

	public static void main(String[] args) {
		WeatherWS weatherWS = new WeatherWS();
		WeatherWSSoap wsSoap = weatherWS.getWeatherWSSoap();
		ArrayOfString arrayOfString = wsSoap.getWeather("南京", null);
		List<String> string = arrayOfString.getString();
		for (String str : string) {
			System.out.println(str);
		}
	}
}
