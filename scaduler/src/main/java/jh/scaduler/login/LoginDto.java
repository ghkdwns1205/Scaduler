package jh.scaduler.login;

import org.apache.ibatis.type.Alias;

import jh.scaduler.util.Util;

@Alias("loginDto")
public class LoginDto  {

	private String sessionUserID;
	private String sessionUserPass;
	
	public String getSessionUserID() {
		return sessionUserID;
	}
	public void setSessionUserID(String sessionUserID) {
		this.sessionUserID = sessionUserID;
	}
	public String getSessionUserPass() {
		return sessionUserPass;
	}
	public void setSessionUserPass(String sessionUserPass) {
		this.sessionUserPass = Util.ShaEncode(sessionUserPass);
	}
	
}
