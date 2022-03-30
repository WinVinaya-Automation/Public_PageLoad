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
		if(page.checkHomeIsExisted()==true) {
			result="PASSED";
		}
		}catch(Exception e) {
			print("Dashboard page is yet to opened!");
			result="FAILED";
		}
	}
	public void searchItem(String CourseName) {
		try{result="FAILED";
		if(page.searchItem(CourseName)==true) {
			result="PASSED";
		}
		}catch(Exception e) {
			print("search a course is issue");
			result="FAILED";
		}
	}

	public void goBack() {
		try{
			page.goBack();
		}catch(Exception e) {
			print("Goback is issue");
		}
	}

	public void clickiLearnItem() {
		try{
			if(result.equalsIgnoreCase("PASSED")){
				result="FAILED";
				page.clickiLearnItem();
				result="PASSED";
			}
			result="FAILED";
		}catch(Exception e) {
			print("open iLearn is issue");
			result="FAILED";
		}
	}

	public void clickiPreteiceItem() {
		try{
			if(result.equalsIgnoreCase("PASSED")){
				result="FAILED";
				page.clickiPreteiceItem();
				result="PASSED";
			}
			result="FAILED";
		}catch(Exception e) {
			print("open iPratice is issue");
			result="FAILED";
		}
	}

	public void clickiAccessItem() {
		try{
			if(result.equalsIgnoreCase("PASSED")){
				result="FAILED";
				page.clickiAccessItem();
				result="PASSED";
			}
			result="FAILED";
		}catch(Exception e) {
			print("open iAccess is issue");
			result="FAILED";
		}
	}
}