package pom.ec_testgit;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.ui.ExpectedConditions; 
import org.openqa.selenium.support.ui.WebDriverWait; 
import com.prolifics.ProlificsSeleniumAPI;
import org.openqa.selenium.Keys; 
import org.testng.annotations.Parameters; 
import org.testng.annotations.BeforeClass; 
import org.testng.annotations.Test; 
import org.testng.annotations.AfterClass; 
import org.openqa.selenium.Alert; 
import org.openqa.selenium.JavascriptExecutor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class LetsTalkTea11
{
	ProlificsSeleniumAPI oPSelFW;
	String currentWindow="";
	String flag="";
	static Properties properties = new Properties();
	
	 static Properties prop = new Properties();
	   

	public  LetsTalkTea11(ProlificsSeleniumAPI oPSelFW)
	{
		this.oPSelFW = oPSelFW;
		currentWindow = oPSelFW.driver.getWindowHandle();
	}

	
	public void  EC_PracticeSel_LetsTalkTea11(String webserviceURL,String sDOADataSetId,String sDOAStepNo, String strEffectaOutKeyDataService,String sEffectaParameters) throws Exception 
	{
		webserviceURL=webserviceURL+"/4850";
		oPSelFW.sDOAStepNumberReport=sDOAStepNo;
		oPSelFW.setEffectaParametersInPOMLevel(sEffectaParameters);

flag=oPSelFW.checkForFrames("name=name&&name=name&&css=.form-row:nth-child(1) > .form-value&&xpath=//input[@name='name']&&xpath=//div[@id='form_78ea690540a24bd8b9dcfbf99e999fea']/div/div/input&&xpath=//input", currentWindow); 
oPSelFW.prolifics("clickAndWait",  "name=name&&name=name&&css=.form-row:nth-child(1) > .form-value&&xpath=//input[@name='name']&&xpath=//div[@id='form_78ea690540a24bd8b9dcfbf99e999fea']/div/div/input&&xpath=//input", "name"); 


	flag=oPSelFW.checkForFrames("name=name&&name=name&&css=.form-row:nth-child(1) > .form-value&&xpath=//input[@name='name']&&xpath=//div[@id='form_78ea690540a24bd8b9dcfbf99e999fea']/div/div/input&&xpath=//input", currentWindow); 
oPSelFW.prolifics("typeSpecifiedText","name=name&&name=name&&css=.form-row:nth-child(1) > .form-value&&xpath=//input[@name='name']&&xpath=//div[@id='form_78ea690540a24bd8b9dcfbf99e999fea']/div/div/input&&xpath=//input" ,oPSelFW.getTestDataEffectaWebservices(webserviceURL, "name") , "name"); 



	flag=oPSelFW.checkForFrames("name=email&&name=email&&css=.form-row:nth-child(2) > .form-value&&xpath=//input[@name='email']&&xpath=//div[@id='form_78ea690540a24bd8b9dcfbf99e999fea']/div/div[2]/input&&xpath=//div[2]/input", currentWindow); 
oPSelFW.prolifics("clickAndWait",  "name=email&&name=email&&css=.form-row:nth-child(2) > .form-value&&xpath=//input[@name='email']&&xpath=//div[@id='form_78ea690540a24bd8b9dcfbf99e999fea']/div/div[2]/input&&xpath=//div[2]/input", "email"); 


	flag=oPSelFW.checkForFrames("name=email&&name=email&&css=.form-row:nth-child(2) > .form-value&&xpath=//input[@name='email']&&xpath=//div[@id='form_78ea690540a24bd8b9dcfbf99e999fea']/div/div[2]/input&&xpath=//div[2]/input", currentWindow); 
oPSelFW.prolifics("typeSpecifiedText","name=email&&name=email&&css=.form-row:nth-child(2) > .form-value&&xpath=//input[@name='email']&&xpath=//div[@id='form_78ea690540a24bd8b9dcfbf99e999fea']/div/div[2]/input&&xpath=//div[2]/input" ,oPSelFW.getTestDataEffectaWebservices(webserviceURL, "email") , "email"); 



	flag=oPSelFW.checkForFrames("name=subject&&name=subject&&css=.form-row:nth-child(3) > .form-value&&xpath=//input[@name='subject']&&xpath=//div[@id='form_78ea690540a24bd8b9dcfbf99e999fea']/div/div[3]/input&&xpath=//div[3]/input", currentWindow); 
oPSelFW.prolifics("clickAndWait",  "name=subject&&name=subject&&css=.form-row:nth-child(3) > .form-value&&xpath=//input[@name='subject']&&xpath=//div[@id='form_78ea690540a24bd8b9dcfbf99e999fea']/div/div[3]/input&&xpath=//div[3]/input", "subject"); 


	flag=oPSelFW.checkForFrames("name=subject&&name=subject&&css=.form-row:nth-child(3) > .form-value&&xpath=//input[@name='subject']&&xpath=//div[@id='form_78ea690540a24bd8b9dcfbf99e999fea']/div/div[3]/input&&xpath=//div[3]/input", currentWindow); 
oPSelFW.prolifics("typeSpecifiedText","name=subject&&name=subject&&css=.form-row:nth-child(3) > .form-value&&xpath=//input[@name='subject']&&xpath=//div[@id='form_78ea690540a24bd8b9dcfbf99e999fea']/div/div[3]/input&&xpath=//div[3]/input" ,oPSelFW.getTestDataEffectaWebservices(webserviceURL, "subject") , "subject"); 



	flag=oPSelFW.checkForFrames("name=message&&name=message&&css=.form-row:nth-child(4) > .form-value&&xpath=//textarea[@name='message']&&xpath=//div[@id='form_78ea690540a24bd8b9dcfbf99e999fea']/div/div[4]/textarea&&xpath=//textarea", currentWindow); 
oPSelFW.prolifics("clickAndWait",  "name=message&&name=message&&css=.form-row:nth-child(4) > .form-value&&xpath=//textarea[@name='message']&&xpath=//div[@id='form_78ea690540a24bd8b9dcfbf99e999fea']/div/div[4]/textarea&&xpath=//textarea", "message"); 


	flag=oPSelFW.checkForFrames("name=message&&name=message&&css=.form-row:nth-child(4) > .form-value&&xpath=//textarea[@name='message']&&xpath=//div[@id='form_78ea690540a24bd8b9dcfbf99e999fea']/div/div[4]/textarea&&xpath=//textarea", currentWindow); 
oPSelFW.prolifics("typeSpecifiedText","name=message&&name=message&&css=.form-row:nth-child(4) > .form-value&&xpath=//textarea[@name='message']&&xpath=//div[@id='form_78ea690540a24bd8b9dcfbf99e999fea']/div/div[4]/textarea&&xpath=//textarea" ,oPSelFW.getTestDataEffectaWebservices(webserviceURL, "message") , "message"); 



	}


}
7/20/2020 7:58:38 AM