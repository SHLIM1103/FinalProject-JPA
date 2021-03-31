package com.example.demo.cmm.utl;

//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.select.Elements;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import com.example.demo.prd.domain.ProductDto;

public class Crawler {
//	public static void main(String[] args) {
//    	List<ProductDto> prdBox = new ArrayList<>();
//		try {
//			Document rawData = Jsoup.connect("https://www.jigushop.co.kr/kitchen").timeout(10000).get();
//			Elements prdName = rawData.select("div[class=item-detail] a[class=_fade_link]");
//			Elements prdImg = rawData.select("img[class=_org_img org_img _lazy_img]");
//			Elements prdPrice = rawData.select("p[class=pay]");
//			for(int i = 0; i < prdName.size(); i++) {
//				ProductDto product = new ProductDto();
//				product.setPrdName(prdName.get(i).text());
//				product.setPrdImg(prdImg.get(i).attr("abs:data-src"));
//				product.setPrdPrice(prdPrice.get(i).text());
//				System.out.println(i + "번째 제품: " + product.toString());
//				prdBox.add(product);
//}
//			XSSFWorkbook workbook = new XSSFWorkbook();
//			XSSFSheet sheet = workbook.createSheet("Report");
//			createHeader(sheet, workbook);
//			int rowCount = 0;
//			for (ProductDto prd : prdBox) {
//				Row row = sheet.createRow(++rowCount);
//				
//				Cell prdNameCell = row.createCell(0);
//				prdNameCell.setCellValue(prd.getPrdName());
//				
//				Cell prdImgCell = row.createCell(1);
//				prdImgCell.setCellValue(prd.getPrdImg());
//				
//				Cell priceCell = row.createCell(2);
//				priceCell.setCellValue(prd.getPrdPrice());
//			}
//			
//			try (FileOutputStream outputStream = new FileOutputStream("C:\\Users\\SOHYUN LIM\\Developer Liiim\\SpringBoot\\SpringBoot-finalproject\\data\\kitchen01.csv")) {
//				workbook.write(outputStream);
//			} finally {
//				workbook.close();
//	        }
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	private static void createHeader(XSSFSheet sheet, XSSFWorkbook workbook) {
//		Row headerRow = sheet.createRow(0);
//		headerRow.createCell(0).setCellValue("prdName");
//		headerRow.createCell(1).setCellValue("prdImg");
//		headerRow.createCell(2).setCellValue("prdPrice");
//	}
}