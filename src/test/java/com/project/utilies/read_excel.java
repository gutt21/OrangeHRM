package com.project.utilies;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.util.Calendar;

import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class read_excel {


	public String path;
	public	FileInputStream input=null;
	public FileOutputStream output=null;
	public XSSFWorkbook work=null;
	public XSSFSheet sheet=null;
	public XSSFRow row=null;
	public XSSFCell cell=null;



	public read_excel(String path) {

		this.path=path;
		try {
			input=new FileInputStream(path);
			work=new XSSFWorkbook(input);
			sheet=work.getSheetAt(0);
			input.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

	@Test
	public int get_row_count(String sheetname) throws Exception {
		int index=work.getSheetIndex(sheetname);
		if(index==-1)
			return 0;

		else {
			sheet=work.getSheetAt(index);
			int number=sheet.getLastRowNum();
			return number;
		}

	}		



	public String getcelldata(String sheetname,String colname,int rownum) {	
		try {
			if(rownum<=0)
				return "";
			int index=work.getSheetIndex(sheetname);	
			int colnum=-1;
			if(index==-1)
				return "";
			sheet=work.getSheetAt(index);
			row=sheet.getRow(0);
			for(int i=0;i<row.getLastCellNum();i++) {
				if(row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(colname.trim())) {
					colnum=i;
				}		 	 
			}
			if(colnum==-1)
				return "";
			sheet=work.getSheetAt(index);
			row=sheet.getRow(rownum-1);
			if(row==null)
				return "";
			cell=row.getCell(colnum);
			if(cell==null)				
				return "";

			if(cell.getCellType()==CellType.STRING)
				return cell.getStringCellValue();

			else if(cell.getCellType()==CellType.NUMERIC || cell.getCellType()==CellType.FORMULA) {
				String celltext=String.valueOf(cell.getNumericCellValue());
				if(HSSFDateUtil.isCellDateFormatted(cell)) {
					double d=cell.getNumericCellValue();
					Calendar cal=Calendar.getInstance();
					cal.setTime(HSSFDateUtil.getJavaDate(d));
					celltext=(String.valueOf(cal.get(Calendar.YEAR))).substring(2);
					celltext=cal.get(Calendar.DAY_OF_MONTH)+"/"+
							cal.get(Calendar.MONTH)+1+"/"+celltext;
				}
				return celltext;

			}else if(cell.getCellType()==CellType.BLANK)
				return "";
			else 
				return String.valueOf(cell.getBooleanCellValue());



		}
		catch(Exception e) {

		}
		return "row"+rownum+" or colum"+colname +" did not exit in xls";

	}



	public String getcelldata(String sheetname,int colnum,int rownum) {	
		try {
			if(rownum<=0)
				return "";
			int index=work.getSheetIndex(sheetname);						
			if(index==-1)
				return "";
			sheet=work.getSheetAt(index);
			row=sheet.getRow(rownum-1);
			if(row==null)
				return "";
			cell=row.getCell(colnum);
			if(cell==null)				
				return "";

			if(cell.getCellType()==CellType.STRING)
				return cell.getStringCellValue();

			else if(cell.getCellType()==CellType.NUMERIC || cell.getCellType()==CellType.FORMULA) {
				String celltext=String.valueOf(cell.getNumericCellValue());
				/*if(HSSFDateUtil.isCellDateFormatted(cell)) {
					double d=cell.getNumericCellValue();
					Calendar cal=Calendar.getInstance();
					cal.setTime(HSSFDateUtil.getJavaDate(d));
					celltext=(String.valueOf(cal.get(Calendar.YEAR))).substring(2);
					celltext=cal.get(Calendar.DAY_OF_MONTH)+"/"+
							cal.get(Calendar.MONTH)+1+"/"+celltext;
				}*/
				return celltext;

			}else if(cell.getCellType()==CellType.BLANK)
				return "";
			else 
				return String.valueOf(cell.getBooleanCellValue());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return "row"+rownum+" or colum"+colnum +" did not exit in xls";

	}

	
	
	public boolean setdatavalue(String sheetname,String colname,int rownum,String data) {
		try {
			input=new FileInputStream(path);
			work=new XSSFWorkbook(input);
			if(rownum<=0)
				return false;
			int index=work.getSheetIndex(sheetname);	
			int colnum=-1;
			if(index==-1)
				return false;
			sheet=work.getSheetAt(index);
			row=sheet.getRow(0);
			for(int i=0;i<row.getLastCellNum();i++) {
				if(row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(colname.trim())) {
					colnum=i;
				}		 	 
			}
			if(colnum==-1)
				return false;
			sheet.autoSizeColumn(colnum);
			row=sheet.getRow(rownum-1);
			if(row==null)
				row=sheet.createRow(rownum-1);
			cell=row.getCell(colnum);
			if(cell==null)
				cell=row.createCell(colnum);

			CellStyle cs=work.createCellStyle();
			cs.setWrapText(true);
			cell.setCellStyle(cs);
			cell.setCellValue(data);
			output=new FileOutputStream(path);
			work.write(output);
			output.close();
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean setdatavalue(String sheetname,String colname,int rownum,String data,String url) {
		try {
			input=new FileInputStream(path);
			work=new XSSFWorkbook(input);
			if(rownum<=0)
				return false;
			int index=work.getSheetIndex(sheetname);	
			int colnum=-1;
			if(index==-1)
				return false;
			sheet=work.getSheetAt(index);
			row=sheet.getRow(0);
			for(int i=0;i<row.getLastCellNum();i++) {
				if(row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(colname.trim())) {
					colnum=i;
				}		 	 
			}
			if(colnum==-1)
				return false;
			sheet.autoSizeColumn(colnum);
			row=sheet.getRow(rownum-1);
			if(row==null)
				row=sheet.createRow(rownum-1);
			cell=row.getCell(colnum);
			if(cell==null)
				cell=row.createCell(colnum);

			
			
			cell.setCellValue(data);
			
			XSSFCreationHelper creathelp=work.getCreationHelper();
			CellStyle cs=work.createCellStyle();
			XSSFFont font=work.createFont();
			font.setUnderline(XSSFFont.U_SINGLE);
			font.setColor(IndexedColors.BLUE.getIndex());
			cs.setFont(font);
			
			XSSFHyperlink link=creathelp.createHyperlink(HyperlinkType.FILE);
			link.setAddress(url);
			cell.setHyperlink(link);
			cell.setCellStyle(cs);
			
			
			output=new FileOutputStream(path);
			work.write(output);
			output.close();
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
	

}
