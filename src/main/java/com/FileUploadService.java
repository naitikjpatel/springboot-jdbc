package com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


@Service
public class FileUploadService {

	public void uploadProductImage(MultipartFile masterImage) {
		
		System.out.println(masterImage.getOriginalFilename());
		String path="C:\\Users\\Naitik\\Documents\\workspace-spring-tool-suite-4-4.22.1.RELEASE\\spring-jdbc\\src\\main\\webapp\\images\\products";
		
		//get the bytes data
		try {
			byte[] b=masterImage.getBytes();
			File file=new File(path,masterImage.getOriginalFilename());			
			
			FileUtils.writeByteArrayToFile(file, b);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
