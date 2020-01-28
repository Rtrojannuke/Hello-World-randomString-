package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class trend {
	static WebDriver Driver;
	static String browser;
	static String projectrail = System.getProperty("user.dir");
	
	public static void main(String[] args) {
		choosebrowser();
		browsersetting();
		test();
	}
	
	public static void choosebrowser(){
		browser = "Chrome";
	}
	public static void browsersetting(){
		if(browser.contains("Chrome")){
			System.setProperty("webdriver.chrome.driver", projectrail+"\\libraries\\driver\\chromedriver.exe");
			Driver = new ChromeDriver();
		}
		if(browser.contains("Firefox")){
			System.setProperty("webdriver.firefox.driver", projectrail+"\\libraries\\driver\\chromedriver.exe");
			Driver = new FirefoxDriver(); 
		}
	}
	public static void test(){
		Driver.get("https://docs.google.com/spreadsheets/d/1nIjdMHp1zauehfWTg1JKvdHYzUXIXeS8zCJctzADhu4/edit#gid=1564777721");
		}
	
}
