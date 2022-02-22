package jh.scaduler.login;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import jh.scaduler.join.MemberVO;

@Repository
@Qualifier("LoginDao")
public class LoginDao {

	@Autowired(required = false)
	private SqlSessionTemplate sqlSession; 
	
	public MemberVO getUserChk(LoginDto loginDto) {
		
		return sqlSession.selectOne("LoginDao.getUserChk",loginDto);
	}

}
