package utillites;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Helper {
	
	
	
	public static void captureSShot(WebDriver driver,String SSH_Name) throws IOException {
		
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyDirectory(sourceFile, new File("~/sc-"+SSH_Name+".png"));
		
		
	}
	
public static void captureSShot0 (WebDriver driver,String SSH_Name) throws IOException {
		
		Path destPath=Paths.get("./ScreenShoots",SSH_Name+".png");
	//	Files.createParentDirs(destPath.getParent());
		FileOutputStream outputStream=new FileOutputStream(destPath.toString());
		outputStream.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
         outputStream.close();

}
	

}
