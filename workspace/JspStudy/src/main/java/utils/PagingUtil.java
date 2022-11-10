package utils;

import java.util.Map;

public class PagingUtil {
	public static String pagingTest(int totalCount,int pageSize, int pageBlock,int pageNum,String reqUri,Map<String, Object> param) {
		
		reqUri += "?findCol=" + param.get("findCol") + "&findWord=" + param.get("findWord");
		
		String pagingRes = "";
		int totalPage = (int) Math.ceil((double) totalCount / pageSize);
		int div = pageBlock/2;
		int pageTemp = pageNum-div;
		if(pageTemp <= 0)
			pageTemp = 1;
		if(pageTemp != 1)
			pagingRes += "<a href='" + reqUri + "&pageNum=1'>[<<]</a>";
		
		int count = 1;
		while(count <= pageBlock && pageTemp <= totalPage) {
			if(pageTemp == pageNum) 
				pagingRes += "&nbsp;" + pageTemp + "&nbsp;";
			else
				pagingRes += "&nbsp;<a href='" + reqUri + "&pageNum=" + pageTemp + "'>" + pageTemp + "</a>&nbsp;";
			pageTemp++;
			count++;			
		}
		if(pageTemp <= totalPage)
			pagingRes+= "<a href='" + reqUri + "&pageNum=" + totalPage + "'>[>>]</a>";	
		
		return pagingRes;
	}
	
	public static String pagingCenter(int totalCount,int pageSize, int pageBlock,int pageNum,String reqUri) {
		String pagingRes = "";
		int totalPage = (int) Math.ceil((double) totalCount / pageSize);
		int div = pageBlock/2;
		int pageTemp = pageNum-div;
		if(pageTemp <= 0)
			pageTemp = 1;
		if(pageTemp != 1)
			pagingRes += "<a href='" + reqUri + "?pageNum=1'>[<<]</a>";
		
		int count = 1;
		while(count <= pageBlock && pageTemp <= totalPage) {
			if(pageTemp == pageNum) 
				pagingRes += "&nbsp;" + pageTemp + "&nbsp;";
			else
				pagingRes += "&nbsp;<a href='" + reqUri + "?pageNum=" + pageTemp + "'>" + pageTemp + "</a>&nbsp;";
			pageTemp++;
			count++;			
		}
		if(pageTemp <= totalPage)
			pagingRes+= "<a href='" + reqUri + "?pageNum=" + totalPage + "'>[>>]</a>";	
		
		return pagingRes;
	}
	
	public static String pagingStr(int totalCount,int pageSize, int pageBlock,int pageNum,String reqUri) {
		String pagingRes = "";
		int totalPage = (int) Math.ceil((double) totalCount / pageSize);
		int pageTemp = (((pageNum-1)/pageBlock)*pageBlock)+1;
		
		if(pageTemp != 1) {
		pagingRes = "<a href='" + reqUri + "?pageNum=1'>[<<]</a>";
		pagingRes+= "&nbsp";
		pagingRes+= "<a href='" + reqUri + "?pageNum=" + (pageTemp-1) + "'>[<]</a>";
		}
		
		int blockCount = 1;
		while(blockCount <= pageBlock && pageTemp <= totalPage) {
			if(pageTemp == pageNum) 
				pagingRes += "&nbsp;" + pageTemp + "&nbsp;";
			else 
				pagingRes += "&nbsp;<a href='" +reqUri + "?pageNum=" + pageTemp + "'>" + pageTemp +"</a>&nbsp;";
			
			pageTemp++;
			blockCount++;
		}
		
		if(pageTemp <= totalPage) {
			pagingRes+= "<a href='" + reqUri + "?pageNum=" + pageTemp + "'>[>]</a>";
			pagingRes+= "&nbsp";
			pagingRes+= "<a href='" + reqUri + "?pageNum=" + totalPage + "'>[>>]</a>";
			
		}
		return pagingRes;
	}
}



