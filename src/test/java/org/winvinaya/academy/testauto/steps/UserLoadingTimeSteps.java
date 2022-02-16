package org.winvinaya.academy.testauto.steps;

import org.openqa.selenium.WebDriver;
import org.winvinaya.academy.testauto.WinVinayaAcadamyWebSteps;
import org.winvinaya.academy.testauto.pages.UserLoadingTimePages;

public class UserLoadingTimeSteps extends WinVinayaAcadamyWebSteps {
	UserLoadingTimePages  page=null;

	public UserLoadingTimeSteps(WebDriver driver) {
		page=new UserLoadingTimePages(driver);
	}
	public void checkHomeIsExisted() {
		try{result="FAILED";
		page.checkHomeIsExisted();
		result="PASSED";
		}catch(Exception e) {
			print("Dashboard page is yet to opened!");
			result="FAILED";
		}
	}
	public void searchItem(String CourseName) {
		try{result="FAILED";
		page.searchItem(CourseName);
		result="PASSED";
		}catch(Exception e) {
			print("search a course is issue");
			result="FAILED";
		}
	}
	
	public void goBack() {
		try{result="FAILED";
		page.goBack();
		result="PASSED";
		}catch(Exception e) {
			print("Gobaak is issue");
			result="FAILED";
		}
	}
	
	public void clickiLearnItem() {
		try{result="FAILED";
		page.clickiLearnItem();
		result="PASSED";
		}catch(Exception e) {
			print("open iLearn is issue");
			result="FAILED";
		}
	}
	
	public void clickiPreteiceItem() {
		try{result="FAILED";
		page.clickiPreteiceItem();
		result="PASSED";
		}catch(Exception e) {
			print("open iPratice is issue");
			result="FAILED";
		}
	}
	
	public void clickiAccessItem() {
		try{result="FAILED";
		page.clickiAccessItem();
		result="PASSED";
		}catch(Exception e) {
			print("open iAccess is issue");
			result="FAILED";
		}
	}

}
