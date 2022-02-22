package jh.scaduler.join;

import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Repository;

@Alias("memberVO")
@Repository
public class MemberVO {

	private String userID;
	private String userPass;
	private String userPhone;
	private String userPhone1;
	private String userPhone2;
	private String userPhone3;
	private String userEmail;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPhone1() {
		return userPhone1;
	}
	public void setUserPhone1(String userPhone1) {
		this.userPhone1 = userPhone1;
	}
	public String getUserPhone2() {
		return userPhone2;
	}
	public void setUserPhone2(String userPhone2) {
		this.userPhone2 = userPhone2;
	}
	public String getUserPhone3() {
		return userPhone3;
	}
	public void setUserPhone3(String userPhone3) {
		this.userPhone3 = userPhone3;
	}
	
}
