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
	
	public int setJoinMember(JoinVO joinVO) {
		
		return sqlSession.insert("JoinDao.setJoinMember", joinVO);
	}

}
