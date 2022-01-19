package jh.scaduler.join;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

	@Autowired(required = false)
	private JoinDao joinDao;
	
	public int setJoinMember(Map<String, Object> param) {
		
		return joinDao.setJoinMember(param);
	}

	
}
