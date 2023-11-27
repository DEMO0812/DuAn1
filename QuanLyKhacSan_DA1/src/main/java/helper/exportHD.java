package helper;

import com.itextpdf.text.Font;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class exportHD {

    static String PDFPath;
    public static HashMap<String, Object[]> listBill = null;
    public static Object infoValues[] = null;
    static Font fontSmall = FontFactory.getFont(FontFactory.HELVETICA, "UTF-8", 11, 0, BaseColor.BLACK);
    static Font fontBold = FontFactory.getFont(FontFactory.HELVETICA, 13, Font.BOLD, BaseColor.BLACK);
    static String folderPDF = "D://may";

//	create file PDF
    public boolean createPDFFile(String id, Object[] info) {
        // set the given value
        PDFPath = "D://" + id + ".pdf";
        infoValues = info;

        // check if the folder is existed
        savePDFFile();

        Document document = new Document();

        try {
            PdfWriter.getInstance(document,
                    new FileOutputStream(PDFPath));
            document.open();

            // title
            Paragraph paragraph = new Paragraph("Quan Ly Khach San", fontBold);
            addEmptyLine(paragraph, 1);
            paragraph.setAlignment(Element.ALIGN_CENTER);
            document.add(paragraph);

            // add spacing
            Paragraph spacing = new Paragraph("----------------------------", fontBold);
            spacing.setAlignment(Element.ALIGN_CENTER);
            document.add(spacing);

            // table info
            PdfPTable tableInfo = new PdfPTable(2);
            tableInfo.setWidths(new int[]{300, 200});
            addRowsInfo(tableInfo);

            document.add(tableInfo);

            // thank you
            Paragraph thankYou = new Paragraph("----Thank you----", fontSmall);

            thankYou.setAlignment(Element.ALIGN_CENTER);
            document.add(thankYou);
            
            Paragraph henGapLai = new Paragraph("----Hen gap Lai Quy Khach----", fontSmall);
            henGapLai.setAlignment(Element.ALIGN_CENTER);
            document.add(henGapLai);
            
            document.close();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private void addRowsInfo(PdfPTable table) {
        String title[] = {
            "Ma Don Phong",
            "Ma Khach Hang",
            "Ma Phong",
            "Ma Dich Vu",
            "Ngay Dat",
            "Ngay Tra",
            "Ghi Chu",
            "Tong Tien"};

        for (int i = 0; i < infoValues.length; i++) {
            PdfPCell cellColumn = new PdfPCell(new Paragraph(title[i], fontSmall));
            cellColumn.setBorderColor(BaseColor.WHITE);
            table.addCell(cellColumn);

            String obj = String.valueOf(infoValues[i]);

            PdfPCell cellValue = new PdfPCell(new Paragraph(obj, fontSmall));
            cellValue.setBorderColor(BaseColor.WHITE);
            table.addCell(cellValue);
        }
    }

//  create location for the file
    private void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
            paragraph.add(new Paragraph(" "));
        }
    }

    public boolean savePDFFile() {
        try {
            File dir = new File(folderPDF);
            if (!dir.exists()) {
                Path path = Paths.get(folderPDF);
                Files.createDirectories(path);
            }
            return true;

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void openPDFFile() {
        if (Desktop.isDesktopSupported()) {
            try {
                File myFile = new File(PDFPath);
                Desktop.getDesktop().open(myFile);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
