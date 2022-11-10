package utils;

public class ELUtils {
	public String getGender(String juminNum) {
		String res = "";
		String resExp = "^\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|[3][01])\\-[1-4][0-9]{6}$";
		if (juminNum.matches(resExp)) {
			int beginIdx = juminNum.indexOf("-") + 1;
			String genderStr = juminNum.substring(beginIdx, beginIdx + 1);
			int genderInt = Integer.parseInt(genderStr);
			if (genderInt == 1 || genderInt == 3)
				res = "남자";
			else if (genderInt == 2 || genderInt == 4)
				res = "여자";
		} else {
			res = "주민번호 오류";
		}
		return res;
	}

	public static boolean isNumber(String value) {
		char[] chArr = value.toCharArray();
		for (int i = 0; i < chArr.length; i++) {
			if (!(chArr[i] >= '0' && chArr[i] <= '9')) {
				return false;
			}
		}
		return true;
	}

	public static String showGugudan(int limitDan) {
		StringBuffer sb = new StringBuffer();
		try {
			sb.append("<table border='1'>");
			for (int i = 2; i <= limitDan; i++) {
				sb.append("<tr>");
				for (int j = 2; j <= 9; j++) {
					sb.append("<td>" + i + " * " + j + " = " + (i * j) + "</td>");
				}
				sb.append("</tr>");
			}
			sb.append("</table>");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
}
