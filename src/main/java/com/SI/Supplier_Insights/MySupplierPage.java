package com.SI.Supplier_Insights;

import com.shaft.gui.element.ElementActions;
import com.shaft.validation.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class MySupplierPage {
  private WebDriver driver;
    public MySupplierPage(WebDriver driver) {
        this.driver = driver;
    }
    public By Supplier_List =By.partialLinkText("Hadeer_ Supplier Li");
    public By DashBoard_Tab= By.xpath("//*[@id=\"z2tableA-contain\"]/div[1]/ul/li[1]/a");
    public By Suppliers_Tab= By.linkText("Suppliers");
    public By Alert_Tab=By.linkText("Alerts");
    public By Scrub_Tab=By.linkText("Scrub");
    public By Reports_Tab=By.linkText("Reports");
    public By SingleFilter=By.xpath("//label[@for='chk_Types_0']");



public void Z2D_OpenSupplierList(){
    ElementActions.click(driver,Supplier_List);
}
public void Z2D_OpenDashBoardTab(){
  ElementActions.click(driver,DashBoard_Tab);
}

public void Z2D_OpenAlertTap(){
  ElementActions.click(driver,Alert_Tab);
}

public void Z2D_OpenScrub(){
  ElementActions.click(driver,Scrub_Tab);
}

public void Z2D_OpenReportTab(){
  ElementActions.click(driver,Reports_Tab);
}


public void Z2D_SelectFilter(){
  ElementActions.click(driver,SingleFilter);
}



}