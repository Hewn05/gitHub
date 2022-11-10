package fileUpDown;

import java.io.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oreilly.servlet.MultipartRequest;

public class FileUtil {
											// req = 넘어온 정보	saveDirectory = 저장할 공간 	maxPostSize = 제약조건
	public static MultipartRequest uploadFile(HttpServletRequest req, String saveDirectory, int maxPostSize) {
		
		try {
			return new MultipartRequest(req, saveDirectory, maxPostSize, "UTF-8"); 
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static void downloadFile(HttpServletRequest req, HttpServletResponse resp, String directory, String sFilename, String oFilename) {
		String saveDirectory = req.getServletContext().getRealPath(directory);		
		try{
			File file = new File(saveDirectory, sFilename);
			InputStream inStream = new FileInputStream(file);
			
			String client = req.getHeader("User-Agent");
			if(client.indexOf("WOW64") == -1) {
				oFilename = new String(oFilename.getBytes("UTF-8"),"ISO-8859-1");
			} else {
				oFilename = new String(oFilename.getBytes("KSC5601"),"ISO-8859-1");
			}
			
			resp.reset();
			resp.setContentType("application/octet-stream");
			resp.setHeader("Content-Disposition","attachment; filename=\"" + oFilename + "\"");
			resp.setHeader("Content-Length", "" + file.length());
			
			OutputStream outStream = resp.getOutputStream();
			
			byte b[] = new byte[(int)file.length()];
			int readBuffer = 0;
			while( (readBuffer = inStream.read(b)) > 0 ) {
				outStream.write(b,0,readBuffer);
			}
			
			inStream.close();
			outStream.close();
			
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		}catch(Exception e){
			System.out.println("예외가 발생하였습니다.");
			e.printStackTrace();
		}
	}
	
	public static void deleteFile(HttpServletRequest req, String directory, String filename) {
		String saveDirectory = req.getServletContext().getRealPath("/Storage");
		File file = new File(saveDirectory+File.separator+filename);
		if(file.exists())
			file.delete();
	}
}






















