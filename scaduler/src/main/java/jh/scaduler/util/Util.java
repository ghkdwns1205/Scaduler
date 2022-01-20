package jh.scaduler.util;

import java.security.MessageDigest;

import org.springframework.stereotype.Component;

	@Component("Util")
	public class Util {
	
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
}
