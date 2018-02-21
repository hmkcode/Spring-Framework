package com.hmkcode.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import com.hmkcode.model.Link;

public class ExcelXlsxView extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, 
			Workbook workbook, 
			HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		@SuppressWarnings("unchecked")
		List<Link> links = (List<Link>) model.get("model");
	         
        // create a new Excel sheet
        Sheet sheet = workbook.createSheet("Sheet");

        int i = 0;
        Row row = null;
        for(Link link:links){
        	row = sheet.createRow(i++);
        	row.createCell(0).setCellValue(link.getTitle());
        	row.createCell(1).setCellValue(link.getUrl());
        }

        
		
	}

}
