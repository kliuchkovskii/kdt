package com.cdp.utils;

import com.cdp.bo.CommonBO;
import com.cdp.model.DataProvider;
import com.cdp.model.User;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class KDTDriver {
    private static final String XLSX_FILE_PATH = "src/main/resources/kdt.xlsx";

    public static void main(String[] args) throws Exception {
        CommonBO commonBO = new CommonBO();
        User user = DataProvider.getRegisteredUser();
        Workbook workbook = WorkbookFactory.create(new File(XLSX_FILE_PATH));
        for (int i = 1; i < workbook.getNumberOfSheets(); i++) {
            Sheet sheet = workbook.getSheetAt(i);
            Iterator<Row> rowIterator = sheet.rowIterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                String keyword = row.getCell(0).toString();
                switch (keyword) {
                    case "register":
                        commonBO.registerUser(DataProvider.generateUser());
                        break;
                    case "login":
                        commonBO.login(user);
                        break;
                    case "logout":
                        commonBO.logout(user.getUsername());
                        break;
                    default:
                        throw new Exception("Not found keyword - " + keyword);
                }
            }
        }
    }
}
