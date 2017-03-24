package Tset;

import java.io.UnsupportedEncodingException;

public class StringTest {
	public static void main(String[] args) {
		String str = "57E67CE7AE61246B098605886647ED45";// 需要转换的字符串  
		byte[] b = new byte [str.length() / 2];  // 每两个字符为一个十六进制确定数字长度  
		for (int i = 0; i < b.length; i++) {  
		    // 将字符串每两个字符做为一个十六进制进行截取  
		    String a = str.substring(i * 2, i * 2 + 2);  
		    b[i] = (byte) Integer.parseInt(a, 16);// 将如e4转成十六进制字节，放入数组  
		}  
		  
		try {  
		    // 将字节数字以utf-8编码以字符串形式输出  
		    System.out.println(new String(b, "UTF-8"));  
		} catch (UnsupportedEncodingException e) {  
		    e.printStackTrace();  
		}  
	}
	
}
