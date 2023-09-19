package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class web_driver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invoking the browser driver->open
		//create an object for the driver class
		//parent WebDriver- interface
		//implement - EdgeDriver,ChromeDriver
		//Interface_name obj=new Driver_class()
		
		WebDriver driver=new EdgeDriver();
		//obj_name.get("address")
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println("Hello");
	
		

	}

}
