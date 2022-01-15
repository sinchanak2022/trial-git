package testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.Excel;

public class validlogin 
{
	@Test
	public void login()throws EncryptedDocumentException,IOException
	{
		String uname=Excel.getData("Sheet1",0,0);
		String pwd=Excel.getData("Sheet1",0,1);
		login act=new login(driver);
		act.username(uname);
		act.username(pwd);
		act.loginbth();
	}

}
