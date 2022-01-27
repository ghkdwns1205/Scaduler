package jh.scaduler.util;

import java.security.MessageDigest;

import org.springframework.stereotype.Component;

	@Component("Util")
	public class Util {
	
		//비밀번호 암호화를 위한 sha-256암호화
		public static String ShaEncode(String msg) {
		
			StringBuffer builder = null;
			byte[] byteMsg = null;
			try {
				
				builder = new StringBuffer();
				
				MessageDigest md = MessageDigest.getInstance("SHA-256");
				md.update(msg.getBytes());
				byteMsg = md.digest();
				
				for(int i = 0; i < byteMsg.length; i++) {
					builder.append( Integer.toString((byteMsg[i] & 0xff) + 0x100, 16).substring(1));
				}
				
				
			}catch(Exception e) {
				e.getStackTrace();
			}
		return builder.toString();
		 
	}
		
		//문자열 값이 NULL이면 빈값으로 리턴한다. (커스텀태그와 공용)
		public static String NVL(Object text) {
			if(text == null)
				return "";
			else if(text.toString() == "null")
				return "";
			else	
			   return text.toString(); 
		}
}
