package controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;



public class ReportController {

	public String form() {
		return "reportForm";
	}
	
	public String upload(HttpServletRequest request) {
		//MultipartFile file;
		//String fileName = file.getOriginalFilename();
		String path = request.getRealPath("/upload/");
		System.out.println(path);
//		if(!file.isEmpty()) {
//			File f = new File(path+fileName);
//			try {
//				file.transferTo(f);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//		request.setAttribute("imgname", fileName);
		return "reportResult";
	}
}







