package pom_bankofamerica;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

public class ExelWithDataModel {

    public HashMap<String, String> readXl(String xlPath, String sheetName) throws IOException {

        HashMap<String, String> data = new HashMap<>();

        String path = xlPath;
        String Sheet=sheetName;

        FileInputStream fis = new FileInputStream(path);

        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet ws = wb.getSheet(sheetName);

        int rows = ws.getLastRowNum() + 1;
        int cols = ws.getRow(0).getLastCellNum();

        String[][] tempData = new String[rows][cols];

        for (int r = 0; r < rows; r++) {

            XSSFRow myRow = ws.getRow(r);

            for (int c = 0; c < cols; c++) {

                XSSFCell cell = myRow.getCell(c);
                String value = getCellData(cell);
                tempData[r][c] = value;

            }

        }
        for (String[] row : tempData) {

            String key = row[0];
            String value = row[1];
            data.put(key, value);

        }

        return data;

    }

    public static String getCellData(Cell cellValue) {

        String value;

        DataFormatter formatter = new DataFormatter();

        try {

            value = formatter.formatCellValue(cellValue);

        } catch (Exception e) {

            value = "";

        }

        return value;

    }
}
