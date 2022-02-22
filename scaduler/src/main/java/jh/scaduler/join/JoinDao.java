package jh.scaduler.join;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("JoinDao")
public class JoinDao {

	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;
	
	public int setJoinMember(MemberVO memberVO) {
		
		return sqlSession.insert("JoinDao.setJoinMember", memberVO);
	}

	public String getUserIdCheck(String userID) {
		
		return sqlSession.selectOne("JoinDao.getUserIdCheck", userID);
	}

}
