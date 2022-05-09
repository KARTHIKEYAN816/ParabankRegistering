package baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public void LaunchEdge() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
	}
public void LaunchIE() {
	WebDriverManager.iedriver().setup();
	driver=new InternetExplorerDriver();
	
}
public void LaunchChrome() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
}
public void WindowMaximize() {
	driver.manage().window().maximize();
}
public void SendKeys(WebElement element,String s) {
	element.sendKeys(s);
	
}
public String GetValue(WebElement element) {
	
	String at = element.getAttribute("value");
    return at;
}
public void LoadUrl(String url) {
	driver.get(url);
}
public String getCurrentUrl() {
	String url = driver.getCurrentUrl();
	return url;
	
}
public void BtnClick(WebElement element) {
	element.click();
}
public void SelectByValue(WebElement element,String value) {
	Select s=new Select(element);
	s.selectByValue(value);
}
public void SelectByIndex(WebElement element,int index) {
	Select s=new Select(element);
    s.selectByIndex(index);
}
public String GetText(WebElement element) {
	String text = element.getText();
	return text;
}
public String GetExcelData(String shNo,int rNo,int cNo) throws IOException {
	String value=null;
	FileInputStream fi=new FileInputStream
			("C:\\Users\\NOLAN\\eclipse-workspace\\New folder\\ParabankRegistering\\src\\test\\resources\\ExcelData\\ParaBank.xlsx");
	Workbook wb=new XSSFWorkbook(fi);
	Sheet sheet = wb.getSheet(shNo);
	Row row = sheet.getRow(rNo);
	Cell cell=row.getCell(cNo);
	int ct = cell.getCellType();
	if (ct==1) {
		value  = cell.getStringCellValue();
	}else if(ct==0) {
		Date date = cell.getDateCellValue();
		if (DateUtil.isCellDateFormatted(cell)) {
			DateFormat df=new SimpleDateFormat("dd-MM-YYYY");
			value=df.format(date);
		}else {
			double d = cell.getNumericCellValue();
		    long l=(long)d;
		    value=String.valueOf(l);
		}
	}
	return value;
}
public void exwait(Duration ti,WebElement element ) {
	WebDriverWait wait=new WebDriverWait(driver, ti);
	wait.until(ExpectedConditions.visibilityOf(element));
}
public void quit() {
	driver.quit();
}
public String getAttribute(WebElement element) {
	String at = element.getAttribute("value");
return at;
}
public void Wait() throws InterruptedException {
	Thread.sleep(4000);
}
public void verification(WebElement element,String text) {
	if(element.getText().contains(text)) {
		System.out.println(text + " is verified Sucessfully");
	}else {
		System.out.println(text + " is verified UnSucessfull");
	}
}

}