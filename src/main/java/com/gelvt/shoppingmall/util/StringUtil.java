/**
 * 
 */
package com.gelvt.shoppingmall.util;

import java.util.Random;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * 字符串工具类
 * @author elvin
 */
public class StringUtil {
	/**
	 * 获取字符串的sha256 hash
	 * @param string 源字符串
	 * @return hash
	 */
	public static String getSha256(String string){
		return DigestUtils.sha256Hex(string);
	}
	
	/**
	 * 获取字符串的sha1 hash
	 * @param string 源字符串
	 * @return hash
	 */
	public static String getSha1(String string){
		return DigestUtils.sha1Hex(string);
	}
	
	/**
	 * 生成一个完全由字母数字组成的UUID
	 * @return 移除了减号的UUID字符串
	 */
	public static String generateUUID(){
        return java.util.UUID.randomUUID().toString().replaceAll("-","");
    }
	
	/**
	 * 生成指定长度的由字母和数字组成的随机字符串
	 * @param length 字符串长度
	 * @param caseSensitive 是否大小写敏感。如果true，则返回大小写都有可能的字符串，如果false则字母全小写。
	 * @return 结果字符串
	 */
	public static String generateRandomString(int length, boolean caseSensitive) {
	    String base1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";  
	    String base2 = "abcdefghijklmnopqrstuvwxyz0123456789"; 
	    Random random = new Random();  
	    StringBuffer sb = new StringBuffer();
	    String base = null;
	    if (caseSensitive){
	        base = base1;
	    }else{
	        base = base2;
	    }
	    for (int i = 0; i < length; i++) {  
	        int number = random.nextInt(base.length());  
	        sb.append(base.charAt(number));  
	    }  
	    return sb.toString();  
	}

	/**
	 * 判断字符串是否为空或者空串
	 * @param str 需要判断的字符串
	 * @return 指示字符串是否为空串
	 */
	public static boolean isNullOrEmpty(String str){
		if (null == str || "".equals(str)){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * 判断字符串是否为空或者空白字符串
	 * @param str 需要判断的字符串
	 * @return 指示字符串是否为空或者空白字符串
	 */
	public static boolean isNullOrBlank(String str){
		if (null == str || "".equals(str)
				|| "".equals(str.replaceAll("\\s+", ""))){
			return true;
		}else{
			return false;
		}
	}
}
