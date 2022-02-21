package jh.scaduler.login;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDao {

	@Autowired(required = false)
	private SqlSessionTemplate sqlSession; 
	
	public int getUserChk(LoginDto loginDto) {
		
		return sqlSession.selectOne("LoginDao.getUserChk",loginDto);
	}

}
