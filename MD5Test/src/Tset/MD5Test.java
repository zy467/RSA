package Tset;

import java.io.File;

import MD5Util.Md5Util;

public class MD5Test {
public static void main(String[] args) {
	File file1=new File("E:/1.txt");	
	File file2=new File("E:/2.txt");
	File file3=new File("E:/3.txt");
	File file4=new File("E:/4.txt");
	String value1 = Md5Util.getMD5(file1);
	System.out.println(value1);
	String value2 = Md5Util.getMD5(file2);
	System.out.println(value2);
	String value3 = Md5Util.getMD5(file3);
	System.out.println(value3);
	String value4 = Md5Util.getMD5(file4);
	System.out.println(value4);
}
}
