package com.example.demo.cmm.utl;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class CrawlerBySelenium extends Proxy {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bitcamp\\SohyunLim\\SpringBoot\\workspace\\be\\demo\\src\\main\\resources\\static\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.naver.com/");
        System.out.println(driver.getPageSource());
      }
}