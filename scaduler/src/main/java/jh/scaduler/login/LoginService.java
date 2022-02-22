package jh.scaduler.login;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jh.scaduler.join.MemberVO;

@Service
public class LoginService {
  
	@Autowired(required = false)
	private LoginDao loginDao;

	public MemberVO getUserChk(LoginDto loginDto) {
		
		return loginDao.getUserChk(loginDto);
	}

	
}
