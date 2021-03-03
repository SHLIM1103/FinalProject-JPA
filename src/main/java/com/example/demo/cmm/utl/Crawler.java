package com.example.demo.cmm.utl;

import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.example.demo.prd.domain.ProductDto;
import lombok.RequiredArgsConstructor;

//@Component @RequiredArgsConstructor
public class Crawler extends Proxy {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	//private final Vector<ProductDto> prdBox;
	//private final ProductDto product;
    public Vector<ProductDto> crawling(String url2) {
    	String url = "https://www.jigushop.co.kr/176";
    	logger.info("URL : " + url);
    	ArrayList<ProductDto> prdBox = new ArrayList<>();
    	try {
    		Document rawData = Jsoup.connect(url).timeout(10000).get();
    		Elements prdName = rawData.select("div[class=item-detail] a[class=_fade_link]");
    		Elements price = rawData.select("p[class=pay]");
    		ProductDto product = null;
    		for(int i = 0; i < prdName.size(); i++) {
    			product = new ProductDto();
    			product.setPrdName(prdName.get(i).text());
    			product.setPrice(price.get(i).text());
    			logger.info(i + "번째 제품: " + product.toString());
    			prdBox.add(product);
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return null;
    }
    public void writeDataToCsv(String filePath) throws IOException {
        CSVWriter writer = new CSVWriter(new FileWriter(filePath));
        String[] entries = "EW#City#State".split("#");  // 1
        writer.writeNext(entries);  // 2

        String[] entries1 = {"W", "Youngstown", "OH"};  // 3
        writer.writeNext(entries1);

        String[] entries2 = {"W", "Williamson", "WV"};
        writer.writeNext(entries2);

        writer.close();
    }
    public static void main(String[] args) {
    	Crawler c = new Crawler();
    	// c.crawling("");
    	try {
    		System.out.println("##########");
			c.writeDataToCsv("C:\\Users\\bitcamp\\Pictures\\sample.csv");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}