package UtilLibraries;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelOperation {
    static String loc = "F:\\SwagLabs\\src\\test\\resource\\Testdata.xlsx";
    public static String getTextValue(String sheetname,int rownumber,int cellnumber) {
        try {
            FileInputStream fis = new FileInputStream(loc);
            XSSFWorkbook xsf = new XSSFWorkbook(fis);
            String s=xsf.getSheet(sheetname).getRow(rownumber).getCell(cellnumber).getStringCellValue();
            return s;
        }
        catch(Exception e) {
            return String.valueOf(e);
        }
        }
    public static long getNumericValue(String sheetname,int rownumber,int cellnumber) {
        try {
            FileInputStream fis = new FileInputStream(loc);
            XSSFWorkbook xsf = new XSSFWorkbook(fis);
            long l=(long)xsf.getSheet(sheetname).getRow(rownumber).getCell(cellnumber).getNumericCellValue();
            return l;
        }
        catch(Exception e) {
            return 0;
        }
    }
    public static void setCellValue(String sheetname,int rownumber,int cellnumber,String value) {
        try {
            FileInputStream fis = new FileInputStream(loc);
            XSSFWorkbook xsf = new XSSFWorkbook(fis);
            xsf.getSheet(sheetname).getRow(rownumber).getCell(cellnumber).setCellValue(value);
            FileOutputStream fos = new FileOutputStream(loc);
            xsf.write(fos);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    }


