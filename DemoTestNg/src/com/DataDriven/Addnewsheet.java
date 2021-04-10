package com.DataDriven;

import com.Excel.utility.Xls_Reader;

public class Addnewsheet {
	
	public static void main(String[] args) {
		
		
		Xls_Reader reader =  new  Xls_Reader("C:\\Users\\admin\\git\\TestNG\\DemoTestNg\\src\\com\\TestData\\EbayData.xlsx");
		
		//Adding sheet in excel
		
		reader.addSheet("HomePage");
		
		if(!reader.isSheetExist("HomePage"))
		{
			reader.addSheet("HomePage");
		}
		
	}
	 

}
