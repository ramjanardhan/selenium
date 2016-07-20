package com.JanardhanRandhi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testZimbra {
	@Test(invocationCount = 10)
	public void testCount() {
		WebDriver driver = new FirefoxDriver();

		driver.get("http://mapi.miraclesoft.com"); // url

		driver.findElement(By.id("username")).sendKeys(
				"rrandhi@miraclesoft.com"); // username

		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS); // time
																			// out

		driver.findElement(By.id("password")).sendKeys("Jana.2854"); // password

		driver.findElement(
				By.xpath("html/body/div[1]/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input[2]"))
				.click(); // sign in

		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);// timeout

		// driver.findElement(By.id("zb__NEW_MENU_title")).click();

		driver.findElement(By.xpath(".//*[@id='zb__App__Mail_title']")).click();// mail
																				// clicking

		driver.findElement(By.xpath(".//*[@id='zb__NEW_MENU_title']")).click();// new
																				// message
																				// clicking

		// driver.manage().timeouts().implicitlyWait(20000,TimeUnit.SECONDS);

		driver.findElement(By.id("zv__COMPOSE-1_to_control"))
				.sendKeys(
						"rrandhi@miraclesoft.com"); // to
		// address

		driver.findElement(By.id("zv__COMPOSE-1_cc_control")).sendKeys(
				"rrandhi@miraclesoft.com"); // cc
																			// address

		driver.findElement(By.id("zv__COMPOSE-1_subject_control")).sendKeys(
				"test zimbra with selenium script"); // subject

		driver.findElement(By.xpath(".//*[@id='ZmHtmlEditor1_body_ifr']"))
				.sendKeys("please update your status "); // message body

		driver.findElement(By.id("zb__COMPOSE-1__SEND_title")).click(); // send

		// driver.findElement(By.xpath(".//*[@id='zb__NEW_MENU_dropdown']/div")).click();
		// new mwnu drop down done

		driver.findElement(By.xpath(".//*[@id='zti__main_Mail__5_textCell']"))
				.click();// sent mail

		// driver.findElement(By.xpath(".//*[@id='zti__main_Mail__5_textCell']")).click();
		// //sent mail

		// driver.findElement(By.xpath(".//*[@id='zb__CLV-main__VIEW_MENU_dropdown']/div")).click();
		// //view hover click

		// driver.findElement(By.xpath(".//*[@id='zb__CLV-main__VIEW_MENU_dropdown']/div")).click();
		// // view hover bar

		// driver.findElement(By.xpath(".//*[@id='DWT31_dropdown']")).click();

		// driver.findElement(By.xpath(".//*[@id='DWT31_dropdown']")).click();

		driver.findElement(By.id("DWT31_dropdown")).click(); // drop down for
																// signout

		// driver.findElement(By.id("DWT31_dropdown")).click();

		// driver.findElement(By.xpath(".//*[@id='skin_dropMenu']")).click();

		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);

		driver.findElement(By.id("POPUP_logOff")).click(); // for hover the sign
															// button

		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);

		driver.findElement(By.id("POPUP_logOff")).click(); // closing zimbra

		driver.close(); // current broswr web page close

		driver.quit(); // entire browser and process terminated

	}

}
