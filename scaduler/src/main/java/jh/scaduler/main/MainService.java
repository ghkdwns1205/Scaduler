package jh.scaduler.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

	@Autowired(required=false)
	private MainDao mainDao;
	
	public String getTestID(String testSeq) {
		
		return mainDao.getTestID(testSeq);
	}

	
}
