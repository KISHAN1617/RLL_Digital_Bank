package in.Bank.TestSteps;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;

import in.Bank.Pages.SignIn;
import in.Bank.Pages.Submit;
import in.Bank.Pages.Transferamount;
import in.Bank.Pages.VISADirectTransfer;
import in.Bank.Pages.Visaaccountnumber;
import in.Bank.Pages.verifyerrormessage;

public class Driver extends Tools{
	protected static SignIn w;
	protected static VISADirectTransfer z;
	protected static Visaaccountnumber y;
	protected static  Transferamount transferPage;
	protected static Submit l;
	protected static verifyerrormessage k;
	public static Logger logger;
	
	public static void init() {
		
		logger = Logger.getLogger("VISADirectTransfer");
		PropertyConfigurator.configure("log4j.properties");
		logger.setLevel(Level.DEBUG);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dbankdemo.com/bank/login");
		  w=new SignIn(driver);
		  z= new VISADirectTransfer(driver);
		  y= new Visaaccountnumber(driver);
		  transferPage = new Transferamount(driver);
		  l=new Submit(driver);
		  k=new verifyerrormessage(driver);
		 


}}


