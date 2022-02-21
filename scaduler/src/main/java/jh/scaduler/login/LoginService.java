package jh.scaduler.login;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
  
	@Autowired(required = false)
	private LoginDao loginDao;

	public int getUserChk(LoginDto loginDto) {
		
		return loginDao.getUserChk(loginDto);
	}

	
}
