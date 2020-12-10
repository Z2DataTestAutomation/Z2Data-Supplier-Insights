package com.SI.Supplier_Insights;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C_Check_Alert_with_Single_Filter extends SI_Test_Base {


    @Test
    public void Z2D_SingleFilter() {
        My_Supplier_Page My_Supplier_Obj = new My_Supplier_Page(driver);

        My_Supplier_Obj.Z2D_Open_Supplier_List();
        My_Supplier_Obj.Z2D_Open_Alert_Tab();
        My_Supplier_Obj.Z2D_Select_Filter();
        Assert.assertTrue(driver.getPageSource().contains("Litigation"));
    }
}

